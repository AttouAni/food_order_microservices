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

import com.dsi.tp1.entities.DeliveryInfo;
import com.dsi.tp1.services.IDeliveryInfoService;

@RestController
public class DeliveryInfoController {
	
	@Autowired
	private IDeliveryInfoService infoService;
	
	@GetMapping("/deliveryInfos")
	public List<DeliveryInfo> getAll(){
		return infoService.getDeliveryInfos();
	}
	
	@GetMapping("/deliveryInfos/{id}")
	public Optional<DeliveryInfo> getOne(@PathVariable("id") int id ) {
		return infoService.getDeliveryInfo(id);
	}
	
	@PostMapping("/deliveryInfos")
	public DeliveryInfo createDeliveryInfo(@RequestBody DeliveryInfo info) {
		return infoService.addDeliveryInfo(info);
	}
	
	@PutMapping("/deliveryInfos/{id}")
	public DeliveryInfo updateDeliveryInfo(@RequestBody DeliveryInfo info, @PathVariable("id") int id) {
		return infoService.updateDeliveryInfo(info,id);
	}
	
	@DeleteMapping("deliveryInfos/{id}")
	public boolean deleteOne(@PathVariable("id")int id) {
		return infoService.deleteDeliveryInfo(id);
	}

}
