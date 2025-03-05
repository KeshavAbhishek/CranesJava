import java.util.ArrayList;
import java.util.List;

class Product{
    int pid;
    String pname;
    double price;
    public Product(int pid, String pname, double price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }
    @Override
    public String toString(){
        return "{ Pid "+ pid+" Pname  "+pname+" Price: "+price+" }";
    }
    
}

public class WihoutStreamFilterDataDemo {
    public static void main(String[] args) {
        ArrayList <Product> productlist = new ArrayList<>();
        productlist.add(new Product(101, "Cooler", 1500));
        productlist.add(new Product(102, "AC", 15000));
        productlist.add(new Product(103, "Heater", 10000));
        productlist.add(new Product(101, "Filter", 5000));
        productlist.add(new Product(101, "Matka", 200));

        productlist.forEach(System.out::println);

        System.out.println("\n\nFiltered...");
        List <Product> list2 = new ArrayList<>();

        for(Product p: productlist){
            if(p.price>6000){
                list2.add(p);
            }
        }

        list2.forEach(System.out::println);
        
    }
    
}