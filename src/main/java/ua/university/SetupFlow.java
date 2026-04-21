package ua.university;

public class SetupFlow {

    @Step(order = 1)
    private void step1() {   System.out.println("Step 1");
    }

    @Step(order = 2)
    private void step2() {
        System.out.println("Step 2");
    }


    @Orderstep = 2)
    public void step3() {
        System.out.println("Step 3");
    }

}