package br.com.bennytech.estudobackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bennytech.estudobackend.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    
}
