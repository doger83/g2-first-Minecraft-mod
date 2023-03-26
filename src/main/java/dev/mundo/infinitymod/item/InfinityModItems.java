package dev.mundo.infinitymod.item;

import dev.mundo.infinitymod.Main;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class InfinityModItems {

    public static final Item WHITE_INFINITY_CONCRETE = registerItem(
            "white_infinity_concrete",
            new Item(new FabricItemSettings().
                    group(ItemGroup.MISC)));

    public static final Item RAINBOW_INFINITY_CONCRETE = registerItem(
            "rainbow_infinity_concrete",
            new Item(new FabricItemSettings().
                    group(ItemGroup.MISC)));

    public static final Item RARE_RAINBOW_INFINITY_CONCRETE = registerItem(
            "rare_rainbow_infinity_concrete",
            new Item(new FabricItemSettings().
                    group(ItemGroup.MISC)));

    public static final Item Z_STONE_BLOCK = registerItem(
            "z_stone_block",
            new Item(new FabricItemSettings().
                    group(ItemGroup.MISC)));

    public static final Item RARE_RAINBOW_STONE_BLOCK = registerItem(
            "rare_rainbow_stone_block",
            new Item(new FabricItemSettings().
                    group(ItemGroup.MISC)));

    public static final Item WHITE_ULTRA_INFINITY_CONCRETE = registerItem(
            "white_ultra_infinity_concrete",
            new Item(new FabricItemSettings().
                    group(ItemGroup.MISC)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Main.LOGGER.debug("Registering Mod items for " + Main.MOD_ID);
    }
}
