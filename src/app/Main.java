package app;

import app.orders.Order;
import app.orders.OrderBilder;

public class Main {
    public static void main(String[] arg){

        OrderBilder orderBilder =new OrderBilder();

        Order orderA= orderBilder.getOrderA();
        System.out.println("OrderA");
        orderA.showItems();
        System.out.println("Total Cost: " + orderA.getCost());


        Order orderB= orderBilder.getOrderB();
        System.out.println("OrderB");
        orderB.showItems();
        System.out.println("Total Cost: " + orderA.getCost());
    }
}
