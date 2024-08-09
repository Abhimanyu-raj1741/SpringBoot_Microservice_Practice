package in.ashokit.binding;

public class Product {

	private Integer id;
	private String name;
	private Double Price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(Integer id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.Price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", Price=" + Price + "]";
	}
	
	
}
