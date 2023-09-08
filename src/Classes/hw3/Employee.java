package Classes.hw3;

import java.util.Calendar;

public class Employee{
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if (salary < 1000) return 0;
        else return salary * 0.03;
    }

    public int bonus(){
        if (workHours > 40) return (workHours-40)*30;
        else return 0;
    }

    public double raiseSalary(){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int yearsWorked = currentYear - hireYear;
        double raise = 0;

        if(yearsWorked < 10) raise = salary * 0.05;
        else if (yearsWorked >= 10 && yearsWorked < 20) raise = salary * 0.1;
        else if (yearsWorked >= 20) raise = salary * 0.15;
        else raise = 0;
        return raise;
    }

    public String toString(){
        double totalSalary = salary - tax() + bonus() + raiseSalary();
        return "Name : " + name + "\nSalary : " + salary + "\nWork Hours : " + workHours + "\nHiring Year : " + hireYear + "\nTaxes : " + tax() + 
        "\nBonuses : " + bonus() + "\nSalary Raise : " + raiseSalary() + "\nSalary with Taxes and Bonuses : " + (salary - tax() + bonus()) + 
        "\nTotal Salary : " + totalSalary;
    }
}