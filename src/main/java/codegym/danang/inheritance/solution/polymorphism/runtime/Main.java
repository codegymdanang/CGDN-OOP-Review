package codegym.danang.inheritance.solution.polymorphism.runtime;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Vehicle vehicle ;
        String inputString = "lambo";

        if (inputString.equals("toyota")) {
            vehicle = new Toyota();

        } else if (inputString.equals("lambo")) {
            vehicle = new Lamborghini();
        } else {
            vehicle = new Lamborghini();
        }

        vehicle.moveOnStree();
    }

}
