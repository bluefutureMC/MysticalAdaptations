package com.focamacho.mysticaladaptations.augment;

import com.blakebr0.mysticalagriculture.api.tinkering.Augment;
import com.blakebr0.mysticalagriculture.api.tinkering.AugmentType;
import com.focamacho.mysticaladaptations.compat.vampirism.CompatVampirism;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import java.util.EnumSet;

public class ThirstlessAugment extends Augment {

    public ThirstlessAugment(ResourceLocation id) {
        super(id, 6, EnumSet.of(AugmentType.CHESTPLATE), 0xFC0000, 0x111111);
    }

    @Override
    public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
        CompatVampirism.fillThirst(player, world);
    }

}