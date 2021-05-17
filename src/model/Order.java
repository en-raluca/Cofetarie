package model;

import java.util.Date;
import java.util.List;

public class Order {
    private int orderId;
    private int clientID;
    private Date date;
    private List<Product> productList;
    private double totalPrice;

    public Order(int orderId, int clientID, Date date,
                 List<Product> productList, double totalPrice){
        this.orderId=orderId;
        this.clientID=clientID;
        this.date=date;
        this.productList=productList;
        this.totalPrice=totalPrice;

    }

        public int getOrderId(){return orderId;}
        public int getClientID(){return  clientID;}
        public Date getDate(){return  date;}
        public List<Product> getProductList(){return productList;}
        public double getTotalPrice(){return totalPrice;}




        public void setOrderId(int orderId){this.orderId=orderId;}
        public void setClientID(int clientID){this.clientID=clientID;}
        public void setDate(Date date){this.date=date;}
        public void setProductList(List<Product> productList){this.productList=productList;}
        public void setTotalPrice(double totalPrice){this.totalPrice=totalPrice;}




}