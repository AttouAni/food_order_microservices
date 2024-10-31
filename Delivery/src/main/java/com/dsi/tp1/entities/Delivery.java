package com.dsi.tp1.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Delivery implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String status;
	
	private LocalDateTime scheduledPickupTime;
	
	private LocalDateTime scheduledDeliveryTime;

	public Delivery() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getScheduledPickupTime() {
		return scheduledPickupTime;
	}

	public void setScheduledPickupTime(LocalDateTime scheduledPickupTime) {
		this.scheduledPickupTime = scheduledPickupTime;
	}

	public LocalDateTime getScheduledDeliveryTime() {
		return scheduledDeliveryTime;
	}

	public void setScheduledDeliveryTime(LocalDateTime scheduledDeliveryTime) {
		this.scheduledDeliveryTime = scheduledDeliveryTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Delivery(String status, LocalDateTime scheduledPickupTime, LocalDateTime scheduledDeliveryTime) {
		super();
		this.status = status;
		this.scheduledPickupTime = scheduledPickupTime;
		this.scheduledDeliveryTime = scheduledDeliveryTime;
	}
	
	

}
