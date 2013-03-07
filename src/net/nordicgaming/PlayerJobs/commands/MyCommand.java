package net.nordicgaming.PlayerJobs.commands;

import net.nordicgaming.PlayerJobs.PlayerJobs;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/*
 * Commands:
 * 
 * User commands:
 *  job claim
 *  job finished
 *  job abandon
 *  job info (or just /job)
 *  
 * 
 * Admin commands:
 *  js reload // Reload plugin
 *  js shop // List shoptypes
 *  js shop <shoptype> // List info 
 *  js shop add <shoptype> // Add new shoptype
 *  
 *  js job <shoptype> // List jobs for that shoptype
 *  js job add // Add new job
 *  
 *
 * ShopConfig shops = new ShopConfig();
 * Shop myShop;
 * 
 * shops.getShop(
 */

public class MyCommand implements CommandExecutor {

	private PlayerJobs plugin;
	
	public MyCommand(PlayerJobs plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if(cmd.getName().equalsIgnoreCase("job")){ // If the player typed /basic then do the following...

			if(args[0].equals("claim")) 
			{
				// Check if user is inside region
				// Check/Get Shop for that region
				// Get random job from region
				// Register job on user

			}
			return true;
		} //If this has happened the function will return true. 
	        // If this hasn't happened the a value of false will be returned.
		return false; 
	}

}
