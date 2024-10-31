package com.dsi.tp1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsi.tp1.entities.DeliveryInfo;
import com.dsi.tp1.repositories.DeliveryInfoRepository;

@Service
public class DeliveryInfoServiceImpl implements IDeliveryInfoService{

	@Autowired
	private DeliveryInfoRepository infoRepository;
	
	@Override
	public Optional<DeliveryInfo> getDeliveryInfo(int i) {
		// TODO Auto-generated method stub
		return infoRepository.findById(i);
	}

	@Override
	public List<DeliveryInfo> getDeliveryInfos() {
		// TODO Auto-generated method stub
		return infoRepository.findAll();
	}

	@Override
	public DeliveryInfo addDeliveryInfo(DeliveryInfo d) {
		// TODO Auto-generated method stub
		return infoRepository.save(d);
	}

	@Override
	public DeliveryInfo updateDeliveryInfo(DeliveryInfo d, int i) {
		// TODO Auto-generated method stub
		DeliveryInfo info = infoRepository.findById(i).get();
		d.setId(info.getId());
		return infoRepository.save(d);
	}

	@Override
	public boolean deleteDeliveryInfo(int i) {
		// TODO Auto-generated method stub
		infoRepository.deleteById(i);
		return !infoRepository.existsById(i);
	}

}
