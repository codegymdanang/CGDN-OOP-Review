package codegym.danang.encapsulation.problem;

public class TransactionHistory {



    public static void saveTransaction() {

        int moneyTransfer = 1000000 ;
        Transaction transaction = new Transaction();
        transaction.transactionFree = 0.03;
        double money = transaction.getMoneyInMonth(moneyTransfer);
        System.out.println(money);
    }

    public static void main(String[] args) {

        saveTransaction();
    }

}
