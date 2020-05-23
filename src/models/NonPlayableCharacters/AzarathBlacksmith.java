package models.NonPlayableCharacters;

import factories.MaterialFactory;
import interfaces.Blacksmith;
import models.InanimateObjects.MiningMaterials.AverageGoldIngot;
import models.InanimateObjects.MiningMaterials.AverageIronIngot;
import models.InanimateObjects.MiningMaterials.CopperIngot;
import models.InanimateObjects.MiningMaterials.GoldIngot;
import models.InanimateObjects.MiningMaterials.IronIngot;
import models.InanimateObjects.MiningMaterials.MasterCopperIngot;

public class AzarathBlacksmith extends Blacksmith implements MaterialFactory {

	@Override
	public CopperIngot createCopperIngot() {
		return new MasterCopperIngot();
	}

	@Override
	public IronIngot createIronIngot() {
		return new AverageIronIngot();
	}

	@Override
	public GoldIngot createGoldIngot() {
		return new AverageGoldIngot();
	}


}
