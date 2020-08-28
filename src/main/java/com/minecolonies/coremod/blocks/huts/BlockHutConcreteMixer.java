package com.minecolonies.coremod.blocks.huts;

import com.minecolonies.api.blocks.AbstractBlockHut;
import com.minecolonies.api.colony.IColony;
import com.minecolonies.api.colony.buildings.ModBuildings;
import com.minecolonies.api.colony.buildings.registry.BuildingEntry;
import com.minecolonies.coremod.research.ResearchInitializer;

import org.jetbrains.annotations.NotNull;

/**
 * Hut for the concrete mason. No different from {@link AbstractBlockHut}
 */
public class BlockHutConcreteMixer extends AbstractBlockHut<BlockHutConcreteMixer>
{
    @NotNull
    @Override
    public String getName()
    {
        return "blockhutconcretemixer";
    }

    @Override
    public BuildingEntry getBuildingEntry()
    {
        return ModBuildings.concreteMixer;
    }

    @Override
    public void checkResearch(final IColony colony)
    {
        checkResearch(colony, ResearchInitializer.CONCRETE_MIXER_RESEARCH);
    }
}
