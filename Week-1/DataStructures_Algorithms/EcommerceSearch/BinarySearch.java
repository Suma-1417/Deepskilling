
import java.util.Arrays;


public class BinarySearch {
    public static int search(Product[] products, String name) {
        Arrays.sort(products, (a, b) -> a.name.compareTo(b.name));
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].name.compareTo(name);

            if (cmp == 0) return mid;
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
