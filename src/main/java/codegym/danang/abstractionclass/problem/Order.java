package codegym.danang.abstractionclass.problem;

import codegym.danang.abstractionclass.data.Employee;
import codegym.danang.abstractionclass.data.Product;

import java.math.BigDecimal;


import java.util.Date;
import java.util.List;

public class Order {
    public enum OrderType {
        ONLINE, STORE, WAREHOUSE;
    }

    private long id;
    private long storeId;
    private Employee storeRep;
    private long warehouseId;
    private Date createdOn;
    private BigDecimal amount;
    private OrderType type;
    private List<Product> products;

    public void validate() {
        if (type == OrderType.STORE) {
            // code for store order validation
        } else if (type == OrderType.WAREHOUSE) {
            // code for warehouse order validation
        } else if (type == OrderType.ONLINE) {
            // code for online order validation
        }
    }

    public void process() {
        if (type == OrderType.STORE) {
            // code for store order validation
        } else if (type == OrderType.WAREHOUSE) {
            // code for warehouse order validation
        } else if (type == OrderType.ONLINE) {
            // code for online order validation
        }
    }

    public void cancel() {
        // universal code for order cancellations
    }
}