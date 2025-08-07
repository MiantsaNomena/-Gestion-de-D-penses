import java.time.LocalDate;

public class RefundableExpense extends Expense {
    private boolean refunded;

    public RefundableExpense(String label, double amount, LocalDate date) {
        super(label, amount, date);
        this.refunded = false;
    }

    public boolean isRefunded() {
        return refunded;
    }

    public void refund() {
        refunded = true;
    }

    public String toString() {
        return super.toString() + " | Remboursée : " + (refunded ? "Oui" : "Non");
    }
}
