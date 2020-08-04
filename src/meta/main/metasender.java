package meta.main;




import org.bukkit.plugin.java.JavaPlugin;

public class metasender extends JavaPlugin {
	
	public void onEnable(){
		
	getLogger().info("Enable!");
		}

	public void onDisable() {
		
		  getLogger().info("Disabled!");

	}
}
