package com.tinkoff.edu.app;

public class LoanCalcController {

    private LoanCalcService loanCalcService;

    public LoanCalcController(LoanCalcService loanCalcService) {
        this.loanCalcService = loanCalcService;

    }

    public int createRequest(LoanRequest request) {

        return loanCalcService.createRequest(request);
    }
}