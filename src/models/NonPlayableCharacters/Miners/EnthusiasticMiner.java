package models.NonPlayableCharacters.Miners;

public class EnthusiasticMiner extends Miner {

	@Override
	public void mine() {
		System.out.println("HEEEAAAAAVEE HOOO! HEAAAAAAAAVEEE HOOO!");
	}

	@Override
	public void refine() {
		System.out.println("Refining ore into a better version of itself");
	}

	@Override
	public void workout() {
		System.out.println("A healthy body helps in mining, 1000 pushups");
	}

}
