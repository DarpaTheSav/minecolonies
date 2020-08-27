package com.minecolonies.coremod.blocks.huts;

import com.minecolonies.api.blocks.AbstractBlockHut;
import com.minecolonies.api.colony.IColony;
import com.minecolonies.api.colony.buildings.ModBuildings;
import com.minecolonies.api.colony.buildings.registry.BuildingEntry;
import com.minecolonies.coremod.research.UnlockBuildingResearchEffect;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.text.TranslationTextComponent;

import org.jetbrains.annotations.NotNull;

/**
 * Hut for the school. No different from {@link AbstractBlockHut}
 */
public class BlockHutSchool extends AbstractBlockHut<BlockHutSchool>
{
    public BlockHutSchool()
    {
        //No different from Abstract parent
        super();
    }

    @NotNull
    @Override
    public String getName()
    {
        return "blockhutschool";
    }

    @Override
    public BuildingEntry getBuildingEntry()
    {
        return ModBuildings.school;
    }

    @Override
    public void onItemCrafted(final IColony colony, final PlayerEntity player)
    {
        if (colony == null || player == null)
        {
            return;
        }
        if (colony.getResearchManager().getResearchEffects().getEffect("School", UnlockBuildingResearchEffect.class) == null)
        {
            player.sendMessage(new TranslationTextComponent("com.minecolonies.coremod.research.crafted", "school"));
        }
    }
}
