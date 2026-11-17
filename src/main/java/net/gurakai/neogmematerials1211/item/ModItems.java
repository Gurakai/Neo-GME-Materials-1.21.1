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


    //BISMUTH

    public static final DeferredItem<Item> BISMUTH = addToItems(ITEMS.register("bismuth",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
            )));

    public static final DeferredItem<Item> BISMUTH_RAW = addToItems(ITEMS.register("bismuth_raw",
            () -> new Item(new Item.Properties())));


    //Guralloy

    public static final DeferredItem<Item> GURALLOY_INGOT = addToItems(ITEMS.register("ingot_guralloy",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)
            )));

    public static final DeferredItem<Item> GURALLOY_AMALGAM = addToItems(ITEMS.register("guralloy_amalgam",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)
            )));

    public static final DeferredItem<Item> GURALLOY_NUGGET = addToItems(ITEMS.register("guralloy_nugget",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)
            )));


    //Invar

    public static final DeferredItem<Item> INVAR_NUGGET = addToItems(ITEMS.register("invar_nugget",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
            )));

    public static final DeferredItem<Item> INVAR_INGOT = addToItems(ITEMS.register("invar_ingot",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
            )));

    public static final DeferredItem<Item> INVAR_AMALGAM = addToItems(ITEMS.register("invar_amalgam",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
            )));


    //Nickel

    public static final DeferredItem<Item> NICKEL_INGOT = addToItems(ITEMS.register("nickel_ingot",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
            )));

    public static final DeferredItem<Item> NICKEL_NUGGET = addToItems(ITEMS.register("nickel_nugget",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
            )));

    public static final DeferredItem<Item> NICKEL_PULVERIZED = addToItems(ITEMS.register("nickel_pulverized",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
            )));


    //Silver

    public static final DeferredItem<Item> INGOT_SILVER = addToItems(ITEMS.register("ingot_silver",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
            )));

    public static final DeferredItem<Item> NUGGET_SILVER = addToItems(ITEMS.register("nugget_silver",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
            )));

    public static final DeferredItem<Item> PULVERIZED_SILVER = addToItems(ITEMS.register("pulverized_silver",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
            )));


    //Red Silvarium

    public static final DeferredItem<Item> INGOT_RED_SILVARIUM = addToItems(ITEMS.register("ingot_red_silvarium",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
            )));

    public static final DeferredItem<Item> NUGGET_RED_SILVARIUM = addToItems(ITEMS.register("nugget_red_silvarium",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
            )));

    public static final DeferredItem<Item> AMALGAM_RED_SILVARIUM = addToItems(ITEMS.register("amalgam_red_silvarium",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
            )));


    //Platinum

    public static final DeferredItem<Item> INGOT_PLATINUM = addToItems(ITEMS.register("ingot_platinum",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)
            )));

    public static final DeferredItem<Item> NUGGET_PLATINUM = addToItems(ITEMS.register("nugget_platinum",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)
            )));

    public static final DeferredItem<Item> DUST_PLATINUM = addToItems(ITEMS.register("dust_platinum",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)
            )));


    //Luminium

    public static final DeferredItem<Item> INGOT_LUMINIUM = addToItems(ITEMS.register("ingot_luminium",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)
            )));

    public static final DeferredItem<Item> NUGGET_LUMINIUM = addToItems(ITEMS.register("nugget_luminium",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)
            )));

    public static final DeferredItem<Item> AMALGAM_LUMINIUM = addToItems(ITEMS.register("amalgam_luminium",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)
            )));


    //Resonant Platinarium

    public static final DeferredItem<Item> INGOT_RESONANT_PLATINARIUM = addToItems(ITEMS.register("ingot_resonant_platinarium",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)
            )));

    public static final DeferredItem<Item> NUGGET_RESONANT_PLATINARIUM = addToItems(ITEMS.register("nugget_resonant_platinarium",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)
            )));

    public static final DeferredItem<Item> AMALGAM_RESONANT_PLATINARIUM = addToItems(ITEMS.register("amalgam_resonant_platinarium",
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


    //powders - blends - amalgams

    public static final DeferredItem<Item> AMALGAM_CERNICIUM = addToItems(ITEMS.register("amalgam_cernicium",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
            )));

    public static final DeferredItem<Item> PLATINUM_HYDRODISULFIDE = addToItems(ITEMS.register("platinum_hydrodisulfide",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)
            )));

    public static final DeferredItem<Item> AMALGAM_GLOWVARIUM = addToItems(ITEMS.register("amalgam_glowvarium",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)
            )));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
