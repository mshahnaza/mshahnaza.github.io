package phonesData;

import services.ClientService;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class ServiceNeeded {
    ClientService clientService = new ClientService();
    public ArrayList<ServiceNeeded> serviceNeededs = new ArrayList<ServiceNeeded>();

    Date date = new Date();

    Random random = new Random();
    int orderDate = date.getDate();
    public String option;
    public int id = random.nextInt();
    public String price;

    public void showServiceNeededData() {
        System.out.println(serviceNeededs);
    }
}
