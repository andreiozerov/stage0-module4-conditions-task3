package school.mjc.stage0.conditions.task3;

public class Divider {
    public static final int numberOne = 5;
    public static final int numberTwo = 11;

    public void isDividableBy5And11(int number) {
        if (number == 0) {
            System.out.println("cannot divide by zero");
        } else if (number % numberOne == 0
                        && number % numberTwo == 0) {
            System.out.println("Dividable");
        } else {
            System.out.println("Non-dividable");
        }
    }
}
