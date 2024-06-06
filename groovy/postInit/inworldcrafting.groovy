import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock
import net.minecraft.util.math.BlockPos
import net.minecraftforge.items.ItemHandlerHelper

// Grass Block
inWorldCrafting.fluidToItem.recipeBuilder()
    .fluidInput(fluid('fertilizerfluid'))
    .input(item('minecraft:dirt'))
    .output(item('minecraft:grass'))
    .register()

// Nutrient Rich Water
inWorldCrafting.fluidToFluid.recipeBuilder()
        .fluidInput(fluid('water'))
        .input(item('gregtech:meta_dust:1599') * 2)
        .fluidOutput(fluid('mineralwater1'))
        .register()

// Nutrient Rich Water
inWorldCrafting.fluidToFluid.recipeBuilder()
        .fluidInput(fluid('water'))
        .input(item('minecraft:sand') * 2, item('gregsea:siltblock'), item('minecraft:clay_ball'))
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

// Crucible
inWorldCrafting.burning.recipeBuilder()
    .input(item('exnihilocreatio:block_crucible'))
    .output(item('exnihilocreatio:block_crucible:1'))
    .register()

// Clay Bucket
inWorldCrafting.burning.recipeBuilder()
        .input(item('claybucket:unfiredclaybucket'))
        .output(item('claybucket:claybucket'))
        .register()

// Whittling Stick Creating Fire
eventManager.listen( { RightClickBlock event ->
    def player = event.getEntityPlayer()
    def heldItem = player.getHeldItemMainhand()
    if (ItemHandlerHelper.canItemStacksStack(heldItem, item('gregsea:whittlingsticks'))) {
        World world = event.getWorld()
        BlockPos pos = event.getPos().add(0, 1, 0)
        if (world.isAirBlock(pos)) {
            world.setBlockState(pos, block('minecraft:fire').getDefaultState())
            heldItem.shrink(1)
        }
    }
})



