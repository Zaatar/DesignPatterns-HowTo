package models.InanimateObjects.Armor.States;

import interfaces.Armor;
import models.InanimateObjects.ArmorState;

public class CoolingState implements ArmorState {
	Armor armor;
	
	public CoolingState(Armor armor) {
		this.armor = armor;
	}

	@Override
	public void hammerNails() {
		System.out.println("Taking a hammer and putting the final touches on the armor");
		armor.setState(armor.getHammeringState());
	}

	@Override
	public void meldMaterials() {
		System.out.println("State already done");
	}

	@Override
	public void coolMaterials() {
		System.out.println("This is the state we are currently in");
	}

	@Override
	public void finishingTouches() {
		System.out.println("This state is after the Hammering state");
	}

}
