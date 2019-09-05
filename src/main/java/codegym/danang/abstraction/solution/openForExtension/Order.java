package codegym.danang.abstraction.solution.openForExtension;

import java.math.BigDecimal;
import java.util.Date;

public abstract class Order {

    private long id;
    private Date createdOn;
    private BigDecimal amount;

    public abstract void validate();
    public abstract void process();

    public final void cancel() {
        // universal code for order cancellations
    }
}
