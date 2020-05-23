package factories;

import interfaces.GameCharacter;
import interfaces.GameCharacter.CharacterChoice;
import models.HumanoidCharacters.King;
import models.HumanoidCharacters.Knight;
import models.HumanoidCharacters.Magician;
import models.HumanoidCharacters.Queen;

public class HumanoidCharacterCreationFactory extends CharacterCreationFactory {

	@Override
	GameCharacter createCharacter(CharacterChoice choice) {
		switch (choice) {
		case KING:
			gameCharacter = new King();
			break;
		case QUEEN:
			gameCharacter = new Queen();
			break;
		case KNIGHT:
			gameCharacter = new Knight();
			break;
		case MAGICIAN:
			gameCharacter = new Magician();
			break;
		default:
			System.out.println("This is the Human creator, you cannot create non human"
					+ "characters");
			System.out.println("You will be fitted with a King for the time being!");
			gameCharacter = new King();
		}
		return gameCharacter;
	}

}
