public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mobile", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Book", "Education")
        };

        int searchId = 104;

        // Linear Search
        Product p1 = SearchOperations.linearSearch(products, searchId);

        if (p1 != null) {
            System.out.println("Linear Search Found:");
            System.out.println(p1.productId + " " + p1.productName);
        }

        // Binary Search
        Product p2 = SearchOperations.binarySearch(products, searchId);

        if (p2 != null) {
            System.out.println("Binary Search Found:");
            System.out.println(p2.productId + " " + p2.productName);
        }
    }
}