package Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.ProductDemoEntity;


public interface ProductDemoRepo extends JpaRepository<ProductDemoEntity, Integer> {

}