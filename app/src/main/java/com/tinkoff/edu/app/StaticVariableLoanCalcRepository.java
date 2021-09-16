package com.tinkoff.edu.app;

public class StaticVariableLoanCalcRepository implements LoanCalcRepository {

    public static void setRequestId(int requestId) {
        StaticVariableLoanCalcRepository.requestId = requestId;
    }

    private static int requestId;

    public int save(LoanRequest request) {

        return ++requestId;
    }
}

