import p3.FuelVehicle;
import p4.ElectricVehicle;

public class HybridVehicle implements FuelVehicle, ElectricVehicle {

    public void refuel(double liters) {
        System.out.println("Refueling vehicle with " + liters + " liters of fuel.");
    }

    public void startEngine() {
        System.out.println("Starting fuel engine...");
    }

    public void chargeBattery(double amount) {
        System.out.println("Charging battery with " + amount + " kWh.");
    }

    public void startElectricMotor() {
        System.out.println("Starting electric motor...");
    }

    public static void main(String[] args) {
        HybridVehicle hybridVehicle = new HybridVehicle();
        
        hybridVehicle.refuel(40);
        hybridVehicle.startEngine();
        hybridVehicle.chargeBattery(20);
        hybridVehicle.startElectricMotor();
    }
}