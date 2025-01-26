package MPP_Labs.Lab2.prob2B;

import java.util.*;

public class Order {
    private int orderNum;
    private OrderLine orderLine;

    public Order(int orderNum){
        this.orderNum = orderNum;
        orderLine = new OrderLine(this);
    }

    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1));
        orders.add(new Order(2));
        orders.add(new Order(3));
    }
}
