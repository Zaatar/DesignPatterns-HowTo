package factories;

import interfaces.GameCharacter;
import interfaces.GameCharacter.CharacterChoice;
import interfaces.GameCharacter.Gender;

/*
 * This class, as well as the HumanCharacterCreationFactory & the 
 * NonHumanCharacterCreationFactory are the implementations of the factory method approach.
 * The idea here is that the class wants to ensure implementation of multiple functions
 * (or standards) on creation of objects, and it also wants to provide dynamic 
 *  instantiation based on the class doing the instantiation.
 *  
 *  In this scenario the HumanCharacterCreationFactory and the 
 *  NonHumanCharacterCreationFactory are the concrete creators, one is used to create
 *  HumanCharacters and the other is used to create NonHumanCharacters.
 *  
 *  Thus our instantiation of new characters is limited to the two classes mentioned above.
 */

public abstract class CharacterCreationFactory {
	GameCharacter gameCharacter;

	abstract GameCharacter createCharacter(CharacterChoice choice);

	public void completeGameCharacterSetup(CharacterChoice choice, String name, Gender gender) {
		gameCharacter = createCharacter(choice);
		gameCharacter.setName(name);
		gameCharacter.setGender(gender);
		System.out.println("You are now ready to try this awesome game!");
	}

}
