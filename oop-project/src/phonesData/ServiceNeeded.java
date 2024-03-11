package phonesData;

import phonesData.finishedWorks.Served;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class ServiceNeeded implements Comparable<ServiceNeeded>{
    Date date = new Date();

    Random random = new Random();
    public int orderDate = date.getDate();
    public String option;
    public int id = random.nextInt();
    public int price;


    public ArrayList<ServiceNeeded> serviceNeededs = new ArrayList<ServiceNeeded>();
    public void showServiceNeededData() {
        if(!serviceNeededs.isEmpty()) {
            int itemNumber = 1;
            for (int i = 0; i < serviceNeededs.size(); i++) {
                System.out.print(itemNumber + ") ");
                ServiceNeeded takenEquipment = serviceNeededs.get(i);
                System.out.print(takenEquipment.option + "-" + takenEquipment.price + "$ id: " + takenEquipment.id + " " + "date: " + takenEquipment.orderDate);
                System.out.println();
                itemNumber++;
            }
        }
        else {
            System.out.println("Nothing is left to serve");
        }
    }

    public void deleteEquipment(int index) {
        Served served = new Served();
        served.servedPhones.add(serviceNeededs.get(index-1));
        serviceNeededs.remove(index-1);
    }

    public int compareTo(ServiceNeeded other) {
        double a = this.price - other.price;
        if(a < 0) return -1;
        else if(a > 0) return 1;
        else return 0;
    }
}
