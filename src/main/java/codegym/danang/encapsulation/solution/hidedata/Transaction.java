package codegym.danang.encapsulation.solution.hidedata;

public class Transaction {


    private double transactionFree = 0.01;

    public double getMoneyInMonth(int moneyTransfer) {

        return moneyTransfer * transactionFree;

    }

    public double getTransactionFree() {
        return transactionFree;
    }
}
