package net.lody.lodylandmod.item;

import net.lody.lodylandmod.LodyLandMod;
import net.lody.lodylandmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeLodyTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_LODY_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LodyLandMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> LODYMOD_TAB = CREATIVE_LODY_TABS.register("lody_mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.lodytab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SAPPHIRE.get());
                        output.accept(ModItems.RAW_SAPPHIRE.get());

                        output.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        output.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                        output.accept(ModBlocks.SOUND_BLOCK.get());

                        output.accept(ModBlocks.SAPPHIRE_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        output.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                        output.accept(ModBlocks.END_STONE_SAPPHIRE_ORE.get());

                        output.accept(ModItems.LAVA_DETECTOR.get());
                        output.accept(ModItems.IRON_DETECTOR.get());

                        output.accept(ModItems.MAGNETIC_COIL.get());
                        output.accept(ModItems.IRON_STICK.get());

                        output.accept(ModItems.STRAWBERRY.get());
                        output.accept(ModItems.PINE_CONE.get());
                    })
                    .build());

    public static void register(IEventBus eb) {
        CREATIVE_LODY_TABS.register(eb);
    }
}
