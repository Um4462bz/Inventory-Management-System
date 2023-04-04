


	import java.util.ArrayList;

	public class Warehouse {
	    private int id;
	    private String name;
	    private String location;
	    private ArrayList<Product> productList;

	    // Constructor
	    public Warehouse(int id, String name, String location) {
	        this.id = id;
	        this.name = name;
	        this.location = location;
	        this.productList = new ArrayList<Product>();
	    }

	    // Getters and Setters
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getLocation() {
	        return location;
	    }

	    public void setLocation(String location) {
	        this.location = location;
	    }

	    public ArrayList<Product> getProductList() {
	        return productList;
	    }

	    public void setProductList(ArrayList<Product> productList) {
	        this.productList = productList;
	    }

	    // Method to add a product to the warehouse's product list
	    public void addProduct(Product product) {
	        productList.add(product);
	    }

	    // Method to remove a product from the warehouse's product list
	    public void removeProduct(Product product) {
	        productList.remove(product);
	    }

	    // Method to modify the warehouse's information
	    public void modifyWarehouse(int id, String name, String location) {
	        setId(id);
	        setName(name);
	        setLocation(location);
	    }

		public String getName1() {
			// TODO Auto-generated method stub
			return null;
		}

		public int getWarehouseId() {
			// TODO Auto-generated method stub
			return 0;
		}
	}