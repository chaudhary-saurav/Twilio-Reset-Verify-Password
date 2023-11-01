package com.api.twillio.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class PasswordResetResponseDto {


    private OtpStatus status;
    private String message;

    public PasswordResetResponseDto() {
    }

    public PasswordResetResponseDto(OtpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public OtpStatus getStatus() {
        return status;
    }

    public void setStatus(OtpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}