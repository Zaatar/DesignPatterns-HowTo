package models.HumanCharacters;

import interfaces.HumanCharacter;

public class Magician extends HumanCharacter {
	
	public Magician() {
		this.setHealthPoints(75);
		this.setMagicPoints(140);
		this.setSpeed(50);
		this.setStamina(50);
		this.setStrength(30);
		this.setCharisma(60);
	}

	@Override
	protected void WearArmor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void Attack() {
		// TODO Auto-generated method stub
		
	}

}
