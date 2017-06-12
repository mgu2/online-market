package com.mgu2.shop.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findByOrderByCreateTimeDesc();

    List<Product> findByOrderByCreateTimeAsc();

    @Query("FROM Product p")
    List<Product> findPopProducts();

}