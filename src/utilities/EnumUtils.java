package utilities;

import interfaces.GameCharacter.CharacterChoice;

public class EnumUtils {
	public static boolean validateStringInput(String input){
		boolean result = false;
		input = input.toUpperCase();
		for(CharacterChoice choice : CharacterChoice.values()) {
			if(input.equals(choice.name())) {
				result = true;
				break;
			} else {
				result = false;		
			}
		}
		return result;
	}
}
