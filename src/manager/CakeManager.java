package manager;

import model.Cake;

import java.util.ArrayList;
import java.util.List;

public class CakeManager {
    public Cake findCakeByCode(List<Cake> cakeList, String code) {
        Cake cakeResult = null;
        for (Cake c : cakeList) {
            if (code.equals(c.getCode())) {
                cakeResult = c;
            }
        }
        return cakeResult;
    }
    public List<Cake> filterListOfCakeWeight(List<Cake> cakeList, int hasWeight) {
        List<Cake> resultList4 = new ArrayList<>();
        for (Cake c : cakeList) {
            if (hasWeight == c.getWeight()) {
                resultList4.add(c);

            }
        }
        return resultList4;
    }
    public boolean searchCakeByWeight(List<Cake> cakeList, int weight) {
        boolean found = false;
        for (Cake c : cakeList) {
            if (weight == c.getWeight()) {
                found = true;
            }
        }

        return found;
    }
    public void updatePricePerPieceOfCake(List<Cake> cakeList, String code, double pricePerPiece) {
        for (Cake c : cakeList) {
            if (c.getCode().equals(code)) {
                c.setPricePerPiece(pricePerPiece);
            }
        }
    }
    public void updateStockOfCake(List<Cake> cakeList, String code, int stock) {
        for (Cake c : cakeList) {
            if (c.getCode().equals(code)) {
                c.setStock(stock);
            }
        }
    }

    /// public void addAFlight(List<Flight> flightList, Flight newFlight){
    //        flightList.add(newFlight);
    //    }
    //
    //    public void removeAFlightById(int flightId, List<Flight> flightList){
    //        Flight flightToBeRemoved = null;
    //        for(Flight f:flightList){
    //            if(f.getId() == flightId){
    //                flightToBeRemoved = f;
    //            }
    //        }
    //        flightList.remove(flightToBeRemoved);
    //    }
    //
    //    public void removeFlight(List<Flight> flightList, Flight flightToBeDeleted){
    //        Iterator<Flight> iterator = flightList.iterator();
    //        while (iterator.hasNext()){
    //            Flight flight = iterator.next();
    //            if(flight.getId() == flightToBeDeleted.getId()){
    //                flightList.remove(flight);
    //            }
    //        }
    //    }

    //Type a message

    public void addCake(List<Cake> cakeList,Cake newCake ){
        cakeList.add(newCake);
    }
    public void removeCakeByCode(String cakeCode, List<Cake> cakeList){
            Cake cakeToBeRemoved=null;
            for(Cake c: cakeList){
                if(c.getCode().equals(cakeCode) ){
                    cakeToBeRemoved= c;
                }
            }
            cakeList.remove(cakeToBeRemoved);
        }
}
