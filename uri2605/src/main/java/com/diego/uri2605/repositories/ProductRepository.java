package com.diego.uri2605.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.diego.uri2605.entities.Product;
import com.diego.uri2605.projections.ProductMinProjection;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
  
	@Query(nativeQuery = true, value = "SELECT products.name , providers.pname "
			+ "FROM products "
			+ "INNER JOIN providers "
			+ "ON providers.id = products.id_providers "
			+ "INNER JOIN categories "
			+ "ON categories.id = products.id_categories "
			+ "WHERE categories.id  = :id")
	List<ProductMinProjection> search1(Integer id);
	
	

	
}
