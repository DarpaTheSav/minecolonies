package com.minecolonies.coremod.blocks.huts;

import com.minecolonies.api.blocks.AbstractBlockHut;
import com.minecolonies.api.colony.IColony;
import com.minecolonies.api.colony.buildings.ModBuildings;
import com.minecolonies.api.colony.buildings.registry.BuildingEntry;
import com.minecolonies.coremod.research.ResearchInitializer;

import org.jetbrains.annotations.NotNull;

/**
 * Hut for the crusher. No different from {@link AbstractBlockHut}
 */
public class BlockHutCrusher extends AbstractBlockHut<BlockHutCrusher>
{
    @NotNull
    @Override
    public String getName()
    {
        return "blockhutcrusher";
    }

    @Override
    public BuildingEntry getBuildingEntry()
    {
        return ModBuildings.crusher;
    }

    @Override
    public void checkResearch(final IColony colony)
    {
        checkResearch(colony, ResearchInitializer.CRUSHER_RESEARCH);
    }
}
