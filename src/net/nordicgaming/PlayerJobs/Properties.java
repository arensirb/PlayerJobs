package net.nordicgaming.PlayerJobs;

import java.io.File;
import java.io.InputStream;
import java.util.Set;

import net.nordicgaming.PlayerJobs.PlayerJobs;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class Properties {
	PlayerJobs plugin;
	FileConfiguration shopConfig;
	File shopConfigFile;

	public Properties() 
	{
		PlayerJobs.properties = this;
	}
	
	public void load(PlayerJobs plugin)
	{
		this.plugin = plugin;
		plugin.getLogger().info("onEnable has been invoked!");
		FileConfiguration config = plugin.getConfig();

		config.options().copyDefaults(true);
		plugin.saveConfig();
		saveShopConfig();
		
		if (shopConfig == null) {
	        this.reloadShopConfig();
	    }
		
		//loadLevelConfig(config.getConfigurationSection("leveling"));
		loadShopConfig(shopConfig.getConfigurationSection("shops"));
	
	}
	public void reloadShopConfig() {
	    if (shopConfig == null) {
	    shopConfigFile = new File(plugin.getDataFolder(), "shops.yml");
	    }
	    shopConfig = YamlConfiguration.loadConfiguration(shopConfigFile);
	 
	    // Look for defaults in the jar
	    InputStream defConfigStream = plugin.getResource("shops.yml");
	    if (defConfigStream != null) {
	        YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
	        shopConfig.setDefaults(defConfig);
	    }
	}
	public void saveShopConfig() {
	    if (shopConfigFile == null) {
	    	 shopConfigFile = new File(plugin.getDataFolder(), "shops.yml");
	    }
	    if (!shopConfigFile.exists()) {            
	         this.plugin.saveResource("shops.yml", false);
	     }
	}
	
	private void loadShopConfig(ConfigurationSection section) {
		if (section == null) {
			return;
		}
		Set<String> set = section.getKeys(false);
		plugin.getLogger().info(set.toString());
	}
}
