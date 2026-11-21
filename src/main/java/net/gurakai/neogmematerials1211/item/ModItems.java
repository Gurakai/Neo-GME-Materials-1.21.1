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

    public static final DeferredItem<BlockItem> THE_RAREST_STEAK_BLOCK = addToItems(ITEMS.register("the_rarest_steak_block",
            () -> new BlockItem(ModBlocks.THE_RAREST_STEAK_BLOCK.get(),
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

    public static final DeferredItem<Item> SILVER_INGOT = addToItems(ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
            )));

    public static final DeferredItem<Item> SILVER_NUGGET = addToItems(ITEMS.register("silver_nugget",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
            )));

    public static final DeferredItem<Item> SILVER_PULVERIZED = addToItems(ITEMS.register("silver_pulverized",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
            )));


    //Red Silvarium

    public static final DeferredItem<Item> RED_SILVARIUM_INGOT = addToItems(ITEMS.register("red_silvarium_ingot",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
            )));

    public static final DeferredItem<Item> RED_SILVARIUM_NUGGET = addToItems(ITEMS.register("red_silvarium_nugget",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
            )));

    public static final DeferredItem<Item> RED_SILVARIUM_AMALGAM = addToItems(ITEMS.register("red_silvarium_amalgam",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
            )));


    //Platinum

    public static final DeferredItem<Item> PLATINUM_INGOT = addToItems(ITEMS.register("platinum_ingot",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)
            )));

    public static final DeferredItem<Item> PLATINUM_NUGGET = addToItems(ITEMS.register("platinum_nugget",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)
            )));

    public static final DeferredItem<Item> PLATINUM_DUST = addToItems(ITEMS.register("platinum_dust",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)
            )));


    //Luminium

    public static final DeferredItem<Item> LUMINIUM_INGOT = addToItems(ITEMS.register("luminium_ingot",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)
            )));

    public static final DeferredItem<Item> LUMINIUM_NUGGET = addToItems(ITEMS.register("luminium_nugget",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)
            )));

    public static final DeferredItem<Item> LUMINIUM_AMALGAM = addToItems(ITEMS.register("luminium_amalgam",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)
            )));


    //Resonant Platinarium

    public static final DeferredItem<Item> RESONANT_PLATINARIUM_INGOT = addToItems(ITEMS.register("resonant_platinarium_ingot",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)
            )));

    public static final DeferredItem<Item> RESONANT_PLATINARIUM_NUGGET = addToItems(ITEMS.register("resonant_platinarium_nugget",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)
            )));

    public static final DeferredItem<Item> RESONANT_PLATINARIUM_AMALGAM = addToItems(ITEMS.register("resonant_platinarium_amalgam",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)
            )));

    //raw ore

    public static final  DeferredItem<Item> NICKEL_RAW = addToItems(ITEMS.register("nickel_raw",
            () -> new Item(new Item.Properties()
            )));

    public static final  DeferredItem<Item> SILVER_RAW = addToItems(ITEMS.register("silver_raw",
            () -> new Item(new Item.Properties()
            )));


    //blends - amalgams

    public static final DeferredItem<Item> CERNICIUM_AMALGAM = addToItems(ITEMS.register("cernicium_amalgam",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
            )));

    public static final DeferredItem<Item> PLATINUM_HYDRODISULFIDE = addToItems(ITEMS.register("platinum_hydrodisulfide",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)
            )));

    public static final DeferredItem<Item> GLOWVARIUM_AMALGAM = addToItems(ITEMS.register("glowvarium_amalgam",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)
            )));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
