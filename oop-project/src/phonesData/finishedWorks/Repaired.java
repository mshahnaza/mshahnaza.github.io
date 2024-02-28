package phonesData.finishedWorks;

import phonesData.RepairNeeded;
import services.ClientService;

public class Repaired {
    RepairNeeded repairNeeded = new RepairNeeded();
    ClientService clientService = new ClientService();
    public void checkRepaired() {
        if(repairNeeded.repairNeededs.contains(clientService.enteredId))
    }
}
