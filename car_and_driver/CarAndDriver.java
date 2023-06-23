public class CarAndDriver {
    public static void main(String[] args){
        Driver driver = new Driver();

        // Drive four times
        driver.drive();
        driver.drive();
        driver.drive();
        driver.drive();

        // Use boosters once
        driver.boost();

        // Refuel three times
        driver.refuel();
        driver.refuel();
        driver.refuel();

        System.out.println("----------------------------");
        

        // BONUS & EXTRA BONUS:
        driver.drive();
        driver.drive();

        driver.boost();
        driver.boost();

        driver.refuel();
        driver.refuel();
        driver.refuel();
        driver.refuel();

        driver.drive();
        driver.drive();
        driver.drive();
        driver.drive();
        driver.drive();
        driver.drive();
        driver.drive();
        driver.drive();
        driver.drive();
    }
}