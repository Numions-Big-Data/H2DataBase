package com.numions.H2DataBase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@SpringBootApplication
public class Productos {
	@Entity
	public class Producto{
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int Id;
		private String value;
	}

	public interface GenericEntityRepository
		extends JpaRepository<Producto, Long> {}
	public static void main(String[] args) {
		SpringApplication.run(Productos.class, args);
	}
}
