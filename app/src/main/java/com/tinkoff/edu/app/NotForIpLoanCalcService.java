package com.tinkoff.edu.app;

public class NotForIpLoanCalcService extends LoanCalcService {

    public NotForIpLoanCalcService(LoanCalcRepository loanCalcRepository) {
        super(loanCalcRepository);
    }

    @Override
    public LoanResponse createRequest(LoanRequest request) {
        if (LoanType.IP.equals(request.getType())) {
            return new LoanResponse(ResponseType.DENIED);
        }
        return super.createRequest(request);
    }
}
