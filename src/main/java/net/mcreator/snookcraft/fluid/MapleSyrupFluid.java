
package net.mcreator.snookcraft.fluid;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.Rarity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.BlockPos;

import net.mcreator.snookcraft.init.SnookcraftModItems;
import net.mcreator.snookcraft.init.SnookcraftModFluids;
import net.mcreator.snookcraft.init.SnookcraftModBlocks;

public abstract class MapleSyrupFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(SnookcraftModFluids.MAPLE_SYRUP,
			SnookcraftModFluids.FLOWING_MAPLE_SYRUP,
			FluidAttributes
					.builder(new ResourceLocation("snookcraft:blocks/lava_placeholder"), new ResourceLocation("snookcraft:blocks/lava_placeholder"))

					.rarity(Rarity.UNCOMMON).sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty_lava"))))
			.explosionResistance(100f).canMultiply().tickRate(20)

			.bucket(SnookcraftModItems.MAPLE_SYRUP_BUCKET).block(() -> (LiquidBlock) SnookcraftModBlocks.MAPLE_SYRUP.get());

	private MapleSyrupFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.FALLING_WATER;
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(-1);
	}

	public static class Source extends MapleSyrupFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends MapleSyrupFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
