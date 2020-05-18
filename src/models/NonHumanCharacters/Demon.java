package models.NonHumanCharacters;

import interfaces.NonHumanCharacter;

public class Demon extends NonHumanCharacter {
	
	public Demon() {
		this.setHealthPoints(125);
		this.setMagicPoints(90);
		this.setSpeed(80);
		this.setStamina(30);
		this.setStrength(50);
		this.setCharisma(80);
	}

	@Override
	protected void Attack() {
		// TODO Auto-generated method stub
		
	}

}
