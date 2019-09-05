package codegym.danang.encapsulation.solution.hidedata;

public class Transaction {


    private double transactionFree = 0.01;

    public double getMoneyInMonth(int NumOfTransaction) {

        return NumOfTransaction * transactionFree;

    }

    public double getTransactionFree() {
        return transactionFree;
    }
}
