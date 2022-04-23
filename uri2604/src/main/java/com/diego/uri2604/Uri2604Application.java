package com.diego.uri2604;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.diego.uri2604.dto.ProductMinDTO;
import com.diego.uri2604.projections.ProductMinProjection;
import com.diego.uri2604.repositories.ProductRepository;

@SpringBootApplication
public class Uri2604Application implements CommandLineRunner {

	@Autowired
	private ProductRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Uri2604Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<ProductMinProjection> list = repository.search1(10, 100);
		List<ProductMinDTO> result1 = list.stream().map(x -> new ProductMinDTO(x)).collect(Collectors.toList());

		System.out.println("\n*** RESULT SQL RAIZ");
		for (ProductMinDTO obj : result1) {
			System.out.println(obj);
		}
		System.out.println("\n\n");

		List<ProductMinDTO> result2 = repository.search2(10.0, 100.0);

		System.out.println("\n*** RESULT JPQL");
		for (ProductMinDTO obj : result2) {
			System.out.println(obj);
		}
	}

}
