package main;

import com.sun.org.apache.xpath.internal.operations.Or;
import data.DataCreator;
import data.DataReader;
import data.GenerateFile;
import javafx.beans.property.ListProperty;
import manager.*;
import model.*;
import sun.util.resources.cldr.de.CalendarData_de_LI;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        DataCreator dataCreator = new DataCreator();
        List<Client> clientList = dataCreator.createClientList();
        List<Order> orderList = dataCreator.createOrderList();
        System.out.println(clientList);
        System.out.println(orderList);
        Order o = orderList.get(0);

        DataReader dataReader = new DataReader();
        List<BirthdayCake> birthdayCakeList = dataReader.createBirthdayCakeList();
        List<Cake> cakeList = dataReader.createCakeList();
        System.out.println(birthdayCakeList);
        System.out.println(cakeList);
        List<Product> allProducts=new ArrayList<>();
        allProducts.addAll(cakeList);
        allProducts.addAll(birthdayCakeList);

        GenerateFile generateFile = new GenerateFile();
        generateFile.generateFile(o);

        ClientManager clientManager = new ClientManager();
        clientManager.updateEmailOfClient(clientList, 22, "anamaria@gmail.com");
        clientManager.updatePhoneOfClient(clientList,22, "0725973865");

        Client client = clientManager.findClientById(clientList,22);
        System.out.println("Client is:" +client);

        CakeManager cakeManager = new CakeManager();

        Cake cake= cakeManager.findCakeByCode(cakeList,"YOGURT_16");

        System.out.println("List of cake by code:" +cake);
        List<Cake> cakeList1= cakeManager.filterListOfCakeWeight(cakeList,400);
        System.out.println("List Of Cake is :" +cakeList1);

        boolean result= cakeManager.searchCakeByWeight(cakeList, 400);
        System.out.println("Cake with weight = 400.00: " + result);

        cakeManager.updatePricePerPieceOfCake(cakeList,"YOGURT_16",25.00);
        cakeManager.updateStockOfCake(cakeList,"YOGURT_16",10);


        BirthdayCakeManager birthdayCakeManager = new BirthdayCakeManager();

        List<BirthdayCake> birthdayCakeList2=birthdayCakeManager.filterListOfBirthDayCakeNrOfSlices(birthdayCakeList,8);
        System.out.println("List of cake with number of slices:" + birthdayCakeList2);

        List<BirthdayCake> birthdayCakeList3= birthdayCakeManager.filterListOfBirthDayCakeWeight(birthdayCakeList,220);
        System.out.println("List of birthday cake by weight: " +birthdayCakeList3);


        birthdayCakeManager.updateWeightOfBirthDayCake(birthdayCakeList,"BANANA_10", 500);
        birthdayCakeManager.updatePricePerKgOfBirthDayCake(birthdayCakeList,"BANANA_10",23.00);


        OrderManager orderManager = new OrderManager();
        List<Order>orderList1= orderManager.filterListOfOrdersByPrice(orderList,250);
        System.out.println("Orders by price 250:" +orderList1);


        List<Order>orderList2=orderManager.filterListOfOrderByPrice(orderList,100.00,500.00);
        System.out.println("Orders by price >100<500: " +orderList2);

        List<Order>orderList3=orderManager.filterListOfOrdersByClientId(orderList,23);
        System.out.println("Orders by client 23:"  + orderList3);

        Map<Order, Integer> countNrOfCommands=orderManager.countNrOfCommands(orderList);;
        Order order= orderManager.findOrderById(orderList,4);
        System.out.println("Order by id 4 :" +order);

        Map<Integer, List<Integer>> listOfOrdersByClient= orderManager.extractListOfOrdersByClient(orderList,clientList);

        ProductManager productManager = new ProductManager();
       List<Product> productList= productManager.filterListOfProductOnStock(allProducts);
       System.out.println("Products on stock:" +productList);

        List<Product> productList1=productManager.filterListOfProductByIngredients(allProducts," butter");
        System.out.println("Products by ingredients with butter:" +productList1);

        List<Product> productList2= productManager.filterListOfProductWeight(allProducts, 500);
        System.out.println("List of product with weight equals 500:" +productList2);

        List<Product> productList3=productManager.filterProductListByAvailability(allProducts, true);
        System.out.println("Numbers of products on stock: " +productList3);


        Map<Product, Integer> nrOfIngredientPerProduct=productManager.countIngredientsForProducts(productList);
        System.out.println("Numbers of ingredients per product" + nrOfIngredientPerProduct);

    }

}

