package com.congueror.mechaddendums.blocks.coalgen;

import javax.annotation.Nullable;

import com.congueror.mechaddendums.util.enums.CoalGenTier;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.network.NetworkHooks;

public class CoalGeneratorBlock extends Block{

	private final CoalGenTier tier;
	
	public CoalGeneratorBlock(CoalGenTier tier) {
		super(Block.Properties.create(Material.IRON)
				.hardnessAndResistance(5f, 6f)
				.sound(SoundType.METAL)
				.harvestTool(ToolType.PICKAXE)
				.harvestLevel(2)
				.setRequiresTool()
				.setLightLevel(state -> state.get(BlockStateProperties.POWERED) ? 14 : 0));
		this.tier = tier;
	}
	
	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return new CoalGeneratorTileEntity(tier);
	}
	
	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
	}
	
	@Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return getDefaultState().with(BlockStateProperties.FACING, context.getNearestLookingDirection().getOpposite());
    }
	
	@Override
    public ActionResultType onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult trace) {
        if (!world.isRemote) {
            TileEntity tileEntity = world.getTileEntity(pos);
            if (tileEntity instanceof CoalGeneratorTileEntity) {
                INamedContainerProvider containerProvider = new INamedContainerProvider() {
                    @Override
                    public ITextComponent getDisplayName() {
                        return new TranslationTextComponent("screen.mytutorial.firstblock");
                    }

                    @Override
                    public Container createMenu(int i, PlayerInventory playerInventory, PlayerEntity playerEntity) {
                    	CoalGeneratorTileEntity tile = (CoalGeneratorTileEntity) tileEntity;
                        return new CoalGeneratorContainer(i, world, pos, playerInventory, playerEntity, tile, tier);
                    }
                };
                NetworkHooks.openGui((ServerPlayerEntity) player, containerProvider, tileEntity.getPos());
            } else {
                throw new IllegalStateException("Our named container provider is missing!");
            }
        }
        return ActionResultType.SUCCESS;
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(BlockStateProperties.FACING, BlockStateProperties.POWERED);
    }
	
//	@OnlyIn(Dist.CLIENT)
//	public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) 
//	{
//		
//	    if (stateIn.get(LIT)) {
//	    	double d0 = (double)pos.getX() + 0.5D;
//	        double d1 = (double)pos.getY();
//	        double d2 = (double)pos.getZ() + 0.5D;
//	        if (rand.nextDouble() < 0.1D) {
//	        	worldIn.playSound(d0, d1, d2, SoundEvents.BLOCK_FURNACE_FIRE_CRACKLE, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
//	        }
//
//	        Direction direction = stateIn.get(FACING);
//	        Direction.Axis direction$axis = direction.getAxis();
//	        double d4 = rand.nextDouble() * 0.6D - 0.3D;
//	        double d5 = direction$axis == Direction.Axis.X ? (double)direction.getXOffset() * 0.52D : d4;
//	        double d6 = rand.nextDouble() * 6.0D / 16.0D;
//	        double d7 = direction$axis == Direction.Axis.Z ? (double)direction.getZOffset() * 0.52D : d4;
//	        worldIn.addParticle(ParticleTypes.SMOKE, d0 + d5, d1 + d6, d2 + d7, 0.0D, 0.0D, 0.0D);
//	        worldIn.addParticle(ParticleTypes.FLAME, d0 + d5, d1 + d6, d2 + d7, 0.0D, 0.0D, 0.0D);
//	     }
//	}
}
