package com.diego.uri2607.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.diego.uri2607.dto.ProviderMinDTO;
import com.diego.uri2607.entities.Provider;
import com.diego.uri2607.projections.ProviderMinProjection;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, Long> {

	@Query(nativeQuery = true, value = "SELECT DISTINCT providers.city " 
			+ "FROM providers "
			+ "ORDER BY providers.city ASC")
	List<ProviderMinProjection> search1();
	
	@Query("SELECT new com.diego.uri2607.dto.ProviderMinDTO(obj.city) "
			+ "FROM Provider obj "
			+ "ORDER BY obj.city ASC")
	List<ProviderMinDTO> search2();
}
