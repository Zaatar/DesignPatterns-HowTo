package factories;

import interfaces.Armor;
import interfaces.GameCharacter;
import interfaces.Weapon;

public interface InterfaceAbstractCharacterCreationFactory {

	public Armor createTorsoArmor();
	public Weapon createWeapon();
	public Armor createHelmet();
	public GameCharacter createGameCharacter();
}
