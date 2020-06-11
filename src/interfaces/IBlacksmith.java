package interfaces;

import models.InanimateObjects.MiningMaterials.CopperIngot;
import models.InanimateObjects.MiningMaterials.GoldIngot;
import models.InanimateObjects.MiningMaterials.IronIngot;

public interface IBlacksmith {
	
	public CopperIngot refineCopper();
	public IronIngot refineIron();
	public GoldIngot refineGold();
	public Armor forgeArmor(String armor);
	public Weapon forgeWeapon(String weapons);

}
