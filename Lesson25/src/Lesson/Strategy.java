package Lesson;

public class Strategy {

    // strategy interface
    interface PaymentStrategy {
        void pay(int amount);
    }

    // concrete strategy
    static class CreditCardPayment implements PaymentStrategy {

        @Override
        public void pay(int amount) {
            System.out.println("Card Payment of $" + amount);
        }
    }

    static class PaypalPayment implements PaymentStrategy {

        @Override
        public void pay(int amount) {
            System.out.println("PayPal Payment of $" + amount);
        }
    }

    // context class
    static class Checkout {
        private PaymentStrategy strategy;

        Checkout(PaymentStrategy strategy) {
            this.strategy = strategy;
        }

        void setStrategy(PaymentStrategy strategy) {
            this.strategy = strategy;
        }

        void pay(int amount) {
            this.strategy.pay(amount);
        }

    }

    public static void main() {
        Checkout checkout = new Checkout(new CreditCardPayment());
        checkout.pay(20);
        checkout.setStrategy(new PaypalPayment());
        checkout.pay(10);

    }

}
