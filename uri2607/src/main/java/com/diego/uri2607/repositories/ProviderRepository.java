package com.diego.uri2607.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diego.uri2607.entities.Provider;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, Long> {

}
