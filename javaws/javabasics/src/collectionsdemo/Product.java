package collectionsdemo;

public class Product {
	private int code;
	private String name;
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	private String description;
	private double price;
	private String manufacturer;
	
	public Product(int code,String name,String description,double price,String manufacturer)
	{
		this.code=code;
		this.name=name;
		this.description=description;
		this.price=price;
		this.manufacturer=manufacturer;
	
	}
	
	public String information() {
		return " code "+this.code+ " Name " +this.name+ " Description "+this.description+ " Price "+this.price+ " Manufacturer "+this.manufacturer;
	}
}
