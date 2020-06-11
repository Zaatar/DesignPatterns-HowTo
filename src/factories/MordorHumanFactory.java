package factories;

import interfaces.Armor;
import interfaces.GameCharacter;
import interfaces.Weapon;
import models.HumanoidCharacters.Human;
import models.InanimateObjects.Armor.Helmet.LightHelmet;
import models.InanimateObjects.Armor.Torso.SturdyBreastplate;
import models.InanimateObjects.Weaponry.Sword;

public class MordorHumanFactory implements WeaponArmorFactory, InterfaceAbstractCharacterCreationFactory {

	@Override
	public Armor createTorsoArmor() {
		System.out.println("Sturdy Breastplate it is!");
		return new SturdyBreastplate();
	}

	@Override
	public Weapon createWeapon() {
		System.out.println("Strong sword you've acquired there!");
		return new Sword();
	}

	@Override
	public Armor createHelmet() {
		System.out.println("A suitable Light Helmet!");
		return new LightHelmet();
	}

	@Override
	public GameCharacter createGameCharacter() {
		this.createTorsoArmor();
		this.createWeapon();
		this.createHelmet();
		System.out.println("Your Human is now ready!");
		return new Human();
	}
	

}
