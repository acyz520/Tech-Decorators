
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package name.tech_decorators.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class TechDecoratorsModSounds {
	public static SoundEvent INTEL_TOOTHPASTE_AUDIO_FREQUENCY = SoundEvent.createVariableRangeEvent(new ResourceLocation("tech_decorators", "intel_toothpaste_audio_frequency"));
	public static SoundEvent BEAUTIFUL_WORLD = SoundEvent.createVariableRangeEvent(new ResourceLocation("tech_decorators", "beautiful_world"));
	public static SoundEvent ONE_LAST_KISS = SoundEvent.createVariableRangeEvent(new ResourceLocation("tech_decorators", "one_last_kiss"));
	public static SoundEvent A_CRUEL_ANGELS_THESIS = SoundEvent.createVariableRangeEvent(new ResourceLocation("tech_decorators", "a_cruel_angels_thesis"));

	public static void load() {
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("tech_decorators", "intel_toothpaste_audio_frequency"), INTEL_TOOTHPASTE_AUDIO_FREQUENCY);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("tech_decorators", "beautiful_world"), BEAUTIFUL_WORLD);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("tech_decorators", "one_last_kiss"), ONE_LAST_KISS);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("tech_decorators", "a_cruel_angels_thesis"), A_CRUEL_ANGELS_THESIS);
	}
}
