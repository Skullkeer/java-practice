package Lesson;

public class AdvancedPaymentSystem {

    private interface Discount {
        int apply(int cents);
    }

    private static class NoDiscount implements Discount {
        @Override
        public int apply(int cents) {
            return cents;
        }
    }

    private static class TenPercentOff implements Discount {
        @Override
        public int apply(int cents) {
            return cents * 9 / 10;
        }
    }

    private interface Payment {
        void pay(int cents);
    }

    public static class CardPayment implements Payment {
        @Override
        public void pay(int cents) {
            System.out.println("Payed with card, cents: " + cents);
        }
    }

    public static class CashPayment implements Payment {
        @Override
        public void pay(int cents) {
            System.out.println("Payed with cash, cents: " + cents);
        }
    }

    private static class PaymentFactory {
        static Payment create(String choice) {
            if (choice.equals("card")) {
                return new CardPayment();
            }
            if (choice.equals("cash")) {
                return new CashPayment();
            }
            throw new IllegalArgumentException("Unknown Payment: " + choice);
        }
    }


    public static void main() {
        int fullPrice = 2000;
        Discount discount = new TenPercentOff();
        int amount = discount.apply(fullPrice);

        Payment payment = PaymentFactory.create("card");
        payment.pay(amount);
    }

}
