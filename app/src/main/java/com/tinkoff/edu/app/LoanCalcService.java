package com.tinkoff.edu.app;

public class LoanCalcService implements CalcService {

    private final LoanCalcRepository loanCalcRepository;

    public LoanCalcService(LoanCalcRepository loanCalcRepository) {
        this.loanCalcRepository = loanCalcRepository;
    }

    public LoanResponse createRequest(LoanRequest request) {
        return new LoanResponse(
                loanCalcRepository.save(request),
                ResponseType.APPROVED
        );
    }
}
