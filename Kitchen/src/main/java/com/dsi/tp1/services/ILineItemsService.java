package com.dsi.tp1.services;

import java.util.List;
import java.util.Optional;

import com.dsi.tp1.entities.LineItems;

public interface ILineItemsService {
	
	public Optional<LineItems> getLineItems(int i);
	public List<LineItems> allLineItems();
	public LineItems addLineItems(LineItems l);
	public LineItems updateLineItems(LineItems l, int i);
	public boolean deleteLineItems(int i);

}
