package data;

import com.sun.xml.internal.fastinfoset.util.StringArray;
import model.BirthdayCake;
import model.Cake;
import model.ProductType;

import javax.naming.PartialResultException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DataReader {

       public List<Cake> createCakeList() {
           List<Cake> cakeList= new ArrayList<>();


           File file = new File("./Resources/Cake.txt");

           if (!file.exists()) {
               System.out.println("Fisierul nu exista, verifica path-ul");
               return cakeList;
           }
           FileReader fileReader = null;
           BufferedReader bufferedReader = null;
           try {
               fileReader = new FileReader(file);
               bufferedReader = new BufferedReader(fileReader);
               String line;
               while ((line = bufferedReader.readLine()) != null) {
                   System.out.println(line);


                   String[] words = line.split(",");
                   String codeString = words[0].trim();
                   String nameString = words[1].trim();
                   String weightString = words[2].trim();
                   String ingredientString = words[3].trim();
                   String[]ingr=ingredientString.split(";");
                   List<String> ingredientList= Arrays.asList(ingr);
                   String productionDateString = words[4].trim();
                   String expirationDateString = words[5].trim();
                   String stockString = words[6].trim();
                   String isAvailableString = words[7].trim();
                   String productTypeString = words[8].trim();
                   ProductType productType= ProductType.valueOf(productTypeString);
                   String pricePerPieceString = words[9].trim();

                   int weight = Integer.parseInt(weightString);
                   SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                   Date productionDate = null;
                   try {
                       productionDate = format.parse(productionDateString);
                   } catch (ParseException e) {
                       System.out.println("Invalid input string for date");
                   }
                   Date expirationDate = null;
                   try {
                       expirationDate = format.parse(expirationDateString);
                   } catch (ParseException e) {

                   }
                   int stock = Integer.parseInt(stockString);
                   boolean isAvailable = Boolean.parseBoolean(isAvailableString);
                   double pricePerPiece = Double.parseDouble(pricePerPieceString);


                   SimpleDateFormat sdf2 = new SimpleDateFormat("dd-M-yyyy HH:mm:ss");
                   // parse a String
                   String dateInString = "31-03-2019 10:20:40";
                   Date extractedDate = null;
                   try {
                       extractedDate = sdf2.parse(dateInString);
                       System.out.println("extractedDate " + extractedDate);
                   } catch (ParseException e) {
                       System.out.println("Invalid input string for date");
                       e.printStackTrace();
                   }

                   Cake cake= new Cake(codeString, nameString, weight, ingredientList,productionDate,expirationDate, stock,
                           isAvailable, productType, pricePerPiece);

                    cakeList.add(cake);

               }
               bufferedReader.readLine();


           } catch (IOException e) {
               System.out.println("Nu s-a facut citirea");

           } finally {
               try {
                   if (fileReader != null) {

                       fileReader.close();
                   }
                   if (bufferedReader != null) {
                       bufferedReader.close();

                   }
               } catch (IOException e) {
               }
           }
           return cakeList;

       }


    public List<BirthdayCake> createBirthdayCakeList() {
        List<BirthdayCake> birthDaycakeList= new ArrayList<>();


        File file = new File("./Resources/BirthdayCake.txt");

        if (!file.exists()) {
            System.out.println("Fisierul nu exista, verifica path-ul");
            return birthDaycakeList;
        }
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);

                String[]words=line.split(",");
                String codeString= words[0].trim();
                String nameString= words[1].trim();
                String weightString= words[2].trim();
                String ingredientString= words[3].trim();

                String[]ingr=ingredientString.split(";");
                List<String> ingredientList= Arrays.asList(ingr);

                String productionDateString= words[4].trim();
                String expirationDateString= words[5].trim();
                String stockString=words[6].trim();
                String isAvailableString= words[7].trim();
                String productTypeString= words[8].trim();
                ProductType productType= ProductType.valueOf(productTypeString);
                String pricePerKgString= words[9].trim();
                String numberOfSlicesString=words[10].trim();

                int weight=Integer.parseInt(weightString);
                SimpleDateFormat format= new SimpleDateFormat("dd/MM/yyyy");
                Date productionDate= null;
                try {
                    productionDate = format.parse(productionDateString);
                } catch (ParseException e) {
                    System.out.println("Invalid input string for date");

                }
                Date expirationDate=null;
                try{
                    expirationDate= format.parse(expirationDateString);
                }
                catch (ParseException e){

                }
                int stock= Integer.parseInt(stockString);
                boolean isAvailable=Boolean.parseBoolean(isAvailableString);
                double pricePerKg= Double.parseDouble(pricePerKgString);
                int numberOfSlices= Integer.parseInt(numberOfSlicesString);


                BirthdayCake birthdayCake= new BirthdayCake(codeString, nameString, weight, ingredientList,productionDate,expirationDate, stock,
                        isAvailable, productType, pricePerKg, numberOfSlices);
                birthDaycakeList.add(birthdayCake);



            }
            bufferedReader.readLine();


        } catch (IOException e) {
            System.out.println("Nu s-a facut citirea");

        } finally {
            try {
                if (fileReader != null) {

                    fileReader.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();

                }
            } catch (IOException e) {
            }
        }
        return birthDaycakeList;

    }
}
