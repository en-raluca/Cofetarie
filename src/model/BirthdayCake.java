package model;
import java.util.Date;
import java.util.List;

public class BirthdayCake extends Product {
    private double pricePerKg;
    private int numberOfSlices;


    public BirthdayCake(String code, String name, int weight, List<String> ingredientList, Date productionDate, Date expirationDate,
                        int stock, boolean isAvailable, ProductType productType, double pricePerKg, int numberOfSlices) {

        super(code, name, weight, ingredientList, productionDate, expirationDate, stock, isAvailable, productType);
        this.pricePerKg = pricePerKg;
        this.numberOfSlices = numberOfSlices;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public int getNumberOfSlices() {
        return numberOfSlices;
    }

    public void setPricePerKg(double pricePerKg){this.pricePerKg=pricePerKg;}
    public void setNumberOfSlices(int numberOfSlices){this.numberOfSlices=numberOfSlices;}

    @Override
    public String toString(){
        return super.toString() + " , pricePerKg=" + pricePerKg + ", numberOfSlices=" +numberOfSlices;


    }
}
