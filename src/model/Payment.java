package model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Payment {
    private UUID paymentId;
    private double amount;
    private String method;
    private String status;
    private LocalDateTime timestamp;

    public Payment(double amount, String method) {
        this.paymentId = UUID.randomUUID();
        this.amount = amount;
        this.method = method;
        this.status = "PENDING";
        this.timestamp = LocalDateTime.now();
    }

    public UUID getPaymentId() {
        return paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public String getMethod() {
        return method;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    
    public void setPaymentId(UUID paymentId) {
        this.paymentId = paymentId;
    }
    
    public void setStatus(String status) {
    	this.status = status;
    }
    
    public void setTimestamp(LocalDateTime timestamp) {
    	this.timestamp = timestamp;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void markSuccess() {
        this.status = "SUCCESS";
        this.timestamp = LocalDateTime.now();
    }

    public void markFailed() {
        this.status = "FAILED";
        this.timestamp = LocalDateTime.now();
    }

    public void refund() {
        this.status = "REFUNDED";
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", amount=" + amount +
                ", method='" + method + '\'' +
                ", status='" + status + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}