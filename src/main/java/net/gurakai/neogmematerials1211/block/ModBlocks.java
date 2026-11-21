package net.gurakai.neogmematerials1211.block;

import net.gurakai.neogmematerials1211.NeoGMEMaterials;
import net.gurakai.neogmematerials1211.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import java.util.function.Supplier;

import static net.gurakai.neogmematerials1211.item.ModCreativeTabs.addToBlocks;
public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(NeoGMEMaterials.MOD_ID);


    //General Blocks

    public static final DeferredBlock<Block> GURALLOY_INGOT_BLOCK = addToBlocks(registerBlock("guralloy_ingot_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK)
                    .mapColor(MapColor.COLOR_YELLOW)
                    .strength(75f, 1500f)
                    .instrument(NoteBlockInstrument.DIDGERIDOO)
                    .lightLevel(state -> 5)
                    .requiresCorrectToolForDrops()
                    .pushReaction(PushReaction.NORMAL)
            )));

    public static final DeferredBlock<Block> INVAR_INGOT_BLOCK = addToBlocks(registerBlock("invar_ingot_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GRAY)
                    .strength(5f, 13f)
                    .instrument(NoteBlockInstrument.COW_BELL)
                    .requiresCorrectToolForDrops()
                    .pushReaction(PushReaction.NORMAL)
            )));

    public static final DeferredBlock<Block> RED_SILVARIUM_INGOT_BLOCK = addToBlocks(registerBlock("red_silvarium_ingot_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .strength(6f, 13f)
                    .instrument(NoteBlockInstrument.CHIME)
                    .requiresCorrectToolForDrops()
                    .pushReaction(PushReaction.NORMAL)
            )));

    public static final DeferredBlock<Block> THE_RAREST_STEAK_BLOCK = addToBlocks(BLOCKS.register("the_rarest_steak_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.HONEY_BLOCK)
                    .mapColor(MapColor.COLOR_RED)
                    .strength(0.1f)
                    .instrument(NoteBlockInstrument.BASS)
                    .pushReaction(PushReaction.DESTROY)
            )));

    public static final DeferredBlock<Block> PLATINUM_INGOT_BLOCK = addToBlocks(registerBlock("platinum_ingot_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(RED_SILVARIUM_INGOT_BLOCK.get())
                    .mapColor(MapColor.COLOR_CYAN)
                    .requiresCorrectToolForDrops()
                    .pushReaction(PushReaction.PUSH_ONLY)
            )));


    //Nickel

    public static final DeferredBlock<DropExperienceBlock> NICKEL_ORE = addToBlocks(registerBlock("nickel_ore",
            () -> new DropExperienceBlock(UniformInt.of(0,2),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
                    .strength(3.0f)
            )));

    public static final DeferredBlock<DropExperienceBlock> NICKEL_DEEPSLATE_ORE = addToBlocks(registerBlock("nickel_deepslate_ore",
            () -> new DropExperienceBlock(UniformInt.of(1,3),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)
                    .strength(4.5f,3.0f)
            )));

    public static final  DeferredBlock<Block> NICKEL_INGOT_BLOCK = addToBlocks(registerBlock("nickel_ingot_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GRAY)
                    .strength(5f, 13f)
                    .instrument(NoteBlockInstrument.BELL)
                    .requiresCorrectToolForDrops()
                    .pushReaction(PushReaction.NORMAL)
            )));


    //Silver

    public static final DeferredBlock<DropExperienceBlock> SILVER_ORE = addToBlocks(registerBlock("silver_ore",
            () -> new DropExperienceBlock(UniformInt.of(0,2),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_ORE)
                    .strength(3.0f)
            )));

    public static final DeferredBlock<DropExperienceBlock> SILVER_DEEPSLATE_ORE = addToBlocks(registerBlock("silver_deepslate_ore",
            () -> new DropExperienceBlock(UniformInt.of(1,3),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_GOLD_ORE)
                    .strength(4.5f,3.0f)
            )));

    public static final DeferredBlock<Block> SILVER_INGOT_BLOCK = addToBlocks(registerBlock("silver_ingot_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GRAY)
                    .strength(5f, 13f)
                    .instrument(NoteBlockInstrument.BELL)
                    .requiresCorrectToolForDrops()
                    .pushReaction(PushReaction.NORMAL)
            )));


    //Bismuth

    public static final DeferredBlock<Block> BISMUTH_BLOCK = addToBlocks(registerBlock("bismuth_block",
        () -> new Block(BlockBehaviour.Properties.of()
                .strength(4f)
                .requiresCorrectToolForDrops()
                .sound(SoundType.AMETHYST)
        )));

    public static final DeferredBlock<Block> BISMUTH_ORE = addToBlocks(registerBlock("bismuth_ore",
        () -> new DropExperienceBlock(UniformInt.of(2,4),
                BlockBehaviour.Properties.of()
                        .strength(3f)
                        .requiresCorrectToolForDrops()
                        .sound(SoundType.STONE)
        )));

    public static final DeferredBlock<Block> BISMUTH_DEEPSLATE_ORE = addToBlocks(registerBlock("bismuth_deepslate_ore",
        () -> new DropExperienceBlock(UniformInt.of(4,6),
                BlockBehaviour.Properties.of()
                        .strength(4f)
                        .requiresCorrectToolForDrops()
                        .sound(SoundType.DEEPSLATE)
        )));


//compressed blocks

    //Cobblestone

    public static final DeferredBlock<Block> COMPRESSED_COBBLESTONE_SINGULARITY = addToBlocks(registerBlock("compressed_cobblestone_singularity",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(GURALLOY_INGOT_BLOCK.get())
                    .strength(150f,3000f)
            )));

    public static final DeferredBlock<Block> COMPRESSED_COBBLESTONE_9 = addToBlocks(registerBlock("compressed_cobblestone_9",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(GURALLOY_INGOT_BLOCK.get())
            )));

    public static final DeferredBlock<Block> COMPRESSED_COBBLESTONE_8 = addToBlocks(registerBlock("compressed_cobblestone_8",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(GURALLOY_INGOT_BLOCK.get())
            )));

    public static final DeferredBlock<Block> COMPRESSED_COBBLESTONE_7 = addToBlocks(registerBlock("compressed_cobblestone_7",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(GURALLOY_INGOT_BLOCK.get())
            )));

    public static final DeferredBlock<Block> COMPRESSED_COBBLESTONE_6 = addToBlocks(registerBlock("compressed_cobblestone_6",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK)
            )));

    public static final DeferredBlock<Block> COMPRESSED_COBBLESTONE_5 = addToBlocks(registerBlock("compressed_cobblestone_5",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK)
            )));

    public static final DeferredBlock<Block> COMPRESSED_COBBLESTONE_4 = addToBlocks(registerBlock("compressed_cobblestone_4",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK)
            )));

    public static final DeferredBlock<Block> COMPRESSED_COBBLESTONE_3 = addToBlocks(registerBlock("compressed_cobblestone_3",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK)
            )));

    public static final DeferredBlock<Block> COMPRESSED_COBBLESTONE_2 = addToBlocks(registerBlock("compressed_cobblestone_2",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)
            )));

    public static final DeferredBlock<Block> COMPRESSED_COBBLESTONE = addToBlocks(registerBlock("compressed_cobblestone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)
            )));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
