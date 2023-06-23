public class BatTest {

    public static void main(String[] args){
        
        // The zookeeper has also captured a rare specimen. Its default energy is much higher than most mammals, its energy level is 300.
        Bat bat = new Bat(300);

        // The bat should be tested by attacking three towns, eating two humans,
        // flying twice, and then displaying its energy.

        bat.displayEnergy();
        bat.attackTowns();
        bat.attackTowns();
        bat.attackTowns();
        bat.displayEnergy();
        bat.eatHumans();
        bat.eatHumans();
        bat.displayEnergy();
        bat.fly();
        bat.fly();
        bat.displayEnergy();
        bat.GameOver();
    }
}