package com.example.loan_management_service.controller;

import com.example.loan_management_service.model.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/loans")
public class LoanController {
    private final Map<String, Loan> loans = new HashMap<>();

    @Autowired
    private RestTemplate restTemplate;
    @PostMapping
    public String createLoan(@RequestBody Loan loan) {
        loans.put(loan.getloanId(), loan);
        return "Loan created!";
    }

    @GetMapping("/{loanId}")
    public Loan getLoan(@PathVariable String loanId) {
        return loans.get(loanId);
    }
    @PostMapping("/{loanId}/repay")
    public String repayLoan(@PathVariable String loanId, @RequestParam double amount) {
        Loan loan = loans.get(loanId);
        if (loan == null) {
            return "Loan not found!";
        }

        // Call Mpesa Service to process payment
        String mpesaUrl = "http://localhost:8082/mpesa/payments";
        String requestBody = String.format("{\"transactionId\":\"%s\", \"phoneNumber\":\"0712345678\", \"amount\":%f, \"status\":\"Pending\"}", loanId, amount);
        String paymentResponse = restTemplate.postForObject(mpesaUrl, requestBody, String.class);

        // Update loan status based on payment response
        if (paymentResponse != null && paymentResponse.contains("Success")) {
            loan.setStatus("Repaid");
            return "Loan repaid successfully!";
        } else {
            return "Payment failed!";
        }
//    } catch (Exception e) {
//        // Log the exception
//        e.printStackTrace();
//        return "An error occurred while processing the payment: " + e.getMessage();
//    }
    }