package factories;

import models.InanimateObjects.MiningMaterials.CopperIngot;
import models.InanimateObjects.MiningMaterials.GoldIngot;
import models.InanimateObjects.MiningMaterials.IronIngot;

public interface MaterialFactory {
	public CopperIngot createCopperIngot();
	public IronIngot createIronIngot();
	public GoldIngot createGoldIngot();
}
