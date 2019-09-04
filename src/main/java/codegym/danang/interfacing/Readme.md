# Vấn đề
Như ta thấy trong lớp Main
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
Không có tính đa hình


# Interface giúp ta làm cho việc code trở nên đa hình lúc runtime
 if (inputString.equals("Visa")) {
            paymentGateway = new VisaCard();

        } else if (inputString.equals("Master")) {
            paymentGateway = new MasterCard();
        } else {
            paymentGateway = new AmexCard();
        }

         paymentGateway.payment();
