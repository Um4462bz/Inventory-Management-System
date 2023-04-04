import java.util.LinkedList;

/*
 * This information system is popular in multiple businesses, where we need to control product inventory stocking and purchasing.
 *  In this project, you will manage various products and warehouses. Each warehouse will stock a different set of products. You 
 *  need to have a user-friendly form to manage the general product information (add, modify, delete) and another form to manage 
 *  each warehouse's inventory stock. Another form to enter product order verifies if each product has enough inventory (quantity). 
 *  If the product order is approved, the inventory of those ordered products is updated.
 */
public class tempMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<specWarehouse> Warehouses = new LinkedList();
		specWarehouse warehouse = new specWarehouse("1", "Warehouse 1");
		Warehouses.add(warehouse);
		invItem item1 = new invItem("Item 1", "Item 1 Description", 10.0, 5);
		invItem item2 = new invItem("Item 2", "Item 2 Description", 15.0, 8);
		warehouse.inv.add(item1);
		warehouse.inv.add(item2);
		System.out.println(warehouse.inv.get(1).toString());
		warehouse.inv.get(1).setPrice(20.0);
		System.out.println(warehouse.inv.get(1).toString());
		
	}
}
