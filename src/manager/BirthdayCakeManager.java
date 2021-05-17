package manager;

import model.BirthdayCake;
import model.Cake;

import java.util.ArrayList;
import java.util.List;

public class BirthdayCakeManager {
    public List<BirthdayCake> filterListOfBirthDayCakeNrOfSlices(List<BirthdayCake>birthdayCakeList, int numberOfSlices){
        List<BirthdayCake> resultList9= new ArrayList<>();
        for(BirthdayCake b: birthdayCakeList){
            if(numberOfSlices==b.getNumberOfSlices()){
                resultList9.add(b);
            }
        }
        return resultList9;

    }
    public List<BirthdayCake> filterListOfBirthDayCakeWeight(List<BirthdayCake> birthdayCakeList, int hasWeight) {
        List<BirthdayCake> resultList5 = new ArrayList<>();
        for (BirthdayCake b : birthdayCakeList) {
            if (hasWeight == b.getWeight()) {
                resultList5.add(b);
            }
        }
        return resultList5;

    }
    public void updateWeightOfBirthDayCake(List<BirthdayCake> birthdayCakeList, String code, int weight) {
        for (BirthdayCake c : birthdayCakeList) {
            if (c.getCode().equals(code)) {
                c.setWeight(weight);
            }
        }
    }
    public void updatePricePerKgOfBirthDayCake(List<BirthdayCake> birthdayCakeList, String code, double pricePerKg) {
        for (BirthdayCake c : birthdayCakeList) {
            if (c.getCode().equals(code)) {
                c.setPricePerKg(pricePerKg);
            }
        }
    }
    public void addBirthdayCake(List<BirthdayCake> birthdayCakeList, BirthdayCake newBirthDayCake){
        birthdayCakeList.add(newBirthDayCake);
    }

    public void removeABirthDayCakeByNrOfSlices(int nrOfCakeSlices, List<BirthdayCake> birthdayCakeList){
        BirthdayCake birthdayCakeToBeRemoved=null;
        for(BirthdayCake b: birthdayCakeList){
            if(b.getNumberOfSlices()== nrOfCakeSlices){
                birthdayCakeToBeRemoved= b;
            }
        }
        birthdayCakeList.remove(birthdayCakeToBeRemoved);
    }
////Sa inlocuiesc co CODE

}
