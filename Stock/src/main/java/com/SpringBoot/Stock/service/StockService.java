package com.SpringBoot.Stock.service;

import com.SpringBoot.Stock.entity.Stock;

public interface StockService {

	public Iterable<Stock> getAllStock();
	public Stock getStockById(int stock_id);
	
}
