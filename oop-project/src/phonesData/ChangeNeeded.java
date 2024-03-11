package phonesData;

import phonesData.finishedWorks.Changed;
import services.ClientService;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class ChangeNeeded {
    Date date = new Date();

    Random random = new Random();
    int orderDate = date.getDate();
    public String option;
    public int id = random.nextInt();
    public int price;

    @Override
    public String toString() {
        return this.option + "-" + this.price + "$ id: " + this.id + " date: " + this.orderDate;
    }

    public ArrayList<ChangeNeeded> changeNeededs = new ArrayList<ChangeNeeded>();

    public void showChangeNeededData() {
        int itemNumber = 1;
        for(int i = 0; i < changeNeededs.size(); i++){
            System.out.print(itemNumber + ") ");
            System.out.print(changeNeededs);
            System.out.println();
            itemNumber++;
        }
    }

    public void deleteEquipment(int index) {
        Changed changed = new Changed();
        changeNeededs.remove(index-1);
        changed.changeDone.add(changeNeededs.get(index-1));
    }
}
