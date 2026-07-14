package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.loan.model.Loan;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @GetMapping("/{loanId}")
    public Loan fetchLoan(@PathVariable String loanId) {

        Loan loan = new Loan();

        loan.setLoanId(loanId);
        loan.setLoanType("Education");
        loan.setLoanAmount(650000);
        loan.setMonthlyEmi(14250);
        loan.setDurationMonths(60);

        return loan;
    }
}
