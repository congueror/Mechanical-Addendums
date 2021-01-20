package com.congueror.mechaddendums.util;

import java.util.List;
import java.util.regex.Pattern;

import com.congueror.mechaddendums.util.enums.SolarGenTier;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Tooltip {
	private static final Pattern COMPILE = Pattern.compile("@", Pattern.LITERAL);

    public static void showInfoShift(SolarGenTier tier ,List<ITextComponent> tooltip, int energy)
    {
        if(Screen.hasShiftDown())
        {
            int generation = tier.getNum();
            int transfer = generation * 2;
            int capacity = generation * 1000;

            addInformationLocalized(tooltip, "tooltip.mechaddendums.solargen_hold_shift", generation, transfer, capacity);
            addInformationLocalized(tooltip, "tooltip.mechaddendums.solargen_hold_shift2", energy);
        }
        else
            addInformationLocalized(tooltip, "tooltip.mechaddendums.solargen_shift_info");
    }

    private static void addInformationLocalized(List<ITextComponent> tooltip, String key, Object... parameters)
    {
        String translated = I18n.format(key, parameters);
        translated = COMPILE.matcher(translated).replaceAll("\u00a7");
        String[] formatted = translated.split("\n");
        for(String line : formatted)
            tooltip.add(new TranslationTextComponent(line));
    }
}
