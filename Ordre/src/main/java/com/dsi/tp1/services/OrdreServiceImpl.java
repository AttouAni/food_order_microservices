package com.dsi.tp1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsi.tp1.entities.Ordre;
import com.dsi.tp1.repositories.OrdreRepository;

@Service
public class OrdreServiceImpl implements IOrdreService {
	
	@Autowired
	private OrdreRepository orderRepository;

	@Override
	public Ordre createOrder(Ordre o) {
		// TODO Auto-generated method stub
		return orderRepository.save(o);
	}

	@Override
	public List<Ordre> allOrders() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	@Override
	public Optional<Ordre> getOrder(int i) {
		// TODO Auto-generated method stub
		return orderRepository.findById(i);
	}

	@Override
	public boolean deleteOrder(int i) {
		// TODO Auto-generated method stub
		orderRepository.deleteById(i);
		return !orderRepository.existsById(i);
	}

	@Override
	public Ordre reviseOrder(Ordre o,int i) {
		// TODO Auto-generated method stub
		Ordre order=orderRepository.findById(i).get();
		o.setId(order.getId());
		return orderRepository.save(o);
	}

	@Override
	public Ordre cancelOrder(int i) {
		// TODO Auto-generated method stub
		Ordre o = orderRepository.findById(i).get();
		o.setState("canceled");
		return orderRepository.save(o);
	}

}
