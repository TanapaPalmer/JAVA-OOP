public class Driver extends Car {

    // Driving should decrease gas by 1
    public void drive(){
        System.out.println("You drive the car.");
        gas --;
        status();
    }


    // Using boosters should decrease gas by 3
    public void boost(){
        System.out.println("You use the boosters.");
        gas -= 3;
        status();
        

    // EXTRA BONUS:
    // Don't allow the driver to boost if his car has less than 3 gas
        if (gas <= 2){
            System.out.println("You don't have enough boosters!!!");
        }
    }



    // Refueling should increase gas by 2
    public void refuel(){
        System.out.println("You refuel.");
        gas += 2;
        status();


    // EXTRA BONUS:
    // Don't allow the driver to refuel if his car has more than 8 gas
        if (gas >= 9){
            System.out.println("You can't refuel yet!!!");
        }
    }
    
}