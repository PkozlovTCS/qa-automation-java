package com.tinkoff.edu.app;

public class StaticVariableLoanCalcRepository implements LoanCalcRepository {

    private static int requestId;
    public int save(LoanRequest request) {
        return ++requestId;
        }
    }
    /**
     * TODO persist request
     * @return request Id
     */
