import p1.Phone;
import p2.Camera;

public class Smartphone implements Phone, Camera {

    public void makeCall(String phoneNumber) {
        System.out.println("Calling " + phoneNumber + "...");
    }

    public void sendMessage(String phoneNumber, String message) {
        System.out.println("Sending message to " + phoneNumber + ": " + message);
    }

    public void takePhoto() {
        System.out.println("Taking a photo...");
    }

    public void recordVideo(int duration) {
        System.out.println("Recording video for " + duration + " seconds...");
    }

    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        
        smartphone.makeCall("9102783437");
        smartphone.sendMessage("7765915845", "Hello, how are you !");
        smartphone.takePhoto();
        smartphone.recordVideo(10);
    }
}