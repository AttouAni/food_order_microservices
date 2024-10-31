package com.dsi.tp1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsi.tp1.entities.LineItems;
import com.dsi.tp1.repositories.LineItemsRepository;

@Service
public class LineItemsServiceImp implements ILineItemsService{
	
	@Autowired
	private LineItemsRepository itemsRepository;

	@Override
	public Optional<LineItems> getLineItems(int i) {
		// TODO Auto-generated method stub
		return itemsRepository.findById(i);
	}

	@Override
	public List<LineItems> allLineItems() {
		// TODO Auto-generated method stub
		return itemsRepository.findAll();
	}

	@Override
	public LineItems addLineItems(LineItems l) {
		// TODO Auto-generated method stub
		return itemsRepository.save(l);
	}

	@Override
	public LineItems updateLineItems(LineItems l, int i) {
		// TODO Auto-generated method stub
		LineItems item = itemsRepository.findById(i).get();
		l.setId(item.getId());
		return itemsRepository.save(l);
	}

	@Override
	public boolean deleteLineItems(int i) {
		// TODO Auto-generated method stub
		itemsRepository.deleteById(i);
		return !itemsRepository.existsById(i);
	}
	
	

}
