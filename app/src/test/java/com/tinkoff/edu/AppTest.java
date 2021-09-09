package com.tinkoff.edu;


import com.tinkoff.edu.app.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.tinkoff.edu.app.LoanType.PERSON;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    LoanRequest request;
    LoanCalcController sut;

    @BeforeEach
    public void init() {
        StaticVariableLoanCalcRepository.setRequestId(2);
        request = new LoanRequest(PERSON, 10, 1000);
        sut = new LoanCalcController(new LoanCalcService(new StaticVariableLoanCalcRepository()));

    }

    @Test
    public void shouldAnswerWithTrue() {
        LoanResponse response = sut.createRequest(request);
        System.out.println(response);
        assertEquals("LoanResponse{type=APPROVED, requestId=2}", response.toString());
    }
}
