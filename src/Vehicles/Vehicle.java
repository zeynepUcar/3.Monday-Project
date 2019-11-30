package Vehicles;

public class Vehicle {

    // create 3 private variables  - String model - String color
    private String model;
    private String color;


    //create a constructer with all the varibles as a parameter
    public Vehicle(String model , String color ){

        this.model = model;

        this.color = color;
    }

    // create getter and setter for all non-Static variables
    public String getModel() {
        return model;
    }


    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }






}
