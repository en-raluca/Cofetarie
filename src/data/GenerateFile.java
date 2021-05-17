package data;

import model.Order;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GenerateFile {

        public void  generateFile(Order order){

            String directoryName = "./fisiere";
            String fileName = "/Order.txt";

            File dir = new File(directoryName);
            if (!dir.exists()) {
                dir.mkdir();
            }
            File file = new File(dir, fileName);
            if (file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException ex) {
                    System.out.println("Nu s-a reusit creearea fisierului");
                }
            }



            FileWriter fw= null;
            BufferedWriter bw =null;



            try {

                fw = new FileWriter(file);
                bw = new BufferedWriter(fw);
                bw.write("Order id is: " +order.getOrderId());
                bw.newLine();
                bw.write("Client id is:" +order.getClientID());
                bw.newLine();
                bw.write("Date of order is:" +order.getDate());
                bw.newLine();
                bw.write("List of products:" +order.getProductList());
                bw.newLine();
                bw.write("The total price is: " +order.getTotalPrice());


                bw.flush();

            }
            catch(IOException ex) {
                System.out.println("Nu s-a reusit scrierea in fisier");
            }
            finally{
                try {
                    if (fw != null) {
                        fw.close();
                    }
                    if (bw != null) {
                        bw.close();
                    }
                }
                catch (IOException e ){


                }
            }
        }


    }

