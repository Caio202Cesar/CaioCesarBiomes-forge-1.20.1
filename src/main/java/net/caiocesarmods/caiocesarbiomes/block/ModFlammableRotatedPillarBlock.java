package net.caiocesarmods.caiocesarbiomes.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import org.jetbrains.annotations.Nullable;

public class ModFlammableRotatedPillarBlock extends RotatedPillarBlock {
    public ModFlammableRotatedPillarBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if(context.getItemInHand().getItem() instanceof AxeItem) {
            if(state.is(ModBlocks.ARAUCARIA_LOG.get())) {
                return ModBlocks.STRIPPED_ARAUCARIA_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.ARAUCARIA_WOOD.get())) {
                return ModBlocks.STRIPPED_ARAUCARIA_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.NOTHOFAGUS_LOG.get())) {
                return ModBlocks.STRIPPED_NOTHOFAGUS_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.NOTHOFAGUS_WOOD.get())) {
                return ModBlocks.STRIPPED_NOTHOFAGUS_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.POMEGRANATE_LOG.get())) {
                return ModBlocks.STRIPPED_POMEGRANATE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.POMEGRANATE_WOOD.get())) {
                return ModBlocks.STRIPPED_POMEGRANATE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.OLEANDER_LOG.get())) {
                return ModBlocks.STRIPPED_OLEANDER_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.OLEANDER_WOOD.get())) {
                return ModBlocks.STRIPPED_OLEANDER_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.FIG_LOG.get())) {
                return ModBlocks.STRIPPED_FIG_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.FIG_WOOD.get())) {
                return ModBlocks.STRIPPED_FIG_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.JUNGLE_FIG_LOG.get())) {
                return ModBlocks.STRIPPED_FIG_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.JUNGLE_FIG_WOOD.get())) {
                return ModBlocks.STRIPPED_FIG_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.ITALIAN_CYPRESS_LOG.get())) {
                return ModBlocks.STRIPPED_ITALIAN_CYPRESS_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.ITALIAN_CYPRESS_WOOD.get())) {
                return ModBlocks.STRIPPED_ITALIAN_CYPRESS_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.STONE_PINE_LOG.get())) {
                return ModBlocks.STRIPPED_PINE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.STONE_PINE_WOOD.get())) {
                return ModBlocks.STRIPPED_PINE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.OLEANDER_LOG.get())) {
                return ModBlocks.STRIPPED_OLEANDER_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.OLEANDER_WOOD.get())) {
                return ModBlocks.STRIPPED_OLEANDER_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.POMEGRANATE_LOG.get())) {
                return ModBlocks.STRIPPED_POMEGRANATE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.POMEGRANATE_WOOD.get())) {
                return ModBlocks.STRIPPED_POMEGRANATE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.OLIVE_LOG.get())) {
                return ModBlocks.STRIPPED_OLIVE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.OLIVE_WOOD.get())) {
                return ModBlocks.STRIPPED_OLIVE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.CORK_OAK_LOG.get())) {
                return ModBlocks.STRIPPED_CORK_OAK_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.CORK_OAK_WOOD.get())) {
                return ModBlocks.STRIPPED_CORK_OAK_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.HOLM_OAK_LOG.get())) {
                return ModBlocks.STRIPPED_HOLM_OAK_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.HOLM_OAK_WOOD.get())) {
                return ModBlocks.STRIPPED_HOLM_OAK_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.STRAWBERRY_TREE_LOG.get())) {
                return ModBlocks.STRIPPED_STRAWBERRY_TREE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.STRAWBERRY_TREE_WOOD.get())) {
                return ModBlocks.STRIPPED_STRAWBERRY_TREE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.PLANE_LOG.get())) {
                return ModBlocks.STRIPPED_PLANE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.PLANE_WOOD.get())) {
                return ModBlocks.STRIPPED_PLANE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.CRABAPPLE_LOG.get())) {
                return ModBlocks.STRIPPED_CRABAPPLE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.CRABAPPLE_WOOD.get())) {
                return ModBlocks.STRIPPED_CRABAPPLE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.AVOCADO_LOG.get())) {
                return ModBlocks.STRIPPED_AVOCADO_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.AVOCADO_WOOD.get())) {
                return ModBlocks.STRIPPED_AVOCADO_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.CITRUS_LOG.get())) {
                return ModBlocks.STRIPPED_CITRUS_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.CITRUS_WOOD.get())) {
                return ModBlocks.STRIPPED_CITRUS_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.STARFRUIT_LOG.get())) {
                return ModBlocks.STRIPPED_STARFRUIT_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.STARFRUIT_WOOD.get())) {
                return ModBlocks.STRIPPED_STARFRUIT_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.POPLAR_LOG.get())) {
                return ModBlocks.STRIPPED_POPLAR_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.POPLAR_WOOD.get())) {
                return ModBlocks.STRIPPED_POPLAR_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}
