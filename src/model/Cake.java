package model;

import java.util.Date;
import java.util.List;

public class Cake extends Product {
    private double pricePerPiece;


    public Cake(String code, String name, int weight, List<String> ingredientList, Date productionDate, Date expirationDate,
                int stock, boolean isAvailable, ProductType productType, double pricePerPiece) {

        super(code, name, weight, ingredientList, productionDate, expirationDate, stock, isAvailable, productType);
        this.pricePerPiece = pricePerPiece;

    }

    public Cake(String choco_12, String chocolateCake, double v, List<String> ingredientList, Date productionDate, Date expirationDate,
                int stock, boolean isAvailable, ProductType chocolate, double pricePerPiece, int i) {

        super();
    }

    public double getPricePerPiece() {
        return pricePerPiece;
    }


    public void setPricePerPiece(double pricePerPiece) { this.pricePerPiece = pricePerPiece;}

    @Override
    public String toString(){
        return super.toString() + " ,pricePerPiece=" + pricePerPiece;


    }

}
