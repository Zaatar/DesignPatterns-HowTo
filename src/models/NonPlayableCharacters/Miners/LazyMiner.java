package models.NonPlayableCharacters.Miners;

public class LazyMiner extends Miner {

	@Override
	public void mine() {
		System.out.println("What a bother! I would rather be asleep now");
	}

	@Override
	public void refine() {
		System.out.println("This is a hook, I don't need to do it");
	}

	@Override
	public void workout() {
		System.out.println("This is also a hook, I don't need to do it");
	}

}
