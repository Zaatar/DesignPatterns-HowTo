package models.InanimateObjects.Armor.States;

import interfaces.Armor;
import models.InanimateObjects.ArmorState;

public class MaterialsState implements ArmorState {
	Armor armor;
	
	public MaterialsState(Armor armor) {
		this.armor = armor;
	}

	@Override
	public void hammerNails() {
		System.out.println("Not this state's turn yet");
	}

	@Override
	public void meldMaterials() {
		System.out.println("Melding materials");
		armor.setState(armor.getMeldingState());
	}

	@Override
	public void coolMaterials() {
		System.out.println("Not this state's turn yet");
	}

	@Override
	public void finishingTouches() {
		System.out.println("Not this state's turn yet");
	}

}
