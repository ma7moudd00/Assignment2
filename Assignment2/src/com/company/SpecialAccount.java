package com.company;

/**
 * <p>Special Account Class, which extends the class account</p>
 * <p>Special account is an account which could allow withdrawing up to -1000</p>
 * @author
 * <p>Mahmoud Hamdy          20190799</p>
 */


public class SpecialAccount extends Account {
    /**
     * <p>Overriding the withdraw method, which will allow us to over overdraft withdrawing.</p>
     * @param amountOfMoney: the required amount of money to be withdrawn
     */
    @Override
    public void withdraw (int amountOfMoney) {
        if ((getBalance()-amountOfMoney) > -1000) {
            setBalance(getBalance()-amountOfMoney);
            System.out.println("You have withdrawn "+amountOfMoney+" ,your current balance is "+getBalance());
        }
        else {
            System.out.println("You have exceeded the maximum draft limit! The maximum amount you can withdraw is "+ (1000+getBalance()));
        }
    }
}
