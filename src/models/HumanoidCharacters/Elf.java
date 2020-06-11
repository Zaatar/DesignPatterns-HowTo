package models.HumanoidCharacters;

import interfaces.GameCharacter;
import interfaces.IHumanBehavior;

public class Elf extends GameCharacter implements IHumanBehavior{
	
	public Elf() {
		this.setHealthPoints(80);
		this.setMagicPoints(120);
		this.setSpeed(80);
		this.setStamina(60);
		this.setStrength(50);
		this.setCharisma(120);
	}

	@Override
	public void Run() {
		this.setSpeed(this.getSpeed()+40);
		this.setStamina(this.getStamina()-3);
		System.out.println("Your elf is running as quickly as he/she can");
		
	}

	@Override
	public void HumanDialectSpeech() {
		System.out.println("Speaking in Alfheim dialect");
		
	}

}
