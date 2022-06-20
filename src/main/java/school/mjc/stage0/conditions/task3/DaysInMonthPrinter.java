package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public static final int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public void amountOfDays(int month) {
        if (0 < month && month < 13) {
            System.out.println(months[month - 1]);
        } else {
            System.out.println("wrong number!");
        }
    }
}
