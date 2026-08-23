package net.gurakai.neogmematerials1211.item;

import net.gurakai.neogmematerials1211.NeoGMEMaterials;
import net.gurakai.neogmematerials1211.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NeoGMEMaterials.MOD_ID);

public static final List<Supplier<? extends ItemLike>> GME_ITEM_ENTRIES = new ArrayList<>();

    public static final Supplier<CreativeModeTab> GME_ITEMS_TAB = CREATIVE_MODE_TAB.register("gme_items_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.BISMUTH.get()))
                    .title(Component.translatable("creativetab.neogmematerials1211.gme_items"))
                    //.displayItems((parameters, output) -> {
                        //output.accept(ModItems.BISMUTH);
                        //output.accept(ModItems.RAW_BISMUTH);
                   // })
                           .displayItems(((parameters, output) ->
                                   GME_ITEM_ENTRIES.forEach(itemLike -> output.accept(itemLike.get()))))

                    .build());

public static <T extends Item> DeferredItem<Item> addToItems(DeferredItem<Item> itemLike) {
    GME_ITEM_ENTRIES.add(itemLike);
    return itemLike;
}

    public static final Supplier<CreativeModeTab> GME_BLOCKS_TAB = CREATIVE_MODE_TAB.register("gme_blocks_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.BISMUTH_BLOCK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(NeoGMEMaterials.MOD_ID,"gme_items_tab"))
                    .title(Component.translatable("creativetab.neogmematerials1211.gme_blocks"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.BISMUTH_BLOCK);
                        output.accept(ModBlocks.BISMUTH_ORE);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
