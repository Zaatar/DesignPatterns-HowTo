package models.HumanoidCharacters;

import interfaces.GameCharacter;
import interfaces.IHumanBehavior;

public class Dwarf extends GameCharacter implements IHumanBehavior {
	
	public Dwarf() {
		this.setHealthPoints(150);
		this.setMagicPoints(40);
		this.setSpeed(40);
		this.setStamina(100);
		this.setStrength(80);
		this.setCharisma(40);
	}

	@Override
	public void Run() {
		this.setSpeed(this.getSpeed()+20);
		this.setStamina(this.getStamina()-5);
		System.out.println("Your dwarf is running as quickly as he/she can");
		
	}

	@Override
	public void HumanDialectSpeech() {
		System.out.println("Speaking in Jotunheim dialect");
		
	}
	
}
