package phonesData;

import phonesData.finishedWorks.Repaired;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class RepairNeeded implements Comparable<RepairNeeded>{
    Date date = new Date();

    Random random = new Random();
    public String orderDate = date.toString();
    public String option;
    public int id = random.nextInt();

    public int price;


    public ArrayList<RepairNeeded> repairNeededs = new ArrayList<RepairNeeded>();

    public void showRepairNeededData() {
        if(!repairNeededs.isEmpty()) {
            int itemNumber = 1;
            for (int i = 0; i < repairNeededs.size(); i++) {
                System.out.print(itemNumber + ") ");
                RepairNeeded takenEquipment = repairNeededs.get(i);
                System.out.print(takenEquipment.option + "-" + takenEquipment.price + "$ id: " + takenEquipment.id + " " + "date: " + takenEquipment.orderDate);
                System.out.println();
                itemNumber++;
            }
        }
        else {
            System.out.println("Nothing is left to repair");
        }
    }


    public void deleteEquipment(int index) {
        Repaired repaired = new Repaired();
        repaired.repairDone.add(repairNeededs.get(index-1));
        repairNeededs.remove(index-1);
    }

    public int compareTo(RepairNeeded other) {
        double a = this.price - other.price;
        if(a < 0) return -1;
        else if(a > 0) return 1;
        else return 0;
    }
}