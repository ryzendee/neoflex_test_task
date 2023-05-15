package com.neoflex.vacation_calculator.controller;

import com.neoflex.vacation_calculator.model.VacationPay;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Positive;

@RestController
@RequestMapping("/api")
public class VacationPayController {

    @GetMapping("/calculate")
    public double calculateVacationPay(@RequestBody VacationPay vacationPay) {
        if (vacationPay.getNumOfVacationDays() < 0 || vacationPay.getAvgSalary() < 0) {
            throw new IllegalArgumentException("Incorrect values!");
        }
        return Math.round(vacationPay.getVacPayAmount() * 100.0) / 100.0;
    }

    /*@GetMapping("/calculate/{avgSalary}-{vacationDays}")
    public double calculateVacationPay(@PathVariable double avgSalary,
                                       @PathVariable double vacationDays) {
        if (avgSalary < 0 || vacationDays < 0) {
            throw new IllegalArgumentException("Incorrect values!");
        }
        VacationPay vacationPay = new VacationPay(avgSalary, vacationDays);
        return Math.round(vacationPay.getVacPayAmount() * 100.0) / 100.0;
    }*/
}
