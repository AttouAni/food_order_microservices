package com.dsi.tp1.services;

import java.util.List;
import java.util.Optional;

import com.dsi.tp1.entities.Delivery;

public interface IDeliveryService {
	
	public List<Delivery> getAll();
	public Optional<Delivery> getOne(int i);
	public Delivery noteDeliveryPickUp(int i);
	public Delivery noteDeliveryDelivered(int i);
	public Delivery noteDeliveryCanceled(int i);
	public Delivery scheduleDelivery(Delivery d);
	

}
