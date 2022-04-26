package com.diego.uri2605;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.diego.uri2605.dto.ProductMinDTO;
import com.diego.uri2605.projections.ProductMinProjection;
import com.diego.uri2605.repositories.ProductRepository;

@SpringBootApplication
public class Uri2605Application implements CommandLineRunner {
	
	@Autowired
	private ProductRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Uri2605Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<ProductMinProjection> list = repository.search1(6);
		
		List<ProductMinDTO> result1 = list.stream().map(x -> new ProductMinDTO(x)).collect(Collectors.toList());
		
		for(ProductMinDTO obj : result1) {
			System.out.println(obj);
		}
		
	}

}
