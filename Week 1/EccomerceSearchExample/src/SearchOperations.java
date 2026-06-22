public class SearchOperations {

    // Linear Search
    public static Product linearSearch(Product[] products, int searchId) {

        for (int i = 0; i < products.length; i++) {

            if (products[i].productId == searchId) {
                return products[i];
            }
        }

        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int searchId) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (products[mid].productId == searchId) {
                return products[mid];
            }

            if (searchId > products[mid].productId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }
}