package com.neoflex.vacation_calculator.model;

import javax.validation.constraints.Positive;

public class VacationPay {
    final static double avgMonthDays = 29.3;
    private double avgSalary;
    private double numOfVacationDays;

    public VacationPay() {

    }

    public VacationPay(double avgSalary, double vacationDays) {
        this.avgSalary = avgSalary;
        this.numOfVacationDays = vacationDays;
    }

    public double getAvgSalary() {
        return avgSalary;
    }

    public void setAvgSalary(double avgSalary) {
        this.avgSalary = avgSalary;
    }

    public double getNumOfVacationDays() {
        return numOfVacationDays;
    }

    public void setNumOfVacationDays(double numOfVacationDays) {
        this.numOfVacationDays = numOfVacationDays;
    }

    public double getVacPayAmount() {
        return (avgSalary / avgMonthDays) * numOfVacationDays;
    }
}
