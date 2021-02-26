package com.congueror.mechaddendums.util.energy;

import net.minecraft.nbt.CompoundNBT;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.energy.EnergyStorage;

public class ModEnergyStorage extends EnergyStorage implements INBTSerializable<CompoundNBT> {

    public ModEnergyStorage(int energyTransfer, int energyCapacity)
    {
        super(energyCapacity, energyTransfer);
        this.maxReceive = 0;
    }

    public void setEnergy(int energy)
    {
        this.energy = energy;
        onEnergyChanged();
    }
    
    protected void onEnergyChanged() {

    }

    public void generateEnergy(long energy)
    {
        this.energy += energy;
        if(this.energy > capacity)
            this.energy = capacity;
        onEnergyChanged();
    }

    public void consumeEnergy(int energy)
    {
        this.energy -= energy;
        if(this.energy < 0)
        {
            this.energy = 0;
        }
        System.out.println("CONSUMED");
    }

    public boolean isFullEnergy()
    {
        return getEnergyStored() >= getMaxEnergyStored();
    }

    @Override
    public CompoundNBT serializeNBT()
    {
        CompoundNBT tag = new CompoundNBT();
        tag.putInt("value", getEnergyStored());
        return tag;
    }

    @Override
    public void deserializeNBT(CompoundNBT nbt)
    {
        setEnergy(nbt.getInt("value"));
    }
}
