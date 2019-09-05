package codegym.danang.abstractionclass.solution.openForExtension;

public class OnlineOrder extends Order {

    //CouponCode is needed for online shoping. We don't need warehouse id
    private String couponCode;

    @Override
    public void validate() {
        // only validation for Online type don't need if else.
        System.out.println("Online Order is validation");
    }

    @Override
    public void process() {
        // only process for Online type don't need if else.
        System.out.println("Online Order is processing ");
    }
}
