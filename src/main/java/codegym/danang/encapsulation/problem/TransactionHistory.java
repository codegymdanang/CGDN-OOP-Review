package codegym.danang.encapsulation.problem;

public class TransactionHistory {



    public static void saveTransaction() {

        Transaction transaction = new Transaction();
        transaction.transactionFree = 0.03;
        double money = transaction.getMoneyInMonth(1000);
        System.out.println(money);
    }

    public static void main(String[] args) {

        saveTransaction();
    }

}
