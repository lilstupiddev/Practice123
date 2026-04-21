package ua.university;

public class CashPaymentService implements PaymentService {

    @Override
    public void pay(int amount) {
        System.out.println("Оплата готівкою: " + amount);
    }
}