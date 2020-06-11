package factories;

import interfaces.Armor;
import interfaces.GameCharacter;
import interfaces.Weapon;
import models.HumanoidCharacters.Dwarf;
import models.InanimateObjects.Armor.Helmet.HeavyHelmet;
import models.InanimateObjects.Armor.Torso.HeavyChainMail;
import models.InanimateObjects.Weaponry.Axe;

public class JotunheimDwarfFactory implements WeaponArmorFactory, InterfaceAbstractCharacterCreationFactory {

	@Override
	public Weapon createWeapon() {
		System.out.println("A new axe brimming with strength!");
		return new Axe();
	}

	@Override
	public Armor createTorsoArmor() {
		System.out.println("This chainmail looks heavy, you need to be strong to wear it");
		return new HeavyChainMail();
	}

	@Override
	public Armor createHelmet() {
		System.out.println("Sooo heavy helmet!");
		return new HeavyHelmet();
	}

	@Override
	public GameCharacter createGameCharacter() {
		System.out.println("Your strong dwarf is now ready!");
		return new Dwarf();
	}

}
