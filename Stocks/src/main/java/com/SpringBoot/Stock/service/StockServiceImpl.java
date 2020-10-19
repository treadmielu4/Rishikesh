package com.SpringBoot.Stock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.Stock.dao.StockDao;
import com.SpringBoot.Stock.dao.jpa.StockJpaDao;
import com.SpringBoot.Stock.entity.Stock;

@Service(value = "st")
public class StockServiceImpl implements StockService {

	@Autowired
	StockDao sd;
	
	@Autowired
	StockJpaDao sjd;
	
	@Override
	public Iterable<Stock> getAllStock() {
		return sjd.findAll();
	}

	@Override
	public Stock getStockById(int stock_id) {
		return sjd.findById(stock_id).get();
	}

}
