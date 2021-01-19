package com.congueror.mechaddendums.network.packet;

import java.util.function.Supplier;

import com.congueror.mechaddendums.MechAddendums;
import com.congueror.mechaddendums.blocks.solargen.SolarGeneratorTileEntity;

import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkEvent;

public class UpdateSolarGenerator {
    private BlockPos pos;
    private int currentEnergy;
    private int currentProduction;

    public UpdateSolarGenerator(PacketBuffer buf)
    {
        pos = buf.readBlockPos();
        currentEnergy = buf.readInt();
        currentProduction = buf.readInt();
    }

    public UpdateSolarGenerator(BlockPos pos, int currentEnergy, int currentProduction)
    {
        this.pos = pos;
        this.currentEnergy = currentEnergy;
        this.currentProduction = currentProduction;
    }

    public void toBytes(PacketBuffer buf)
    {
        buf.writeBlockPos(pos);
        buf.writeInt(currentEnergy);
        buf.writeInt(currentProduction);
    }

    public void handle(Supplier<NetworkEvent.Context> ctx)
    {
        ctx.get().enqueueWork(() -> {
            World world = MechAddendums.eventbussub.getClientWorld();
            if(world.isBlockPresent(pos))
            {
                TileEntity te = world.getTileEntity(pos);
                if(te instanceof SolarGeneratorTileEntity)
                {
                	SolarGeneratorTileEntity solar = (SolarGeneratorTileEntity) te;
                    solar.energyClient = currentEnergy;
                    solar.energyProductionClient = currentProduction;
                }
            }
        });
        ctx.get().setPacketHandled(true);
    }
}
