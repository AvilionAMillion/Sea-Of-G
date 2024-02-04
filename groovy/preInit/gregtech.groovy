import gregtech.api.recipes.RecipeMap
import gregtech.api.recipes.builders.SimpleRecipeBuilder

import gregtech.api.gui.GuiTextures
import gregtech.api.gui.widgets.ProgressWidget.MoveType
import gregtech.core.sound.GTSoundEvents

import gregtech.api.metatileentity.SimpleMachineMetaTileEntity
import gregtech.api.metatileentity.MetaTileEntity
import gregtech.api.GTValues
import gregtech.client.renderer.texture.Textures

import gregtech.common.metatileentities.MetaTileEntities

RecipeMap<SimpleRecipeBuilder> STRAINER_RECIPES = new RecipeMap<>("STRAINER", 0, 6, 1, 0,
        new SimpleRecipeBuilder(), false)
        .setProgressBar(GuiTextures.PROGRESS_BAR_SIFT, MoveType.HORIZONTAL)
        .setSound(GTSoundEvents.MOTOR)

for (int i = 0; i < 5; i++) {
    ResourceLocation rl = new ResourceLocation(GTValues.MODID, "strainer" + "." + GTValues.VN[i].toLowerCase())
    MetaTileEntity strainerMachine = new SimpleMachineMetaTileEntity(rl, STRAINER_RECIPES, Textures.SIFTER_OVERLAY, i, false)

    MetaTileEntities.registerMetaTileEntity(30000 + i, strainerMachine)
}
