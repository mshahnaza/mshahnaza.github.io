package phonesData;

import services.ClientService;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class RepairNeeded {
    public ArrayList<RepairNeeded> repairNeededs = new ArrayList<RepairNeeded>();


    Date date = new Date();

    Random random = new Random();
    String orderDate = date.toString();
    public String option;
    public int id = random.nextInt();

    public String price;

    @Override
    public String toString() {
        return this.option + "-" + this.price + " id: " + this.id + " " + "date: " + this.orderDate;
    }

    public void showRepairNeededData() {
        int itemNumber = 1;
        for(int i = 0; i < repairNeededs.size(); i++) {
            System.out.print(itemNumber + ") ");
            System.out.print(repairNeededs.get(i));
            System.out.println();
            itemNumber++;
        }
    }


    public void deleteEquipment(int index) {
        repairNeededs.remove(index-1);
    }
}