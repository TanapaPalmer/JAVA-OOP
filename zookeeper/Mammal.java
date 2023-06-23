public class Mammal {

	protected int energyLevel = 0;
	

	// They should all be able to display their energy levels when asked through the displayEnergy method,
	// which should print and return the energy level.
	public int displayEnergy() {
		System.out.println("ENERGY LEVEL: " + energyLevel);
		return energyLevel;
	}


	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}


	public void GameOver(){
		if (energyLevel <= 0){
			System.out.println("GAME OVER!!!");
		}
	}
}