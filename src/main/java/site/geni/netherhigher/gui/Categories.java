package site.geni.netherhigher.gui;

import me.shedaniel.clothconfig2.api.ConfigCategory;
import me.shedaniel.clothconfig2.impl.builders.BooleanToggleBuilder;
import me.shedaniel.clothconfig2.impl.builders.TextDescriptionBuilder;
import net.minecraft.client.resource.language.I18n;
import site.geni.netherhigher.NetherHigher;

@SuppressWarnings("ConstantConditions")
public class Categories {
	static class General {
		/**
		 * Creates all options of the "General" category
		 *
		 * @param general The "General" category's {@link ConfigCategory}
		 * @author geni
		 */
		static void createCategory(ConfigCategory general) {
			// Adds the warning in the "World" category
			general.addEntry(
				new TextDescriptionBuilder(
					"",
					"",
					I18n.translate("config.netherhigher.warning")
				).setColor(0xff5555)
					.build()
			);

			// Adds the option for raising the Nether's height limit to 256
			general.addEntry(
				new BooleanToggleBuilder(
					"text.cloth.reset_value",
					"config.netherhigher.raiseNetherHeightLimit",
					NetherHigher.getConfig().raiseNetherHeightLimit.getValue()
				).setDefaultValue(NetherHigher.getConfig().raiseNetherHeightLimit.getDefaultValue())
					.setSaveConsumer(bool -> NetherHigher.getConfig().raiseNetherHeightLimit.setValue(bool))
					.build()
			);

			// Adds the option for raising the End's height limit to 256
			general.addEntry(
				new BooleanToggleBuilder(
					"text.cloth.reset_value",
					"config.netherhigher.raiseEndHeightLimit",
					NetherHigher.getConfig().raiseEndHeightLimit.getValue()
				).setDefaultValue(NetherHigher.getConfig().raiseEndHeightLimit.getDefaultValue())
					.setSaveConsumer(bool -> NetherHigher.getConfig().raiseEndHeightLimit.setValue(bool))
					.build()
			);
		}
	}
}
