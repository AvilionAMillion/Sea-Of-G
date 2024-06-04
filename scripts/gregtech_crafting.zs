// Gregtech ZenScript
import crafttweaker.item.IItemDefinition;
import crafttweaker.item.IItemStack;
import crafttweaker.item.IIngredient;
import crafttweaker.oredict.IOreDict;
import crafttweaker.oredict.IOreDictEntry;
import mods.gregtech.recipe.RecipeMaps;
import mods.gregtech.recipe.RecipeMap;

// Crafting
# Flint Saw recipe change
recipes.removeByRecipeName("gregtech:saw_flint");
recipes.addShaped(<gregtech:saw>.withTag({DisallowContainerItem: 0 as byte, "GT.Behaviours": {HarvestIce: 1 as byte}, HideFlags: 2, "GT.Tool": {MaxDurability: 39, AttackDamage: -1.0 as float, Durability: 0, Material: "gregtech:flint", AttackSpeed: -2.6 as float}}),
	[[<minecraft:stick>, <minecraft:stick>],
	[<minecraft:flint>, <minecraft:flint>]]);