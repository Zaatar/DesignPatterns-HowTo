package gameEngine;

import java.util.Scanner;

import interfaces.GameCharacter.CharacterChoice;
import utilities.EnumUtils;

public class Main {

	public static void main(String[] args) {
		boolean validInput = false;
		System.out.println("Welcome to Kingdom Simulator");
		System.out.println("We hope you enjoy your time with us!");
		System.out.println("We will start with the Simple Factory pattern for easy"
				+ "character creation, please choose your champion");
		System.out.println("The options are: KING, QUEEN, KNIGHT, MAGICIAN, DEMON & TROLL");
		Scanner sc = new Scanner(System.in);
		String choiceString = sc.nextLine();
		choiceString = choiceString.toUpperCase();
		for(int i = 0; i <=2; i++) {
			if(EnumUtils.validateStringInput(choiceString)) {
				validInput = true;
				break;
			}
		}
		if(!validInput) {
			System.out.println("You have chosen a wrong character three times,"
					+ " a king has been chosen for you.");
			choiceString = "KING";
		}
		sc.close();
		CharacterChoice choice = CharacterChoice.valueOf(choiceString);
		GameStarter startup = new GameStarter();
		startup.chooseCharacter(choice);
		System.out.println("The Simple Factory pattern worked successfully!");
	}
	
}
