package com.tinkoff.edu.test;

import com.tinkoff.edu.app.LoanCalcController;
import com.tinkoff.edu.app.LoanRequest;
import com.tinkoff.edu.app.LoanType;

import static com.tinkoff.edu.app.LoanType.IP;


/**
 * Loan calc test
 */
public class LoanCalcTest {
    public static void main(String[] args) {
        LoanRequest request = new LoanRequest(IP, 10,1000);
        LoanCalcController loanCalcController = new LoanCalcController();
        int requestId = loanCalcController.createRequest(request);
        System.out.println(request.toString());
        System.out.println(requestId + "must be 1");
    }
}
