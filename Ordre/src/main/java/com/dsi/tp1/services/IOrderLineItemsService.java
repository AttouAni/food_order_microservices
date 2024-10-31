package com.dsi.tp1.services;

import java.util.List;
import java.util.Optional;

import com.dsi.tp1.entities.OrderLineItems;

public interface IOrderLineItemsService {
	public Optional<OrderLineItems> getOrderLineItems(int i);
	public List<OrderLineItems> allOrderLineItems();
	public OrderLineItems addOrderLineItems(OrderLineItems o);
	public OrderLineItems updateOrderLineItems(OrderLineItems o, int i);
	public boolean deleteOrderLineItems(int i);
}
