package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        String result = "";
        if (month == 1 || month == 2 || month == 12) {
            result = "Winter";
        } else if (month >= 3 && month <= 5) {
            result = "Spring";
        } else if (month >= 6 && month <= 8) {
            result = "Summer";
        } else if (month >= 3 && month <= 5) {
            result = "Autumn";
        } else {
            result = "wrong number!";
        }
        System.out.println(result);
    }
}
