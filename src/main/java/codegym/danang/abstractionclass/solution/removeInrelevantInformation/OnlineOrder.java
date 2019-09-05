package codegym.danang.abstractionclass.solution.removeInrelevantInformation;

public class OnlineOrder extends Order {

    //CouponCode is needed for online shoping. We don't need warehouse id
    private String couponCode;

    @Override
    public void validate() {
        // only validation for Online type don't need if else.
    }

    @Override
    public void process() {
        // only process for Online type don't need if else.
    }
}
