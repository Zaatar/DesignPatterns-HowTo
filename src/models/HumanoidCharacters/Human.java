package models.HumanoidCharacters;

import interfaces.GameCharacter;
import interfaces.IHumanBehavior;

public class Human extends GameCharacter implements IHumanBehavior {
	
	public Human() {
		this.setHealthPoints(80);
		this.setMagicPoints(120);
		this.setSpeed(80);
		this.setStamina(60);
		this.setStrength(50);
		this.setCharisma(120);
	}

	@Override
	public void Run() {
		this.setSpeed(this.getSpeed()+30);
		this.setStamina(this.getStamina()-4);
		System.out.println("Your human is running as quickly as he/she can");
	}

	@Override
	public void HumanDialectSpeech() {
		System.out.println("Speaking in Alfheim dialect");
	}
	
}
