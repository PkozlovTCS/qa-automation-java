package com.tinkoff.edu.test;

import com.tinkoff.edu.app.*;

import static com.tinkoff.edu.app.LoanType.IP;


/**
 * Loan calc test
 */
public class LoanCalcTest {
    public static void main(String[] args) {
        LoanRequest request = new LoanRequest(IP, 10,1000);
        LoanCalcController loanCalcController = new LoanCalcController(new LoanCalcService(new StaticVariableLoanCalcRepository()));

        int requestId = loanCalcController.createRequest(request);

        System.out.println("Параметры запроса: " + request.toString());
        System.out.println("RequestID: " + requestId);
        System.out.println("Response: ");
    }
}