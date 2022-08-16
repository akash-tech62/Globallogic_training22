package Repo;


import org.springframework.data.jpa.repository.JpaRepository;

import Entity.CatergoryDemoEntity;


public interface CategoryDemoRepo extends JpaRepository<CatergoryDemoEntity, Integer> {

}
