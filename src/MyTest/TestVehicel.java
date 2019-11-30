package MyTest;

import Vehicles.Car;
import Vehicles.Motorbike;
import Vehicles.Ticket;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class TestVehicel {

    
 @Test
    public void CheckCar1(){

    Car c1 = new Car("Toyota" , 100,"Red" , 8);

    int fine_amount = c1.PassengerShouldbeLessthen5();

     System.out.println(fine_amount);

     Assert.assertTrue(750 == fine_amount);

 }

    @Test
    public void CheckCar2(){

        Car c1 = new Car("Toyota" , 100,"Red" , 3);

        int fine_amount = c1.PassengerShouldbeLessthen5();

        System.out.println(fine_amount);

        Assert.assertTrue(150 == fine_amount);

    }

    @Test
    public void CheckCar3(){

        Car c1 = new Car("Toyota" , 70,"Red" , 3);

        int fine_amount = c1.PassengerShouldbeLessthen5();

        System.out.println(fine_amount);

        Assert.assertTrue(0 == fine_amount);

    }

    @Test
    public void CheckMotorBike1(){

        Motorbike c1 = new Motorbike("Kawasaki" , 110,"Red" , true);

        int fine_amount = c1.HelmetShouldbePresent();

        System.out.println(fine_amount);

        Assert.assertTrue(280 == fine_amount);

    }

    @Test
    public void CheckMotorBike2(){

        Motorbike c1 = new Motorbike("BMW" , 160,"Red" , false);

        int fine_amount = c1.HelmetShouldbePresent();

        System.out.println(fine_amount);

        Assert.assertTrue(700 == fine_amount);

    }

    @Test
    public void CheckMotorBike3(){

        Motorbike c1 = new Motorbike("Mercedes" , 50,"Red" , true);

        int fine_amount = c1.HelmetShouldbePresent();

        System.out.println(fine_amount);

        Assert.assertTrue(0 == fine_amount);

    }

    @After
    public void after(){
    // dont touch here
        Ticket.getFine(50);


    }
}
