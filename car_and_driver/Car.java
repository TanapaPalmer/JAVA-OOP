public class Car {
    public int gas = 10;

    public void status(){
        System.out.println("Gas remaining: "+gas+"/10");

    //BONUS: Add a 'game over' message to your car class that is displayed when the gas reaches zero

            if (gas == 0){
                System.out.println("Game Over");
            }
    }
}