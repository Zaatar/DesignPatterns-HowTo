package factories;

import interfaces.Armor;
import interfaces.GameCharacter;
import interfaces.Weapon;
import models.HumanoidCharacters.Elf;
import models.InanimateObjects.Armor.Helmet.Tiara;
import models.InanimateObjects.Armor.Torso.LightArcherArmor;
import models.InanimateObjects.Weaponry.BowAndArrow;

public class AlfheimElfFactory implements WeaponArmorFactory, InterfaceAbstractCharacterCreationFactory {

	@Override
	public Armor createTorsoArmor() {
		System.out.println("Light Archer Armor created!");
		return new LightArcherArmor();
	}

	@Override
	public Weapon createWeapon() {
		System.out.println("Bow and Arrow created, quiver full!");
		return new BowAndArrow();
	}

	@Override
	public Armor createHelmet() {
		System.out.println("Tiara created, it is shining!");
		return new Tiara();
	}

	@Override
	public GameCharacter createGameCharacter() {
		System.out.println("Your elf is now ready!");
		return new Elf();
	}

}
