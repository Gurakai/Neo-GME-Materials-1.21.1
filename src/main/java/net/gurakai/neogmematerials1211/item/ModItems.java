package net.gurakai.neogmematerials1211.item;

import net.gurakai.neogmematerials1211.NeoGMEMaterials;
import net.gurakai.neogmematerials1211.block.ModBlocks;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.gurakai.neogmematerials1211.item.ModCreativeTabs.addToItems;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NeoGMEMaterials.MOD_ID);



    //food

    public static final DeferredItem<Item> GURALLOY_APPLE = addToItems(ITEMS.register("guralloy_apple",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2400, 3), 1f)
                            .build())
                    .rarity(Rarity.RARE)
            )));

    //foodblocks

    public static final DeferredItem<BlockItem> BLOCK_THE_RAREST_STEAK = addToItems(ITEMS.register("block_the_rarest_steak",
            () -> new BlockItem(ModBlocks.BLOCK_THE_RAREST_STEAK.get(),
                    new Item.Properties()
                            .rarity(Rarity.RARE)
                            .food(new FoodProperties.Builder()
                                    .nutrition(20)
                                    .saturationModifier(10f)
                                    .effect(() -> new MobEffectInstance(MobEffects.CONFUSION,200, 0),0.2f)
                                    .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 100,2),0.05f)
                                    .build())
            )));

    //bismuth

    public static final DeferredItem<Item> BISMUTH = addToItems(ITEMS.register("bismuth",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
            )));

    public static final DeferredItem<Item> BISMUTH_RAW = addToItems(ITEMS.register("bismuth_raw",
            () -> new Item(new Item.Properties())));

    //guralloy

    public static final DeferredItem<Item> GURALLOY_INGOT = addToItems(ITEMS.register("ingot_guralloy",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)
            )));

    //ingots


    public static final DeferredItem<Item> INGOT_INVAR = addToItems(ITEMS.register("ingot_invar",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
            )));

    public static final DeferredItem<Item> INGOT_NICKEL = addToItems(ITEMS.register("ingot_nickel",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
            )));

    public static final DeferredItem<Item> INGOT_RED_SILVARIUM = addToItems(ITEMS.register("ingot_red_silvarium",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
            )));

    public static final DeferredItem<Item> INGOT_SILVER = addToItems(ITEMS.register("ingot_silver",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
            )));

    public static final DeferredItem<Item> INGOT_PLATINUM = addToItems(ITEMS.register("ingot_platinum",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)
            )));

    public static final DeferredItem<Item> INGOT_LUMINIUM = addToItems(ITEMS.register("ingot_luminium",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)
            )));

    public static final DeferredItem<Item> INGOT_RESONANT_PLATINARIUM = addToItems(ITEMS.register("ingot_resonant_platinarium",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)
            )));

    //raw ore

    public static final  DeferredItem<Item> RAW_NICKEL = addToItems(ITEMS.register("raw_nickel",
            () -> new Item(new Item.Properties()
            )));

    public static final  DeferredItem<Item> RAW_SILVER = addToItems(ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties()
            )));

    //nuggets

    public static final DeferredItem<Item> NUGGET_GURALLOY = addToItems(ITEMS.register("nugget_guralloy",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)
            )));

    public static final DeferredItem<Item> NUGGET_INVAR = addToItems(ITEMS.register("nugget_invar",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
            )));

    public static final DeferredItem<Item> NUGGET_NICKEL = addToItems(ITEMS.register("nugget_nickel",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
            )));

    public static final DeferredItem<Item> NUGGET_RED_SILVARIUM = addToItems(ITEMS.register("nugget_red_silvarium",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
            )));

    public static final DeferredItem<Item> NUGGET_SILVER = addToItems(ITEMS.register("nugget_silver",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
            )));

    public static final DeferredItem<Item> NUGGET_PLATINUM = addToItems(ITEMS.register("nugget_platinum",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)
            )));

    public static final DeferredItem<Item> NUGGET_LUMINIUM = addToItems(ITEMS.register("nugget_luminium",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)
            )));

    public static final DeferredItem<Item> NUGGET_RESONANT_PLATINARIUM = addToItems(ITEMS.register("nugget_resonant_platinarium",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)
            )));

    //ingot blocks

    public static final DeferredItem<Item> INGOT_BLOCK_GURALLOY = addToItems(ITEMS.register("ingot_block_guralloy",
            () -> new BlockItem(ModBlocks.INGOT_BLOCK_GURALLOY.get(),
                    new Item.Properties()
                            .rarity(Rarity.RARE)
            )));

    public static final DeferredItem<Item> INGOT_BLOCK_INVAR = addToItems(ITEMS.register("ingot_block_invar",
            () -> new BlockItem(ModBlocks.INGOT_BLOCK_INVAR.get(),
                    new Item.Properties()
                            .rarity(Rarity.UNCOMMON)
            )));

