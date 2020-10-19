package cofh.core.util.references;

import net.minecraft.block.Block;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

import static cofh.core.util.constants.Constants.ID_FORGE;
import static cofh.core.util.constants.Constants.ID_THERMAL;

public class CoFHTags {

    public static class Blocks {

        public static final Tags.IOptionalNamedTag<Block> HARDENED_GLASS = thermalTag("glass/hardened");
        public static final Tags.IOptionalNamedTag<Block> ROCKWOOL = thermalTag("rockwool");

        public static final Tags.IOptionalNamedTag<Block> ORES_APATITE = forgeTag("ores/apatite");
        public static final Tags.IOptionalNamedTag<Block> ORES_CINNABAR = forgeTag("ores/cinnabar");
        public static final Tags.IOptionalNamedTag<Block> ORES_COPPER = forgeTag("ores/copper");
        public static final Tags.IOptionalNamedTag<Block> ORES_LEAD = forgeTag("ores/lead");
        public static final Tags.IOptionalNamedTag<Block> ORES_NICKEL = forgeTag("ores/nickel");
        public static final Tags.IOptionalNamedTag<Block> ORES_NITER = forgeTag("ores/niter");
        public static final Tags.IOptionalNamedTag<Block> ORES_RUBY = forgeTag("ores/ruby");
        public static final Tags.IOptionalNamedTag<Block> ORES_SAPPHIRE = forgeTag("ores/sapphire");
        public static final Tags.IOptionalNamedTag<Block> ORES_SILVER = forgeTag("ores/silver");
        public static final Tags.IOptionalNamedTag<Block> ORES_SULFUR = forgeTag("ores/sulfur");
        public static final Tags.IOptionalNamedTag<Block> ORES_TIN = forgeTag("ores/tin");

        public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_APATITE = forgeTag("storage_blocks/apatite");
        public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_BAMBOO = forgeTag("storage_blocks/bamboo");
        public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_BRONZE = forgeTag("storage_blocks/bronze");
        public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_CHARCOAL = forgeTag("storage_blocks/charcoal");
        public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_CINNABAR = forgeTag("storage_blocks/cinnabar");
        public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_CONSTANTAN = forgeTag("storage_blocks/constantan");
        public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_COPPER = forgeTag("storage_blocks/copper");
        public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_ELECTRUM = forgeTag("storage_blocks/electrum");
        public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_ENDERIUM = forgeTag("storage_blocks/enderium");
        public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_INVAR = forgeTag("storage_blocks/invar");
        public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_LEAD = forgeTag("storage_blocks/lead");
        public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_LUMIUM = forgeTag("storage_blocks/lumium");
        public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_NICKEL = forgeTag("storage_blocks/nickel");
        public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_NITER = forgeTag("storage_blocks/niter");
        public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_RUBY = forgeTag("storage_blocks/ruby");
        public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_SAPPHIRE = forgeTag("storage_blocks/sapphire");
        public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_SIGNALUM = forgeTag("storage_blocks/signalum");
        public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_SILVER = forgeTag("storage_blocks/silver");
        public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_SUGAR_CANE = forgeTag("storage_blocks/sugar_cane");
        public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_SULFUR = forgeTag("storage_blocks/sulfur");
        public static final Tags.IOptionalNamedTag<Block> STORAGE_BLOCKS_TIN = forgeTag("storage_blocks/tin");

        // region HELPERS
        private static Tags.IOptionalNamedTag<Block> thermalTag(String name) {

            return BlockTags.createOptional(new ResourceLocation(ID_THERMAL, name));
        }

        private static Tags.IOptionalNamedTag<Block> forgeTag(String name) {

            return BlockTags.createOptional(new ResourceLocation(ID_FORGE, name));
        }
        // endregion
    }

    public static class Items {

        public static final Tags.IOptionalNamedTag<Item> COINS = forgeTag("coins");

