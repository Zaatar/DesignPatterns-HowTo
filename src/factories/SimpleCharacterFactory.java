package factories;

import interfaces.GameCharacter;
import interfaces.GameCharacter.CharacterChoice;
import models.HumanoidCharacters.King;
import models.HumanoidCharacters.Knight;
import models.HumanoidCharacters.Magician;
import models.HumanoidCharacters.Queen;
import models.NonHumanCharacters.Demon;
import models.NonHumanCharacters.Mermaid;
import models.NonHumanCharacters.Troll;

public class SimpleCharacterFactory {
	/*
	 * The below example is using the Simple Factory pattern, in this part decoupled
	 * the instantiation from the GameStarter class and put it into the
	 * SimpleHumanFactory Class
	 */

	public GameCharacter createCharacter(CharacterChoice choice) {
		GameCharacter character = null;
		switch(choice) {
		case KING:
			character = new King();
			System.out.println("You chose a king!");
			break;
		case QUEEN:
			character = new Queen();
			System.out.println("You chose a queen!");
			break;
		case KNIGHT:
			character = new Knight();
			System.out.println("You chose a knight!");
			break;
		case MAGICIAN:
			character = new Magician();
			System.out.println("You chose a magician!");
			break;
		case DEMON:
			character = new Demon();
			System.out.println("You chose a demon!");
			break;
		case MERMAID:
			character = new Mermaid();
			System.out.println("You chose a mermaid!");
			break;
		case TROLL:
			character = new Troll();
			System.out.println("You chose a troll!");
			break;
		default:
			System.out.println("You did not insert any of the defined value."
					+ "Therefore we will provide you with a King!");
			character = new King();
			break;
		}
		return character;
	}
}
