package com.demo.complaint.model;
import jakarta.persistence.*;
@Entity
public class Complaint {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String message;
    private String status;

    public Complaint() {}

    public Complaint(String message, String status) {
        this.setMessage(message);
        this.setStatus(status);
    }

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

    
}

