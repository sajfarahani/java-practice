package com.javapractice;

/**
 * Created by Sajj on 1/06/2017.
 */
public class Car {

    private int door;
    private int wheels;
    private String model;
    private String engine;
    private String colour;


    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "unknown";
        }

    }

    public String getModel(){
        return this.model;
    }


}
