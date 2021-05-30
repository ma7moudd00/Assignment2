package com.company;
import java.util.ArrayList;

/**
 * <p>Bank Class.</p>
 * <p>This class contains an array list of all the accounts and clients of the bank.</p>
 * @author
 * <p>Mahmoud Hamdy          20190799</p>
 * <p>Ziad Mahmoud           20190226</p>
 * @version 1.0
 */

public class Bank {
    private String name;
    private String address;
    private String phone;
    ArrayList <Account> AccountList = new ArrayList<Account>();
    ArrayList <Client> ClientList=new ArrayList<Client>();

    /**
     * <p> This is the parametrized constructor</p>
     * @param name Name of the created object.
     * @param address Address of the created object.
     * @param phone Phone number of the created object.
     */
    public Bank(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    /**
     * <p>Used to set an account list to a bank object.</p>
     * @param accountList: The given list.
     */
    public void setAccountList (ArrayList accountList) {
        AccountList = accountList;
    }

    /**
     * <p>Used to set an client list to a bank object.</p>
     * @param clientList: The given list.
     */

    public void setClientList (ArrayList clientList) {
        ClientList = clientList;
    }

    /**
     * <p>Adding a specific account to a account list.</p>
     * @param A: The given account object.
     */
    public void addUser(Account A) {
        AccountList.add(A);
    }

    /**
     * <p>Adding a new client to a client list</p>
     * @param C: The given client object.
     */
    public void addClient(Client C) {
        ClientList.add(C);
    }

    /**
     * <p>A method to show all clients of a client list.</p>
     * @param c: the given client list.
     */
    public void showClients (ArrayList <Client> c){
        for (Client client: c) {
            System.out.println (client);
        }
    }

    /**
     * <p>Find an account in the account list by the given account number.</p>
     * @param accountNumber: the given account number.
     * @return an account object.
     */

    public Account findAccount (int accountNumber) {
        if (AccountList.size() == 0) {
            System.out.println("Error! Can't find an account with such a number!");
            return null;
        }
        for (int counter = 0; counter < AccountList.size(); counter++) {
            if (accountNumber == (AccountList.get(counter).getAccountNumber() ) ) {
                return AccountList.get(counter);
            }
        else {
            System.out.println("Error! Can't find an account with such a number!");
            }
        }
        return null;
    }

    /**
     *
     * @return name of the bank
     */
    public String getName() {
        return name;
    }

    /**
     * <p>Set the bank name</p>
     * @param name: the name of the bank object.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return the address of the bank
     */
    public String getAddress() {
        return address;
    }
    /**
     * <p>Set the bank address</p>
     * @param address: the address of the bank object.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return the phone number of the bank object.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * <p>Set the bank phone number</p>
     * @param phone: the phone number of the bank object.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

}