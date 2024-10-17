package main.java.by.rublevskaya.lesson_6;

public class ATMRun {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("liza-2024-2023-2021", 455);
        CreditCard card2 = new CreditCard("2525-1111-2005-kate", 999);
        CreditCard card3 = new CreditCard("1298-pavel-1111-2222", 666);

        TransferService transferService = new TransferService();
        transferService.deposit(45, card1); //должно успешно
        transferService.deposit(2525, card2);//должно успешно
        transferService.deposit(10000000, card3);  //не должно быть успешной

        transferService.withdraw(55, card1);//успешно
        transferService.withdraw(2525, card1); //недостаточно средств
        transferService.withdraw(10000000, card2); //превышен лимит на снятие

        System.out.println("\ncurrent balance state:");
        card1.displayIfo();
        card2.displayIfo();
        card3.displayIfo();
    }
}
