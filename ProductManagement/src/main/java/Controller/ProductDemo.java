package Controller;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entity.ProductDemoEntity;
import Repo.CategoryDemoRepo;
import Repo.CustomerDemoRepo;
import Repo.MerchantDemoRepo;
import Repo.ProductDemoRepo;


@RestController
@RequestMapping("/ecommerce")
public class ProductDemo {
	
	@Autowired
	CategoryDemoRepo CatRepo;
	@Autowired
	CustomerDemoRepo CusRepo;
	@Autowired
	MerchantDemoRepo MerRepo;
	@Autowired
	ProductDemoRepo ProRepo;
	
	@GetMapping("/")
	public List<ProductDemoEntity> showProduct()
	{
		return ProRepo.findAll();
	}
	
	
	@GetMapping("/prod/{name}")
	public List<String> showProductByCategoryName(@PathVariable("name") String cName){
		
		List<ProductDemoEntity> prod = ProRepo.findAll();
		System.out.println(prod);
		
		List<ProductDemoEntity> prodName = prod.stream().filter(e -> (e.getCaEn().getCat()).equalsIgnoreCase(cName)).collect(Collectors.toList());
		
		System.out.println(prodName);
		List<String> name = new ArrayList<>();
		for(ProductDemoEntity pro : prodName ) {
			name.add(pro.getName());
		}
		return name;	
	}
	
	
	
	@PostMapping("/")
	public ProductDemoEntity saveProduct(@RequestBody ProductDemoEntity pr) {
		ProRepo.save(pr);
		System.err.println(pr);
		return pr;
	}
	
	@PutMapping("/")
	public ProductDemoEntity updateProduct(@RequestBody ProductDemoEntity pr) {
		System.out.println(pr);
		ProRepo.save(pr);
		System.out.println(pr);
		return pr;
	}
	
	
	@DeleteMapping("/{id}")
	public String deleteProduct(@PathVariable int id) {
		System.err.println("Deleted");
		ProRepo.deleteById(id);
		
		return "Record has been deleted";
	}

	
	

}
