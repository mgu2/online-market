package com.mgu2.shop.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mgu2.shop.models.Product;
import com.mgu2.shop.models.ProductType;

@Repository
public interface ProductTypeRespository extends JpaRepository<ProductType, Integer>{

}
