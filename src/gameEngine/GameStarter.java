package gameEngine;

import java.util.Iterator;

import adapters.HumanToNonHumanAdapter;
import commands.ForgeArmorCommand;
import commands.ForgeWeaponCommand;
import factories.AlfheimElfFactory;
import factories.CharacterCreationFactory;
import factories.HumanoidCharacterCreationFactory;
import factories.InterfaceAbstractCharacterCreationFactory;
import factories.JotunheimDwarfFactory;
import factories.MordorHumanFactory;
import factories.NonHumanCharacterCreationFactory;
import factories.SimpleCharacterFactory;
import interfaces.Armor;
import interfaces.GameCharacter;
import interfaces.GameCharacter.CharacterChoice;
import interfaces.GameCharacter.Race;
import interfaces.IHumanBehavior;
import models.HumanoidCharacters.Human;
import models.InanimateObjects.ArmorList;
import models.InanimateObjects.Forgeable;
import models.InanimateObjects.Armor.Helmet.HeavyHelmet;
import models.InanimateObjects.Armor.Helmet.LightHelmet;
import models.InanimateObjects.Armor.Torso.SturdyBreastplate;
import models.NonPlayableCharacters.AzarathBlacksmith;
import models.NonPlayableCharacters.BlacksmithApprentice;
import models.NonPlayableCharacters.MetriosBlacksmith;
import models.NonPlayableCharacters.Miners.EnthusiasticMiner;
import models.NonPlayableCharacters.Miners.LazyMiner;
import models.NonPlayableCharacters.Miners.Miner;
import utilities.EnumUtils;

public class GameStarter {
	SimpleCharacterFactory characterFactory;
	CharacterCreationFactory characterCreationFactory;
	HumanoidCharacterCreationFactory humanCharacterCreationFactory;
	NonHumanCharacterCreationFactory nonHumanCharacterCreationFactory;
	GameCharacter character;
	BlacksmithApprentice apprentice;
	AzarathBlacksmith aBlacksmith;
	MetriosBlacksmith mBlacksmith;
	ForgeArmorCommand forgeArmorCommand;
	ForgeWeaponCommand forgeWeaponCommand;
	HumanToNonHumanAdapter htnAdapter;
	Miner enthusiasticMiner;
	Miner lazyMiner;
	
	public GameStarter() {
		this.characterFactory = new SimpleCharacterFactory();
		this.apprentice = new BlacksmithApprentice();
		this.aBlacksmith = new AzarathBlacksmith();
		this.mBlacksmith = new MetriosBlacksmith();
		this.forgeArmorCommand = new ForgeArmorCommand(aBlacksmith);
		this.forgeWeaponCommand = new ForgeWeaponCommand(mBlacksmith);
		this.enthusiasticMiner = new EnthusiasticMiner();
		this.lazyMiner = new LazyMiner();
	}

	public GameCharacter chooseCharacterSimpleFactory(CharacterChoice choice) {
		GameCharacter playerCharacter = characterFactory.createCharacter(choice);
		System.out.println("The Simple Factory pattern worked successfully!");
		return playerCharacter;
	}
	
	public boolean checkIfHumanCharacter(CharacterChoice choice) {
		if(choice == CharacterChoice.KING || choice == CharacterChoice.KNIGHT
				||choice == CharacterChoice.QUEEN ||
				choice == CharacterChoice.MAGICIAN)
			return true;
		else
			return false;
	}
	
	public GameCharacter gameCharacterSetupWithFactoryMethod(CharacterChoice choice,
			String name, String race) {
		if(checkIfHumanCharacter(choice)) {
			CharacterCreationFactory factory = 
					new HumanoidCharacterCreationFactory();
			boolean validInput = EnumUtils.enumInputNTimeCheck(3, race,
					Race.class);
			if(!validInput) {
				System.out.println("You have chosen a wrong race three times,"
						+ " an elf has been chosen for you.");
				race = "ELF";
			}
			Race raceEnum = Race.valueOf(race);
			character = factory.completeGameCharacterSetup
					(choice, name, raceEnum);
		} else {
			CharacterCreationFactory factory = 
					new NonHumanCharacterCreationFactory();
			boolean validInput = EnumUtils.enumInputNTimeCheck(3, race,
					Race.class);
			if(!validInput) {
				System.out.println("You have chosen a wrong race three times,"
						+ " a demonoid has been chosen for you.");
				race = "DEMONOID";
			}
			Race raceEnum = Race.valueOf(race);
			character = factory.completeGameCharacterSetup
					(choice, name, raceEnum);
		}
		System.out.println("The FactoryMethod pattern worked successfully!");
		return character;	
	}
	
