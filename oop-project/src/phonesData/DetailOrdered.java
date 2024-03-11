package phonesData;

import phonesData.finishedWorks.Served;

import java.util.ArrayList;

public class DetailOrdered {
    public ArrayList<DetailOrdered> detailsOrdered = new ArrayList<DetailOrdered>();

    public String detailName;
    public int detailsNumber;

    public void showOrderList() {
        if(!detailsOrdered.isEmpty()) {
            int itemNumber = 1;
            for (int i = 0; i < detailsOrdered.size(); i++) {
                System.out.print(itemNumber + ") ");
                DetailOrdered detailOrdered = detailsOrdered.get(i);
                System.out.print(detailOrdered.detailName + "-" + detailOrdered.detailsNumber);
                System.out.println();
                itemNumber++;
            }
        }
        else {
            System.out.println("Orders list is empty");
        }
    }

    public void removeOrder(int index) {
        detailsOrdered.remove(index-1);
    }
}
