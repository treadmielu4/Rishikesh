package com.SpringBoot.Stock.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.SpringBoot.Stock.entity.Stock;

@Repository(value = "sd")
public class StockDaoImpl implements StockDao {

	List<Stock> sList=new ArrayList<>();
	
	public StockDaoImpl() {
		sList.add(new Stock(101, "Mobile",10000.00, 50.00,new Date(2020-10-19)));
		sList.add(new Stock(102, "TV", 50000.00, 400.00,new Date(2020-10-20)));
		sList.add(new Stock(103, "AC", 40000.00, 500.00,new Date(2020-10-21)));		
	}
	
	@Override
	public List<Stock> getAllStock() {
		return sList;
	}
	
	
	@Override
	public Stock getStockById(int stock_id) {
		
		for(Stock s:sList) {
			if(s.getStock_id()==stock_id) {
				
				return s;	
			}
		}
		
		return null;
	}

}
