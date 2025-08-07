import java.time.LocalDate;

public class RecurringExpense extends Expense {
    private String recurrence; 

    public RecurringExpense(String label, double amount, LocalDate date, String recurrence) {
        super(label, amount, date);
        if (recurrence.equals("monthly") || recurrence.equals("yearly")) {
            this.recurrence = recurrence;
        } else {
            this.recurrence = "monthly";
        }
    }

    public String getRecurrence() {
        return recurrence;
    }

    public void setRecurrence(String recurrence) {
        if (recurrence.equals("monthly") || recurrence.equals("yearly")) {
            this.recurrence = recurrence;
        }
    }

    public String toString() {
        return super.toString() + " | Récurrence : " + recurrence;
    }
}
