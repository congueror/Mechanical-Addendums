package com.congueror.mechaddendums.entities.wandering_florist;

import java.util.Iterator;
import java.util.Optional;
import java.util.Random;

import javax.annotation.Nullable;

import com.congueror.mechaddendums.init.EntityInit;

import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.village.PointOfInterestManager;
import net.minecraft.village.PointOfInterestType;
import net.minecraft.world.GameRules;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.spawner.WorldEntitySpawner;

public class WanderingFloristSpawner {

	private final Random random = new Random();
    private final ServerWorld world;
    private int field_221248_c;
    private int spawnDelay;
    private int spawnChance;


    public WanderingFloristSpawner(ServerWorld world) {
        this.world = world;
        this.field_221248_c = 400; //12000
        this.spawnDelay = 24000;
        this.spawnChance = 25;
    }

    public int tick() {
    	if (!this.world.getGameRules().getBoolean(GameRules.DO_TRADER_SPAWNING))
    	      return 0; 
    	    if (--this.field_221248_c > 0)
    	      return 0; 
    	    this.field_221248_c = 1200;
    	    this.spawnDelay -= 1200;
    	    if (this.spawnDelay > 0)
    	      return 0; 
    	    this.spawnDelay = 24000;
    	    if (!this.world.getGameRules().getBoolean(GameRules.DO_TRADER_SPAWNING))
    	      return 0; 
    	    int chance = this.spawnChance;
    	    this.spawnChance = MathHelper.clamp(this.spawnChance + 25, 25, 75);
    	    if (this.random.nextInt(100) > chance)
    	      return 0; 
    	    if (spawnFlorist(this.world)) {
    	      this.spawnChance = 25;
    	      return 1;
    	    } 
    	    return 0;
    }

    @SuppressWarnings("unused")
	private boolean spawnFlorist(ServerWorld server) {
    	ServerPlayerEntity serverPlayerEntity = world.getRandomPlayer();
        if (serverPlayerEntity == null)
          return true; 
        if (this.random.nextInt(10) != 0)
          return false; 
        BlockPos blockpos = serverPlayerEntity.getPosition();
        int i = 48;
        PointOfInterestManager pointofinterestmanager = world.getPointOfInterestManager();
        Optional<BlockPos> optional = pointofinterestmanager.find(PointOfInterestType.MEETING.getPredicate(), p_221241_0_ -> true, blockpos, 48, PointOfInterestManager.Status.ANY);
        BlockPos blockpos1 = optional.orElse(blockpos);
        BlockPos blockpos2 = func_221244_a(world, blockpos1, 48);
        if (blockpos2 != null) {
          if (world.getDimensionKey() != World.THE_NETHER && world.getDimensionKey() != World.THE_END)
            return false; 
          WanderingFloristEntity wanderingFloristEntity = EntityInit.WANDERING_FLORIST.get().spawn(world, null, null, null, blockpos2, SpawnReason.EVENT, false, false);
          if (wanderingFloristEntity != null) {
            spawnCat(wanderingFloristEntity, 4);
            wanderingFloristEntity.setDespawnDelay(48000);
            wanderingFloristEntity.setWanderTarget(blockpos1);
            wanderingFloristEntity.setHomePosAndDistance(blockpos1, 16);
            return true;
          } 
        } 
        return false;
    }

    private void spawnCat(WanderingFloristEntity florist, int radius) {
    	BlockPos blockpos = func_221244_a(florist.getWorld(), new BlockPos(florist.getPosition()), radius);
        if (blockpos != null) {
          CatEntity catEntity = EntityType.CAT.spawn((ServerWorld) florist.getWorld(), null, null, null, blockpos, SpawnReason.EVENT, false, false);
          if (catEntity != null) {
        	  catEntity.setLeashHolder(florist, true);
        	  catEntity.setOwnerId(florist.getUniqueID());
          } 
        } 
    }


    @Nullable
    private BlockPos func_221244_a(IWorldReader world, BlockPos pos, int radius) {
      BlockPos blockpos = null;
      for (int i = 0; i < 10; i++) {
        int j = pos.getX() + this.random.nextInt(radius * 2) - radius;
        int k = pos.getY() + this.random.nextInt(radius * 2) - radius;
        int l = world.getHeight(Heightmap.Type.WORLD_SURFACE, j, k);
        BlockPos blockpos1 = new BlockPos(j, l, k);
        if (WorldEntitySpawner.canCreatureTypeSpawnAtLocation(EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, world, blockpos1, EntityInit.WANDERING_FLORIST.get())) {
          blockpos = blockpos1;
          break;
        } 
      } 
      return blockpos;
    }
    
    @SuppressWarnings("unused")
	private boolean func_234560_a_(IBlockReader world, BlockPos pos) {
      BlockPos pos1;
      Iterator<BlockPos> var3 = BlockPos.getAllInBoxMutable(pos, pos.add(1, 2, 1)).iterator();
      do {
        if (!var3.hasNext())
          return true; 
        pos1 = var3.next();
      } while (world.getBlockState(pos1).getCollisionShape(world, pos1).isEmpty());
      return false;
    }
}
