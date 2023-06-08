package ch.heigvd.pdl.refactoring;

import java.util.ArrayList;
import java.util.List;

public class Orders {

    private List<Order> ordersList = new ArrayList<Order>();

    public void AddOrder(Order order) {
        ordersList.add(order);
    }

    public int getOrdersCount() {
        return ordersList.size();
    }

    public Order getOrder(int i) {
        return ordersList.get(i);
    }

}
