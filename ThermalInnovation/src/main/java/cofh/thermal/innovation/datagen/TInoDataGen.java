package cofh.thermal.innovation.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

import static cofh.core.util.constants.Constants.ID_THERMAL_INNOVATION;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = ID_THERMAL_INNOVATION)
public class TInoDataGen {

    @SubscribeEvent
    public static void gatherData(final GatherDataEvent event) {

        if (event.includeServer()) {
            registerServerProviders(event);
        }
        if (event.includeClient()) {
            registerClientProviders(event);
        }
    }

    private static void registerServerProviders(GatherDataEvent event) {

        DataGenerator gen = event.getGenerator();
        ExistingFileHelper exFileHelper = event.getExistingFileHelper();

        TInoTags.Block blockTags = new TInoTags.Block(gen, exFileHelper);

        gen.addProvider(blockTags);
        gen.addProvider(new TInoTags.Item(gen, blockTags, exFileHelper));
        gen.addProvider(new TInoTags.Fluid(gen, exFileHelper));

        gen.addProvider(new TInoRecipes(gen));
    }

    private static void registerClientProviders(GatherDataEvent event) {

    }

}
