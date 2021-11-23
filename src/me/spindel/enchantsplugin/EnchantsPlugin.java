package me.spindel.enchantsplugin;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import me.jereds.txenchants.api.AbstractEnchant;
import me.spindel.enchantsplugin.enchants.swords.DumbGabe;
import me.spindel.enchantsplugin.enchants.swords.Penis;

public class EnchantsPlugin extends JavaPlugin {

	private List<Class<? extends AbstractEnchant>> enchants = Arrays.asList(Penis.class, DumbGabe.class);
	
	@Override
	public void onEnable() {
		Plugin plugin = Bukkit.getPluginManager().getPlugin("TxEnchants");
		if(plugin == null || !plugin.isEnabled()) {
			getLogger().log(Level.SEVERE, "This plugin requires TxEnchants to be enabled! Disabling...");
			onDisable();
		}
		
		enchants.forEach(AbstractEnchant::registerEnchant);
	}
}
