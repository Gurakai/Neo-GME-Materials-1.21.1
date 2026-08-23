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

    public static final DeferredItem<Item> BISMUTH = addToItems(ITEMS.register("bismuth",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
            )));


    //food

    public static final DeferredItem<Item> guralloy_apple = addToItems(ITEMS.register("guralloy_apple",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2400, 3), 1f)
                            .build())
                    .rarity(Rarity.RARE)
            )));

    //foodblocks

    public static final DeferredItem<BlockItem> block_the_rarest_steak = addToItems(ITEMS.register("block_the_rarest_steak",
            () -> new BlockItem(ModBlocks.block_the_rarest_steak.get(),
                    new Item.Properties()
                            .rarity(Rarity.RARE)
                            .food(new FoodProperties.Builder()
                                    .nutrition(20)
                                    .saturationModifier(10f)
                                    .effect(() -> new MobEffectInstance(MobEffects.CONFUSION,200, 0),0.2f)
                                    .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 100,2),0.05f)
                                    .build())
            )));

    //ingots

    public static final DeferredItem<Item> ingot_guralloy = addToItems(ITEMS.register("ingot_guralloy",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)
            )));

    public static final DeferredItem<Item> ingot_invar = addToItems(ITEMS.register("ingot_invar",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
            )));

    public static final DeferredItem<Item> ingot_nickel = addToItems(ITEMS.register("ingot_nickel",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
            )));

    public static final DeferredItem<Item> ingot_red_silvarium = addToItems(ITEMS.register("ingot_red_silvarium",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
            )));

    public static final DeferredItem<Item> ingot_silver = addToItems(ITEMS.register("ingot_silver",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
            )));

    public static final DeferredItem<Item> ingot_platinum = addToItems(ITEMS.register("ingot_platinum",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)
            )));

    public static final DeferredItem<Item> ingot_luminium = addToItems(ITEMS.register("ingot_luminium",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)
            )));

    public static final DeferredItem<Item> ingot_resonant_platinarium = addToItems(ITEMS.register("ingot_resonant_platinarium",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)
            )));

    //raw ore

    public static final  DeferredItem<Item> raw_nickel = addToItems(ITEMS.register("raw_nickel",
            () -> new Item(new Item.Properties()
            )));

    public static final  DeferredItem<Item> raw_silver = addToItems(ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties()
            )));

    //nuggets

    public static final DeferredItem<Item> nugget_guralloy = addToItems(ITEMS.register("nugget_guralloy",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)
            )));

    public static final DeferredItem<Item> nugget_invar = addToItems(ITEMS.register("nugget_invar",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
            )));

    public static final DeferredItem<Item> nugget_nickel = addToItems(ITEMS.register("nugget_nickel",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
            )));

    public static final DeferredItem<Item> nugget_red_silvarium = addToItems(ITEMS.register("nugget_red_silvarium",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
            )));

    public static final DeferredItem<Item> nugget_silver = addToItems(ITEMS.register("nugget_silver",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
            )));

    public static final DeferredItem<Item> nugget_platinum = addToItems(ITEMS.register("nugget_platinum",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)
            )));

    public static final DeferredItem<Item> nugget_luminium = addToItems(ITEMS.register("nugget_luminium",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)
            )));

    public static final DeferredItem<Item> nugget_resonant_platinarium = addToItems(ITEMS.register("nugget_resonant_platinarium",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)
            )));

    //ingot blocks

    public static final DeferredItem<Item> ingot_block_guralloy = addToItems(ITEMS.register("ingot_block_guralloy",
            () -> new BlockItem(BlockInitialization.ingot_block_guralloy.get(),
                    new Item.Properties()
                            .rarity(Rarity.RARE)
            )));

    public static final DeferredItem<Item> ingot_block_invar = addToItems(ITEMS.register("ingot_block_invar",
            () -> new BlockItem(BlockInitialization.ingot_block_invar.get(),
                    new Item.Properties()
                            .rarity(Rarity.UNCOMMON)
            )));

    public static final DeferredItem<Item> ingot_block_nickel = addToItems(ITEMS.register("ingot_block_nickel",
            () -> new BlockItem(BlockInitialization.ingot_block_nickel.get(),
                    new Item.Properties()
                            .rarity(Rarity.COMMON)
            )));

    public static final DeferredItem<Item> ingot_block_red_silvarium = addToItems(ITEMS.register("ingot_block_red_silvarium",
            () -> new BlockItem(BlockInitialization.ingot_block_red_silvarium.get(),
                    new Item.Properties()
                            .rarity(Rarity.UNCOMMON)
            )));
    public static final DeferredItem<Item> ingot_block_silver = addToItems(ITEMS.register("ingot_block_silver",
            () -> new BlockItem(BlockInitialization.ingot_block_silver.get(),
                    new Item.Properties()
                            .rarity(Rarity.COMMON)
            )));

    public static final DeferredItem<Item> ingot_block_platinum = addToItems(ITEMS.register("ingot_block_platinum",
            () -> new BlockItem(BlockInitialization.ingot_block_platinum.get(),
                    new Item.Properties()
                            .rarity(Rarity.RARE)
            )));

    //powders - blends - amalgams

    public static final DeferredItem<Item> amalgam_guralloy = addToItems(ITEMS.register("amalgam_guralloy",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)
            )));

    public static final DeferredItem<Item> amalgam_invar = addToItems(ITEMS.register("amalgam_invar",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
            )));

    public static final DeferredItem<Item> pulverized_nickel = addToItems(ITEMS.register("pulverized_nickel",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
            )));

    public static final DeferredItem<Item> amalgam_cernicium = addToItems(ITEMS.register("amalgam_cernicium",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
            )));

    public static final DeferredItem<Item> amalgam_red_silvarium = addToItems(ITEMS.register("amalgam_red_silvarium",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
            )));

    public static final DeferredItem<Item> pulverized_silver = addToItems(ITEMS.register("pulverized_silver",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
            )));

    public static final DeferredItem<Item> platinum_hydrodisulfide = addToItems(ITEMS.register("platinum_hydrodisulfide",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)
            )));

    public static final DeferredItem<Item> dust_platinum = addToItems(ITEMS.register("dust_platinum",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)
            )));

    public static final DeferredItem<Item> amalgam_luminium = addToItems(ITEMS.register("amalgam_luminium",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)
            )));

    public static final DeferredItem<Item> amalgam_resonant_platinarium = addToItems(ITEMS.register("amalgam_resonant_platinarium",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)
            )));

    public static final DeferredItem<Item> amalgam_glowvarium = addToItems(ITEMS.register("amalgam_glowvarium",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)
            )));



    public static final DeferredItem<Item> RAW_BISMUTH = addToItems(ITEMS.register("raw_bismuth",
            () -> new Item(new Item.Properties())));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
