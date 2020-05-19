package models.HumanCharacters;

import interfaces.GameCharacter;

public class Knight extends GameCharacter {
	
	public Knight() {
		this.setHealthPoints(125);
		this.setMagicPoints(60);
		this.setSpeed(60);
		this.setStamina(100);
		this.setStrength(75);
		this.setCharisma(40);
	}

}
