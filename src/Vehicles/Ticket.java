package Vehicles;

public class Ticket {

    // create one private int static variable name is fine
    private static int fine;

//      Create a GetFine static method parameter is int(currentSpeed) and return type is int if the current speed(in the parameter)
//      is more then 80 then give a ticket

//      If the current speed between 80 - 90 ticket price is 80$

//      If the current speed between 90 - 100 ticket price is 150$

//      If the current speed between 100 - 110 ticket price is 280$

//      If the current speed more then 110 then 500$

//      if the current speed less then 80 fine is 0

// return the fine again

//    NOTE YOU SHOULD ASSIGN ALL THE FINES AMOUNTS TO THE FINE STATIC VARIABLE

    public static int getFine(int speed) {

        int currentSpeed = speed;


        if (currentSpeed > 80 && currentSpeed <= 90) {

            fine = 80;

        } else if (currentSpeed > 90 && currentSpeed <= 100) {

            fine = 150;

        } else if (currentSpeed > 100 && currentSpeed <= 110) {

            fine = 280;

        } else if (currentSpeed > 110) {

            fine = 500;

        }else{

            fine = 0;

        }

        return fine;
    }

}
