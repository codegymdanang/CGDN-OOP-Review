package codegym.danang.abstractionclass.solution.openForExtension;

public class Main {

    public static void main(String[] args) {

        Order order = new OnlineOrder();
        order.process();

       // Order order = new MarketOrder();
       // order.process();
    }
}
