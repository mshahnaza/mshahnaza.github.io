package login;

import loginData.LoginData;
import services.ClientService;
import services.RepairmanService;
import services.SupplierService;
import services.WorkerService;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginData loginData = new LoginData();

        System.out.print("Please enter type of your account: ");
        String accountType = scanner.next();

        if(accountType.equals(loginData.clientLogin)) {
            ClientService clientService = new ClientService();
            clientService.serveClient();
        }
        if(accountType.equals(loginData.repairLogin)) {
            RepairmanService repairmanService = new RepairmanService();
            repairmanService.serveRepairman();
        }
        if(accountType.equals(loginData.workerLogin)) {
            WorkerService workerService = new WorkerService();
            workerService.serveWorker();
        }
        if(accountType.equals(loginData.supplierLogin)) {
            SupplierService supplierService = new SupplierService();
            supplierService.serveClient();
        }
    }
}