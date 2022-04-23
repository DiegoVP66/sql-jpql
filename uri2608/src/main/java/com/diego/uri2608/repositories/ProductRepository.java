package com.diego.uri2608.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diego.uri2608.entities.Product;
import com.diego.uri2608.projections.ProductMinProjection;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	List<ProductMinProjection> search1();
}
