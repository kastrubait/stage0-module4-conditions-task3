package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary >= 0) {
            if (salary > 10000) {
                if (salary > 20000) {
                    System.out.println("20%");
                } else {
                    System.out.println("18%");
                }
            } else {
                System.out.println("15%");
            }
        } else {
            System.out.println("wrong input!");
        }
    }
}
