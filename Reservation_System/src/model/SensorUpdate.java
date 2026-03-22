package model;

import java.time.LocalDateTime;
import java.util.UUID;

public class SensorUpdate {
    private UUID updateId;
    private LocalDateTime timestamp;
    private String operationalStatus;
    private String message;

    public SensorUpdate(String operationalStatus, String message) {
        this.updateId = UUID.randomUUID();
        this.timestamp = LocalDateTime.now();
        this.operationalStatus = operationalStatus;
        this.message = message;
    }

    public UUID getUpdateId() {
        return updateId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getOperationalStatus() {
        return operationalStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setOperationalStatus(String operationalStatus) {
        this.operationalStatus = operationalStatus;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "SensorUpdate{" +
                "updateId=" + updateId +
                ", timestamp=" + timestamp +
                ", operationalStatus='" + operationalStatus + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}