package gameEngine;

import factories.CharacterCreationFactory;
import factories.HumanCharacterCreationFactory;
import factories.NonHumanCharacterCreationFactory;
import factories.SimpleCharacterFactory;
import interfaces.GameCharacter;
import interfaces.GameCharacter.CharacterChoice;
import interfaces.GameCharacter.Gender;
import utilities.EnumUtils;

public class GameStarter {
	SimpleCharacterFactory characterFactory;
	CharacterCreationFactory characterCreationFactory;
	HumanCharacterCreationFactory humanCharacterCreationFactory;
	NonHumanCharacterCreationFactory nonHumanCharacterCreationFactory;
	GameCharacter character;

	public GameStarter() {
		this.characterFactory = new SimpleCharacterFactory();
	}

	public GameCharacter chooseCharacterSimpleFactory(CharacterChoice choice) {
		GameCharacter playerCharacter = characterFactory.createCharacter(choice);
		return playerCharacter;
	}

	public GameCharacter completeGameCharacterSetup(CharacterChoice choice,
			String name, String gender) {
		if(choice == CharacterChoice.KING || choice == CharacterChoice.KNIGHT
				||choice == CharacterChoice.QUEEN ||
				choice == CharacterChoice.MAGICIAN) {
			CharacterCreationFactory factory = 
					new HumanCharacterCreationFactory();
			boolean validInput = EnumUtils.enumInputNTimeCheck(3, gender,
					Gender.class);
			if(!validInput) {
				System.out.println("You have chosen a wrong gender three times,"
						+ " a female has been chosen for you.");
				gender = "FEMALE";
			}
			Gender genderEnum = Gender.valueOf(gender);
			character = factory.completeGameCharacterSetup
					(choice, name, genderEnum);
		} else {
			CharacterCreationFactory factory = 
					new NonHumanCharacterCreationFactory();
			boolean validInput = EnumUtils.enumInputNTimeCheck(3, gender,
					Gender.class);
			if(!validInput) {
				System.out.println("You have chosen a wrong gender three times,"
						+ " a female has been chosen for you.");
				gender = "FEMALE";
			}
			Gender genderEnum = Gender.valueOf(gender);
			character = factory.completeGameCharacterSetup
					(choice, name, genderEnum);
		}
		return character;	
	}
}
