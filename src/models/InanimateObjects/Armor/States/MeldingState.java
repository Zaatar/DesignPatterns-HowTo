package models.InanimateObjects.Armor.States;

import interfaces.Armor;
import models.InanimateObjects.ArmorState;

public class MeldingState implements ArmorState {
	Armor armor;
	
	public MeldingState(Armor armor) {
		this.armor = armor;
	}

	@Override
	public void hammerNails() {
		System.out.println("Not this state's turn yet");
	}

	@Override
	public void meldMaterials() {
		System.out.println("This is the state we are currently in");
	}

	@Override
	public void coolMaterials() {
		System.out.println("Moving on to the cooling state");
		armor.setState(armor.getCoolingState());
	}

	@Override
	public void finishingTouches() {
		System.out.println("Not this state's turn yet");
	}

}
