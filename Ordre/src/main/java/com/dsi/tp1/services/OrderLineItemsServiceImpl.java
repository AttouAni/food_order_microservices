package com.dsi.tp1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsi.tp1.entities.OrderLineItems;
import com.dsi.tp1.repositories.OrderLineItemsRepository;

@Service
public class OrderLineItemsServiceImpl implements IOrderLineItemsService{

	@Autowired
	private OrderLineItemsRepository itemsRepository;
	
	@Override
	public Optional<OrderLineItems> getOrderLineItems(int i) {
		// TODO Auto-generated method stub
		return itemsRepository.findById(i);
	}

	@Override
	public List<OrderLineItems> allOrderLineItems() {
		// TODO Auto-generated method stub
		return itemsRepository.findAll();
	}

	@Override
	public OrderLineItems addOrderLineItems(OrderLineItems o) {
		// TODO Auto-generated method stub
		return itemsRepository.save(o);
	}

	@Override
	public OrderLineItems updateOrderLineItems(OrderLineItems o, int i) {
		// TODO Auto-generated method stub
		OrderLineItems item = itemsRepository.findById(i).get();
		o.setId(item.getId());
		return itemsRepository.save(o);
	}

	@Override
	public boolean deleteOrderLineItems(int i) {
		// TODO Auto-generated method stub
		itemsRepository.deleteById(i);
		return !itemsRepository.existsById(i);
	}

}