	public void abstractFactorySetup(String raceInput) {
		boolean validInput = EnumUtils.enumInputNTimeCheck(3, raceInput,
				Race.class);
		if(!validInput) {
			System.out.println("You have chosen a wrong race three times,"
					+ " an elf has been chosen for you.");
			raceInput = "ELF";
		}
		Race raceEnum = Race.valueOf(raceInput);
		if(raceEnum == Race.ELF) {
			InterfaceAbstractCharacterCreationFactory factory = new AlfheimElfFactory();
			factory.createGameCharacter();
		} else if(raceEnum == Race.HUMAN) {
			InterfaceAbstractCharacterCreationFactory factory = new MordorHumanFactory();
			factory.createGameCharacter();
		} else if(raceEnum == Race.DWARF) {
			InterfaceAbstractCharacterCreationFactory factory = new JotunheimDwarfFactory();
			factory.createGameCharacter();
		} else {
			System.out.println("Demonoid support not implemented yet");
		}
		System.out.println("The Abstract Factory Pattern Works!");
	}
	
	public void showGameStartupMessages() {
		System.out.println("Welcome to Kingdom Simulator");
		System.out.println("We hope you enjoy your time with us!");
		System.out.println("We will start with the Simple Factory pattern for easy"
				+ "character creation, please choose your champion");
		System.out.println("The options are: KING, QUEEN, KNIGHT, MAGICIAN, DEMON & TROLL");
	}
	
	public void forgeArmor() {
		apprentice.setCommand(forgeArmorCommand);
		forgeArmorCommand.execute();
		System.out.println("Command pattern executed successfully");
	}
	
	public void forgeWeapon() {
		apprentice.setCommand(forgeWeaponCommand);
		forgeWeaponCommand.execute();
		System.out.println("Command pattern executed successfully");
	}
	
	public void humanPerformNonHumanActions() {
		IHumanBehavior humanCharacter = new Human();
		htnAdapter = new HumanToNonHumanAdapter(humanCharacter);
		htnAdapter.DemonicDialectSpeech();
		htnAdapter.Dissapear();
		System.out.println("Adapter pattern working as expected");
	}
	
	public void mineOre(Miner miner) {
		miner.mineMaterial();
		System.out.println("Template Method Proof Of Concept");
	}
	
	public void CompositePatternTest() {
		Forgeable lightHelmet = new LightHelmet();
		Forgeable heavyHelmet = new HeavyHelmet();
		Forgeable sturdyBreastplate = new SturdyBreastplate();
		Forgeable listOfArmor = new ArmorList();
		listOfArmor.add(lightHelmet);
		listOfArmor.add(heavyHelmet);
		listOfArmor.add(sturdyBreastplate);
		Iterator<Forgeable> iterator = listOfArmor.createIterator();
		while(iterator.hasNext()) {
			Forgeable forgeable = (Forgeable)iterator.next();
			System.out.println(forgeable.getLevelRequirement());
			System.out.println(forgeable.getProtectionStat());
			System.out.println(forgeable.getWeightStat());
		}
		System.out.println("Composite Pattern works successfully!");
	}
	
	public void StatePatternTest() {
		Armor lightHelmet = new LightHelmet();
		lightHelmet.setState(lightHelmet.getMaterialsState());
		lightHelmet.meldMaterials();
		lightHelmet.meldMaterials();
		lightHelmet.coolMaterials();
		lightHelmet.meldMaterials();
		lightHelmet.hammerNails();
		lightHelmet.finishingTouches();
		System.out.println("State Pattern works successfully");
	}
}
