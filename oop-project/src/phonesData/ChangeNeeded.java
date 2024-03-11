package phonesData;

import phonesData.finishedWorks.Changed;
import services.ClientService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Random;

public class ChangeNeeded implements Comparable<ChangeNeeded>{
    Date date = new Date();

    Random random = new Random();
    public int orderDate = date.getDate();
    public String option;
    public int id = random.nextInt();
    public int price;

    public ArrayList<ChangeNeeded> changeNeededs = new ArrayList<ChangeNeeded>();

    public void showChangeNeededData() {
        if(!changeNeededs.isEmpty()) {
            int itemNumber = 1;
            for (int i = 0; i < changeNeededs.size(); i++) {
                System.out.print(itemNumber + ") ");
                ChangeNeeded takenEquipment = changeNeededs.get(i);
                System.out.print(takenEquipment.option + "-" + takenEquipment.price + "$ id: " + takenEquipment.id + " " + "date: " + takenEquipment.orderDate);
                System.out.println();
                itemNumber++;
            }
        }
        else {
            System.out.println("Nothing is left to change");
        }
    }

    public void deleteEquipment(int index) {
        Changed changed = new Changed();
        changed.changeDone.add(changeNeededs.get(index-1));
        changeNeededs.remove(index-1);
    }

    public int compareTo(ChangeNeeded other) {
        double a = this.price - other.price;
        if(a < 0) return -1;
        else if(a > 0) return 1;
        else return 0;
    }
}
