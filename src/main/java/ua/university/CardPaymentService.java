package ua.university;

public class CardPaymentService implements PaymentService {

    @Override
    public void pay(int amount) {
        System.out.println("Оплата карткою: " + amount);
    }
}