package models.NonHumanCharacters;

import interfaces.NonHumanCharacter;

public class Mermaid extends NonHumanCharacter {
	
	public Mermaid() {
		this.setHealthPoints(60);
		this.setMagicPoints(150);
		this.setSpeed(25);
		this.setStamina(70);
		this.setStrength(40);
		this.setCharisma(20);
	}

	@Override
	protected void Attack() {
		// TODO Auto-generated method stub
		
	}

}
