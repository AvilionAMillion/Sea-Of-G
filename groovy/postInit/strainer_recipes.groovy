mods.gregtech.strainer.recipeBuilder()
        .fluidInputs(fluid('water') * 1000)
        .outputs(item('gregsea:sand') * 2)
        .chancedOutput(item('gregsea:sand'), 5000, 1000)
        .chancedOutput(item('gregsea:sediment'), 2500, 1000)
        .chancedOutput(item('gregsea:silt'), 2500, 500)
        .chancedOutput(item('minecraft:clay_ball'), 500, 100)
        .circuit(2)
        .duration(25)
        .EUt(8)
        .buildAndRegister()

mods.gregtech.strainer.recipeBuilder()
        .fluidInputs(fluid('water') * 2000)
        .notConsumable(item('gregsea:mesh1') * 1)
        .chancedOutput(item('gregsea:sediment'), 5000, 2000)
        .chancedOutput(item('gregtech:meta_dust_small:2049'), 1500, 500)
        .chancedOutput(item('gregtech:meta_dust_tiny:16'), 1000, 500)
        .circuit(1)
        .duration(100)
        .EUt(8)
        .buildAndRegister()
