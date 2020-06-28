package models.InanimateObjects.Armor.States;

import interfaces.Armor;
import models.InanimateObjects.ArmorState;

public class HammeringState implements ArmorState {
	Armor armor;
	
	public HammeringState(Armor armor) {
		this.armor = armor;
	}

	@Override
	public void hammerNails() {
		System.out.println("This is the state we're currently in");
	}

	@Override
	public void meldMaterials() {
		System.out.println("Not this state's turn, already done.");
	}

	@Override
	public void coolMaterials() {
		System.out.println("Not this state's turn, already done.");
	}

	@Override
	public void finishingTouches() {
		System.out.println("Polishing the armor");
		System.out.println("Armor complete!");
	}

}
