package com.tinkoff.edu.app;

public class NotForIP extends LoanCalcService {

    public NotForIP(LoanCalcRepository repo) {

        super(repo);
    }


    @Override
    public int createRequest(LoanRequest request) {

        if (request.getType().equals(LoanType.IP)) return -1;

        return super.createRequest(request);
    }
}
