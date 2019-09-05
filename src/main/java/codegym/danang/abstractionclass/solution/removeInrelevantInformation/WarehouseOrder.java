package codegym.danang.abstractionclass.solution.removeInrelevantInformation;

public class WarehouseOrder extends Order {

    //Only warehousId is need . We don't need online store ID
    private long warehouseId;

    @Override
    public void validate() {
        //  only validation for Warehouse type type don't need if else.
    }

    @Override
    public void process() {
        //  only process for Warehouse type type don't need if else.
    }
}