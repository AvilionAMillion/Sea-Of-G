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
        item('gregtech:meta_dust_tiny:16'), item('gregtech:meta_item_1:1001')]
)

// String Mesh
crafting.addShaped('mesh', item('gregsea:mesh1'), [
        [item('minecraft:string'), item('minecraft:string'), item('minecraft:string')],
        [item('minecraft:string'), item('minecraft:string'), item('minecraft:string')],
        [item('minecraft:string'), item('minecraft:string'), item('minecraft:string')]])