//    public static final DeferredItem<Item> INGOT_BLOCK_NICKEL = addToItems(ITEMS.register("ingot_block_nickel",
//            () -> new BlockItem(ModBlocks.ingot_block_nickel.get(),
//                    new Item.Properties()
//                            .rarity(Rarity.COMMON)
//            )));

    public static final DeferredItem<Item> INGOT_BLOCK_RED_SILVARIUM = addToItems(ITEMS.register("ingot_block_red_silvarium",
            () -> new BlockItem(ModBlocks.INGOT_BLOCK_RED_SILVARIUM.get(),
                    new Item.Properties()
                            .rarity(Rarity.UNCOMMON)
            )));
//    public static final DeferredItem<Item> INGOT_BLOCK_SILVER = addToItems(ITEMS.register("ingot_block_silver",
//            () -> new BlockItem(ModBlocks.ingot_block_silver.get(),
//                    new Item.Properties()
//                            .rarity(Rarity.COMMON)
//            )));

    public static final DeferredItem<Item> INGOT_BLOCK_PLATINUM = addToItems(ITEMS.register("ingot_block_platinum",
            () -> new BlockItem(ModBlocks.INGOT_BLOCK_PLATINUM.get(),
                    new Item.Properties()
                            .rarity(Rarity.RARE)
            )));

    //powders - blends - amalgams

    public static final DeferredItem<Item> AMALGAM_GURALLOY = addToItems(ITEMS.register("amalgam_guralloy",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)
            )));

    public static final DeferredItem<Item> AMALGAM_INVAR = addToItems(ITEMS.register("amalgam_invar",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
            )));

    public static final DeferredItem<Item> PULVERIZED_NICKEL = addToItems(ITEMS.register("pulverized_nickel",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
            )));

    public static final DeferredItem<Item> AMALGAM_CERNICIUM = addToItems(ITEMS.register("amalgam_cernicium",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
            )));

    public static final DeferredItem<Item> AMALGAM_RED_SILVARIUM = addToItems(ITEMS.register("amalgam_red_silvarium",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
            )));

    public static final DeferredItem<Item> PULVERIZED_SILVER = addToItems(ITEMS.register("pulverized_silver",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
            )));

    public static final DeferredItem<Item> PLATINUM_HYDRODISULFIDE = addToItems(ITEMS.register("platinum_hydrodisulfide",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)
            )));

    public static final DeferredItem<Item> DUST_PLATINUM = addToItems(ITEMS.register("dust_platinum",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)
            )));

    public static final DeferredItem<Item> AMALGAM_LUMINIUM = addToItems(ITEMS.register("amalgam_luminium",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)
            )));

    public static final DeferredItem<Item> AMALGAM_RESONANT_PLATINARIUM = addToItems(ITEMS.register("amalgam_resonant_platinarium",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)
            )));

    public static final DeferredItem<Item> AMALGAM_GLOWVARIUM = addToItems(ITEMS.register("amalgam_glowvarium",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)
            )));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
