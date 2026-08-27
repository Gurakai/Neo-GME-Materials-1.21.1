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

    public static final DeferredBlock<Block> INGOT_BLOCK_GURALLOY = addToBlocks(BLOCKS.register("ingot_block_guralloy",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK)
                    .mapColor(MapColor.COLOR_YELLOW)
                    .strength(75f, 1500f)
                    .instrument(NoteBlockInstrument.DIDGERIDOO)
                    .lightLevel(state -> 5)
                    .requiresCorrectToolForDrops()
                    .pushReaction(PushReaction.NORMAL)
            )));

    public static final DeferredBlock<Block> INGOT_BLOCK_INVAR = addToBlocks(BLOCKS.register("ingot_block_invar",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GRAY)
                    .strength(5f, 13f)
                    .instrument(NoteBlockInstrument.COW_BELL)
                    .requiresCorrectToolForDrops()
                    .pushReaction(PushReaction.NORMAL)
            )));

    public static final  DeferredBlock<Block> INGOT_BLOCK_NICKEL = addToBlocks(registerBlock("ingot_block_nickel",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GRAY)
                    .strength(5f, 13f)
                    .instrument(NoteBlockInstrument.BELL)
                    .requiresCorrectToolForDrops()
                    .pushReaction(PushReaction.NORMAL)
            )));

    public static final DeferredBlock<Block> INGOT_BLOCK_RED_SILVARIUM = addToBlocks(BLOCKS.register("ingot_block_red_silvarium",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .strength(6f, 13f)
                    .instrument(NoteBlockInstrument.CHIME)
                    .requiresCorrectToolForDrops()
                    .pushReaction(PushReaction.NORMAL)
            )));

    public static final DeferredBlock<Block> INGOT_BLOCK_SILVER = addToBlocks(registerBlock("ingot_block_silver",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GRAY)
                    .strength(5f, 13f)
                    .instrument(NoteBlockInstrument.BELL)
                    .requiresCorrectToolForDrops()
                    .pushReaction(PushReaction.NORMAL)
            )));

    public static final DeferredBlock<Block> BLOCK_THE_RAREST_STEAK = addToBlocks(BLOCKS.register("block_the_rarest_steak",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.HONEY_BLOCK)
                    .mapColor(MapColor.COLOR_RED)
                    .strength(0.1f)
                    .instrument(NoteBlockInstrument.BASS)
                    .pushReaction(PushReaction.DESTROY)
            )));

    public static final DeferredBlock<Block> INGOT_BLOCK_PLATINUM = addToBlocks(BLOCKS.register("ingot_block_platinum",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(INGOT_BLOCK_RED_SILVARIUM.get())
                    .mapColor(MapColor.COLOR_CYAN)
                    .requiresCorrectToolForDrops()
                    .pushReaction(PushReaction.PUSH_ONLY)
            )));

    //ores

    public static final DeferredBlock<DropExperienceBlock> ORE_NICKEL = addToBlocks(registerBlock("ore_nickel",
            () -> new DropExperienceBlock(UniformInt.of(0,2),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
                    .strength(3.0f)
            )));

    public static final DeferredBlock<DropExperienceBlock> ORE_DEEPSLATE_NICKEL = addToBlocks(registerBlock("ore_deepslate_nickel",
            () -> new DropExperienceBlock(UniformInt.of(1,3),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)
                    .strength(4.5f,3.0f)
            )));

    public static final DeferredBlock<DropExperienceBlock> ORE_SILVER = addToBlocks(registerBlock("ore_silver",
            () -> new DropExperienceBlock(UniformInt.of(0,2),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_ORE)
                    .strength(3.0f)
            )));

    public static final DeferredBlock<DropExperienceBlock> ORE_DEEPSLATE_SILVER = addToBlocks(registerBlock("ore_deepslate_silver",
            () -> new DropExperienceBlock(UniformInt.of(1,3),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_GOLD_ORE)
                    .strength(4.5f,3.0f)
            )));

//compressed blocks

    public static final DeferredBlock<Block> COMPRESSED_COBBLESTONE_SINGULARITY = addToBlocks(registerBlock("compressed_cobblestone_singularity",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(INGOT_BLOCK_GURALLOY.get())
                    .strength(150f,3000f)
            )));

    public static final DeferredBlock<Block> COMPRESSED_COBBLESTONE_9 = addToBlocks(registerBlock("compressed_cobblestone_9",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(INGOT_BLOCK_GURALLOY.get())
            )));

    public static final DeferredBlock<Block> COMPRESSED_COBBLESTONE_8 = addToBlocks(registerBlock("compressed_cobblestone_8",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(INGOT_BLOCK_GURALLOY.get())
            )));

    public static final DeferredBlock<Block> COMPRESSED_COBBLESTONE_7 = addToBlocks(registerBlock("compressed_cobblestone_7",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(INGOT_BLOCK_GURALLOY.get())
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
