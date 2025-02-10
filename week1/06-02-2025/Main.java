class Vehicle{
    public String make;
    public String model;
    public int year;
    Vehicle(){}
    Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayInfo(){
        System.out.println("Make: " + make + "\nModel: " + model + "\nYear: " + year);
    }
}

class Car extends Vehicle{
    int numberOfDoors;
    double trunkCapacity;
    Car(){}
    Car(int numberOfDoors, double trunkCapacity){
        super("Audi", "SUV", 2022);
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
    }

    public void displayInfo(){
        System.out.println("Make: " + make + "\nModel: " + model + "\nYear: " + year);
        System.out.println("No. of doors: " + numberOfDoors + "\nTrunk Capacity: " + trunkCapacity);
    }
}

public class Main{
    public static void main(String[] args) {
        Car c = new Car(4,8.9);
        c.displayInfo();
    }
}