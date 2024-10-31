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

import com.dsi.tp1.entities.Ordre;
import com.dsi.tp1.services.IOrdreService;

@RestController
public class OrdreController {
	@Autowired
	private IOrdreService orderService;
	
	@GetMapping("/orders")
	public List<Ordre> getAll(){
		return orderService.allOrders();
	}
	
	@GetMapping("/orders/{id}")
	public Optional<Ordre> getOne(@PathVariable("id") int id ) {
		return orderService.getOrder(id);
	}
	
	@PostMapping("/orders")
	public Ordre createOrder(@RequestBody Ordre order) {
		return orderService.createOrder(order);
	}
	
	@PutMapping("/orders/{id}")
	public Ordre updateOrder(@RequestBody Ordre order, @PathVariable("id") int id) {
		return orderService.reviseOrder(order,id);
	}
	
	@DeleteMapping("orders/{id}")
	public boolean deleteOne(@PathVariable("id")int id) {
		return orderService.deleteOrder(id);
	}
	
	@PutMapping("cancelOrdre/{id}")
	public Ordre cancel(@PathVariable("id") int id) {
		return orderService.cancelOrder(id);
	}
	
}
