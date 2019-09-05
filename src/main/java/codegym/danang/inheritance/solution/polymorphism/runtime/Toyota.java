package codegym.danang.inheritance.solution.polymorphism.runtime;

public class Toyota extends Vehicle {



    public boolean swichingLight;

    public Toyota() {

    }

    @Override
    public void moveOnStree() {
        System.out.println("Toyota Moving 50 miles ........ ");
    }
}
