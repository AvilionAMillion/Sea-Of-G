// Sand Block
crafting.addShaped('seasand', item('minecraft:sand'), [
        [item('gregsea:sand'), item('gregsea:sand')],
        [item('gregsea:sand'), item('gregsea:sand')],])

// Silt Block
crafting.addShaped('siltblock', item('gregsea:siltblock'), [
        [item('gregsea:silt'), item('gregsea:silt')],
        [item('gregsea:silt'), item('gregsea:silt')],])

// Dirt Block
crafting.addShaped('dirt', item('minecraft:dirt'), [
        [item('gregsea:soil'), item('gregsea:soil')],
        [item('gregsea:soil'), item('gregsea:soil')],])

// Gravel
crafting.addShaped('gravel', item('minecraft:gravel'), [
        [item('gregsea:sediment'), item('gregsea:sediment')],
        [item('gregsea:sediment'), item('gregsea:sediment')],])

// Plant Ball
crafting.addShaped('plantball', item('gregtech:meta_item_1:439'), [
        [item('minecraft:wheat_seeds'), item('minecraft:wheat_seeds')],
        [item('minecraft:wheat_seeds'), item('gregtech:meta_item_1:1001')],])

// Dry Bush
crafting.addShaped('deadbush', item('minecraft:deadbush'), [
        [item('minecraft:stick')],
        [item('minecraft:stick')],])

// Whittling Sticks
crafting.addShaped('whittlingsticks', item('gregsea:whittlingsticks'), [
        [null, item('minecraft:stick'), null],
        [item('minecraft:stick'), item('minecraft:stick'), item('minecraft:stick')],
        [null, item('minecraft:stick'), null]])

// Gravel to Flint
crafting.addShapeless('flint', item('minecraft:flint'), [
        item('minecraft:gravel'), item('minecraft:gravel'), item('minecraft:gravel')]
)

// Bone Meal
crafting.addShapeless('bonemeal', item('minecraft:dye:15'), [
        item('gregtech:meta_dust_tiny:16'), item('gregtech:meta_item_1:1001')])

// Sapling to Sticks
crafting.addShapeless('stick-sapling', item('minecraft:stick') * 2, [
        ore('treeSapling')])

// String Mesh
crafting.addShaped('mesh', item('gregsea:mesh1'), [
        [item('minecraft:string'), item('minecraft:string'), item('minecraft:string')],
        [item('minecraft:string'), item('minecraft:string'), item('minecraft:string')],
        [item('minecraft:string'), item('minecraft:string'), item('minecraft:string')]])

// Plank Removal
crafting.remove('gregtech:rubber_planks')
crafting.remove('gregtech:oak_planks')
crafting.remove('gregtech:birch_planks')
crafting.remove('gregtech:spruce_planks')
crafting.remove('gregtech:jungle_planks')
crafting.remove('gregtech:acacia_planks')
crafting.remove('gregtech:dark_oak_planks')

// Porcelain Brick
crafting.addShapeless('porcelainbrick', item('gregsea:porcelainbrick'), [
        item('exnihilocreatio:item_material:1'), item('gregtech:meta_item_1:348')])

// Crucible
crafting.remove('exnihilocreatio:block_crucible_0')
crafting.addShaped('unfiredcrucible', item('exnihilocreatio:block_crucible'), [
        [item('gregsea:porcelainbrick'), null, item('gregsea:porcelainbrick')],
        [item('gregsea:porcelainbrick'), null, item('gregsea:porcelainbrick')],
        [item('gregsea:porcelainbrick'), item('gregsea:porcelainbrick'), item('gregsea:porcelainbrick')]])

// Coarse Dirt
crafting.addShaped('coarsedirt', item('minecraft:dirt:1'), [
        [item('minecraft:dirt'), item('minecraft:gravel')],
        [item('minecraft:gravel'), item('minecraft:dirt')]])

// Small Stone Dust
crafting.addShapeless('smallstone', item('gregtech:meta_dust_small:1599'), [
        item('gregtech:mortar'), item('minecraft:cobblestone')])