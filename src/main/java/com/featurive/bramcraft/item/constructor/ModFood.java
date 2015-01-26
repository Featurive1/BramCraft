package com.featurive.bramcraft.item.constructor;

import com.featurive.bramcraft.reference.References;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ModFood extends ItemFood
{
    public ModFood(int heal, boolean b){
        super(heal, b);
        this.setMaxStackSize(1);
        this.isDamageable();
        this.setMaxDamage(32);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", References.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", References.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    @Override
    public int getMaxItemUseDuration(ItemStack itemstack)
    {
        return 8;
    }
}