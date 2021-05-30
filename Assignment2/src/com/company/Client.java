package com.company;

/**
 * <p>Client Class</p>
 * @author
 * <p>Ziad Mahmoud           20190226</p>
 * @version 1.0
 */
public class Client {
    private String Name,Address;
    private String Phone,National_ID;
    private Account account;

    /**
     *
     * Default Constructor
     */
    public Client () {}

    /**
     * <p>Parametrized Constructor</p>
     * @param A : the given client details.
     */

    public Client(Account A) {
        A=new Account();
        this.account = A;
        this.Name = "";
        this.Address = "";
        this.Phone="";
        this.National_ID="";
    }

    /**
     * <p>Parametrized Constructor</p>
     * @param Name: Name of the client
     * @param Address: Address of the client
     * @param account: Account of the client
     * @param Phone: Phone number of the client
     */

    public Client(String Name, String Address, Account account, String Phone)
    {
        this.Name = Name;
        this.Address = Address;
        this.account = account;
        this.Phone = Phone;

    }

    /**
     * <p>Parametrized Constructor</p>
     * @param Name: Name of the client
     * @param Address: Address of the client
     * @param Phone: Phone number of the client
     * @param National_ID: National ID of the client
     * @param A: Account of the client, could be a regular account or a special account.
     */
    public Client(String Name, String Address, String Phone, String National_ID,Account A)
    {
        this.Name = Name;
        this.Address = Address;
        this.account = A;
        this.Phone = Phone;
        this.National_ID = National_ID ;
    }

    /**
     * Setter for the variable Name
     * @param Name: Name of the client
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Setter for the variable Address
     * @param Address: Address of the client
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Setter for the variable account
     * @param account: The account of the client
     */
    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     * Setter for the variable Phone
     * @param Phone: Phone number of the client
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Setter for the variable National_ID
     * @param National_ID: National ID of the client
     */
    public void setNational_ID(String National_ID) {
        this.National_ID = National_ID;
    }

    /**
     * <p>Getter for the variable Name</p>
     * @return Name
     */
    public String getName() {
        return Name;
    }

    /**
     * <p>Getter for the variable Address</p>
     * @return Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     *  <p>Getter for the variable account</p>
     * @return account
     */
    public Account getAccount() {
        return account;
    }

    /**
     * <p>Getter for the variable Phone</p>
     * @return Phone
     */
    public String getPhone() {
        return Phone;
    }

    /**
     * <p>Getter for the variable National_ID</p>
     * @return National_ID
     */
    public  String getNational_ID() {
        return National_ID;
    }

    /**
     * <p>Overriding the toString method inherited from Object class, which will allow us to easily print Client details.</p>
     * @return A string which represents the Client details.
     */
    @Override
    public String toString()
    {
        return "Name: "+Name+"\n Address: "+Address+"\n Account: "+account+"\n phone: "+Phone+"\n National ID: "+National_ID+"\n";
    }

}



