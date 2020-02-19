package classWorks.realibi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Customer {
    static int counter = 0;
    int id;
    String firstName;
    String secondName;
    String thirdName;
    String address;
    String cardNumber;
    int accountNumber;
    static List<Customer> customers = new ArrayList<>();

    public Customer(String firstName, String secondName, String thirdName, String address, String cardNumber, int accountNumber) {
        counter++;
        this.id = counter;
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.accountNumber = accountNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", thirdName='" + thirdName + '\'' +
                ", address='" + address + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", accountNumber=" + accountNumber +
                "}";
    }

    static void showCustomers(){
        customers.sort( Comparator.comparing( Customer::getFirstName ) );
        for(Customer customer : customers){
            System.out.println(customer.toString());
        }
    }

    static void showCustomersWithinInterval(int num1, int num2){
        for(Customer customer : customers){
            if(customer.accountNumber > num1 && customer.accountNumber < num2) {
                System.out.println(customer.toString());
            }
        }
    }
}
