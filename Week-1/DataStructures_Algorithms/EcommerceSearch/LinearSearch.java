public class LinearSearch {
    public static int search(Product[] products, String name) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].name.equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
