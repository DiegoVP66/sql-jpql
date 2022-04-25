package com.diego.uri2608.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.diego.uri2608.dto.ProductMinDTO;
import com.diego.uri2608.entities.Product;
import com.diego.uri2608.projections.ProductMinProjection;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	@Query(nativeQuery = true, value = "SELECT  max(products.price) AS price "
	+ "FROM products "
	+ "UNION "
	+ "SELECT min(products.price) FROM products")
	List<ProductMinProjection> search1();
	
	
	@Query("SELECT new com.diego.uri2608.dto.ProductMinDTO(max(obj.price)) "
			+ "FROM Product obj") 
			List<ProductMinDTO> search2();
}