        public static final Tags.IOptionalNamedTag<Item> COINS_BRONZE = forgeTag("coins/bronze");
        public static final Tags.IOptionalNamedTag<Item> COINS_CONSTANTAN = forgeTag("coins/constantan");
        public static final Tags.IOptionalNamedTag<Item> COINS_COPPER = forgeTag("coins/copper");
        public static final Tags.IOptionalNamedTag<Item> COINS_ELECTRUM = forgeTag("coins/electrum");
        public static final Tags.IOptionalNamedTag<Item> COINS_ENDERIUM = forgeTag("coins/enderium");
        public static final Tags.IOptionalNamedTag<Item> COINS_GOLD = forgeTag("coins/gold");
        public static final Tags.IOptionalNamedTag<Item> COINS_INVAR = forgeTag("coins/invar");
        public static final Tags.IOptionalNamedTag<Item> COINS_IRON = forgeTag("coins/iron");
        public static final Tags.IOptionalNamedTag<Item> COINS_LEAD = forgeTag("coins/lead");
        public static final Tags.IOptionalNamedTag<Item> COINS_LUMIUM = forgeTag("coins/lumium");
        public static final Tags.IOptionalNamedTag<Item> COINS_NICKEL = forgeTag("coins/nickel");
        public static final Tags.IOptionalNamedTag<Item> COINS_SIGNALUM = forgeTag("coins/signalum");
        public static final Tags.IOptionalNamedTag<Item> COINS_SILVER = forgeTag("coins/silver");
        public static final Tags.IOptionalNamedTag<Item> COINS_TIN = forgeTag("coins/tin");

        public static final Tags.IOptionalNamedTag<Item> DUSTS_APATITE = forgeTag("dusts/bronze");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_BRONZE = forgeTag("dusts/bronze");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_CINNABAR = forgeTag("dusts/cinnabar");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_CONSTANTAN = forgeTag("dusts/constantan");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_COPPER = forgeTag("dusts/copper");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_DIAMOND = forgeTag("dusts/diamond");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_ELECTRUM = forgeTag("dusts/electrum");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_EMERALD = forgeTag("dusts/emerald");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_ENDERIUM = forgeTag("dusts/enderium");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_GOLD = forgeTag("dusts/gold");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_INVAR = forgeTag("dusts/invar");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_IRON = forgeTag("dusts/iron");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_LAPIS = forgeTag("dusts/lapis");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_LEAD = forgeTag("dusts/lead");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_LUMIUM = forgeTag("dusts/lumium");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_NICKEL = forgeTag("dusts/nickel");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_NITER = forgeTag("dusts/niter");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_QUARTZ = forgeTag("dusts/quartz");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_RUBY = forgeTag("dusts/ruby");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_SAPPHIRE = forgeTag("dusts/sapphire");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_SIGNALUM = forgeTag("dusts/signalum");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_SILVER = forgeTag("dusts/silver");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_SULFUR = forgeTag("dusts/sulfur");
        public static final Tags.IOptionalNamedTag<Item> DUSTS_TIN = forgeTag("dusts/tin");

        public static final Tags.IOptionalNamedTag<Item> GEARS = forgeTag("gears");

