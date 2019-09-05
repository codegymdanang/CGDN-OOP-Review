package codegym.danang.interfacing.solution.polymorphism;

public class AmexCard implements PaymentGateway {
    public void payment() {
        System.out.println("Payment with amex card ");
    }
}
