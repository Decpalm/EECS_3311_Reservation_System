package model;

import java.util.UUID;

public abstract class User {
    private UUID userId;
    private String email;
    private String passwordHash;
    private String status;
    private String idOrCertNumber;
    private boolean active;

    public User(String email, String passwordHash, String idOrCertNumber) {
        this.userId = UUID.randomUUID();
        this.email = email;
        this.passwordHash = passwordHash;
        this.idOrCertNumber = idOrCertNumber;
        this.status = "ACTIVE";
        this.active = true;
    }

    public UUID getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public String getStatus() {
        return status;
    }

    public String getIdOrCertNumber() {
        return idOrCertNumber;
    }

    public boolean isActive() {
        return active;
    }
    
    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setIdOrCertNumber(String idOrCertNumber) {
        this.idOrCertNumber = idOrCertNumber;
    }

    public void setActive(boolean active) {
        this.active = active;
        this.status = active ? "ACTIVE" : "INACTIVE";
    }

    public abstract double getHourlyRate();

    public abstract String getRole();

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", email='" + email + '\'' +
                ", status='" + status + '\'' +
                ", idOrCertNumber='" + idOrCertNumber + '\'' +
                ", role='" + getRole() + '\'' +
                '}';
    }
}