        public static final Tags.IOptionalNamedTag<Item> GEARS_BRONZE = forgeTag("gears/bronze");
        public static final Tags.IOptionalNamedTag<Item> GEARS_CONSTANTAN = forgeTag("gears/constantan");
        public static final Tags.IOptionalNamedTag<Item> GEARS_COPPER = forgeTag("gears/copper");
        public static final Tags.IOptionalNamedTag<Item> GEARS_DIAMOND = forgeTag("gears/diamond");
        public static final Tags.IOptionalNamedTag<Item> GEARS_ELECTRUM = forgeTag("gears/electrum");
        public static final Tags.IOptionalNamedTag<Item> GEARS_EMERALD = forgeTag("gears/emerald");
        public static final Tags.IOptionalNamedTag<Item> GEARS_ENDERIUM = forgeTag("gears/enderium");
        public static final Tags.IOptionalNamedTag<Item> GEARS_GOLD = forgeTag("gears/gold");
        public static final Tags.IOptionalNamedTag<Item> GEARS_INVAR = forgeTag("gears/invar");
        public static final Tags.IOptionalNamedTag<Item> GEARS_IRON = forgeTag("gears/iron");
        public static final Tags.IOptionalNamedTag<Item> GEARS_LAPIS = forgeTag("gears/lapis");
        public static final Tags.IOptionalNamedTag<Item> GEARS_LEAD = forgeTag("gears/lead");
        public static final Tags.IOptionalNamedTag<Item> GEARS_LUMIUM = forgeTag("gears/lumium");
        public static final Tags.IOptionalNamedTag<Item> GEARS_NICKEL = forgeTag("gears/nickel");
        public static final Tags.IOptionalNamedTag<Item> GEARS_QUARTZ = forgeTag("gears/quartz");
        public static final Tags.IOptionalNamedTag<Item> GEARS_RUBY = forgeTag("gears/ruby");
        public static final Tags.IOptionalNamedTag<Item> GEARS_SAPPHIRE = forgeTag("gears/sapphire");
        public static final Tags.IOptionalNamedTag<Item> GEARS_SIGNALUM = forgeTag("gears/signalum");
        public static final Tags.IOptionalNamedTag<Item> GEARS_SILVER = forgeTag("gears/silver");
        public static final Tags.IOptionalNamedTag<Item> GEARS_TIN = forgeTag("gears/tin");

        public static final Tags.IOptionalNamedTag<Item> GEMS_APATITE = forgeTag("gems/apatite");
        public static final Tags.IOptionalNamedTag<Item> GEMS_CINNABAR = forgeTag("gems/cinnabar");
        public static final Tags.IOptionalNamedTag<Item> GEMS_NITER = forgeTag("gems/niter");
        public static final Tags.IOptionalNamedTag<Item> GEMS_RUBY = forgeTag("gems/ruby");
        public static final Tags.IOptionalNamedTag<Item> GEMS_SAPPHIRE = forgeTag("gems/sapphire");
        public static final Tags.IOptionalNamedTag<Item> GEMS_SULFUR = forgeTag("gems/sulfur");

        public static final Tags.IOptionalNamedTag<Item> INGOTS_BRONZE = forgeTag("ingots/bronze");
        public static final Tags.IOptionalNamedTag<Item> INGOTS_CONSTANTAN = forgeTag("ingots/constantan");
        public static final Tags.IOptionalNamedTag<Item> INGOTS_COPPER = forgeTag("ingots/copper");
        public static final Tags.IOptionalNamedTag<Item> INGOTS_ELECTRUM = forgeTag("ingots/electrum");
        public static final Tags.IOptionalNamedTag<Item> INGOTS_ENDERIUM = forgeTag("ingots/enderium");
        public static final Tags.IOptionalNamedTag<Item> INGOTS_INVAR = forgeTag("ingots/invar");
        public static final Tags.IOptionalNamedTag<Item> INGOTS_LEAD = forgeTag("ingots/lead");
        public static final Tags.IOptionalNamedTag<Item> INGOTS_LUMIUM = forgeTag("ingots/lumium");
        public static final Tags.IOptionalNamedTag<Item> INGOTS_NICKEL = forgeTag("ingots/nickel");
        public static final Tags.IOptionalNamedTag<Item> INGOTS_SIGNALUM = forgeTag("ingots/signalum");
        public static final Tags.IOptionalNamedTag<Item> INGOTS_SILVER = forgeTag("ingots/silver");
        public static final Tags.IOptionalNamedTag<Item> INGOTS_TIN = forgeTag("ingots/tin");

