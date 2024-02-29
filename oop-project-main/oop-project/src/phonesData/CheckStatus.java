package phonesData;

import services.ClientService;

public class CheckStatus {
    public static void main(String[] args) {
        ClientService clientService = new ClientService();
        ChangeNeeded changeNeeded = new ChangeNeeded();
        ServiceNeeded serviceNeeded = new ServiceNeeded();
        RepairNeeded repairNeeded = new RepairNeeded();

        boolean isReady = repairNeeded.repairNeededs.contains(clientService.enteredId) || changeNeeded.changeNeededs.contains(clientService.enteredId) || serviceNeeded.serviceNeededs.contains(clientService.enteredId);

        if(isReady) {
            System.out.println("Your phone is ready!");
        }
        else {
            System.out.println("Your phone is not ready yet!");
        }
    }
}
