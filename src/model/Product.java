package model;

import com.sun.org.apache.bcel.internal.classfile.Code;

import java.util.Date;
import java.util.List;

public class Product {
    private String code;
    private String name;
    private int weight;
    private List<String> ingredientList;
    private Date productionDate;
    private Date expirationDate;
    private int stock;
    private boolean isAvailable;
    private ProductType productType;

    public Product(String code, String name, int weight, List<String> ingredientList, Date productionDate, Date expirationDate,
                   int stock, boolean isAvailable, ProductType productType) {
        this.code = code;
        this.name = name;
        this.weight = weight;
        this.ingredientList = ingredientList;
        this.expirationDate = expirationDate;
        this.productionDate = productionDate;
        this.stock = stock;
        this.isAvailable = isAvailable;
        this.productType = productType;

    }

    public Product() {

    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public List<String> getIngredientList() {
        return ingredientList;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public int getStock() {
        return stock;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public ProductType getProductType() {
        return productType;
    }
        public void setCode(String code){this.code=code;}
        public void setName(String name){this.name=name;}
        public void setWeight(int weight){this.weight=weight;}
        public void setIngredientList(List<String> ingredientList){this.ingredientList=ingredientList;}
        public void setProductionDate(Date productionDate){this.productionDate=productionDate;}
        public void setExpirationDate(Date expirationDate){this.expirationDate=expirationDate;}
        public void setStock(int stock){this.stock=stock;}
        public void setAvailable(boolean isAvailable){this.isAvailable=isAvailable;}
        public void setProductType(ProductType productType){this.productType=productType;}

        @Override
    public boolean equals(Object o){
        Product product=(Product) o;
        if(this.code.equals(product.getCode())){
            return true;

        }
        return false;

        }
        @Override
    public int hashCode(){
        return 31* code.hashCode();

        }
        @Override
    public String toString(){
        return "code="+ code + ", name="+name + " , weight=" +weight+ ", ingredientList="+ ingredientList+ ", productionDate="
                + productionDate+ ", expirationDate=" + expirationDate + " stock=" + stock + " isAvailable=" + isAvailable +
                " productType=" +productType;


        }
}

