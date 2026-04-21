package ua.university;

public class ServiceFactory {

    public static PaymentService create(String className) {
        try {
            Class<?> clazz = Class.forName(className);

            Object instance = clazz.getDeclaredConstructor().newInstance();

            return (PaymentService) instance;

        } catch (ClassNotFoundException e) {
            throw new RuntimeException("ClassNotFoundException: " + className, e);
        } catch (Exception e) {
            throw new RuntimeException("Exception: " + className, e);
        }
    }
}