package com.SpringBoot.Stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.Stock.entity.Stock;
import com.SpringBoot.Stock.service.StockService;

@RestController
public class StockController {

	@Autowired
	StockService st;
	
	@GetMapping(value = "/stockList")
	public ResponseEntity<Object> personList()
	{
		
		return new ResponseEntity<>(st.getAllStock(),HttpStatus.OK);
	}
	
	
	@GetMapping(value = "/getStockById/id/{stock_id}")
	public ResponseEntity<Object> personList(@PathVariable("stock_id") Integer stock_id)
	{
		
			Stock s=st.getStockById(stock_id);
			if(s!=null) {
				
				return new ResponseEntity<>(s,HttpStatus.OK);	
			}
			else
			return new ResponseEntity<>("Result Not Found",HttpStatus.OK);
				
	}
	
	
}
