package phonesData;

import services.ClientService;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class ChangeNeeded {
    ClientService clientService = new ClientService();
    public ArrayList<ChangeNeeded> changeNeededs = new ArrayList<ChangeNeeded>();

    Date date = new Date();

    Random random = new Random();
    int orderDate = date.getDate();
    public String option;
    public int id = random.nextInt();
    public String price;

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
        changeNeededs.remove(index-1);
    }
}
