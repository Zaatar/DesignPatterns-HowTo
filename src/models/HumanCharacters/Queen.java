package models.HumanCharacters;

import interfaces.HumanCharacter;

public class Queen extends HumanCharacter {
	
	public Queen() {
		this.setHealthPoints(90);
		this.setMagicPoints(120);
		this.setSpeed(70);
		this.setStamina(70);
		this.setStrength(50);
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
