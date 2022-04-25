package com.diego.uri2608;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.diego.uri2608.dto.ProductMinDTO;
import com.diego.uri2608.projections.ProductMinProjection;
import com.diego.uri2608.repositories.ProductRepository;

@SpringBootApplication
public class Uri2608Application implements CommandLineRunner {

	@Autowired
	private ProductRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Uri2608Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<ProductMinProjection> list = repository.search1();
		List<ProductMinDTO> result1 = list.stream().map(x -> new ProductMinDTO(x)).collect(Collectors.toList());

		System.out.println("\n*** SQL");
		for (ProductMinDTO obj : result1) {
			System.out.println(obj);
		}
		System.out.println("\n\n\n");
		
		List<ProductMinDTO> result2 = repository.search2();
		

		System.out.println("\n*** JPQL");
		for (ProductMinDTO obj : result2) {
			System.out.println(obj);
		}

	}

}
