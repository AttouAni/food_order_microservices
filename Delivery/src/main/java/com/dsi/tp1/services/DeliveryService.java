package com.dsi.tp1.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsi.tp1.entities.Delivery;
import com.dsi.tp1.repositories.DeliveryRepository;

@Service
public class DeliveryService implements IDeliveryService {
	
	@Autowired
	private DeliveryRepository deliveryRepository;

	@Override
	public List<Delivery> getAll() {
		// TODO Auto-generated method stub
		return deliveryRepository.findAll();
	}

	@Override
	public Optional<Delivery> getOne(int i) {
		// TODO Auto-generated method stub
		return deliveryRepository.findById(i);
	}

	@Override
	public Delivery noteDeliveryPickUp(int i) {
		// TODO Auto-generated method stub
		Delivery d = deliveryRepository.findById(i).get();
		d.setStatus("pickedup");
		d.setScheduledPickupTime(LocalDateTime.now());
		return deliveryRepository.save(d);
	}

	@Override
	public Delivery noteDeliveryDelivered(int i) {
		// TODO Auto-generated method stub
		Delivery d = deliveryRepository.findById(i).get();
		d.setStatus("done");
		d.setScheduledDeliveryTime(LocalDateTime.now());
		return deliveryRepository.save(d);
	}

	@Override
	public Delivery noteDeliveryCanceled(int i) {
		// TODO Auto-generated method stub
		Delivery d = deliveryRepository.findById(i).get();
		d.setStatus("canceled");
		d.setScheduledDeliveryTime(null);
		d.setScheduledPickupTime(null);
		return deliveryRepository.save(d);
	}

	@Override
	public Delivery scheduleDelivery(Delivery d) {
		// TODO Auto-generated method stub
		d.setStatus("pending");
		return deliveryRepository.save(d);
	}

}
