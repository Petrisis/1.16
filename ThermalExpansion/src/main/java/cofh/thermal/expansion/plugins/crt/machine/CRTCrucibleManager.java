package cofh.thermal.expansion.plugins.crt.machine;

import cofh.thermal.expansion.init.TExpRecipeTypes;
import cofh.thermal.expansion.plugins.crt.actions.ActionRemoveThermalRecipeByOutput;
import cofh.thermal.expansion.plugins.crt.base.CRTRecipe;
import cofh.thermal.expansion.util.recipes.machine.CrucibleRecipe;
import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker.api.fluid.IFluidStack;
import com.blamejared.crafttweaker.api.item.*;
import com.blamejared.crafttweaker.api.managers.IRecipeManager;
import com.blamejared.crafttweaker.impl.actions.recipes.ActionAddRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.ResourceLocation;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@ZenCodeType.Name("mods.thermal.Crucible")
public class CRTCrucibleManager implements IRecipeManager {

    @ZenCodeType.Method
    public void addRecipe(String name, IFluidStack output, IIngredient ingredient, int energy) {

        name = fixRecipeName(name);
        ResourceLocation resourceLocation = new ResourceLocation("crafttweaker", name);

        CRTRecipe crtRecipe = new CRTRecipe(resourceLocation).energy(energy).input(ingredient).output(output);
        CraftTweakerAPI.apply(new ActionAddRecipe(this, crtRecipe.recipe(CrucibleRecipe::new), ""));
    }

    @Override
    public IRecipeType<CrucibleRecipe> getRecipeType() {

        return TExpRecipeTypes.RECIPE_CRUCIBLE;
    }

    @Override
    public void removeRecipe(IItemStack output) {

        throw new IllegalArgumentException("The Crucible only outputs fluids! Please provide an IFluidStack");
    }

    @ZenCodeType.Method
    public void removeRecipe(IFluidStack output) {

        CraftTweakerAPI.apply(new ActionRemoveThermalRecipeByOutput(this, new IFluidStack[]{output}));
    }

}
