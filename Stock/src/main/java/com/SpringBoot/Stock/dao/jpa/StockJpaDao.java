package com.SpringBoot.Stock.dao.jpa;

import org.springframework.data.repository.CrudRepository;

import com.SpringBoot.Stock.entity.Stock;

public interface StockJpaDao extends CrudRepository<Stock, Integer> {




}
