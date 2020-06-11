package models.NonPlayableCharacters;

import interfaces.Armor;
import interfaces.IBlacksmith;
import interfaces.Weapon;
import models.InanimateObjects.Armor.Torso.LightArcherArmor;
import models.InanimateObjects.MiningMaterials.AverageCopperIngot;
import models.InanimateObjects.MiningMaterials.CopperIngot;
import models.InanimateObjects.MiningMaterials.GoldIngot;
import models.InanimateObjects.MiningMaterials.IronIngot;
import models.InanimateObjects.MiningMaterials.MasterGoldIngot;
import models.InanimateObjects.MiningMaterials.MasterIronIngot;
import models.InanimateObjects.Weaponry.BowAndArrow;

public class MetriosBlacksmith implements IBlacksmith {

	@Override
	public CopperIngot refineCopper() {
		System.out.println("Copper refined into Master Copper");
		return new AverageCopperIngot();
	}

	@Override
	public IronIngot refineIron() {
		System.out.println("Iron refined into Master Iron");
		return new MasterIronIngot();
	}

	@Override
	public GoldIngot refineGold() {
		System.out.println("Gold refined into Master Gold");
		return new MasterGoldIngot();
	}

	@Override
	public Armor forgeArmor(String armor) {
		System.out.println("Using material to forge light archer armor");
		return new LightArcherArmor();
	}

	@Override
	public Weapon forgeWeapon(String weapons) {
		System.out.println("Using material to forge bow and arrow");
		return new BowAndArrow();
	}

}
