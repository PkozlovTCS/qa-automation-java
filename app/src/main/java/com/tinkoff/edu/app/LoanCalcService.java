package com.tinkoff.edu.app;

public class LoanCalcService implements CalcService {

    private LoanCalcRepository repo;

    public LoanCalcService(LoanCalcRepository repo) {
        this.repo = repo;
    }

    public int createRequest(LoanRequest request) {
        return repo.save(request);
    }
}
