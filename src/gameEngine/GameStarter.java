package gameEngine;

import factories.AbstractCharacterCreationFactory;
import factories.AlfheimElfFactory;
import factories.CharacterCreationFactory;
import factories.HumanoidCharacterCreationFactory;
import factories.JotunheimDwarfFactory;
import factories.MordorHumanFactory;
import factories.NonHumanCharacterCreationFactory;
import factories.SimpleCharacterFactory;
import interfaces.GameCharacter;
import interfaces.GameCharacter.CharacterChoice;
import interfaces.GameCharacter.Race;
import utilities.EnumUtils;

public class GameStarter {
	SimpleCharacterFactory characterFactory;
	CharacterCreationFactory characterCreationFactory;
	HumanoidCharacterCreationFactory humanCharacterCreationFactory;
	NonHumanCharacterCreationFactory nonHumanCharacterCreationFactory;
	GameCharacter character;

	public GameStarter() {
		this.characterFactory = new SimpleCharacterFactory();
	}

	public GameCharacter chooseCharacterSimpleFactory(CharacterChoice choice) {
		GameCharacter playerCharacter = characterFactory.createCharacter(choice);
		return playerCharacter;
	}
	
	public boolean checkIfHumanCharacter(CharacterChoice choice) {
		if(choice == CharacterChoice.KING || choice == CharacterChoice.KNIGHT
				||choice == CharacterChoice.QUEEN ||
				choice == CharacterChoice.MAGICIAN)
			return true;
		else
			return false;
	}
	
	public GameCharacter completeGameCharacterSetup(CharacterChoice choice,
			String name, String race) {
		if(checkIfHumanCharacter(choice)) {
			CharacterCreationFactory factory = 
					new HumanoidCharacterCreationFactory();
			boolean validInput = EnumUtils.enumInputNTimeCheck(3, race,
					Race.class);
			if(!validInput) {
				System.out.println("You have chosen a wrong race three times,"
						+ " an elf has been chosen for you.");
				race = "ELF";
			}
			Race raceEnum = Race.valueOf(race);
			character = factory.completeGameCharacterSetup
					(choice, name, raceEnum);
		} else {
			CharacterCreationFactory factory = 
					new NonHumanCharacterCreationFactory();
			boolean validInput = EnumUtils.enumInputNTimeCheck(3, race,
					Race.class);
			if(!validInput) {
				System.out.println("You have chosen a wrong race three times,"
						+ " a demonoid has been chosen for you.");
				race = "DEMONOID";
			}
			Race raceEnum = Race.valueOf(race);
			character = factory.completeGameCharacterSetup
					(choice, name, raceEnum);
		}
		return character;	
	}
	
	public void abstractFactorySetup(String raceInput) {
		boolean validInput = EnumUtils.enumInputNTimeCheck(3, raceInput,
				Race.class);
		if(!validInput) {
			System.out.println("You have chosen a wrong race three times,"
					+ " an elf has been chosen for you.");
			raceInput = "ELF";
		}
		Race raceEnum = Race.valueOf(raceInput);
		if(raceEnum == Race.ELF) {
			AbstractCharacterCreationFactory factory = new AlfheimElfFactory();
			factory.createTorsoArmor();
			factory.createHelmet();
			factory.createWeapon();
			factory.createGameCharacter();
		} else if(raceEnum == Race.HUMAN) {
			AbstractCharacterCreationFactory factory = new MordorHumanFactory();
			factory.createTorsoArmor();
			factory.createHelmet();
			factory.createWeapon();
			factory.createGameCharacter();
		} else if(raceEnum == Race.DWARF) {
			AbstractCharacterCreationFactory factory = new JotunheimDwarfFactory();
			factory.createTorsoArmor();
			factory.createHelmet();
			factory.createWeapon();
			factory.createGameCharacter();
		} else {
			System.out.println("Demonoid support not implemented yet");
		}
			
	}
}
