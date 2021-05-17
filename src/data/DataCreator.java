package data;

import model.*;
import org.omg.CORBA.PRIVATE_MEMBER;
import sun.security.krb5.internal.crypto.Aes128;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DataCreator {

    public List<Client> createClientList(){
        List<Client> clientList= new ArrayList<>();
        Client client = new Client(23, "Simona", "Alexandra","0749847330", "simonasent@yahoo.com"
        , "Calea Burdujeni","Suceava" );
        Client client1= new Client(22, "Ana", "Maria,", "0746376540", "anamaria@yahoo.com",
                "Calea Tineretului", "Suceava");
        Client client2= new Client(26, "Marius", "Daniel", "0749376381", "daniel_marius@gmail.com",
                "B-dul 21 Dec", "Cluj-Napoca");
        Client client3= new Client(28, "Ciprian", "Juravle", "0230522749", "ciprianjuravle23@yahoo.com",
                "Calea Eroilor 22", "sSuceava");
        Client client4= new Client(27, "Amalia", "Jessica","074986756","amalia.jessica@yahoo.com",
                "Aleea Somesul Rece", "Bucuresti");
        Client client5= new Client(30,"Horea","Motan", "0230522222", "motan_horea30@yahoo.com",
                "Aleea Bucium","Iasi" );
        Client client6= new Client (45, "Ion", "Ponei", "0749567856", "ioan.ponei89@yahoo.com",
                "Str 1 Dec 1918", "Sibiu");
        Client client7= new Client(37, "Madalina", "Moraru", "075639821", "madalinamoraru80@yahoo.com",
                "Str Domneasca47", "Galati");
        Client client8= new Client(24,"Hrticu", "Madalina", "0779845621", "hr.madalina@yahoo.com",
                "Aleea actorilor 22", "Timisoara");
        Client client9= new Client(55, "Cervenciuc", "Miruna", "0748956558", "cerve.miruna@yahoo.com",
                "Strada Garii 17", "Bacau");
        Client client10= new Client(34, "Cazacu", "Paula", "0230555240", "caz.pau.la@yahoo.com",
                "Aleea Neptun 20", "Arad");

        clientList.add(client1);
        clientList.add(client2);
        clientList.add(client3);
        clientList.add(client4);
        clientList.add(client5);
        clientList.add(client6);
        clientList.add(client7);
        clientList.add(client8);
        clientList.add(client9);
        clientList.add(client10);


        return clientList;

    }

    public List<Order> createOrderList() {
        List<Order> orderList= new ArrayList<>();
        Date date1 = new Date();
        Date date2=new Date();
        Date date3= new Date();

        List<Product> productList1 = new ArrayList();
        List<Product> productList2 = new ArrayList<>();
        List<Product> productList3= new ArrayList<>();

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date productionDate = null;
        try {
            productionDate = format.parse("02/05/2021");
        } catch (ParseException e) {
            System.out.println("Invalid input string for date");
        }
        Date expirationDate = null;
        try {
            expirationDate = format.parse("10/05/2021");
        } catch (ParseException e) {

        }
        Product p1 = new BirthdayCake("COCONUT_01", "CoconutCake", 250, Arrays.asList("flour", "eggs", "bakingPowder")
                , productionDate, expirationDate, 13, true, ProductType.VEGETARIAN, 30.00, 10);

        Product p2 = new BirthdayCake("RASPBERRY_2", "RaspBerryCake", 300, Arrays.asList("cake floor", "sugar",
                "eggs", "butter","milk"), productionDate, expirationDate, 6, true, ProductType.FRUITS, 25.00, 6);

        Product p3 = new Cake("Choco_12", "ChocolateCake", 0.200, Arrays.asList("eggs", "milk", "chocolate", "cocoa"),

                productionDate, expirationDate, 10, true, ProductType.CHOCOLATE, 15.00, 10);

        Product p4 = new Cake("BUTTER_13", "ButterCake", 300, Arrays.asList("milk", "butter", "biscuit")
                , productionDate, expirationDate, 7, true, ProductType.VEGETARIAN, 10.00);

        Product p5 = new BirthdayCake("lEMON_03", "LemonCake", 400, Arrays.asList("lemon", "butter", "vanilla exract"),
                productionDate, expirationDate, 12, true, ProductType.FRUITS, 55.00, 12);

        Product p6 = new BirthdayCake("APPLE_6", "AppleCake", 410, Arrays.asList("apple", "cinnamon", "eggs", "milk"),
                productionDate, expirationDate, 15, true, ProductType.FRUITS, 26.00, 8);

        productList1.add(p1);
        productList1.add(p2);
        productList2.add(p2);
        productList2.add(p1);
        productList3.add(p1);
        productList3.add(p3);
        productList3.add(p4);
        productList1.add(p5);
        productList2.add(p6);


        Order order1 = new Order(1, 23, date1, productList1, 125);
        Order order2= new Order(2, 28, date2, productList2, 330);
        Order order3= new Order(3, 34, date3, productList3,250);
        Order order4 = new Order(4, 23, date1, productList1, 220);
        Order order5= new Order(5, 28, date2, productList2, 325);
        Order order6= new Order(6, 34, date3, productList3,350);

        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
        orderList.add(order4);
        orderList.add(order5);
        orderList.add(order6);

        return orderList;

           }


}
