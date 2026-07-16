
public class ArrayIndexDemo {
    public static void main(String[] a) {
        String[] n = {"A", "B"};
        try {
            System.out.println(n[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled");
        }
    }