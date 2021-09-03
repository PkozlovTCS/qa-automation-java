package com.tinkoff.edu.test;

import com.tinkoff.edu.app.*;

import static com.tinkoff.edu.app.LoanType.*;

/**
 * Loan calc test
 */
public class LoanCalcTest {
    public static void main(String[] args) {
        LoanRequest request = new LoanRequest(PERSON, 10, 1000);
        LoanCalcController loanCalcController = new LoanCalcController(new NotForIpLoanCalcService(new StaticVariableLoanCalcRepository()));

        LoanResponse response = loanCalcController.createRequest(request);

        System.out.println("Параметры запроса: " + request.toString());
        System.out.println("RequestID: " + response.getRequestId());
        System.out.println("Response: " + response.getType());
    }
}