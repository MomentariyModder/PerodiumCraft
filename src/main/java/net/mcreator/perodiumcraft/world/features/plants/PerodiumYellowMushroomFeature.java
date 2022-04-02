
package net.mcreator.perodiumcraft.world.features.plants;

import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.RandomPatchFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.mcreator.perodiumcraft.init.PerodiumcraftModBlocks;

import java.util.Set;
import java.util.List;

public class PerodiumYellowMushroomFeature extends RandomPatchFeature {
	public static PerodiumYellowMushroomFeature FEATURE = null;
	public static Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new PerodiumYellowMushroomFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("perodiumcraft:perodium_yellow_mushroom", FEATURE,
				FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
						new SimpleBlockConfiguration(
								BlockStateProvider.simple(PerodiumcraftModBlocks.PERODIUM_YELLOW_MUSHROOM.get().defaultBlockState())),
						List.of(), 64));
		PLACED_FEATURE = PlacementUtils.register("perodiumcraft:perodium_yellow_mushroom", CONFIGURED_FEATURE,
				List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, CountPlacement.of(5)));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("perodiumcraft:perodium_oak_plains"),
			new ResourceLocation("perodiumcraft:perodium_zombie_plains"), new ResourceLocation("perodiumcraft:perodium_desert"),
			new ResourceLocation("perodiumcraft:ruby_zombie_plains"), new ResourceLocation("perodiumcraft:infiniti_swamp"),
			new ResourceLocation("perodiumcraft:akvamarine_birch_forest"), new ResourceLocation("perodiumcraft:akvamarine_plains"),
			new ResourceLocation("perodiumcraft:akvamarine_zombie_plains"), new ResourceLocation("perodiumcraft:perodium_oak_forest"),
			new ResourceLocation("perodiumcraft:ruby_jungle_forest"), new ResourceLocation("perodiumcraft:hochiym_plains"));
	private final Set<ResourceKey<Level>> generate_dimensions = Set
			.of(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("perodiumcraft:perodium_land")));

	public PerodiumYellowMushroomFeature() {
		super(RandomPatchConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
