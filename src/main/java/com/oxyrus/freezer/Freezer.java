package com.oxyrus.freezer;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class Freezer extends JavaPlugin {

    @Override
    public void onEnable() {
        ItemStack iceBlocks = new ItemStack(Material.BLUE_ICE, 64);

        ItemMeta meta = iceBlocks.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§bIce Block");

        iceBlocks.setItemMeta(meta);

        NamespacedKey key = new NamespacedKey(this, "ice_block");

        ShapedRecipe recipe = new ShapedRecipe(key, iceBlocks);

        recipe.shape(" W ", " S ", "   ");
        recipe.setIngredient('W', Material.WATER_BUCKET);
        recipe.setIngredient('S', Material.SNOW);

        Bukkit.addRecipe(recipe);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
