
package name.tech_decorators.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import name.tech_decorators.init.TechDecoratorsModBlocks;

import java.util.List;
import java.util.Collections;

public class Intel12i5fuBlock extends Block {
	public static BlockBehaviour.Properties PROPERTIES = BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false);
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public Intel12i5fuBlock() {
		super(PROPERTIES);
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		Vec3 offset = state.getOffset(world, pos);
		return (switch (state.getValue(FACING)) {
			default -> Shapes.or(box(3, 0, 2.4, 13, 0.35, 13.6), box(3.8, 0.35, 10, 4, 0.5, 13), box(12, 0.35, 10, 12.2, 0.5, 13.2), box(3.8, 0.35, 13, 12, 0.5, 13.2), box(4, 0.35, 3, 12, 0.65, 13), box(3, 0.35, 6, 4, 0.5, 10),
					box(12, 0.35, 6, 13, 0.5, 10), box(12, 0.35, 2.8, 12.2, 0.5, 6), box(3.8, 0.35, 3, 4, 0.5, 6), box(3.8, 0.35, 2.8, 12, 0.5, 3));
			case NORTH -> Shapes.or(box(3, 0, 2.4, 13, 0.35, 13.6), box(12, 0.35, 3, 12.2, 0.5, 6), box(3.8, 0.35, 2.8, 4, 0.5, 6), box(4, 0.35, 2.8, 12.2, 0.5, 3), box(4, 0.35, 3, 12, 0.65, 13), box(12, 0.35, 6, 13, 0.5, 10),
					box(3, 0.35, 6, 4, 0.5, 10), box(3.8, 0.35, 10, 4, 0.5, 13.2), box(12, 0.35, 10, 12.2, 0.5, 13), box(4, 0.35, 13, 12.2, 0.5, 13.2));
			case EAST -> Shapes.or(box(2.4, 0, 3, 13.6, 0.35, 13), box(10, 0.35, 12, 13, 0.5, 12.2), box(10, 0.35, 3.8, 13.2, 0.5, 4), box(13, 0.35, 4, 13.2, 0.5, 12.2), box(3, 0.35, 4, 13, 0.65, 12), box(6, 0.35, 12, 10, 0.5, 13),
					box(6, 0.35, 3, 10, 0.5, 4), box(2.8, 0.35, 3.8, 6, 0.5, 4), box(3, 0.35, 12, 6, 0.5, 12.2), box(2.8, 0.35, 4, 3, 0.5, 12.2));
			case WEST -> Shapes.or(box(2.4, 0, 3, 13.6, 0.35, 13), box(3, 0.35, 3.8, 6, 0.5, 4), box(2.8, 0.35, 12, 6, 0.5, 12.2), box(2.8, 0.35, 3.8, 3, 0.5, 12), box(3, 0.35, 4, 13, 0.65, 12), box(6, 0.35, 3, 10, 0.5, 4),
					box(6, 0.35, 12, 10, 0.5, 13), box(10, 0.35, 12, 13.2, 0.5, 12.2), box(10, 0.35, 3.8, 13, 0.5, 4), box(13, 0.35, 3.8, 13.2, 0.5, 12));
		}).move(offset.x, offset.y, offset.z);
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Environment(EnvType.CLIENT)
	public static void clientInit() {
		BlockRenderLayerMap.INSTANCE.putBlock(TechDecoratorsModBlocks.INTEL_12I_5FU, RenderType.solid());
	}
}
