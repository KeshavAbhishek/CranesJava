public class OrderDetails {
    long orderId;
    String orderName;
    float orderQty;
    float orderPrice;
    float totalPrice;

    OrderDetails(long oid, String oName, float oQty, float oPrice) {
        orderId = oid;
        orderName = oName;
        orderQty = oQty;
        orderPrice = oPrice;
    }

    void totalPrice() {
        totalPrice = orderPrice * orderQty;
    }

    static void display(OrderDetails obj) {
        System.out.println("Order ID: " + (obj.orderId));
        System.out.println("Order Name: " + (obj.orderName));
        System.out.println("Order Qty: " + (obj.orderQty));
        System.out.println("Order Price: " + (obj.orderPrice));
        System.out.println("Total price after 5% discount: " + (obj.totalPrice * 0.95));
    }

    public static void main(String[] args) {
        OrderDetails O1 = new OrderDetails(1001, "Pen", 10, 100);
        O1.totalPrice();
        OrderDetails O2 = new OrderDetails(1002, "Paper", 100, 9);
        O2.totalPrice();

        display(O1.orderPrice > O2.orderPrice ? O1 : O2);
    }
}