        public static final Tags.IOptionalNamedTag<Item> NUGGETS_BRONZE = forgeTag("nuggets/bronze");
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_CONSTANTAN = forgeTag("nuggets/constantan");
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_COPPER = forgeTag("nuggets/copper");
        // public static final Tags.IOptionalNamedTag<Item> NUGGETS_DIAMOND = forgeTag("nuggets/diamond");
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_ELECTRUM = forgeTag("nuggets/electrum");
        // public static final Tags.IOptionalNamedTag<Item> NUGGETS_EMERALD = forgeTag("nuggets/emerald");
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_ENDERIUM = forgeTag("nuggets/enderium");
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_INVAR = forgeTag("nuggets/invar");
        // public static final Tags.IOptionalNamedTag<Item> NUGGETS_LAPIS = forgeTag("nuggets/lapis");
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_LEAD = forgeTag("nuggets/lead");
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_LUMIUM = forgeTag("nuggets/lumium");
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_NICKEL = forgeTag("nuggets/nickel");
        // public static final Tags.IOptionalNamedTag<Item> NUGGETS_QUARTZ = forgeTag("nuggets/quartz");
        // public static final Tags.IOptionalNamedTag<Item> NUGGETS_RUBY = forgeTag("nuggets/ruby");
        // public static final Tags.IOptionalNamedTag<Item> NUGGETS_SAPPHIRE = forgeTag("nuggets/sapphire");
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_SIGNALUM = forgeTag("nuggets/signalum");
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_SILVER = forgeTag("nuggets/silver");
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_TIN = forgeTag("nuggets/tin");

        public static final Tags.IOptionalNamedTag<Item> ORES_APATITE = forgeTag("ores/apatite");
        public static final Tags.IOptionalNamedTag<Item> ORES_CINNABAR = forgeTag("ores/cinnabar");
        public static final Tags.IOptionalNamedTag<Item> ORES_COPPER = forgeTag("ores/copper");
        public static final Tags.IOptionalNamedTag<Item> ORES_LEAD = forgeTag("ores/lead");
        public static final Tags.IOptionalNamedTag<Item> ORES_NICKEL = forgeTag("ores/nickel");
        public static final Tags.IOptionalNamedTag<Item> ORES_NITER = forgeTag("ores/niter");
        public static final Tags.IOptionalNamedTag<Item> ORES_RUBY = forgeTag("ores/ruby");
        public static final Tags.IOptionalNamedTag<Item> ORES_SAPPHIRE = forgeTag("ores/sapphire");
        public static final Tags.IOptionalNamedTag<Item> ORES_SILVER = forgeTag("ores/silver");
        public static final Tags.IOptionalNamedTag<Item> ORES_SULFUR = forgeTag("ores/sulfur");
        public static final Tags.IOptionalNamedTag<Item> ORES_TIN = forgeTag("ores/tin");

        public static final Tags.IOptionalNamedTag<Item> PLATES = forgeTag("plates");

        public static final Tags.IOptionalNamedTag<Item> PLATES_BRONZE = forgeTag("plates/bronze");
        public static final Tags.IOptionalNamedTag<Item> PLATES_CONSTANTAN = forgeTag("plates/constantan");
        public static final Tags.IOptionalNamedTag<Item> PLATES_COPPER = forgeTag("plates/copper");
        // public static final Tags.IOptionalNamedTag<Item> PLATES_DIAMOND = forgeTag("plates/diamond");
        public static final Tags.IOptionalNamedTag<Item> PLATES_ELECTRUM = forgeTag("plates/electrum");
        // public static final Tags.IOptionalNamedTag<Item> PLATES_EMERALD = forgeTag("plates/emerald");
        public static final Tags.IOptionalNamedTag<Item> PLATES_ENDERIUM = forgeTag("plates/enderium");
        public static final Tags.IOptionalNamedTag<Item> PLATES_GOLD = forgeTag("plates/gold");
        public static final Tags.IOptionalNamedTag<Item> PLATES_INVAR = forgeTag("plates/invar");
        public static final Tags.IOptionalNamedTag<Item> PLATES_IRON = forgeTag("plates/iron");
        // public static final Tags.IOptionalNamedTag<Item> PLATES_LAPIS = forgeTag("plates/lapis");
        public static final Tags.IOptionalNamedTag<Item> PLATES_LEAD = forgeTag("plates/lead");
        public static final Tags.IOptionalNamedTag<Item> PLATES_LUMIUM = forgeTag("plates/lumium");
        public static final Tags.IOptionalNamedTag<Item> PLATES_NICKEL = forgeTag("plates/nickel");
        // public static final Tags.IOptionalNamedTag<Item> PLATES_QUARTZ = forgeTag("plates/quartz");
        // public static final Tags.IOptionalNamedTag<Item> PLATES_RUBY = forgeTag("plates/ruby");
        // public static final Tags.IOptionalNamedTag<Item> PLATES_SAPPHIRE = forgeTag("plates/sapphire");
        public static final Tags.IOptionalNamedTag<Item> PLATES_SIGNALUM = forgeTag("plates/signalum");
        public static final Tags.IOptionalNamedTag<Item> PLATES_SILVER = forgeTag("plates/silver");
        public static final Tags.IOptionalNamedTag<Item> PLATES_TIN = forgeTag("plates/tin");

