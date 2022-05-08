import java.util.HashMap;
import java.util.Map;

public class ZombieDictionary {
	Map<String, String> dict;
	
	public ZombieDictionary() {
		dict = new HashMap<String, String>();
	}
	
	public void addZombie(String name, String weakness) {
		dict.put(name, weakness);
	}
	
	public void removeZombie(String name) {
		dict.remove(name);
	}
	
	public String getDescription(String name) {
		return String.format("Type: %s, Weakness: %s", name, dict.get(name).toString());
	}
	
	public Map<String, String> getMap() {
		return dict;
	}
}
