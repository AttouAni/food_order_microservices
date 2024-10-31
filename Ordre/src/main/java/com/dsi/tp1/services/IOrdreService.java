package com.dsi.tp1.services;

import java.util.List;
import java.util.Optional;

import com.dsi.tp1.entities.Ordre;

public interface IOrdreService {

	public Ordre createOrder(Ordre o);
	public List<Ordre> allOrders();
	public Optional<Ordre> getOrder(int i);
	public boolean deleteOrder(int i);
	public Ordre reviseOrder(Ordre o,int i);
	public Ordre cancelOrder(int i);
}
