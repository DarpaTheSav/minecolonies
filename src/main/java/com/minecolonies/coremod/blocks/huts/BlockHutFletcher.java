package com.minecolonies.coremod.blocks.huts;

import com.minecolonies.api.blocks.AbstractBlockHut;
import com.minecolonies.api.colony.IColony;
import com.minecolonies.api.colony.buildings.ModBuildings;
import com.minecolonies.api.colony.buildings.registry.BuildingEntry;
import com.minecolonies.coremod.research.ResearchInitializer;

import org.jetbrains.annotations.NotNull;

/**
 * Hut for the fletcher. No different from {@link AbstractBlockHut}
 */
public class BlockHutFletcher extends AbstractBlockHut<BlockHutFletcher>
{
    @NotNull
    @Override
    public String getName()
    {
        return "blockhutfletcher";
    }

    @Override
    public BuildingEntry getBuildingEntry()
    {
        return ModBuildings.fletcher;
    }

    @Override
    public void checkResearch(final IColony colony)
    {
        checkResearch(colony, ResearchInitializer.FLETCHER_RESEARCH);
    }
}
