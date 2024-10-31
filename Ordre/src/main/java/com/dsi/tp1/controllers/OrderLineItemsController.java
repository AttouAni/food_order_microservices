package com.dsi.tp1.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dsi.tp1.entities.OrderLineItems;
import com.dsi.tp1.services.IOrderLineItemsService;

@RestController
public class OrderLineItemsController {

	@Autowired
	private IOrderLineItemsService itemsService;
	
	@GetMapping("/orderLineItems")
	public List<OrderLineItems> getAll(){
		return itemsService.allOrderLineItems();
	}
	
	@GetMapping("/orderLineItems/{id}")
	public Optional<OrderLineItems> getOne(@PathVariable("id") int id ) {
		return itemsService.getOrderLineItems(id);
	}
	
	@PostMapping("/orderLineItems")
	public OrderLineItems createOrderLineItems(@RequestBody OrderLineItems item) {
		return itemsService.addOrderLineItems(item);
	}
	
	@PutMapping("/orderLineItems/{id}")
	public OrderLineItems updateOrderLineItems(@RequestBody OrderLineItems item, @PathVariable("id") int id) {
		return itemsService.updateOrderLineItems(item,id);
	}
	
	@DeleteMapping("orderLineItems/{id}")
	public boolean deleteOne(@PathVariable("id")int id) {
		return itemsService.deleteOrderLineItems(id);
	}
	
}
