package main.java.by.rublevskaya.lesson_6;

public class TransferService {

    public void deposit(double amount, CreditCard card) {
        if (amount <= 0) {
            System.out.println("the amount must be greater than 0.Error");
            return;
        }

        if (card.getCurrentBalance()+ amount > card.getCreditLimit()) {
            System.out.println("This amount cannot be credited, the limit has been exceeded.Error");
            return;
        }

        card.setCurrentBalance(card.getCurrentBalance() + amount);
        System.out.println("the operation was completed successfully,to the account" + card.getAccountNumber() + "credited" + amount );
    }
    public void withdraw(double amount, CreditCard card) {
        if (amount <= 0) {
            System.out.println("the amount must be greater than 0.Error");
            return;
        }
        if (amount > card.getCurrentBalance()){
            System.out.println("insufficient funds in the account, available now"+ card.getAccountNumber());
            return;
        }
        if (amount > 100000) {
            System.out.println("withdrawal limit exceeded. Maximum withdrawal amount per transaction is 100,000 ");
            return;
        }
        card.setCurrentBalance(card.getCurrentBalance() - amount);
        System.out.println("the operation was completed successfully,to the account" + card.getAccountNumber());
    }
}
