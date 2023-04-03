import java.util.LinkedList;

/*
 * This information system is popular in multiple businesses, where we need to control product inventory stocking and purchasing.
 *  In this project, you will manage various products and warehouses. Each warehouse will stock a different set of products. You 
 *  need to have a user-friendly form to manage the general product information (add, modify, delete) and another form to manage 
 *  each warehouse's inventory stock. Another form to enter product order verifies if each product has enough inventory (quantity). 
 *  If the product order is approved, the inventory of those ordered products is updated.
 */
//warehouse ID, name, location
public class specWarehouse {
	private int id;
	private String name;
	
	LinkedList<invItem> inv = new LinkedList();
	
	public specWarehouse(int id, String name) {//need input of product list, can input a null list which will then be accessed and modified after creation
		id=this.id;
		name=this.name;	
	}
	//getter/setters - need maybe a get/set for the list once implemented
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
}
