package com.tinkoff.edu.app;

public class LoanCalcController {

    private final LoanCalcService loanCalcService;

    public LoanCalcController(LoanCalcService loanCalcService) {

        this.loanCalcService = loanCalcService;
    }

    public LoanResponse createRequest(LoanRequest request) {
        return loanCalcService.createRequest(request);
    }
}