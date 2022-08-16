package Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="category")

public class CatergoryDemoEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	
	@Column
	private String cat;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCat() {
		return cat;
	}


	public void setCat(String cat) {
		this.cat = cat;
	}


	@Override
	public String toString() {
		return "CategoryDemoEntity [id=" + id + ", cat=" + cat + "]";
	}


	public CatergoryDemoEntity(int id, String cat) {
		super();
		this.id = id;
		this.cat = cat;
	}


	public CatergoryDemoEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}