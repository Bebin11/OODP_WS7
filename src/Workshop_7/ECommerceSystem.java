package Workshop_7;

import java.util.HashMap;


public class ECommerceSystem {

    public static void main(String[] args) {
        Customer customer = new Customer(1, "Bebin", "bebinjungthapa@email.com", "");
        Product product = new Product(101, "Laptop", 75000, 5);

        customer.viewProducts();
        customer.addToCart(product, 1);
        customer.checkout();
    }
}

class Customer {
    private int customerId;
    private String name;
    private String email;
    private String password;
    private ShoppingCart cart;

    public Customer(int customerId, String name, String email, String password) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.cart = new ShoppingCart();
    }

    public void register() {
        System.out.println("Customer registered successfully.");
    }

    public void login() {
        System.out.println("Customer logged in.");
    }

    public void viewProducts() {
        System.out.println("Displaying available products.");
    }

    public void addToCart(Product product, int quantity) {
        cart.addProduct(product, quantity);
    }

    public void checkout() {
        cart.calculateTotalPrice();
        System.out.println("Checkout completed.");
    }
}

class Product {
    int productId;
    String name;
    double price;
    int stockQuantity;

    public Product(int productId, String name, double price, int stockQuantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public void getDetails() {
        System.out.println(name + " - Price: " + price);
    }

    public boolean checkAvailability() {
        return stockQuantity > 0;
    }
}

class ShoppingCart {
    private HashMap<Product, Integer> cartItems = new HashMap<>();
    private double totalPrice;

    public void addProduct(Product product, int quantity) {
        cartItems.put(product, quantity);
        System.out.println("Product added to cart.");
    }

    public void removeProduct(Product product) {
        cartItems.remove(product);
        System.out.println("Product removed from cart.");
    }

    public void calculateTotalPrice() {
        totalPrice = 0;
        for (Product p : cartItems.keySet()) {
            totalPrice += p.price * cartItems.get(p);
        }
        System.out.println("Total Price: " + totalPrice);
    }

    public void viewCartItems() {
        System.out.println("Items in cart: " + cartItems.size());
    }
}

