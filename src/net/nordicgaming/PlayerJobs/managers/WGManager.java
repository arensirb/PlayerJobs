package net.nordicgaming.PlayerJobs.managers;


import org.bukkit.Bukkit;

import org.bukkit.World;
import org.bukkit.entity.Player;



import com.sk89q.worldguard.bukkit.WorldGuardPlugin;
import com.sk89q.worldguard.protection.managers.RegionManager;
import com.sk89q.worldguard.protection.ApplicableRegionSet;

public class WGManager {
	private WorldGuardPlugin plugin;
	public WGManager(WorldGuardPlugin plugin)
	{
		this.plugin = plugin;
	}

	public String getRegion(Player dd) {
		
		World world = Bukkit.getWorld("world");
		RegionManager regionManager = plugin.getRegionManager(world);
		if(regionManager != null) {
			ApplicableRegionSet set = regionManager.getApplicableRegions(dd.getLocation());
		}
		return null;
		
	}
	
}
