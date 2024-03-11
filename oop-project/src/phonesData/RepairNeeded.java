package phonesData;

import phonesData.finishedWorks.Repaired;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class RepairNeeded {
    Date date = new Date();

    Random random = new Random();
    String orderDate = date.toString();
    public String option;
    public int id = random.nextInt();

    public int price;


    public String toString() {
        return this.option + "-" + this.price + "$ id: " + this.id + " " + "date: " + this.orderDate;
    }

    public ArrayList<RepairNeeded> repairNeededs = new ArrayList<RepairNeeded>();

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
        Repaired repaired = new Repaired();
        repaired.repairDone.add(repairNeededs.get(index-1));
        repairNeededs.remove(index-1);
    }
}