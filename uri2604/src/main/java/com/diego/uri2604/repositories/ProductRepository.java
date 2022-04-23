package com.diego.uri2604.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.diego.uri2604.entities.Product;
import com.diego.uri2604.projections.ProductMinProjection;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	@Query(nativeQuery = true, value ="SELECT products.id, products.name "
			+ "FROM products "
			+ "WHERE products.price < :min OR products.price > :max")
	List<ProductMinProjection> search1(Integer min, Integer max);
}
