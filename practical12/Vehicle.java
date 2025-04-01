/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaljava;

/**
 *
 * @author keshav
 */
public class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    
    public static void main(String[] args) {
        ToyotaCamry camry = new ToyotaCamry(2025);
        camry.displayInfo();
        camry.sedanFeature();

        System.out.println();

        FordMustang mustang = new FordMustang(2025);
        mustang.displayInfo();
        mustang.coupeFeature();

        System.out.println();

        Thar thar = new Thar(2025);  
        thar.displayInfo();
        thar.suvFeature();

        System.out.println();

        MazdaMX5 mx5 = new MazdaMX5(2025);
        mx5.displayInfo();
        mx5.convertibleFeature();
    }

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    public void displayInfo(){  
        System.out.printf(year + " " + make + " " + model);  
    }
}

class Car extends Vehicle {
    public Car(String make, String model, int year) {
        super(make, model, year);
    }
}

abstract class Sedan extends Car {
    public Sedan(String make, String model, int year) {
        super(make, model, year);
    }
    public void sedanFeature() {
        System.out.println(model + " offers comfortable ride");
    }
}

abstract class SUV extends Car {
    public SUV(String make, String model, int year) {
        super(make, model, year);
    }

    public void suvFeature() {
        System.out.println(model + " provides higher ground clearance and off-road capability.");
    }
}

abstract class Coupe extends Car {
    public Coupe(String make, String model, int year) {
        super(make, model, year);
    }

    public void coupeFeature() {
        System.out.println(model + " has a sporty design with two doors.");
    }
}

abstract class Convertible extends Car {
    public Convertible(String make, String model, int year) {
        super(make, model, year);
    }

    public void convertibleFeature() {
        System.out.println(model + " features a retractable roof for open-air driving.");
    }
}

class ToyotaCamry extends Sedan {
    public ToyotaCamry(int year) {
        super("Toyota", "Camry", year);
    }
}

class FordMustang extends Coupe {
    public FordMustang(int year) {
        super("Ford", "Mustang", year);
    }
}

class Thar extends SUV {
    public Thar(int year) {
        super("Mahindra", "Thar", year);
    }
}

class MazdaMX5 extends Convertible {
    public MazdaMX5(int year) {
        super("Mazda", "MX-5 Miata", year);
    }
}