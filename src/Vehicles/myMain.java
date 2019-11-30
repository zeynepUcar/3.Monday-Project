package Vehicles;

public class myMain {

    public static void main(String[] args) {

        Motorbike m1 = new Motorbike("Kawasaki" , 150, "Red" ,  false );

        System.out.println(m1.getModel());

        System.out.println(m1.getColor());

        System.out.println(m1.HelmetShouldbePresent());

        Car c1 = new Car("Honda" ,110 ,"Silver" , 7);

        System.out.println(c1.PassengerShouldbeLessthen5());
    }
}
