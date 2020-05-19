package gameEngine;

import factories.SimpleCharacterFactory;
import interfaces.GameCharacter;
import interfaces.GameCharacter.CharacterChoice;

public class GameStarter {
	SimpleCharacterFactory characterFactory;
	GameCharacter character;
	public GameStarter() {
		this.characterFactory = new SimpleCharacterFactory();
	}
	
	public GameCharacter chooseCharacter(CharacterChoice choice) {
		GameCharacter playerCharacter = characterFactory.createCharacter(choice);
		return playerCharacter;
	}
}
