package com.tinkoff.edu.app;

public class LoanCalcController {

    private LoanCalcService loanCalcService = new LoanCalcService();

    public int createRequest(LoanRequest request) {
        return loanCalcService.createRequest(request);
    }
}