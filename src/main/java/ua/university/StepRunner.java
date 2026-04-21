package ua.university;

import java.lang.reflect.Method;
import java.util.*;

public class StepRunner {

    public static void run(Object target) {

        Class<?> clazz = target.getClass();

        Method[] methods = clazz.getDeclaredMethods();

        List<Method> steps = new ArrayList<>();

        for (Method m : methods) {
            if (m.isAnnotationPresent(Step.class)) {
                steps.add(m);
            }
        else{
                throw new IllegalException("Помилка у методі" + m.getName());

            }

        }

        steps.sort(Comparator.comparingInt(
                m -> m.getAnnotation(Step.class).order()

        ));

        for (Method m : steps) {

            validate(m);
            try {
                if (!m.canAccess(target)) {
                    m.setAccessible(true);
                }

                m.invoke(target);

            } catch (Exception e) {
                throw new StepInvalid(
                        "Помилка: " + m.getName()
                );
            }

        }
    }

    private static void validate(Method m) {

        if (m.getParameterCount() != 0 || m.getReturnType() != void.class) {
            throw new StepInvalid("Помилка у методі" + m.getName());
        }

    }
}