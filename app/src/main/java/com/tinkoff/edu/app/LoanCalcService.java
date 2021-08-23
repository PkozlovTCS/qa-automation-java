package com.tinkoff.edu.app;

public class LoanCalcService {

    private LoanCalcRepository repo = new LoanCalcRepository();

    public int createRequest(LoanRequest request) {
        return repo.save(request);
    }
}
