

import java.util.*;

class Bank {

    String n;
    String add;
    int an;
    int bal;
    int dep;

    public Bank(String n, String add, int an, int bal) {

        this.add = add;
        this.bal = bal;
        this.an = an;
        this.n = n;

    }

    public String toString() {
        return "Name of the customer.:" + this.n + ",, "
                + "Address of the customer.:" + this.add + ",, " + "A/c no..:"
                + this.an + ",, " + "Balance in A/c..:" + this.bal;
    }
}

