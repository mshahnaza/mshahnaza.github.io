package phonesData;

import phonesData.finishedWorks.DeliveredMaterial;

import java.util.ArrayList;
import java.util.Date;

public class DetailOrdered {
    public ArrayList<DetailOrdered> detailsOrdered = new ArrayList<DetailOrdered>();

    Date date = new Date();
    public String detailName;
    public int detailsNumber;
    public int orderDate = date.getDate();

    public void showOrderList() {
        if(!detailsOrdered.isEmpty()) {
            int itemNumber = 1;
            for (int i = 0; i < detailsOrdered.size(); i++) {
                System.out.print(itemNumber + ") ");
                DetailOrdered detailOrdered = detailsOrdered.get(i);
                System.out.print(detailOrdered.detailName + "-" + detailOrdered.detailsNumber + " date" + detailOrdered.orderDate);
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

    public void addOrder(String detail,int detailnumber) {
        DeliveredMaterial deliveredMaterial = new DeliveredMaterial();
        for(int i = 0; i < detailsOrdered.size(); i++) {
            DetailOrdered takenDetail = detailsOrdered.get(i);
            if(takenDetail.detailName.equals(detail) && takenDetail.detailsNumber == detailnumber) {
                deliveredMaterial.deliveredMaterials.add(takenDetail);
                detailsOrdered.remove(takenDetail);
                break;
            }
        }
    }
}
