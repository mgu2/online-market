package com.mgu2.shop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mgu2.shop.models.Product;
import com.mgu2.shop.respository.ProductRespository;
import com.mgu2.shop.respository.ProductTypeRespository;

@Service
@Transactional
public class ProductService {
	
	@Autowired
	ProductRespository productDao;
	
	@Autowired
	ProductTypeRespository productTypeDao;
	
	public List<Product> findNew(){
		return productDao.findByOrderByCreateTimeDesc();
	}
	
	public List<Product> findPop(){
		return productDao.findPopProducts();
	}

	public List<Product> findAll() {
		
		return productDao.findAll();
	}

	public Object findType() {
		
		return productTypeDao.findAll();
	}
	
}
