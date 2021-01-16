package com.congueror.mechaddendums.util.energy;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class SolarGenProduction {
	public static float computeSunIntensity(World world, BlockPos pos)
    {
        float sunIntensity = 0;

        if(world.canBlockSeeSky(pos))
        {
            float multiplicator = 1.5f;
            float displacement = 1.2f;
            // Celestial angle == 0 at zenith.
            float celestialAngleRadians = world.getCelestialAngleRadians(1.0f);
            if(celestialAngleRadians > Math.PI)
            {
                celestialAngleRadians = (2 * 3.141592f - celestialAngleRadians);
            }

            sunIntensity = multiplicator * MathHelper.cos(celestialAngleRadians / displacement);
            sunIntensity = Math.max(0, sunIntensity);
            sunIntensity = Math.min(1, sunIntensity);

            if(sunIntensity > 0)
            {
                if(world.isRaining())
                    sunIntensity *= 0.4;

                if(world.isThundering())
                    sunIntensity *= 0.2;
            }
        }

        return sunIntensity;
    }
}
