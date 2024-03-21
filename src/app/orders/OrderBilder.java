package app.orders;

import app.caps.BlackCap;
import app.caps.WhiteCap;
import app.shirts.BlueShirt;
import app.shirts.RedShirt;

public class OrderBilder {
    public Order getOrderA(){
        Order order =new Order();
        order.addItem(new RedShirt());
        order.addItem(new WhiteCap());
        return order;

    }

    public Order getOrderB(){
        Order order =new Order();
        order.addItem(new BlueShirt());
        order.addItem(new BlackCap());
        return order;

    }
}
