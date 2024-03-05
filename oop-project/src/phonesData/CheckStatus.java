package phonesData;

import phonesData.finishedWorks.Changed;
import phonesData.finishedWorks.Repaired;
import phonesData.finishedWorks.Served;
import services.ClientService;

public class CheckStatus {
    ClientService clientService = new ClientService();
    Repaired repaired = new Repaired();
    Changed changed = new Changed();
    Served served = new Served();


    public void checkPhone() {
        boolean isReady = repaired.repairDone.contains(clientService.enteredId) || changed.changeDone.contains(clientService.enteredId) || served.servedPhones.contains(clientService.enteredId);
        if (isReady) {
            System.out.println("Your phone is ready!");
        }
        else {
            System.out.println("Your phone is not ready yet!");
        }
    }
}
