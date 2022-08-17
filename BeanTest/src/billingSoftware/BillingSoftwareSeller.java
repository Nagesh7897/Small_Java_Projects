package billingSoftware;

import java.util.Scanner;

public class BillingSoftwareSeller {

	public Object[] addProduct() {
		
		Model model=new Model();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter Number of object you want to list");
		int n =scanner.nextInt();
		Object a[]= new Object[n];
		
		for(int i=0; i<n; i++) {
	
		System.out.println("Enter Product Code");
		int productCode=scanner.nextInt();
		model.setProductCode(productCode);
		
		System.out.println("Enter Product Name");
		String ProductName=scanner.next();
		model.setName(ProductName);
		
		System.out.println("Enter product Description");
		String ProductDes=scanner.next();
		model.setProductDes(ProductDes);
		
		System.out.println("Enter product Category");
		String ProductCt=scanner.next();
		model.setCategory(ProductCt);
		
		System.out.println("Enter Product Price");
		int productprice=scanner.nextInt();
		model.setPrice(productprice);
		
		System.out.println("Enter Product Quantity");
		int productQuant=scanner.nextInt();
		model.setQuantity(productQuant);
		
//		System.out.println("Total Bill : ");
//		model.setBill(productprice*productQuant);
		
		System.out.println(model.getProductCode()+"   "+model.getName()+"   "+model.getProductDes()+"   "+model.getCategory()+"   "+model.getPrice()+"     "+model.getQuantity()+"   "+model.getBill());
	
	}
		
		Object[] x = a; 
		scanner.close();
	return x;
	
	}

}
