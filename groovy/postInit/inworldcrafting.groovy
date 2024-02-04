// Grass Block
inWorldCrafting.fluidToItem.recipeBuilder()
    .fluidInput(fluid('fertilizerfluid'))
    .input(item('minecraft:dirt'))
    .output(item('minecraft:grass'))
    .register()

// Nutrient Rich Water
inWorldCrafting.fluidToFluid.recipeBuilder()
        .fluidInput(fluid('water'))
        .input(item('minecraft:sand') * 2, item('gregsea:siltblock') * 2)
        .fluidOutput(fluid('fertilizerfluid'))
        .register()

// Fertilizer
inWorldCrafting.fluidToItem.recipeBuilder()
        .fluidInput(fluid('fertilizerfluid'))
        .input(item('minecraft:clay_ball'))
        .output(item('gregtech:meta_item_1:1001'))
        .register()

// Podzol
inWorldCrafting.fluidToItem.recipeBuilder()
        .fluidInput(fluid('fertilizerfluid'))
        .input(item('minecraft:grass'), item('gregtech:meta_item_1:439'), item('minecraft:dirt:1'))
        .output(item('minecraft:dirt:2'))
        .register()

// Sapling
inWorldCrafting.fluidToItem.recipeBuilder()
        .fluidInput(fluid('fertilizerfluid'))
        .input(item('minecraft:deadbush'), item('gregtech:meta_item_1:439'))
        .output(item('minecraft:sapling'))
        .register()
