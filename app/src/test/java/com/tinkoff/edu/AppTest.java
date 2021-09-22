package com.tinkoff.edu;


import com.tinkoff.edu.app.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.tinkoff.edu.app.LoanType.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    LoanRequest request;
    LoanCalcController sut;

    @BeforeAll
    public static void setRequestId() {
        StaticVariableLoanCalcRepository.setRequestId(0);
    }

    @Test
    public void isLoanAvailable1() {
        request = new LoanRequest(PERSON, 11, 9000.0);
        sut = new LoanCalcController(new LoanCalcService(new StaticVariableLoanCalcRepository()));
        LoanResponse response = sut.createRequest(request);
        System.out.println(response);
        assertEquals("LoanResponse{type=APPROVED, requestId=1}", response.toString());
    }

    @Test
    public void isLoanAvailable2() {
        request = new LoanRequest(PERSON, 12, 10000.0);
        sut = new LoanCalcController(new LoanCalcService(new StaticVariableLoanCalcRepository()));
        LoanResponse response = sut.createRequest(request);
        System.out.println(response);
        assertEquals("LoanResponse{type=APPROVED, requestId=2}", response.toString());
    }

    @Test
    public void isLoanAvailable3() {
        request = new LoanRequest(PERSON, 13, 13000.0);
        sut = new LoanCalcController(new LoanCalcService(new StaticVariableLoanCalcRepository()));
        LoanResponse response = sut.createRequest(request);
        System.out.println(response);
        assertEquals("LoanResponse{type=DENIED, requestId=3}", response.toString());
    }

    @Test
    public void isLoanAvailable4() {
        request = new LoanRequest(OOO, 1, 9000.0);
        sut = new LoanCalcController(new LoanCalcService(new StaticVariableLoanCalcRepository()));
        LoanResponse response = sut.createRequest(request);
        System.out.println(response);
        assertEquals("LoanResponse{type=DENIED, requestId=4}", response.toString());
    }

    @Test
    public void isLoanAvailable5() {
        request = new LoanRequest(OOO, 13, 10000.0);
        sut = new LoanCalcController(new LoanCalcService(new StaticVariableLoanCalcRepository()));
        LoanResponse response = sut.createRequest(request);
        System.out.println(response);
        assertEquals("LoanResponse{type=DENIED, requestId=5}", response.toString());
    }

    @Test
    public void isLoanAvailable6() {
        request = new LoanRequest(OOO, 11, 13000.0);
        sut = new LoanCalcController(new LoanCalcService(new StaticVariableLoanCalcRepository()));
        LoanResponse response = sut.createRequest(request);
        System.out.println(response);
        assertEquals("LoanResponse{type=APPROVED, requestId=6}", response.toString());
    }

    @Test
    public void isLoanAvailable7() {
        request = new LoanRequest(OOO, 13, 13000.0);
        sut = new LoanCalcController(new LoanCalcService(new StaticVariableLoanCalcRepository()));
        LoanResponse response = sut.createRequest(request);
        System.out.println(response);
        assertEquals("LoanResponse{type=DENIED, requestId=7}", response.toString());
    }

    @Test
    public void isLoanAvailable8() {
        request = new LoanRequest(IP, 13, 11000.0);
        sut = new LoanCalcController(new LoanCalcService(new StaticVariableLoanCalcRepository()));
        LoanResponse response = sut.createRequest(request);
        System.out.println(response);
        assertEquals("LoanResponse{type=DENIED, requestId=8}", response.toString());
    }
}