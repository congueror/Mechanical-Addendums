package com.congueror.mechaddendums.blocks;

import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.congueror.mechaddendums.init.TileEntityInit;
import com.congueror.mechaddendums.util.PacketHandler;
import com.congueror.mechaddendums.util.energy.ModEnergyStorage;
import com.congueror.mechaddendums.util.energy.SolarGenProduction;
import com.congueror.mechaddendums.util.energy.UpdateSolarGenerator;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Direction;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.fml.network.PacketDistributor;

public class SolarGeneratorTileEntity extends TileEntity implements ITickableTileEntity, INamedContainerProvider{

	private LazyOptional<IEnergyStorage> energy = LazyOptional.of(this::createEnergy);
    private int energyGeneration, maxEnergyOutput;
    public int maxEnergy;
    
    public int energyClient, energyProductionClient;
	
	public SolarGeneratorTileEntity(TileEntityType<?> tileEntityTypeIn) {
		super(tileEntityTypeIn);
		energyGeneration = (int) Math.pow(8, 1);
        maxEnergyOutput = energyGeneration * 2;
        maxEnergy = energyGeneration * 1000;
        energyClient = energyProductionClient = -1;
	}

	public SolarGeneratorTileEntity() {
	    this(TileEntityInit.BASIC_SOLAR_GENERATOR_TILE_ENTITY.get());
	  }
	
	private IEnergyStorage createEnergy()
    {
        return new ModEnergyStorage(maxEnergyOutput, maxEnergy);
    }
	
	

	@Override
	public void tick() {
		if(!world.isRemote)
        {
            energy.ifPresent(e -> ((ModEnergyStorage) e).generatePower(currentAmountEnergyProduced()));
            sendEnergy();
            if(energyClient != getEnergy() || energyProductionClient != currentAmountEnergyProduced())
            {
                int energyProduced = (getEnergy() != getMaxEnergy()) ? currentAmountEnergyProduced() : 0;
                PacketHandler.INSTANCE.send(PacketDistributor.ALL.noArg(), new UpdateSolarGenerator(getPos(), getEnergy(), energyProduced));
            }
        }
	}
	
	private int getMaxEnergy()
    {
        return getCapability(CapabilityEnergy.ENERGY).map(IEnergyStorage::getMaxEnergyStored).orElse(0);
    }

    private int getEnergy()
    {
        return getCapability(CapabilityEnergy.ENERGY).map(IEnergyStorage::getEnergyStored).orElse(0);
    }

    private int currentAmountEnergyProduced()
    {
        return (int) (energyGeneration * SolarGenProduction.computeSunIntensity(world, pos));
    }
    
    private void sendEnergy()
    {
        energy.ifPresent(energy -> {
            AtomicInteger capacity = new AtomicInteger(energy.getEnergyStored());

            for(int i = 0; (i < Direction.values().length) && (capacity.get() > 0); i++)
            {
                Direction facing = Direction.values()[i];
                if(facing != Direction.UP)
                {
                    TileEntity tileEntity = world.getTileEntity(pos.offset(facing));
                    if(tileEntity != null)
                    {
                        tileEntity.getCapability(CapabilityEnergy.ENERGY, facing.getOpposite()).ifPresent(handler -> {
                            if(handler.canReceive())
                            {
                                int received = handler.receiveEnergy(Math.min(capacity.get(), maxEnergyOutput), false);
                                capacity.addAndGet(-received);
                                ((ModEnergyStorage) energy).consumePower(received);
                            }
                        });
                    }
                }
            }
        });
    }
    
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> capability, Direction facing)
    {
        if(capability == CapabilityEnergy.ENERGY && facing != Direction.UP)
        {
            return energy.cast();
        }
        return super.getCapability(capability, facing);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public void read(BlockState state, CompoundNBT compound)
    {
        CompoundNBT energyTag = compound.getCompound("energy");
        energy.ifPresent(h -> ((INBTSerializable<CompoundNBT>) h).deserializeNBT(energyTag));
        super.read(state, compound);
    }

    @SuppressWarnings("unchecked")
    @Override
    public CompoundNBT write(CompoundNBT compound)
    {
        energy.ifPresent(h -> {
            CompoundNBT tag = ((INBTSerializable<CompoundNBT>) h).serializeNBT();
            compound.put("energy", tag);
        });
        return super.write(compound);
    }
    
    @Nullable
    @Override
	public Container createMenu(int id, PlayerInventory playerInv, PlayerEntity playerEntity) {
    	return new SolarGeneratorContainer(id, playerEntity, this);
	}

	@Override
	public ITextComponent getDisplayName() {
		return new TranslationTextComponent(this.getBlockState().getBlock().getTranslationKey());
	}
}
