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
        if (LoanType.PERSON.equals(request.getType()) & (request.getMonths() <= 12) & (request.getAmount() <= 10000.0)) {
            return new LoanResponse(loanCalcRepository.save(request), ResponseType.DENIED);
        }
        if (LoanType.PERSON.equals(request.getType()) & (request.getMonths() > 12) & (request.getAmount() > 10000.0)) {
            return new LoanResponse(loanCalcRepository.save(request),ResponseType.DENIED);
        }
        if (LoanType.OOO.equals(request.getType()) & (request.getAmount() <= 10000.0)) {
            return new LoanResponse(loanCalcRepository.save(request),ResponseType.DENIED);
        }
        if (LoanType.OOO.equals(request.getType()) & (request.getMonths() < 12) & (request.getAmount() > 10000.0)) {
            return new LoanResponse(loanCalcRepository.save(request),ResponseType.APPROVED);
        }
        if (LoanType.OOO.equals(request.getType()) & (request.getMonths() > 12) & (request.getAmount() > 10000.0)) {
            return new LoanResponse(loanCalcRepository.save(request),ResponseType.DENIED);
        }
        return super.createRequest(request);
    }
}
