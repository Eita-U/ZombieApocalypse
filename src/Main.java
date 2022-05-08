
public class Main {

	public static void main(String[] args) {
		ZombieDictionary dict = new ZombieDictionary();
		dict.addZombie("Common Infected", "damage to head");
		dict.addZombie("The Spitter", "damage to throat");
		dict.addZombie("The Boomer", "damage to stomach");
		dict.addZombie("The Hound", "fire");
		dict.addZombie("The Jockey", "damage to hands");
		
		for(String str : dict.getMap().keySet()) {
			System.out.println(dict.getDescription(str));
		}
	}
}
