

public class TestLogger {
    public static void main(String[] args) {
        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();    

        l1.log("First log entry");
        l2.log("Second log entry");

        if (l1 == l2) {
            System.out.println("Only one Logger instance exists.");
        } else {
            System.out.println("Multiple Logger instances exist.");
        }
    
    }
}
//output:
// LOG: First log entry
// LOG: Second log entry
// Only one Logger instance exists.