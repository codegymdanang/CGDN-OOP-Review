package codegym.danang.interfacing.solution2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System. out. print( "Enter payment type : ");
        PaymentGateway paymentGateway;

        Scanner scanner = new Scanner( System. in);
        String inputString = scanner.nextLine();
        if (inputString.equals("Visa")) {
            paymentGateway = new VisaCard();

        } else if (inputString.equals("Master")) {
            paymentGateway = new MasterCard();
        } else {
            paymentGateway = new AmexCard();
        }

         paymentGateway.payment();
    }
}
