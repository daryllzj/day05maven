package sdf;

import java.security.SecureRandom;
import java.util.Random;
import java.util.UUID;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        System.out.println("Welcome to banking");

        int n = 3;

        BankAccount bankAccount[] = new BankAccount[n];

        for (int i = 0; i < bankAccount.length; i++) {
        String uuid = UUID.randomUUID().toString();

        // double max = 100000.0;
        double min = 1000.00;

        Random rand = new SecureRandom();
        double initialBalance = min + rand.nextDouble();

        bankAccount[i] = new FixedDepositAccount(uuid,initialBalance);

        }

        bankAccount[0].setName("Tim");
        bankAccount[1].setName("Tom");
        bankAccount[2].setName("Tam");

        for (int i = 0; i < bankAccount.length; i++) {
            bankAccount[i].showAccount();
        }


        bankAccount[0].deposit(-1000);
        bankAccount[1].deposit(2000);
        bankAccount[2].deposit(3000);
        

        for (int i = 0; i < bankAccount.length; i++) {
            bankAccount[i].showAccount();
        }

        bankAccount[0].withdraw(2000);
        bankAccount[1].withdraw(1000);
        bankAccount[2].withdraw(500);
        
        for (int i = 0; i < bankAccount.length; i++) {
            bankAccount[i].showAccount();
        }

    }
}
