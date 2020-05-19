package factories;

import interfaces.GameCharacter;
import interfaces.GameCharacter.CharacterChoice;
import models.NonHumanCharacters.Demon;
import models.NonHumanCharacters.Mermaid;
import models.NonHumanCharacters.Troll;

public class NonHumanCharacterCreationFactory extends CharacterCreationFactory {

	@Override
	GameCharacter createCharacter(CharacterChoice choice) {
		switch(choice) {
		case DEMON:
			gameCharacter = new Demon();
			break;
		case MERMAID:
			gameCharacter = new Mermaid();
			break;
		case TROLL:
			gameCharacter = new Troll();
			break;
		default:
			System.out.println("This is the NonHuman creator, you cannot create human"
					+ "characters");
			System.out.println("You will be fitted with a Demon for the time being!");
			gameCharacter = new Demon();
		}
		return gameCharacter;
	}

}
