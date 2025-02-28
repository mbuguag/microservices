package com.example.loan_management_service.model;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class Loan {
    private String loanId;
    private String customerId;
    private double loanAmount;
    private String status;

    public Loan() {
    }

    public Loan(String loanId, String customerId, double loanAmount, String status) {
        this.loanId = loanId;
        this.customerId = customerId;
        this.loanAmount = loanAmount;
        this.status = status;
    }

    public Loan(String customerId, double loanAmount, String status) {
        this.customerId = customerId;
        this.loanAmount = loanAmount;
        this.status = status;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getloanId() {
        return loanId;
    }

    public void setloanId(String loanId) {
        this.loanId = loanId;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanId='" + loanId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", loanAmount=" + loanAmount +
                ", status='" + status + '\'' +
                '}';
    }

}
