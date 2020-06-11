package commands;

import interfaces.Command;
import interfaces.IBlacksmith;
import models.InanimateObjects.MiningMaterials.CopperIngot;
import models.InanimateObjects.MiningMaterials.GoldIngot;
import models.InanimateObjects.MiningMaterials.IronIngot;

public class ForgeArmorCommand implements Command {
	public CopperIngot copperIngot;
	public IronIngot ironIngot;
	public GoldIngot goldIngot;
	public IBlacksmith blacksmith;
	
	public ForgeArmorCommand(IBlacksmith blacksmith) {
		this.blacksmith = blacksmith;
	}
	
	public ForgeArmorCommand(CopperIngot copper, IronIngot iron, GoldIngot gold, IBlacksmith blacksmith) {
		this.copperIngot = copper;
		this.ironIngot = iron;
		this.goldIngot = gold;
		this.blacksmith = blacksmith;
	}

	@Override
	public void execute() {
		blacksmith.refineCopper();
		blacksmith.refineGold();
		blacksmith.forgeArmor("cool armor");
	}

}
