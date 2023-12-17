package secondColloqium.Task11;

public class Product {
    private String name;
    private double price;
    private ShoppingCart shoppingCart;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void addToShoppingCart(ShoppingCart cart) {
        this.shoppingCart = cart;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private String customerName;
    private Product[] products;
    private int productCount;

    public ShoppingCart(String customerName, int capacity) {
        this.customerName = customerName;
        this.products = new Product[capacity];
        this.productCount = 0;
    }

    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount] = product;
            product.addToShoppingCart(this);
            productCount++;
            System.out.println("Dodano produkt do koszyka: " + product.getName());
        } else {
            System.out.println("Koszyk jest pełny, nie można dodać więcej produktów.");
        }
    }

    public void displayProducts() {
        System.out.println("Zawartość koszyka dla klienta " + customerName + ":");
        for (int i = 0; i < productCount; i++) {
            System.out.println(products[i].getName() + " - Cena: " + products[i].getPrice() + " zł");
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart("John Doe", 3);

        Product product1 = new Product("Laptop", 2999.99);
        Product product2 = new Product("Smartphone", 1299.99);
        Product product3 = new Product("Headphones", 199.99);

        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        cart.displayProducts();
    }
}
