import java.util.*;

class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return productId + " - " + productName + " [" + category + "]";
    }
}

public class ProductSearch {

    public static Product linearSearch(Product[] products, String productName) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(productName)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String productName) {
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = productName.compareToIgnoreCase(products[mid].productName);

            if (comparison == 0)
                return products[mid];
            else if (comparison < 0)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Footwear"),
            new Product(103, "Watch", "Accessories"),
            new Product(104, "Mobile", "Electronics"),
            new Product(105, "Tablet", "Electronics")
        };

        // Linear Search
        String searchName = "Watch";
        Product result1 = linearSearch(products, searchName);
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not Found"));

        // Binary Search (requires sorted array)
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
        Product result2 = binarySearch(products, searchName);
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not Found"));
    }
}
