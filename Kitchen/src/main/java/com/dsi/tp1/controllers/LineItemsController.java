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

import com.dsi.tp1.entities.LineItems;
import com.dsi.tp1.services.ILineItemsService;

@RestController
public class LineItemsController {
	
	@Autowired
	private ILineItemsService itemsService;
	
	@GetMapping("/lineItems")
	public List<LineItems> getAll(){
		return itemsService.allLineItems();
	}
	
	@GetMapping("/lineItems/{id}")
	public Optional<LineItems> getOne(@PathVariable("id") int id ) {
		return itemsService.getLineItems(id);
	}
	
	@PostMapping("/lineItems")
	public LineItems createLineItems(@RequestBody LineItems item) {
		return itemsService.addLineItems(item);
	}
	
	@PutMapping("/lineItems/{id}")
	public LineItems updateLineItems(@RequestBody LineItems item, @PathVariable("id") int id) {
		return itemsService.updateLineItems(item,id);
	}
	
	@DeleteMapping("lineItems/{id}")
	public boolean deleteOne(@PathVariable("id")int id) {
		return itemsService.deleteLineItems(id);
	}

}