        public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_APATITE = forgeTag("storage_blocks/apatite");
        public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_BAMBOO = forgeTag("storage_blocks/bamboo");
        public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_BRONZE = forgeTag("storage_blocks/bronze");
        public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_CHARCOAL = forgeTag("storage_blocks/charcoal");
        public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_CINNABAR = forgeTag("storage_blocks/cinnabar");
        public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_CONSTANTAN = forgeTag("storage_blocks/constantan");
        public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_COPPER = forgeTag("storage_blocks/copper");
        public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_ELECTRUM = forgeTag("storage_blocks/electrum");
        public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_ENDERIUM = forgeTag("storage_blocks/enderium");
        public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_INVAR = forgeTag("storage_blocks/invar");
        public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_LEAD = forgeTag("storage_blocks/lead");
        public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_LUMIUM = forgeTag("storage_blocks/lumium");
        public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_NICKEL = forgeTag("storage_blocks/nickel");
        public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_NITER = forgeTag("storage_blocks/niter");
        public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_RUBY = forgeTag("storage_blocks/ruby");
        public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_SAPPHIRE = forgeTag("storage_blocks/sapphire");
        public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_SIGNALUM = forgeTag("storage_blocks/signalum");
        public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_SILVER = forgeTag("storage_blocks/silver");
        public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_SUGAR_CANE = forgeTag("storage_blocks/sugar_cane");
        public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_SULFUR = forgeTag("storage_blocks/sulfur");
        public static final Tags.IOptionalNamedTag<Item> STORAGE_BLOCKS_TIN = forgeTag("storage_blocks/tin");

        public static final Tags.IOptionalNamedTag<Item> TOOLS_WRENCH = forgeTag("tools/wrench");

        public static final Tags.IOptionalNamedTag<Item> SAWDUST = forgeTag("sawdust");

        public static final Tags.IOptionalNamedTag<Item> MACHINE_DIES = thermalTag("crafting/dies");
        public static final Tags.IOptionalNamedTag<Item> MACHINE_CASTS = thermalTag("crafting/casts");

        public static final Tags.IOptionalNamedTag<Item> HARDENED_GLASS = thermalTag("glass/hardened");
        public static final Tags.IOptionalNamedTag<Item> ROCKWOOL = thermalTag("rockwool");

        // region HELPERS
        private static Tags.IOptionalNamedTag<Item> thermalTag(String name) {

            return ItemTags.createOptional(new ResourceLocation(ID_THERMAL, name));
        }

        private static Tags.IOptionalNamedTag<Item> forgeTag(String name) {

            return ItemTags.createOptional(new ResourceLocation(ID_FORGE, name));
        }
        // endregion
    }

    public static class Fluids {

        // region HELPERS
        private static Tags.IOptionalNamedTag<Fluid> thermalTag(String name) {

            return FluidTags.createOptional(new ResourceLocation(ID_THERMAL, name));
        }

        private static Tags.IOptionalNamedTag<Fluid> forgeTag(String name) {

            return FluidTags.createOptional(new ResourceLocation(ID_FORGE, name));
        }
        // endregion
    }

}
