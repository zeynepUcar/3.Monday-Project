package Vehicles;

public class Car extends Vehicle {

    //create two private variables boolean is_HelmetPresent , int CurrentSpeed
    private int passengerCount;
    private int CurrentSpeed;

    //create a get method for the is_HelmentPresent and CurrentSpeed
    public int getpassengerCount() {
        return passengerCount;
    }

    public int getCurrentSpeed() {
        return CurrentSpeed;
    }

//    create a constructer , with all the variables
    public Car(String model, int currentSpeed, String color, int passengerCount) {
        super(model, color);
        this.passengerCount = passengerCount;
        this.CurrentSpeed = currentSpeed;

    }

    /*
      create a method PassengerShouldbeLessthen5 <<<-----  get the name from here

         create one int(fine) to get the fine amount from the getFine Method from ticket class then

         if the pessanger amount 6 or 7 add 300 to fine

         if the pessanger amount is 8 or 9 then 500 to fine

         if more then add 1000 to fine

         return the fine which is created in the method
      */
    public int PassengerShouldbeLessthen5(){

        int fine = Ticket.getFine(getCurrentSpeed());

        System.out.println(fine + "  fine is here ");

        if(passengerCount>5 && passengerCount<=7) {

            fine = fine + 300;

        }else if(passengerCount>=8 && passengerCount<10) {

            fine = fine + 600;

        }else if(passengerCount>=10){

            fine = fine+1000;

        }

        return fine;

    }

}
