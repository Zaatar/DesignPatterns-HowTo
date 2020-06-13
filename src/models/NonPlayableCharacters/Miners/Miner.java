package models.NonPlayableCharacters.Miners;

public abstract class Miner {
	public final void mineMaterial() {
		prospect();
		dig();
		rest();
		mine();
		rest();
		refine();
		rest();
		workout();
	}
	
	public void prospect() {
		System.out.println("Searching for possible material locations");
	}
	
	public void dig() {
		System.out.println("Possible material found, digging hole");
	}
	
	public void rest() {
		System.out.println("The miner is exhausted, let's take a break");
	}
	
	public abstract void mine();
	
	public abstract void refine();
	
	public abstract void workout();
}
