package com.tinkoff.edu;


import com.tinkoff.edu.app.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.tinkoff.edu.app.LoanType.IP;
import static com.tinkoff.edu.app.LoanType.PERSON;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    LoanRequest request;
    LoanCalcController sut;

    @BeforeAll
    public static void setRequestId() {
        StaticVariableLoanCalcRepository.setRequestId(0);
    }

    @BeforeEach
    public void init() {
        request = new LoanRequest(PERSON,12, 10000.0);
        sut = new LoanCalcController(new LoanCalcService(new StaticVariableLoanCalcRepository()));
    }

    @Test
    public void shouldAnswerWithTrue() {
        LoanResponse response = sut.createRequest(request);
        System.out.println(response);
        assertEquals("LoanResponse{type=APPROVED, requestId=1}", response.toString());
    }
}
