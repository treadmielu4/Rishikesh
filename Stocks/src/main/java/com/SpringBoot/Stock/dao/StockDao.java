package com.SpringBoot.Stock.dao;

import java.util.List;

import com.SpringBoot.Stock.entity.Stock;

public interface StockDao {
	public List<Stock> getAllStock();
	public Stock getStockById(int stock_id);

}
