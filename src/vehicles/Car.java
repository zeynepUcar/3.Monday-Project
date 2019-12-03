package vehicles;


public class Car extends Vehicle {



    /**
     * Task 10
     * create two private attributes: int passengerCount, int currentSpeed
     */

    private int passengerCount;
    private int currentSpeed;




    /**
     * Task 11
     * create getter methods for the passengerCount and currentSpeed
     */
    public int getPassengerCount() {
        return passengerCount;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }





    /**
     * Task 12
     * create a constructor with all attributes including inherited
     * order of parameters are model, color, passengerCount, currentSpeed
     *
     */
    public Car(String model, String color,int passengerCount, int currentSpeed){
        super(model,color);
        this.passengerCount = passengerCount;
        this.currentSpeed = currentSpeed;

    }






    /**
     * Task 13
     * create a method additionalFineForCrowd
     * <p>
     * create one local variable called extraFine as int
     * to hold fine amount from the getFine method in vehicles.Ticket class
     * then check for passengerCount:
     * <p>
     * if passengerCount between 6 and 7, add 300 to extraFine
     * if passengerCount between 8 and 10, add 600 to extraFine
     * if more than 10, add 1000 to extraFine
     * <p>
     * return extraFine
     */
    public int additionalFineForCrowd(){
        int extraFine = 0;

        Ticket.getFine(currentSpeed);
        int fine=  Ticket.getFine(currentSpeed);

        if(passengerCount >=6 && passengerCount <=7){
            extraFine = fine + 300;
        }else if(passengerCount >=8 && passengerCount <=10) {
            extraFine = fine + 600;
        }else if(passengerCount >10) {
            extraFine = fine + 1000;
        }else {
            extraFine = fine;
        }
        return extraFine;
    }




}
