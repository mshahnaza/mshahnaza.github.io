package phonesData;

import phonesData.finishedWorks.Served;

import java.util.ArrayList;

public class DetailOrdered {
    public ArrayList<DetailOrdered> detailsOrdered = new ArrayList<DetailOrdered>();

    public String detailName;

    public void showOrderList() {
        int itemNumber = 1;
        for(int i = 0; i < detailsOrdered.size(); i++) {
            System.out.print(itemNumber + ") ");
            System.out.print(detailsOrdered.get(i));
            System.out.println();
            itemNumber++;
        }
    }

    public void removeOrder(int index) {
        detailsOrdered.remove(index-1);
    }
}
