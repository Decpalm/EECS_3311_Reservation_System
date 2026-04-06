package model;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit 5 tests for {@link Payment}.
 *
 * @author sal1818
 */
public class PaymentTest {

    @Test
    void constructor_pendingStatus() {
        Payment p = new Payment(50.0, "VISA");
        assertEquals("PENDING", p.getStatus());
        assertEquals(50.0, p.getAmount(), 0.001);
        assertEquals("VISA", p.getMethod());
    }

    @Test
    void getPaymentId_notNull() {
        assertNotNull(new Payment(1, "M").getPaymentId());
    }

    @Test
    void markSuccess_setsSuccessAndUpdatesTimestamp() {
        Payment p = new Payment(10, "CASH");
        LocalDateTime before = p.getTimestamp();
        p.markSuccess();
        assertEquals("SUCCESS", p.getStatus());
        assertTrue(!p.getTimestamp().isBefore(before));
    }

    @Test
    void markFailed_setsFailed() {
        Payment p = new Payment(10, "CASH");
        p.markFailed();
        assertEquals("FAILED", p.getStatus());
    }

    @Test
    void refund_setsRefunded() {
        Payment p = new Payment(10, "CASH");
        p.refund();
        assertEquals("REFUNDED", p.getStatus());
    }

    @Test
    void setAmount_updates() {
        Payment p = new Payment(1, "M");
        p.setAmount(99.5);
        assertEquals(99.5, p.getAmount(), 0.001);
    }

    @Test
    void setMethod_updates() {
        Payment p = new Payment(1, "A");
        p.setMethod("B");
        assertEquals("B", p.getMethod());
    }

    @Test
    void setStatus_updates() {
        Payment p = new Payment(1, "M");
        p.setStatus("CUSTOM");
        assertEquals("CUSTOM", p.getStatus());
    }

    @Test
    void setPaymentId_updates() {
        Payment p = new Payment(1, "M");
        UUID id = UUID.randomUUID();
        p.setPaymentId(id);
        assertEquals(id, p.getPaymentId());
    }

    @Test
    void setTimestamp_updates() {
        Payment p = new Payment(1, "M");
        LocalDateTime t = LocalDateTime.of(2025, 1, 1, 12, 0);
        p.setTimestamp(t);
        assertEquals(t, p.getTimestamp());
    }

    @Test
    void toString_containsAmountAndMethod() {
        Payment p = new Payment(42.5, "DEBIT");
        assertTrue(p.toString().contains("42.5"));
        assertTrue(p.toString().contains("DEBIT"));
    }
}
