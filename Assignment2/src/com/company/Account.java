package com.company;
import java.util.Random;

/**
 * <p>Account Class</p>
 * @author
 * <p>Mahmoud Hamdy          20190799</p>
 * @version 1.0
 */
public class Account {
    Random random = new Random();
    private int balance;
    private int accountNumber;
    static private int Temp=1;

    /**
     * <p>Default constructor, which sets the user's current balance to 0 and increases the account number.</p>
     */

    public Account() {
        balance =0;
        accountNumber=Temp++;
    }

    /**
     * <p>Parametrized Constructor, which sets the account number of the account object.</p>
     * @param accountNumber: the given account number.
     */

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * <p>Getter for the variable balance</p>
     * @return balance
     */
    public int getBalance() {
        return balance;
    }

    /**
     * <p>Setter for the variable balance</p>
     * @param balance: the given balance value.
     */

    public void setBalance(int balance) {
        this.balance = balance;
    }

    /**
     * <p>Getter for the variable accountNumber</p>
     * @return accountNumber
     */

    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * <p>Setter for the variable accountNumber</p>
     * @param accountNumber: the given account number.
     */

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * <p>A method to withdraw money from an account.</p>
     * @param amountOfMoney: the required amount of money to be withdrawn
     */
    public void withdraw(int amountOfMoney) {
        if (balance < amountOfMoney) {
            System.out.println("Invalid Input! Your current balance ("+balance+") isn't sufficient to withdraw "+amountOfMoney);
        }
        else {
            balance -= amountOfMoney;
            System.out.println("You have withdrawn "+amountOfMoney+", your current balance is "+balance);
        }
    }

    /**
     * <p>A method to deposit money to an account</p>
     * @param Money: the amount of money to be deposited
     */
    public void deposit(int Money) {
        balance+=Money;
        System.out.println("Success! Your current balance is "+balance);
    }

    /**
     * <p>Overriding the toString method inherited from Object class, which will allow us to easily print account info.</p>
     * @return A string which represents the account info
     */

    @Override
    public String toString() {
        return "Account balance= " + balance +
                ", Account Number= " + accountNumber;
    }

}
