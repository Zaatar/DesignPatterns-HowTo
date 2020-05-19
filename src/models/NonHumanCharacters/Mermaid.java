package models.NonHumanCharacters;

import interfaces.GameCharacter;

public class Mermaid extends GameCharacter {
	
	public Mermaid() {
		this.setHealthPoints(60);
		this.setMagicPoints(150);
		this.setSpeed(25);
		this.setStamina(70);
		this.setStrength(40);
		this.setCharisma(20);
	}

}
