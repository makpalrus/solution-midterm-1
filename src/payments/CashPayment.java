package payments;

public class CashPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("Оплата наличными: $" + amount);
        return true;
    }
}