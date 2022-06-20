package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double salaryNet = 0.0;
        double taxes = 0;

        if (salary <= 0) {
            System.out.println("wrong input!");
        } else {
            if (salary <= 10_000) {
                taxes = 15;
            } else if (salary < 20_000) {
                taxes = 18;
            } else {
                taxes = 20;
            }
            salaryNet = salary - (salary * taxes / 100);
            System.out.println(salaryNet);
        }
    }
}
