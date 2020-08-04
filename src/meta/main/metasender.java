package meta.main;




import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class metasender extends JavaPlugin {
	
	public void onEnable(){
		
	
		
	Bukkit.getPluginManager().registerEvents(new JoinEvent(), this);
	getLogger().info("Enable!");
		}

	public void onDisable() {
		
		  getLogger().info("Disabled!");

	}
}
