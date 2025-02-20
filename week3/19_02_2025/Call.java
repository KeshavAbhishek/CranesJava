class Callme{
    public synchronized void printMessage(String msg){
        try {
            System.out.print("[");
            System.out.print(msg);
            Thread.sleep(1000);
        } catch (Exception e) {}
        System.out.print("]");
    }
}

class Caller implements Runnable{
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme targ, String s){
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }
    public void run(){
        target.printMessage(msg);
    }
}

public class Call {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller obj1 = new Caller(target, "Hello");
        Caller obj2 = new Caller(target, "Sync");
    }
}