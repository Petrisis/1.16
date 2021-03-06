package cofh.thermal.locomotion.datagen;

import cofh.core.datagen.BlockStateProviderCoFH;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

import static cofh.core.util.constants.Constants.ID_THERMAL;

public class TLocBlockStates extends BlockStateProviderCoFH {

    public TLocBlockStates(DataGenerator gen, ExistingFileHelper existingFileHelper) {

        super(gen, ID_THERMAL, existingFileHelper);
    }

    @Override
    public String getName() {

        return "Thermal Locomotion: BlockStates";
    }

    @Override
    protected void registerStatesAndModels() {

    }

}
