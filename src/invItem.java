/*
 * This information system is popular in multiple businesses, where we need to control product inventory stocking and purchasing.
 *  In this project, you will manage various products and warehouses. Each warehouse will stock a different set of products. You 
 *  need to have a user-friendly form to manage the general product information (add, modify, delete) and another form to manage 
 *  each warehouse's inventory stock. Another form to enter product order verifies if each product has enough inventory (quantity). 
 *  If the product order is approved, the inventory of those ordered products is updated.
 */
public class invItem {
	//ID, name, description, price, and quantity.
	int ID;
	String name, desc;
	double price;
	int quantity;
	
	public invItem(String name, String desc, double price, int quantity) {//Constructor Method
		name =this.name;
		desc=this.desc;
		price=this.price;
		quantity=this.quantity;
	}
	//getter/setters
	public int getID() {return ID;}
	public void setID(int iD) {ID = iD;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getDescription() {return desc;}
	public void setDescription(String description) {this.desc = description;}
	public double getPrice() {return price;}
	public void setPrice(double price) {this.price = price;}
	public int getQuantity() {return quantity;}
	public void setQuantity(int quantity) {this.quantity = quantity;}
	
	@Override
	public String toString() {
		return "SKU: " + ID + ", Product: " + name + ", Description: " + desc + ", Price: " + price
				+ ", Count: " + quantity;
	}
}
