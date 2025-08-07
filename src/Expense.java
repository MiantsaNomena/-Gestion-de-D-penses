import java.time.LocalDate;

public class Expense {

    private String label;
    private double amount;
    private LocalDate date;


    public Expense(String label, double amount, LocalDate date) {
        this.label = label;
        this.amount = amount;
        this.date = date;
    }


    public String getLabel() {
        return label;
    }

    public double getAmount() {
        return amount;
    }


    public LocalDate getDate() {
        return date;
    }


    public boolean isLargeExpense() {
        if (amount > 100.0) {
            return true;
        } else {
            return false;
        }
    }
    public String toString() {
        return "Dépense : " + label +"  Montant : " + String.format("%.2f", amount) +" | Date : " + date;
    }
}
