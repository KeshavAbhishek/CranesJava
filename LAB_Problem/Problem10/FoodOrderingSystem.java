package LAB_Problem.Problem10;

/**
 * ==========================================================
 * Program Name: FoodOrderingSystem
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 20-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

class Order {
    private final String customerName;
    private final String foodItem;

    public Order(String customerName, String foodItem) {
        this.customerName = customerName;
        this.foodItem = foodItem;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getFoodItem() {
        return foodItem;
    }
}

class OrderQueue {
    private final Order[] queue;
    private int front, rear, size;
    private final int capacity;

    public OrderQueue(int capacity) {
        this.capacity = capacity;
        queue = new Order[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public synchronized void placeOrder(Order order) {
        while (size == capacity) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        rear = (rear + 1) % capacity;
        queue[rear] = order;
        size++;
        System.out.println("Order placed by: " + order.getCustomerName() + " - " + order.getFoodItem());
        notify();
    }

    public synchronized Order takeOrder() {
        while (size == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        Order order = queue[front];
        front = (front + 1) % capacity;
        size--;
        notify();
        return order;
    }
}

class Kitchen implements Runnable {
    private final OrderQueue orderQueue;

    public Kitchen(OrderQueue orderQueue) {
        this.orderQueue = orderQueue;
    }

    public void run() {
        try {
            while (true) {
                Order order = orderQueue.takeOrder();
                System.out.println("Preparing order for: " + order.getCustomerName() + " - " + order.getFoodItem());
                Thread.sleep(1000);
                System.out.println("Order ready for: " + order.getCustomerName() + " - " + order.getFoodItem());
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Customer implements Runnable {
    private final OrderQueue orderQueue;
    private final String customerName;
    private final String foodItem;

    public Customer(OrderQueue orderQueue, String customerName, String foodItem) {
        this.orderQueue = orderQueue;
        this.customerName = customerName;
        this.foodItem = foodItem;
    }

    public void run() {
        orderQueue.placeOrder(new Order(customerName, foodItem));
    }
}

public class FoodOrderingSystem {
    public static void main(String[] args) {
        OrderQueue orderQueue = new OrderQueue(10);

        Thread kitchenThread = new Thread(new Kitchen(orderQueue));
        kitchenThread.start();

        Thread customer1 = new Thread(new Customer(orderQueue, "Customer 1", "Pizza"));
        Thread customer2 = new Thread(new Customer(orderQueue, "Customer 2", "Burger"));
        Thread customer3 = new Thread(new Customer(orderQueue, "Customer 3", "Pasta"));
        Thread customer4 = new Thread(new Customer(orderQueue, "Customer 4", "Salad"));
        Thread customer5 = new Thread(new Customer(orderQueue, "Customer 5", "Sushi"));

        customer1.start();
        customer2.start();
        customer3.start();
        customer4.start();
        customer5.start();
    }
}