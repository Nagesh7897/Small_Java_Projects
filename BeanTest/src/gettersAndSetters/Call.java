package gettersAndSetters;

public class Call {

	public static void main(String[] args) {
		
		Vegitables vegitable= new Vegitables();
		vegitable.setVegitableName("Mango");
		vegitable.setQuantity(12);
		vegitable.setPrice(100);
		vegitable.setType("Fruit");
		
		System.out.println(vegitable.getVegitableName()+"   "+vegitable.getQuantity()+"   "+vegitable.getPrice()+"   "+vegitable.getType());

	}

}
