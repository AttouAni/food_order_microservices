package com.dsi.tp1.services;

import java.util.List;
import java.util.Optional;

import com.dsi.tp1.entities.DeliveryInfo;

public interface IDeliveryInfoService {
	
	public Optional<DeliveryInfo> getDeliveryInfo(int i);
	public List<DeliveryInfo> getDeliveryInfos();
	public DeliveryInfo addDeliveryInfo(DeliveryInfo d);
	public DeliveryInfo updateDeliveryInfo(DeliveryInfo d,int i);
	public boolean deleteDeliveryInfo(int i);

}
