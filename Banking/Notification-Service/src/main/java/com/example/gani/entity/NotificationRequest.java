package com.example.gani.entity;

import jakarta.validation.constraints.NotBlank;

public class NotificationRequest {

    @NotBlank
    private String recipient;

    public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@NotBlank
    private String subject;

    @NotBlank
    private String message;

    // Getters and Setters
}
