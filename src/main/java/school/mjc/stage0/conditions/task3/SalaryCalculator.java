package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary >= 0) {
            if (salary > 10000) {
                if (salary > 20000) {
                    System.out.println((double)salary * 0.80);
                } else {
                    System.out.println((double)salary * 0.82);
                }
            } else {
                System.out.println((double)salary * 0.85);
            }
        } else {
            System.out.println("wrong input!");
        }
    }
}
