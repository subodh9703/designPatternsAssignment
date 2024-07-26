package net.media.training.designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:35:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class SeniorEmployee extends GenericEmployee {
    private int setMaxBonus;

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
        atLeast(salary, 200);
        this.salary = salary;
    }

    @Override
    public void setMonthsSpent(int months) {
        super.setMonthsSpent(months);
        atLeast(months, 60);
        this.monthsSpent = months;
    }

    public void setMaxBonus(int bonus) {
        atLeast(bonus, 1);
        this.setMaxBonus = bonus;
    }
}
