package factories;

import interfaces.Armor;
import interfaces.Weapon;

public interface WeaponArmorFactory {
	
	public Armor createTorsoArmor();
	public Weapon createWeapon();
	public Armor createHelmet();
}
