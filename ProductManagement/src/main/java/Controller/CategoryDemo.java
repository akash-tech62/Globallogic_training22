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

import Entity.CatergoryDemoEntity;
import Repo.CategoryDemoRepo;
import Repo.CustomerDemoRepo;
import Repo.MerchantDemoRepo;
import Repo.ProductDemoRepo;

@RestController
@RequestMapping("/category")
public class CategoryDemo  {
	
	@Autowired
	CategoryDemoRepo CatRepo;
	@Autowired
	CustomerDemoRepo CusRepo;
	@Autowired
	MerchantDemoRepo MerRepo;
	@Autowired
	ProductDemoRepo ProRepo;
	
	
	@GetMapping("/")
	public List<CatergoryDemoEntity> showCategory()
	{
		return CatRepo.findAll();
	}
	
	
	@PostMapping("/")
	public List<CatergoryDemoEntity> saveCategory(@RequestBody CatergoryDemoEntity CategoryDemoEntity){
		CatRepo.save(CategoryDemoEntity);
		return CatRepo.findAll();
	}
	@PutMapping("/")
	public List<CatergoryDemoEntity> updateCategory(@RequestBody CatergoryDemoEntity CategoryDemoEntity){
		CatRepo.save(CategoryDemoEntity);
		return CatRepo.findAll();
	}
	@DeleteMapping("/{id}")
	public List<CatergoryDemoEntity> deleteDept(@PathVariable("id") int id){
		CatRepo.deleteById(id);
		return CatRepo.findAll();
	}

}