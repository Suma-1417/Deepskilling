
public class SearchTest {

    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Fashion"),
            new Product(3, "Phone", "Electronics")
        };

        System.out.println("Linear Search result: " + LinearSearch.search(products, "Shoes"));
        System.out.println("Binary Search result: " + BinarySearch.search(products, "Shoes"));
    }
}

// output:
// Linear Search result: 1
// Binary Search result: 2
