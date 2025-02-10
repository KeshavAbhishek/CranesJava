class ElectronicDevice{
    String brand;
    String model;
    double powerUsage;
    public ElectronicDevice(){}
    public ElectronicDevice(String brand, String model, double powerUsage){
        this.brand = brand;
        this.model = model;
        this.powerUsage = powerUsage;
    }

    public void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Power Usage: " + powerUsage);
    }
}

class SmartDevice extends ElectronicDevice{
    public String connect;
    public String os;
    public SmartDevice(){}
    public SmartDevice(String connect, String os){
        super("Samsung", "F23", 25.0);
        this.connect = connect;
        this.os = os;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Connect: " + connect);
        System.out.println("OS: " + os);
    }
}

class SmartPhone extends SmartDevice{
    public double cameraResolution;
    public int batteryCapacity;
    public SmartPhone(){}
    public SmartPhone(double cameraResolution, int batteryCapacity){
        super("VoLTE/WiFi/Bluetooth", "Android");
        this.cameraResolution = cameraResolution;
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Camera Resolution: " + cameraResolution);
        System.out.println("Battery Capacity: " + batteryCapacity);
    }
}

public class DeviceInheritance {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone(50, 5000);
        sp.displayInfo();
    }
}