package com.example.mpesa_service.model;

public class Transaction {
    private String transactionId;
    private String phoneNumber;
    private double amount;
    private String status;

    public Transaction() {
    }

    public Transaction(String transactionId, String status, String phoneNumber, double amount) {
        this.transactionId = transactionId;
        this.status = status;
        this.phoneNumber = phoneNumber;
        this.amount = amount;
    }

    public Transaction(String status, double amount, String phoneNumber) {
        this.status = status;
        this.amount = amount;
        this.phoneNumber = phoneNumber;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                '}';
    }
}
