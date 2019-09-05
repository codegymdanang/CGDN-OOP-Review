package codegym.danang.abstraction.solution.removeInrelevantInformation;

import codegym.danang.abstraction.data.Employee;

public class StoreOrder extends Order {

    //Store ID is need . We don't need warehouse id
    private long storeId;
    private Employee storeRep;

    @Override
    public void validate() {
        //  only validation for Store type type don't need if else.
    }

    @Override
    public void process() {
        // only process for Store type type don't need if else.
    }
}