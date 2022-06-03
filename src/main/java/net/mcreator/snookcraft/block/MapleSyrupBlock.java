
package net.mcreator.snookcraft.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.snookcraft.procedures.MapleSyrupMobplayerCollidesBlockProcedure;
import net.mcreator.snookcraft.init.SnookcraftModFluids;

public class MapleSyrupBlock extends LiquidBlock {
	public MapleSyrupBlock() {
		super(() -> (FlowingFluid) SnookcraftModFluids.MAPLE_SYRUP.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 5;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		MapleSyrupMobplayerCollidesBlockProcedure.execute(entity);
	}
}
