
package ourestore;
public abstract class Customer {  
    private String customerId;   
    private String name;
    private String address;
    private String phone;    
    private double accountBalance;

    public Customer(String customerId, String name, String address, String phone, double accountBalance) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.accountBalance = accountBalance;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    
    public void updateBalance(double  amount ){
        this.accountBalance+=amount;
    }
    public abstract double calculatediscount(double totalamount);
    
    void  displayCusomerInfo(){
        System.out.println("Customer ID: "+customerId);        
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Phone: "+phone);
        System.out.println("Balance: "+accountBalance);

    }

    
}
