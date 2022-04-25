package com.diego.uri2615.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.diego.uri2615.entity.Customer;
import com.diego.uri2615.projections.CustomerMinProjection;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	@Query(nativeQuery = true, value = "SELECT customers.city "
			+ "FROM customers")
	List<CustomerMinProjection> search1();
}
