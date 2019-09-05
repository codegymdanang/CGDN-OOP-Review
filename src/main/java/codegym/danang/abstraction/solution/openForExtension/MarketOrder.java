package codegym.danang.abstraction.solution.openForExtension;

public class MarketOrder extends Order {

    public void validate() {
        System.out.println("Market Order is validation");
    }

    public void process() {
        System.out.println("Market Order is process");
    }
}
