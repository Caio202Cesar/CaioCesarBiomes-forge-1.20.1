package net.caiocesarmods.caiocesarbiomes.util;

import net.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodTypes {
    public static final WoodType ARAUCARIA = WoodType.register(new WoodType(CaioCesarBiomesMod.MOD_ID + ":araucaria", BlockSetType.OAK));
}
