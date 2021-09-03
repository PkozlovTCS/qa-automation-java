package com.tinkoff.edu.app;

public class LoanResponse {

    private final ResponseType type;
    private Integer requestId;

    public LoanResponse(int requestId, ResponseType type) {
        this.requestId = requestId;
        this.type = type;
    }

    public LoanResponse(ResponseType type) {
        this.type = type;
    }

    public ResponseType getType() {
        return type;
    }

    public Integer getRequestId() {
        return requestId;
    }
}