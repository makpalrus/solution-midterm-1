package payments;
public class KaspiPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("Оплата через Kaspi: $" + amount);
        return true;
    }
}