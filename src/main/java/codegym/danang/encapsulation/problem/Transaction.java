package codegym.danang.encapsulation.problem;

public class Transaction {


    public double transactionFree = 0.01;

    public double getMoneyInMonth(int moneyTransfer) {

        return moneyTransfer * transactionFree;

    }
}
