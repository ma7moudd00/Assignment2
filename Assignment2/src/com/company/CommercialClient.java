package com.company;

/**
 * <p>Commercial_ID Class, which extends the class Client</p>
 * @author
 * <p>Ziad Mahmoud           20190226</p>
 */
public class CommercialClient extends Client {

    private String  Commercial_ID;

    public  CommercialClient(String Name, String Address, String Phone, String Commerical_ID, Account A) {
        super(Name, Address, Phone,Commerical_ID, A);
        this.Commercial_ID=Commerical_ID;
    }

    public CommercialClient(){
        setNational_ID("000000000");
    }

    /**
     * <p>getCommerical_ID</p>
     * @return Commercial_ID
     */
    public String getCommerical_ID() {
        return Commercial_ID;
    }

    /**
     * <p>setCommerical_ID</p>
     * @param Commerical_ID: The Commercial ID of a given client.
     */
    public void setCommerical_ID(String Commerical_ID) {
        this.Commercial_ID = Commerical_ID;
    }

    /**
     * <p>Overriding</p>
     * @return Name ,Address ,Account ,Phone ,Commercial ID
     */
    @Override
    public String toString()
    {
        return "Name: "+this.getName()+"\n Address: "+this.getAddress()+"\n Account: "+this.getAccount()+"\n Phone: "+this.getPhone()+"\n Commercial ID: "+Commercial_ID+"\n";
    }


}


