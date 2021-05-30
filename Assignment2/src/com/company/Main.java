package com.company;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * <p>Main class</p>
 * @author
 * <p>Mahmoud Hamdy          20190799</p>
 * <p>Ziad Mahmoud           20190226</p>
 */

public class Main {
    public static void main(String[] args) {
        // Account Main
       /*  Account account = new Account();
        account.setAccountNumber(1);
        account.setBalance(0);
        account.deposit(550);
        account.withdraw(250);
        System.out.println(account+"\n");

        SpecialAccount specialAccount = new SpecialAccount();
        specialAccount.setAccountNumber(2);
        specialAccount.withdraw(750);
        specialAccount.withdraw(251);
         System.out.println(specialAccount); */

         // Client Main

        // Menu for the user
        display();

    }

    /**
     * <p>A method to display the bank menu to the user</p>
     * <p>The method asks the user to make a new account first before accessing his account</p>
     *
     */
    public static void display() {
        int flag = 1;
        Bank bank = new Bank("FCAI Bank", "52 st Giza", "011111111111");
        ArrayList<Account> AccountList = new ArrayList<>();
        ArrayList<Client> ClientList = new ArrayList<>();
        bank.setAccountList(AccountList);
        bank.setClientList(ClientList);
        String Input;
        Scanner scanner = new Scanner(System.in);
        while (flag == 1) {
            System.out.println("-------------------- \nHello!\nEnter 1 if you're a new client\nEnter 2 if you want to access your current account \nEnter 3 if you want to show all clients \nEnter 4 if you'd like to exit this menu");
            int input = scanner.nextInt();
            scanner.nextLine();
            if (input == 1) {
                System.out.println("\nEnter 1 if you want to create a regular account, Enter 2 if you want to create a special account");
                input = scanner.nextInt();
                scanner.nextLine();
                if (input==1) {
                    System.out.println("Creating a new account for the client...");
                    Account clientAccount = new Account();
                    System.out.println(clientAccount);
                    AccountList.add(clientAccount);
                    System.out.println("Please enter the client information: \n");
                    System.out.println("Name:");
                    Input = scanner.nextLine();
                    String clientName = Input;
                    System.out.println("\nAddress:");
                    Input = scanner.nextLine();
                    String clientAddress = Input;
                    System.out.println("\nPhone:");
                    Input = scanner.next();
                    String clientPhone = Input;
                    System.out.println("\nNational ID:");
                    Input = scanner.next();
                    String clientNationalID = Input;
                    Client client = new Client(clientName, clientAddress, clientPhone, clientNationalID, clientAccount);
                    System.out.println("Showing client details... \n" + client +"----------------");
                    ClientList.add(client);
                    System.out.println("\nPress 1 to deposit money to your account, Press 2 if you want to exit.");
                    input = scanner.nextInt();
                    scanner.nextLine();
                    if (input == 1) {
                        System.out.println("\nPlease enter the amount of money you want to deposit.");
                        int amountOfMoney = scanner.nextInt();
                        scanner.nextLine();
                        clientAccount.deposit(amountOfMoney);
                        System.out.println(clientAccount);
                    }  else if (input !=2) {
                        System.out.println("Invalid Input! Exiting the program... \n");
                    }
                }
                else if (input == 2 ) {
                    System.out.println("Creating a new special account for the client...");
                    Account clientAccount = new SpecialAccount();
                    System.out.println(clientAccount);
                    AccountList.add(clientAccount);
                    System.out.println("Please enter the client information: \n");
                    System.out.println("Name:");
                    Input = scanner.nextLine();
                    String clientName = Input;
                    System.out.println("\nAddress:");
                    Input = scanner.nextLine();
                    String clientAddress = Input;
                    System.out.println("\nPhone:");
                    Input = scanner.next();
                    String clientPhone = Input;
                    System.out.println("\nNational ID:");
                    Input = scanner.next();
                    String clientNationalID = Input;
                    Client client = new Client(clientName, clientAddress, clientPhone, clientNationalID, clientAccount);
                    System.out.println("Showing client details... \n" + client +"----------------");
                    ClientList.add(client);
                    System.out.println("\nPress 1 to deposit money to your account, Press 2 if you want to exit.");
                    input = scanner.nextInt();
                    scanner.nextLine();
                    if (input == 1) {
                        System.out.println("\nPlease enter the amount of money you want to deposit.");
                        int amountOfMoney = scanner.nextInt();
                        scanner.nextLine();
                        clientAccount.deposit(amountOfMoney);
                        System.out.println(clientAccount);
                    } else if (input !=2) {
                        System.out.println("Invalid Input! Exiting the program... \n");
                        flag = 0;
                    }
                }
            } else if (input == 2) {
                System.out.println("Please enter the account number:");
                int accountNumber = scanner.nextInt();
                scanner.nextLine();
                Account account1 = bank.findAccount(accountNumber);
                System.out.println(account1);
                System.out.println("\nEnter 1 if you'd like to withdraw money from your account, Enter 2 if you want to deposit money to your account, Enter 3 if you'd like to exit.");
                input = scanner.nextInt();
                scanner.nextLine();
                if (input == 1) {
                  System.out.println("\nPlease enter the amount of money you'd like to withdraw..");
                    int amountOfMoney = scanner.nextInt();
                    scanner.nextLine();
                    account1.withdraw(amountOfMoney);
                    System.out.println(account1+"\n---------------------");
                }
                else if (input == 2 ) {
                    System.out.println("\nPlease enter the amount of money you want to deposit.");
                    int amountOfMoney = scanner.nextInt();
                    scanner.nextLine();
                    account1.deposit(amountOfMoney);
                    System.out.println(account1);
                }

            } else if (input == 3) {
                bank.showClients(ClientList);
            }
            else if (input == 4) {
                System.out.println("Exiting the program... \n");
                flag = 0;
            }
            else {
                System.out.println("Invalid Input! Exiting the program... \n");
                flag = 0;
            }
        }
    }
}
