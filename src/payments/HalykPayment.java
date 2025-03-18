package payments;
public class HalykPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("Оплата через Halyk: $" + amount);
        return true;
    }
}