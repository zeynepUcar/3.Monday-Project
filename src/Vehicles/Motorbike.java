package Vehicles;

public class Motorbike extends Vehicle {

    //create two private variables boolean is_HelmetPresent , int CurrentSpeed
    private boolean is_HelmetPresent;
    private int CurrentSpeed;


    //create a get method for the is_HelmentPresent and CurrentSpeed
    public boolean getis_HelmetPresent() {
        return is_HelmetPresent;
    }

    public int getCurrentSpeed() {
        return CurrentSpeed;
    }

    /*  create a constructer
            this constructer should have the model and color from the Vehicle class

            and currentSpeed and is_HelmetPresent should be as a parameter as well.
            is_HelmetPresent and currentSpeed also assigned with this keyword

     */
    public Motorbike(String model, int currentSpeed, String color ,boolean is_HelmetPresent) {
        super(model, color);
        this.is_HelmetPresent = is_HelmetPresent;
        this.CurrentSpeed = currentSpeed;

    }


    /*
     create a method HelmetShouldbePresent <<<-----  get the name from here

        create one int(fine) to get the fine amount from the getFine Method from ticket class then

        if the helmet is not present then add the 200$ to TicketPrice

        return the fine which is created in the method
     */
    public int HelmetShouldbePresent(){

        int fine = Ticket.getFine(getCurrentSpeed());

        System.out.println(fine + "  fine is here ");

        if(is_HelmetPresent==false) {

            fine = fine + 200;

        }

    return fine;

    }

}
