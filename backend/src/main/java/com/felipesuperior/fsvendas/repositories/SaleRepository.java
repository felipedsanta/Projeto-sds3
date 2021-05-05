package com.felipesuperior.fsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipesuperior.fsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
