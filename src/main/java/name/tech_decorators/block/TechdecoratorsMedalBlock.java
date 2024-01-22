
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

public class TechdecoratorsMedalBlock extends Block {
	public static BlockBehaviour.Properties PROPERTIES = BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false);
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public TechdecoratorsMedalBlock() {
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
			default -> Shapes.or(box(2.5, 14, 11.5, 13.5, 16, 12), box(2.5, 2, 11.5, 4.5, 14, 12), box(11.5, 2, 11.5, 13.5, 14, 12), box(2.5, 0, 11.5, 13.5, 2, 12), box(8, -3.8, 6.5, 12, 5, 7), box(8, 8, 9.2, 12, 8.5, 10),
					box(2.5, 0, 9.5, 3, 16, 11.5), box(3, 0, 9.5, 13, 16, 10), box(8, 9, 10, 11, 12, 10.5), box(13, 0, 9.5, 13.5, 16, 11.5), box(3, 14, 10, 13, 16, 11.5), box(3, 0, 10, 13, 2, 11.5));
			case NORTH -> Shapes.or(box(2.5, 14, 4, 13.5, 16, 4.5), box(11.5, 2, 4, 13.5, 14, 4.5), box(2.5, 2, 4, 4.5, 14, 4.5), box(2.5, 0, 4, 13.5, 2, 4.5), box(4, -3.8, 9, 8, 5, 9.5), box(4, 8, 6, 8, 8.5, 6.8), box(13, 0, 4.5, 13.5, 16, 6.5),
					box(3, 0, 6, 13, 16, 6.5), box(5, 9, 5.5, 8, 12, 6), box(2.5, 0, 4.5, 3, 16, 6.5), box(3, 14, 4.5, 13, 16, 6), box(3, 0, 4.5, 13, 2, 6));
			case EAST -> Shapes.or(box(11.5, 14, 2.5, 12, 16, 13.5), box(11.5, 2, 11.5, 12, 14, 13.5), box(11.5, 2, 2.5, 12, 14, 4.5), box(11.5, 0, 2.5, 12, 2, 13.5), box(6.5, -3.8, 4, 7, 5, 8), box(9.2, 8, 4, 10, 8.5, 8),
					box(9.5, 0, 13, 11.5, 16, 13.5), box(9.5, 0, 3, 10, 16, 13), box(10, 9, 5, 10.5, 12, 8), box(9.5, 0, 2.5, 11.5, 16, 3), box(10, 14, 3, 11.5, 16, 13), box(10, 0, 3, 11.5, 2, 13));
			case WEST -> Shapes.or(box(4, 14, 2.5, 4.5, 16, 13.5), box(4, 2, 2.5, 4.5, 14, 4.5), box(4, 2, 11.5, 4.5, 14, 13.5), box(4, 0, 2.5, 4.5, 2, 13.5), box(9, -3.8, 8, 9.5, 5, 12), box(6, 8, 8, 6.8, 8.5, 12), box(4.5, 0, 2.5, 6.5, 16, 3),
					box(6, 0, 3, 6.5, 16, 13), box(5.5, 9, 8, 6, 12, 11), box(4.5, 0, 13, 6.5, 16, 13.5), box(4.5, 14, 3, 6, 16, 13), box(4.5, 0, 3, 6, 2, 13));
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
		BlockRenderLayerMap.INSTANCE.putBlock(TechDecoratorsModBlocks.TECHDECORATORS_MEDAL, RenderType.solid());
	}
}
