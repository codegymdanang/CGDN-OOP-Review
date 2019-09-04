package codegym.danang.interfacing.problem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System. out. print( "Enter a string : ");
        Scanner scanner = new Scanner( System. in);
        String inputString = scanner.nextLine();
        if (inputString.equals("Visa")) {
            VisaCard visaCard = new VisaCard();
            visaCard.paymentWithVisaCard();
        } else if (inputString.equals("Master")) {
            MasterCard masterCard = new MasterCard();
            masterCard.paymentMasterCard();
        } else {
            AmexCard amexCard = new AmexCard();
            amexCard.paymentAmexCard();
        }
    }
}
