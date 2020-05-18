package models.HumanCharacters;

import interfaces.HumanCharacter;

public class Knight extends HumanCharacter {
	
	public Knight() {
		this.setHealthPoints(125);
		this.setMagicPoints(60);
		this.setSpeed(60);
		this.setStamina(100);
		this.setStrength(75);
		this.setCharisma(40);
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
