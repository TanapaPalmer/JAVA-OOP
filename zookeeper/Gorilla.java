// Once this is done, she has asked that you also create a separate class of gorilla,
public class Gorilla extends Mammal {


	public Gorilla(int energyLevel) {
		super(energyLevel);
	}

	
	// which can throw things at people but will lose energy (-5) whenever this is done.
	public void throwThings() {
		energyLevel -= 5;
		System.out.println("The gorilla lost 5 energy because of throwing things.");		
	}


	// The gorilla should also be able to eatBananas and regain energy (+10).
	public void eatBananas() {
		energyLevel += 10;
		System.out.println("The gorilla got 10 energy by eating bananas.");		
	}


	// The gorilla should also be able to climb at the expense of energy (-10).
	public void climb() {
		energyLevel -= 10;
		System.out.println("The gorilla got a little tired because of climbing earlier so he lost 10 energy.");
	}
}