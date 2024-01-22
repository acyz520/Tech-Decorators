
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

public class KioxiaRC20Block extends Block {
	public static BlockBehaviour.Properties PROPERTIES = BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false);
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public KioxiaRC20Block() {
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
			default -> Shapes.or(box(2, 0, 6, 14, 0.2, 9), box(2, 0.2, 6, 4, 0.4, 9), box(4.05, 0.2, 6, 6.05, 0.4, 9), box(8.15, 0.2, 6, 10.15, 0.4, 9), box(10.2, 0.2, 6.9, 12.2, 0.4, 8.9), box(12.4, 0.2, 6.6, 13.9, 0.4, 8.8),
					box(6.1, 0.2, 6, 8.1, 0.4, 9), box(2, 0.4, 6, 9.8, 0.45, 9), box(14, 0, 8.6, 14.5, 0.2, 8.9), box(14, 0, 6.1, 14.5, 0.2, 8.5), box(1.5, 0, 7.7, 2, 0.2, 9), box(1.75, 0, 7.3, 2, 0.2, 7.7), box(1.5, 0, 6, 2, 0.2, 7.3));
			case NORTH -> Shapes.or(box(2, 0, 7, 14, 0.2, 10), box(12, 0.2, 7, 14, 0.4, 10), box(9.95, 0.2, 7, 11.95, 0.4, 10), box(5.85, 0.2, 7, 7.85, 0.4, 10), box(3.8, 0.2, 7.1, 5.8, 0.4, 9.1), box(2.1, 0.2, 7.2, 3.6, 0.4, 9.4),
					box(7.9, 0.2, 7, 9.9, 0.4, 10), box(6.2, 0.4, 7, 14, 0.45, 10), box(1.5, 0, 7.1, 2, 0.2, 7.4), box(1.5, 0, 7.5, 2, 0.2, 9.9), box(14, 0, 7, 14.5, 0.2, 8.3), box(14, 0, 8.3, 14.25, 0.2, 8.7), box(14, 0, 8.7, 14.5, 0.2, 10));
			case EAST -> Shapes.or(box(6, 0, 2, 9, 0.2, 14), box(6, 0.2, 12, 9, 0.4, 14), box(6, 0.2, 9.95, 9, 0.4, 11.95), box(6, 0.2, 5.85, 9, 0.4, 7.85), box(6.9, 0.2, 3.8, 8.9, 0.4, 5.8), box(6.6, 0.2, 2.1, 8.8, 0.4, 3.6),
					box(6, 0.2, 7.9, 9, 0.4, 9.9), box(6, 0.4, 6.2, 9, 0.45, 14), box(8.6, 0, 1.5, 8.9, 0.2, 2), box(6.1, 0, 1.5, 8.5, 0.2, 2), box(7.7, 0, 14, 9, 0.2, 14.5), box(7.3, 0, 14, 7.7, 0.2, 14.25), box(6, 0, 14, 7.3, 0.2, 14.5));
			case WEST -> Shapes.or(box(7, 0, 2, 10, 0.2, 14), box(7, 0.2, 2, 10, 0.4, 4), box(7, 0.2, 4.05, 10, 0.4, 6.05), box(7, 0.2, 8.15, 10, 0.4, 10.15), box(7.1, 0.2, 10.2, 9.1, 0.4, 12.2), box(7.2, 0.2, 12.4, 9.4, 0.4, 13.9),
					box(7, 0.2, 6.1, 10, 0.4, 8.1), box(7, 0.4, 2, 10, 0.45, 9.8), box(7.1, 0, 14, 7.4, 0.2, 14.5), box(7.5, 0, 14, 9.9, 0.2, 14.5), box(7, 0, 1.5, 8.3, 0.2, 2), box(8.3, 0, 1.75, 8.7, 0.2, 2), box(8.7, 0, 1.5, 10, 0.2, 2));
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
		BlockRenderLayerMap.INSTANCE.putBlock(TechDecoratorsModBlocks.KIOXIA_RC_20, RenderType.solid());
	}
}
