package models.HumanCharacters;

import interfaces.HumanCharacter;

public class King extends HumanCharacter {
	
	public King() {
		this.setHealthPoints(100);
		this.setMagicPoints(100);
		this.setSpeed(75);
		this.setStamina(75);
		this.setStrength(60);
		this.setCharisma(100);
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
