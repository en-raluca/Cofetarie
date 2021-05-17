package manager;

import com.sun.org.apache.xpath.internal.operations.Or;
import model.*;
import sun.security.krb5.internal.crypto.Aes128;

import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;

public class ClientManager {
    public void updateEmailOfClient(List<Client> clientList, int clientId, String email) {
        for (Client c : clientList) {
            if (c.getId() == clientId) {
                c.setEmail(email);
            }
        }
    }

    public void updatePhoneOfClient(List<Client> clientList, int clientId, String phoneNumber) {
        for (Client c : clientList) {
            if (c.getId() == clientId) {
                c.setPhoneNumber(phoneNumber);
            }
        }
    }

    public Client findClientById(List<Client> clientList, int clientId) {
        Client clientResult = null;
        for (Client c : clientList) {
            if (clientId == c.getId()) {
                clientResult = c;

            }
        }
        return clientResult;
    }
    public void removeClientbyId(int clientId, List<Client>clientList){
        Client clientToBeRemoved=null;
        for(Client c:clientList){
            if(c.getId()==clientId){
                clientToBeRemoved=c;
            }
        }
        clientList.remove(clientToBeRemoved);
    }


}

