package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entity.MerchantDemoEntity;
import Repo.MerchantDemoRepo;


	@RestController
	@RequestMapping("/merchant")
	public class MerchantDemo {
		@Autowired
		MerchantDemoRepo MerRepo;
		@GetMapping("/")
		public List<MerchantDemoEntity> getDept(){
			return MerRepo.findAll();
		}
		
		@PostMapping("/")
		public List<MerchantDemoEntity> saveDept(@RequestBody MerchantDemoEntity merchantEntity){
			MerRepo.save(merchantEntity);
			return MerRepo.findAll();
		}
		@PutMapping("/")
		public List<MerchantDemoEntity> updateDept(@RequestBody MerchantDemoEntity merchantEntity){
			MerRepo.save(merchantEntity);
			return MerRepo.findAll();
		}
		@DeleteMapping("/{id}")
		public List<MerchantDemoEntity> deleteDept(@PathVariable("id") int id){
			MerRepo.deleteById(id);
			return MerRepo.findAll();
		}
		
		
		
	}