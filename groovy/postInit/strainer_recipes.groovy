
mods.gregtech.strainer.recipeBuilder()
        .fluidInputs(fluid('water') * 1000)
        .outputs(item('gregsea:sand') * 2)
        .chancedOutput(item('gregsea:sand'), 5000, 1000)
        .chancedOutput(item('gregsea:sediment'), 2500, 1000)
        .chancedOutput(item('gregsea:silt'), 2500, 500)
        .chancedOutput(item('minecraft:clay_ball'), 500, 100)
        .duration(25)
        .EUt(8)
        .buildAndRegister()