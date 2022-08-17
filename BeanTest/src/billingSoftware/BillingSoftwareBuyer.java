package billingSoftware;

import java.util.Scanner;

public class BillingSoftwareBuyer {

	public void buyer() {
		Model model=new Model();
		Scanner scanner=new Scanner(System.in);
		BillingSoftwareSeller bss=new BillingSoftwareSeller();
		
		Object[] y= bss.addProduct();
		for(int i=0; i<y.length; i++ ) 
		{
			System.out.println(model.getProductCode()+"   "+model.getName()+"   "+model.getProductDes()+"   "+model.getCategory()+"   "+model.getPrice()+"     "+model.getQuantity()+"   "+model.getBill());
		}
		
	}
	
	

}
