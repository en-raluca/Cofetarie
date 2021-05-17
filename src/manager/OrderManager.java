package manager;

import com.sun.org.apache.xpath.internal.operations.Or;
import model.Client;
import model.Order;
import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderManager {
    public List<Order> filterListOfOrderByPrice(List<Order> orderList, double priceOrder1, double priceOrder2) {
        List<Order> resultList8 = new ArrayList<>();
        for (Order o : orderList) {
            if (priceOrder1 > o.getTotalPrice() && o.getTotalPrice() < priceOrder2) {
                resultList8.add(o);
            }
        }
        return resultList8;
    }

    public List<Order> filterListOfOrdersByPrice(List<Order> orderList, double priceOrder) {
        List<Order> resultList7 = new ArrayList<>();
        for (Order o : orderList) {
            if (priceOrder == o.getTotalPrice()) {
                resultList7.add(o);
            }

        }
        return resultList7;

    }

    public List<Order> filterListOfOrdersByClientId(List<Order> orderList, int clientId) {
        List<Order> resultList6 = new ArrayList<>();
        for (Order o : orderList) {
            if (clientId == o.getClientID()) {
                resultList6.add(o);
            }
        }

        return resultList6;
    }

    public Order findOrderById(List<Order> orderList, int orderId) {
        Order orderResult = null;
        for (Order o : orderList) {
            if (orderId == o.getOrderId()) {
                orderResult = o;
            }
        }
        return orderResult;
    }

    public Map<Integer, List<Integer>> extractListOfOrdersByClient(List<Order> orderList, List<Client> clientList) {
        Map<Integer, List<Integer>> resultMap = new HashMap<>();

        for (Client c : clientList) {
            List<Integer> orderIdList = new ArrayList<>();
            for (Order o : orderList) {
                if (o.getClientID() == c.getId()) {
                    orderIdList.add(o.getOrderId());

                }
            }
            resultMap.put(c.getId(), orderIdList);
        }
        return resultMap;

    }



    public Map<Order, Integer> countNrOfCommands(List<Order> orderList){
        Map<Order,Integer> resultMap2 = new HashMap<>();

        for(Order o: orderList){
            List<Product> productList=o.getProductList();
            int nr= productList.size();
            resultMap2.put(o,nr);
        }
        return resultMap2;
    }
    public void addOrder(List<Order> orderList, Order newOrder){
        orderList.add(newOrder);
    }

    public void removeAnOrderById(double orderByPrice, List<Order> orderList){
        orderByPrice=40.00;
        Order orderToBeRemoved;
        for(Order o: orderList){
            if(o.getTotalPrice()>orderByPrice);
        }


    }

    ////CODE

}
