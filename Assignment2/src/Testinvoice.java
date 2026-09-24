
class Test {
	private String part_number;
	private String part_description;
	private int quantity;
	private int price_per_item;
	
	Test() {
		this.part_number = " ";
		this.part_description = " ";
		this.quantity = 0;
		this.price_per_item = 0;
		
	}
	
	Test(String part_number, String part_description, int quantity, int price_per_item) {
		this.part_number = part_number;
		this.part_description = part_description;
		this.quantity = quantity;
		this.price_per_item = price_per_item;
		
	}
	
	void set_part_number(String part_number) {
		this.part_number = part_number;
	}
	
	String get_part_number() {
		return this.part_number;
	}
	
	void set_part_description(String part_description) {
		this.part_description = part_description;
	}
	
	String get_part_desccription() {
		return this.part_description;
	}
	
	void set_quantity(int quantity) {
		if(quantity < 0) {
			this.quantity = 0;
		}
		else
		this.quantity = quantity;
	}
	
	int get_quantity() {
		return this.quantity;
	}
	
	void set_price_per_item(int price_per_item) {
		if(price_per_item < 0) {
			this.price_per_item = 0;
		}
		else
		this.price_per_item = price_per_item;
	}
	
	int get_price_per_item() {
		return this.price_per_item;
	}
}

public class Testinvoice{
	  public static void main(String[] args) {
	    	 Test t = new Test();
	    	 t.set_price_per_item(-200);
	    	 t.set_quantity(2);
	    	 
	    	 System.out.println(t.get_price_per_item() * t.get_quantity());
	     }
}
