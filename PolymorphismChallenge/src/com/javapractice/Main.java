package com.javapractice;

class Car{
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.engine = true;
        this.wheels = 4;
        this.name = name;
        this.cylinders = cylinders;
    }

    public String startEngine(){
        return "The engine has started: Car -> startEngine()!";
    }

    public String accelerate(){
        return "Car -> Accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class Toyota extends Car{

    public Toyota(){
        super("Corola", 4);
    }

    @Override
    public String startEngine() {
        return "Toyota Corolla -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Toyota Corolla -> accelerate()";
    }

    @Override
    public String brake() {
        return "Toyota Corolla -> brake()";
    }
}

class Audi extends Car{

    public Audi(){
        super("R8", 6);
    }

    @Override
    public String startEngine() {
        return "Audi R8 -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Audi R8 -> accelerate()";
    }

    @Override
    public String brake() {
        return "Audi R8 -> brake()";
    }
}

class AstinMartin extends Car{

    public AstinMartin(){
        super("326", 8);
    }

    @Override
    public String startEngine() {
        return "AstinMartin 326 -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "AstinMartin 326 -> accelerate()";
    }

    @Override
    public String brake() {
        return "AstinMartin 326 -> brake()";
    }
}

public class Main {

    public static void main(String[] args) {

        for(int i=1 ; i<11; i++){
            Car car = randomCar();
            System.out.println("Car #" + i + " : " + car.getName() + "\n" + "Cylinders: " + car.getCylinders() + "\n");
        }
    }

    public static Car randomCar(){
        int randomNumber = (int) (Math.random()*3) + 1;
        System.out.println("Random number Generated was: " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Toyota();
            case 2:
                return new Audi();
            case 3:
                return new AstinMartin();
        }

        return null;
    }
}
