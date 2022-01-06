
package net.mcreator.perodiumcraft.world.features.ores;

import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight;
import net.minecraft.world.level.levelgen.feature.configurations.RangeDecoratorConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.mcreator.perodiumcraft.init.PerodiumcraftModBlocks;

import java.util.Set;
import java.util.Random;

public class PerodiumCobblestoneFeature extends OreFeature {
	public static final PerodiumCobblestoneFeature FEATURE = (PerodiumCobblestoneFeature) new PerodiumCobblestoneFeature()
			.setRegistryName("perodiumcraft:perodium_cobblestone");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(PerodiumCobblestoneFeatureRuleTest.INSTANCE,
					PerodiumcraftModBlocks.PERODIUM_COBBLESTONE.defaultBlockState(), 6))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(244)))).squared().count(4);
	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("perodiumcraft:perodium_oak_plains"),
			new ResourceLocation("perodiumcraft:perodium_zombie_plains"), new ResourceLocation("perodiumcraft:perodium_desert"),
			new ResourceLocation("perodiumcraft:ruby_zombie_plains"), new ResourceLocation("perodiumcraft:infiniti_swamp"),
			new ResourceLocation("perodiumcraft:akvamarine_plains"), new ResourceLocation("perodiumcraft:akvamarine_zombie_plains"),
			new ResourceLocation("perodiumcraft:hochiym_plains"));

	public PerodiumCobblestoneFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;
		if (dimensionType == ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("perodiumcraft:perodium_land")))
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return false;
		return super.place(context);
	}

	private static class PerodiumCobblestoneFeatureRuleTest extends RuleTest {
		static final PerodiumCobblestoneFeatureRuleTest INSTANCE = new PerodiumCobblestoneFeatureRuleTest();
		static final com.mojang.serialization.Codec<PerodiumCobblestoneFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		static final RuleTestType<PerodiumCobblestoneFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("perodiumcraft:perodium_cobblestone_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;
			if (blockAt.getBlock() == PerodiumcraftModBlocks.AKVAMARINE_GRASS)
				blockCriteria = true;
			if (blockAt.getBlock() == PerodiumcraftModBlocks.RUBY_GRASS)
				blockCriteria = true;
			if (blockAt.getBlock() == PerodiumcraftModBlocks.PERODIUM_GRASS)
				blockCriteria = true;
			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
