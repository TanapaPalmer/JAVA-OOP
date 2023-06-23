public class Bat extends Mammal {

// The zookeeper has also captured a rare specimen. Its default energy is much higher than most mammals, its energy level is 300.

// The zookeeper has caught a giant Bat and wants your help to track its energy levels.


    public Bat(int energyLevel){
        super(energyLevel);
    }


    // It also can do a lot more than climb - it can fly. 
    // For the fly() method, print the sound of a bat taking off and decrease its energy by 50.
    public void fly(){
        energyLevel -= 50;
        System.out.println("Weeeeeeeeeeeeeee! The bat just took off and lost 50 energy.");
        
    }


    // Moreover, this specimen doesn't eat bananas, it eats humans... 
    // For the eatHumans() method, print the so- well, never mind, just increase its energy by 25.
    public void eatHumans(){
        energyLevel += 25;
        System.out.println("The bat just ate some humans and got 25 energy.");
        
    }


    // and it doesn't throw things, but attacks towns.
    // For the attackTown() method, print the sound of a town on fire and decrease its energy by 100.
    public void attackTowns(){
        energyLevel -= 100;
        System.out.println("Not good! The bat lost 100 energy because of attacking the towns. Oh noooooooooooo!");
        
    }
}