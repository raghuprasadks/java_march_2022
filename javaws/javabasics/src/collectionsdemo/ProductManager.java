package collectionsdemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProductManager {
//	ArrayList<Product> pctlt = new ArrayList<Product>();
	List<Product> pctlt = new LinkedList<Product>();
	public static void main(String[] args) {

		ProductManager prdMaster = new ProductManager();
		Product prd1 = new Product(1, "Mobile", "Made in Japan", 1200000, "apple");

		prdMaster.addProduct(prd1);

		Product prd2 = new Product(2, "Earphone", "Made in India", 1250, "boat");

		prdMaster.addProduct(prd2);
		Product prd3 = new Product(3, "TV", "Smart Tv made in india", 25000, "samsung");

		prdMaster.addProduct(prd3);

		prdMaster.listProduct();
		prdMaster.searchProduct("TV");
		prdMaster.searchByPrice(10000);
	}

	public void addProduct(Product prd) {
		System.out.println("AddProduct");
		pctlt.add(prd);
	}

	public void listProduct() {
		System.out.println("Product List");

		for (Product prd : pctlt) {
			String info = prd.information();
			System.out.println(info);
		}
	}

	public void searchProduct(String productname) {
		System.out.println(" Product for Search ");
		boolean isFound = false;
		for (Product prd : pctlt) {
			if (prd.getName().equals(productname)) {
				isFound = true;
				System.out.println(productname + "Found : Its details ::" + prd.information());
			}
		}
		if (!isFound)
			System.out.println(productname + "is not found");

	}

	public void searchByPrice(double price) {
		System.out.println(" SearchByPrice ");
		boolean isFound = false;
		for (Product prd : pctlt) {
			if (prd.getPrice()>price) {
				isFound = true;
				System.out.println("Found : Its details ::" + prd.information());
			}
		}
		if (!isFound)
			System.out.println(" not found");

	}

}
