package factories;

import interfaces.Armor;
import interfaces.GameCharacter;
import interfaces.Weapon;

public abstract class AbstractCharacterCreationFactory {
	
	public abstract Armor createTorsoArmor();
	public abstract Weapon createWeapon();
	public abstract Armor createHelmet();
	public abstract GameCharacter createGameCharacter();
}