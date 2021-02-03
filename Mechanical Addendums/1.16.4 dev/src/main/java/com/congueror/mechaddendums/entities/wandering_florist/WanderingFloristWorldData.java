package com.congueror.mechaddendums.entities.wandering_florist;

import java.util.UUID;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.storage.DimensionSavedDataManager;
import net.minecraft.world.storage.WorldSavedData;

@SuppressWarnings("unused")
public class WanderingFloristWorldData extends WorldSavedData{
	
	private static final String IDENTIFIER = "mechaddendums_wandering_florist";
    private World world;
	private int tickCounter;
    private int villagerSpawnDelay;
    private int villagerSpawnChance;
    private UUID villagerID;

	public WanderingFloristWorldData() {
		super(IDENTIFIER);
	}
	
	public static WanderingFloristWorldData get(World world) {
        if (world instanceof ServerWorld) {
            ServerWorld overworld = world.getServer().getWorld(world.getDimensionKey());

            DimensionSavedDataManager storage = overworld.getSavedData();
            WanderingFloristWorldData data = storage.getOrCreate(WanderingFloristWorldData::new, IDENTIFIER);
            if(data != null){
                data.world = world;
                data.markDirty();
            }
            return data;
        }
        return null;
    }
	
	public int getDoctorSpawnDelay() {
        return this.villagerSpawnDelay;
    }

    public void setDoctorSpawnDelay(int delay) {
        this.villagerSpawnDelay = delay;
    }

    public int getDoctorSpawnChance() {
        return this.villagerSpawnChance;
    }

    public void setDoctorSpawnChance(int chance) {
        this.villagerSpawnChance = chance;
    }

    public void setPlagueDoctorID(UUID id) {
        this.villagerID = id;
    }

    public void tick() {
        ++this.tickCounter;
    }

	@Override
	public void read(CompoundNBT nbt) {
		if (nbt.contains("VillagerSpawnDelay", 99)) {
            this.villagerSpawnDelay = nbt.getInt("PlagueDoctorSpawnDelay");
        }

        if (nbt.contains("VillagerSpawnChance", 99)) {
            this.villagerSpawnChance = nbt.getInt("PlagueDoctorSpawnChance");
        }

        if (nbt.contains("VillagerId", 8)) {
            this.villagerID = UUID.fromString(nbt.getString("PlagueDoctorId"));
        }
	}

	@Override
	public CompoundNBT write(CompoundNBT compound) {
		compound.putInt("VillagerSpawnDelay", this.villagerSpawnDelay);
        compound.putInt("VillagerSpawnChance", this.villagerSpawnChance);
        if (this.villagerID != null) {
            compound.putString("VillagerId", this.villagerID.toString());
        }
        return compound;
	}

}
