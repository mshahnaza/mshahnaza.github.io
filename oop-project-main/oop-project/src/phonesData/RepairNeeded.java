package phonesData;

import services.ClientService;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class RepairNeeded {
    public ArrayList<RepairNeeded> repairNeededs = new ArrayList<RepairNeeded>();

    Date date = new Date();

    Random random = new Random();
    int orderDate = date.getDate();
    public String option;
    public int id = random.nextInt();

    public String price;
}