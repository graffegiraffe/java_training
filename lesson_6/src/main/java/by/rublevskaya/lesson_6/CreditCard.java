package main.java.by.rublevskaya.lesson_6;

public class CreditCard {
    private String accountNumber;  // Номер счета
    private double currentBalance;
    private final double creditLimit = 100000;

    public CreditCard(String accountNumber, double currentBalance) {
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void displayIfo(){
        System.out.println("Account Number: " + accountNumber + "\nCurrent Balance: " + currentBalance);
    }

    public void setCurrentBalance (double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}

