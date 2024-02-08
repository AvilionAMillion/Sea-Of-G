#priority 120

// This file is to make sure each and every iteration of an ore only comes from GT
import crafttweaker.item.IItemDefinition;
import crafttweaker.item.IItemStack;
import crafttweaker.item.IIngredient;
import crafttweaker.oredict.IOreDict;
import crafttweaker.oredict.IOreDictEntry;
import mods.gregtech.recipe.RecipeMaps;
import mods.gregtech.recipe.RecipeMap;

print("Ore Removal");
var oresDisabled as IItemStack[][IOreDictEntry] = {

#Mekanism Ores
	<ore:oreOsmium> : [
	<mekanism:oreblock>
	],
	
	<ore:oreCopper> : [
	<mekanism:oreblock:1>
	],
	
	<ore:oreTin> : [
	<mekanism:oreblock:2>
	]
};

for oreDictEntry, items in oresDisabled {
	for i in items {
		mods.jei.JEI.removeAndHide(i);
	}
	oreDictEntry.removeItems(items);
}
print ("Ore Removal Finished");

/////////////////////////////////////

print("Ingot Removal");
var ingotsDisabled as IItemStack[][IOreDictEntry] = {
	<ore:ingotOsmium> : [
	<mekanism:ingot:1>,
	<exnihilocreatio:item_ore_osmium:3>],
	<ore:ingotBronze> : [
	<mekanism:ingot:2>],
	<ore:ingotSteel> : [
	<mekanism:ingot:4>],
	<ore:ingotCopper> : [
	<mekanism:ingot:5>],
	<ore:ingotTin> : [
	<mekanism:ingot:6>]
};

for oreDictEntry, items in ingotsDisabled {
	for i in items {
		mods.jei.JEI.removeAndHide(i);
	}
	oreDictEntry.removeItems(items);
}
print("Ingot Removal Finished");