package domain;

public class Сustomer {
    private int ID;
    private boolean isNew;
    private double total;

    public Сustomer() {
        this.ID = 1;
        this.isNew = true;
        this.total = 1000;
    }
    
    public void displayCustomerInfo(){
        System.out.println("Customer ID: " + ID);
        System.out.println("Is new Customer: " + isNew);
        System.out.println("Total purchases are: " + total);
    }

}