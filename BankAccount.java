


package com.shishirchitre;

public class BankAccount {

    String customerAccountNumber;
    double customerBalance;
    String customerName;
    String customerEmailID;
    String customerPhoneNo;

    public static void main(String [] args){

        Sytem.out.println("This is from main. And this is from GitHub as well");
    }

    public void withdrawal(double withdrawalAmount){
        if(this.customerBalance - withdrawalAmount < 0){
            System.out.println("Insufficient Funds! Sorry.");
        }
        else {
            this.customerBalance -= withdrawalAmount;
            System.out.println("Withdrawal of  " + withdrawalAmount + " is do ne successfully! Now the current balance is  " + customerBalance);
        }
    }
    public void deposit(double depositAmount){
        this.customerBalance += depositAmount;
        System.out.println("Deposit of  " + depositAmount + " is do ne successfully! Now the current balance is  " + customerBalance);
    }




    public String getCustomerAccountNumber() {
        return customerAccountNumber;
    }

    public void setCustomerAccountNumber(String customerAccountNumber) {
        this.customerAccountNumber = customerAccountNumber;
    }

    public double getCustomerBalance() {
        return customerBalance;
    }

    public void setCustomerBalance(double customerBalance) {
        this.customerBalance = customerBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailID() {
        return customerEmailID;
    }

    public void setCustomerEmailID(String customerEmailID) {
        this.customerEmailID = customerEmailID;
    }

    public String getCustomerPhoneNo() {
        return customerPhoneNo;
    }

    public void setCustomerPhoneNo(String customerPhoneNo) {
        this.customerPhoneNo = customerPhoneNo;
    }






}
