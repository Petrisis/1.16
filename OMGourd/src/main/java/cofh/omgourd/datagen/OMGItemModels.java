package cofh.omgourd.datagen;

import cofh.core.datagen.ItemModelProviderCoFH;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

import static cofh.core.util.constants.Constants.ID_OMGOURD;
import static cofh.omgourd.OMGourd.BLOCKS;

public class OMGItemModels extends ItemModelProviderCoFH {

    public OMGItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {

        super(generator, ID_OMGOURD, existingFileHelper);
    }

    @Override
    public String getName() {

        return "OMGourd: Item Models";
    }

    @Override
    protected void registerModels() {

        for (int i = 1; i <= 24; ++i) {
            blockItem(BLOCKS.getSup("carved_pumpkin_" + i));
            blockItem(BLOCKS.getSup("jack_o_lantern_" + i));
        }
    }

}
