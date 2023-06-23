public class GorillaTest {


    public static void main(String[] args) {

        // Every mammal should have an energy level (default 100).
        Gorilla gorilla = new Gorilla(100);


        // She asks that you demonstrate that the class works as expected by having the gorilla throw things 3 times,
        // eat bananas twice and climb once; then print the gorilla's energy level.
        
        gorilla.displayEnergy();
        gorilla.throwThings();
        gorilla.throwThings();
        gorilla.throwThings();
        gorilla.displayEnergy();
        gorilla.eatBananas();
        gorilla.eatBananas();
        gorilla.displayEnergy();
        gorilla.climb();
        gorilla.displayEnergy();
    }
}