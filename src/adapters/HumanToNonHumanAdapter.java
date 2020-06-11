package adapters;

import interfaces.IHumanBehavior;
import interfaces.INonHumanBehavior;

public class HumanToNonHumanAdapter implements INonHumanBehavior{
	IHumanBehavior humanoid;
	
	public HumanToNonHumanAdapter(IHumanBehavior humanoid) {
		this.humanoid = humanoid;
	}

	@Override
	public void Dissapear() {
		humanoid.Run();
		System.out.println("Humanoids can't run away as fast as Demonic beings");
		System.out.println("Adapter worked successfully");
	}

	@Override
	public void DemonicDialectSpeech() {
		humanoid.HumanDialectSpeech();
		System.out.println("Human speech Instantaneous translation to Demonic speech spell activated");
		System.out.println("Adapter worked successfully");
	}

}
