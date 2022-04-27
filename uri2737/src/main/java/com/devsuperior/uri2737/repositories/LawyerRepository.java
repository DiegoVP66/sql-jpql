package com.devsuperior.uri2737.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.uri2737.entities.Lawyer;
import com.devsuperior.uri2737.projections.LawyerMinProjection;

public interface LawyerRepository extends JpaRepository<Lawyer, Long> {

	@Query(nativeQuery = true, value = "(SELECT lawyers.name, lawyers.customers_number AS customersNumber " 
			+ "FROM lawyers "
			+ "ORDER BY lawyers.customers_number DESC " 
			+ "LIMIT 1) " 
			+ "UNION ALL "
			+ "(SELECT lawyers.name, lawyers.customers_number " 
			+ "FROM lawyers "
			+ "ORDER BY lawyers.customers_number ASC " 
			+ "LIMIT 1) " 
			+ "UNION ALL " 
			+ "(SELECT 'Average', ROUND(AVG(lawyers.customers_number)) " 
			+ " FROM lawyers)")
	List<LawyerMinProjection> search1();
	
	
	@Query(nativeQuery = true, value = "(SELECT lawyers.name, lawyers.customers_number AS customersNumber "
			+ "	FROM lawyers "
			+ "	WHERE customers_number = ( "
			+ "	SELECT MAX(customers_number) "
			+ "	FROM lawyers "
			+ "	) "
			+ " ) "
			+ " UNION ALL "
			+ "  (SELECT lawyers.name, lawyers.customers_number "
			+ "	FROM lawyers "
			+ "	WHERE customers_number = ( "
			+ "	SELECT MIN(customers_number) "
			+ "	FROM lawyers) "
			+ " ) "
			+ " UNION ALL "
			+ " (SELECT 'Average',  "
			+ " ROUND(AVG(lawyers.customers_number)) "
			+ " FROM lawyers)")
	List<LawyerMinProjection> search2();
}
