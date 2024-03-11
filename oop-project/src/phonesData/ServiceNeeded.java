package phonesData;

import phonesData.finishedWorks.Served;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class ServiceNeeded {
    Date date = new Date();

    Random random = new Random();
    int orderDate = date.getDate();
    public String option;
    public int id = random.nextInt();
    public int price;

    public String toString() {
        return this.option + "-" + this.price + "$ id: " + this.id + " date: " + this.orderDate;
    }

    public ArrayList<ServiceNeeded> serviceNeededs = new ArrayList<ServiceNeeded>();
    public void showServiceNeededData() {
        int itemNumber = 1;
        for(int i = 0; i < serviceNeededs.size(); i++) {
            System.out.print(itemNumber + ") ");
            System.out.print(serviceNeededs);
            System.out.println();
            itemNumber++;
        }
    }

    public void deleteEquipment(int index) {
        Served served = new Served();
        serviceNeededs.remove(index-1);
        served.servedPhones.add(serviceNeededs.get(index-1));
    }
}
