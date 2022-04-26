package com.diego.uri2605.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diego.uri2605.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
