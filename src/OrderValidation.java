public class OrderValidation {

    public static boolean validateOrder(Order order) {
        for (OrderItem item : order.getOrderItems()) {
            Product product = item.getProduct();
            if (product.getQuantity() < item.getQuantity()) {
                return false;
            }
        }
        return true;
    }
}