package gameEngine;

import java.util.Scanner;

import interfaces.GameCharacter.CharacterChoice;
import utilities.EnumUtils;

public class Main {

	public static void main(String[] args) {

		GameStarter startup = new GameStarter();
		startup.showGameStartupMessages();
		//User Input section start
		Scanner sc = new Scanner(System.in);
		String choiceString = sc.nextLine();
		choiceString = choiceString.toUpperCase();
		//User input section pause
		boolean validInput = EnumUtils.enumInputNTimeCheck(3, choiceString,
				CharacterChoice.class);
		if(!validInput) {
			System.out.println("You have chosen a wrong character three times,"
					+ " a king has been chosen for you.");
			choiceString = "KING";
		}
		CharacterChoice choice = CharacterChoice.valueOf(choiceString);
		startup.chooseCharacterSimpleFactory(choice);
		startup.gameCharacterSetupWithFactoryMethod(choice, "Excelsior", "FEMALE");
		System.out.println("Please choose a Race");
		System.out.println("The options are: ELF, HUMAN, DWARF & DEMONOID");
		//User Input Section Resume
		String raceInput = sc.nextLine();
		raceInput = raceInput.toUpperCase();
		sc.close();
		//User Input Section End
		startup.abstractFactorySetup(raceInput);
		startup.forgeArmor();
		startup.forgeWeapon();
		startup.humanPerformNonHumanActions();
	}
	
}
