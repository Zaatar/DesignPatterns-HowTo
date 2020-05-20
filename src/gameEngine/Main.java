package gameEngine;

import java.util.Scanner;

import interfaces.GameCharacter.CharacterChoice;
import utilities.EnumUtils;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Kingdom Simulator");
		System.out.println("We hope you enjoy your time with us!");
		System.out.println("We will start with the Simple Factory pattern for easy"
				+ "character creation, please choose your champion");
		System.out.println("The options are: KING, QUEEN, KNIGHT, MAGICIAN, DEMON & TROLL");
		Scanner sc = new Scanner(System.in);
		String choiceString = sc.nextLine();
		choiceString = choiceString.toUpperCase();
		boolean validInput = EnumUtils.enumInputNTimeCheck(3, choiceString,
				CharacterChoice.class);
		if(!validInput) {
			System.out.println("You have chosen a wrong character three times,"
					+ " a king has been chosen for you.");
			choiceString = "KING";
		}
		sc.close();
		CharacterChoice choice = CharacterChoice.valueOf(choiceString);
		GameStarter startup = new GameStarter();
		startup.chooseCharacterSimpleFactory(choice);
		System.out.println("The Simple Factory pattern worked successfully!");
		startup.completeGameCharacterSetup(choice, "Excelsior", "FEMALE");
		System.out.println("The FactoryMethod pattern worked successfully!");
	}
	
}
