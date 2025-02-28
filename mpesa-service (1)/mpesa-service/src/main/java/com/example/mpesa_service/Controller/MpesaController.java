package com.example.mpesa_service.Controller;

import com.example.mpesa_service.model.Transaction;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/mpesa")
public class MpesaController {
    private final Map<String, Transaction> transactions = new HashMap<>();

    @PostMapping("/payments")
    public String createPayment(@RequestBody Transaction transaction) {
        transactions.put(transaction.getTransactionId(), transaction);
        return "Payment processed!";
    }
    @GetMapping("/transactions/{transactionId}")
    public Transaction getTransaction(@PathVariable String transactionId) {
        return transactions.get(transactionId);
    }
}
