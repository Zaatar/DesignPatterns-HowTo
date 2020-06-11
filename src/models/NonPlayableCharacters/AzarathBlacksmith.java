package models.NonPlayableCharacters;

import interfaces.Armor;
import interfaces.IBlacksmith;
import interfaces.Weapon;
import models.InanimateObjects.Armor.Torso.HeavyChainMail;
import models.InanimateObjects.MiningMaterials.AverageIronIngot;
import models.InanimateObjects.MiningMaterials.CopperIngot;
import models.InanimateObjects.MiningMaterials.GoldIngot;
import models.InanimateObjects.MiningMaterials.IronIngot;
import models.InanimateObjects.MiningMaterials.MasterCopperIngot;
import models.InanimateObjects.MiningMaterials.MasterGoldIngot;
import models.InanimateObjects.Weaponry.Sword;

public class AzarathBlacksmith implements IBlacksmith {

	@Override
	public CopperIngot refineCopper() {
		System.out.println("Copper refined into Master Copper");
		return new MasterCopperIngot();
	}

	@Override
	public IronIngot refineIron() {
		System.out.println("Iron refined into Average Iron");
		return new AverageIronIngot();
	}

	@Override
	public GoldIngot refineGold() {
		System.out.println("Gold refined into Master Gold");
		return new MasterGoldIngot();
	}

	@Override
	public Armor forgeArmor(String armor) {
		System.out.println("Using material to forge heavy chain mail");
		return new HeavyChainMail();
	}

	@Override
	public Weapon forgeWeapon(String weapons) {
		System.out.println("Using material to forge sword");
		return new Sword();
	}


}
