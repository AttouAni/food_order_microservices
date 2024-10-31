package com.dsi.tp1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dsi.tp1.entities.Delivery;
import com.dsi.tp1.services.IDeliveryService;

@RestController
public class DeliveryController {
	
	@Autowired
	private IDeliveryService deliveryService;
	
	@GetMapping("/deliveries")
	public List<Delivery> getAll(){
		return deliveryService.getAll();
	}
	
	@PostMapping("/deliveries")
	public Delivery createDelivery(@RequestBody Delivery d) {
		return deliveryService.scheduleDelivery(d);
	}
	
	@PutMapping("/pickup/{id}")
	public Delivery pickupDelivery(@PathVariable("id") int id) {
		return deliveryService.noteDeliveryPickUp(id);
	}
	
	@PutMapping("/delivery/{id}")
	public Delivery DeliveryDelivery(@PathVariable("id") int id) {
		return deliveryService.noteDeliveryDelivered(id);
	}
	
	@PutMapping("/cancel/{id}")
	public Delivery cancelDelivery(@PathVariable("id") int id) {
		return deliveryService.noteDeliveryCanceled(id);
	}

}
