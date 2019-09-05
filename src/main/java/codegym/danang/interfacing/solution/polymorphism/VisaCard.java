package codegym.danang.interfacing.solution.polymorphism;

public class VisaCard implements PaymentGateway {

    public void payment() {
        System.out.println("Payment with visa card ");
    }
}
