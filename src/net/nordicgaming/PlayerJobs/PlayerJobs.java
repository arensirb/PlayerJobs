package net.nordicgaming.PlayerJobs;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.sk89q.worldguard.bukkit.WorldGuardPlugin;

import net.nordicgaming.PlayerJobs.Properties;
import net.nordicgaming.PlayerJobs.managers.WGManager;
/*
 * Command idea for adding new shop: /pj shop create <type> <region>
 * 
 * 
 * @author unknown
 *
 */
public class PlayerJobs extends JavaPlugin {

	public static Properties properties;
	public static WorldGuardPlugin wgPlugin;
	public static WGManager wgManager;
	 public void onEnable(){
		 
		 try
	    	{
	    		new Properties();
	    		wgPlugin = getWorldGuard();
	    		wgManager = new WGManager(wgPlugin);
	    	} catch (Exception e) {
	    		getLogger().info("Something went wrong!!!");
	    		Bukkit.getPluginManager().disablePlugin(this);
	    	}
	    	this.saveDefaultConfig();

	    	properties.load(this);
		 
	 }
	 public void onDisable(){
		 
	 }
	 private WorldGuardPlugin getWorldGuard() {
		 Plugin plugin = getServer().getPluginManager().getPlugin("WorldGuard");
		 
		    // WorldGuard may not be loaded
		    if (plugin == null || !(plugin instanceof WorldGuardPlugin)) {
		        this.getLogger().severe("WorldGuard not found, plugin disabled!");
		        Bukkit.getPluginManager().disablePlugin(this);
		        return null;
		    }
		    
		    this.getLogger().info("WorldGuard found!");
		    return (WorldGuardPlugin) plugin;

	 }
}
