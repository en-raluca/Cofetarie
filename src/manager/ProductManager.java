package manager;

import model.Product;
import model.ProductType;

import java.util.*;

public class ProductManager {
    public List<Product> filterListOfProductOnStock(List<Product> productList){
        List<Product> resultList2 = new ArrayList<>();
        for (Product p : productList) {
            if ( p.getStock() >0) {
                resultList2.add(p);
            }
        }
        return resultList2;

    }
    public List<Product> filterListOfProductByIngredients(List<Product> productList, String ingredient){
        List<Product> resultList10= new ArrayList<>();
        for(Product p: productList){
            if(p.getIngredientList().contains(ingredient)){
                resultList10.add(p);
            }
        }
        return resultList10;
    }
    public List<Product> filterListOfProductWeight(List<Product> productList, int hasWeight) {
        List<Product> resultList3 = new ArrayList<>();
        for (Product p : productList) {
            if (hasWeight==p.getWeight()){
                resultList3.add(p);

            }
        }
        return resultList3;

    }

    public List<Product> filterProductListByAvailability(List<Product> productList, boolean isAvailable) {
        List<Product> resultList = new ArrayList<>();
        for (Product p : productList) {
            if (isAvailable == p.getIsAvailable()) {
                resultList.add(p);
            }
        }
        return resultList;

    }
    public void addProduct(List<Product> productList, Product newProduct){
        productList.add(newProduct);
    }

    public void removeProduct(List<Product> productList, Product productToBeRemoved){
        Iterator<Product> iterator= productList.iterator();
        while (iterator.hasNext()){
            Product product=iterator.next();
            if(product.getCode().equals(productToBeRemoved)){
                productList.remove(product);

            }
        }
    }
    public Map<Product, Integer> countIngredientsForProducts(List<Product> productList) {
        Map<Product, Integer> resultMap = new HashMap<>();

        for (Product p : productList) {
            List<String > ingredientsList= p.getIngredientList();
            int nr= ingredientsList.size();
            resultMap.put(p,nr);

        }
        return resultMap;
    }

}
