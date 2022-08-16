package Repo;


import org.springframework.data.jpa.repository.JpaRepository;

import Entity.MerchantDemoEntity;


public interface MerchantDemoRepo extends JpaRepository<MerchantDemoEntity, Integer> {

}