public class NullPointerDemo {
    public static void main(String[] a) {
        String t = null;
        try {
            System.out.println(t.length());
        } catch (NullPointerException e) {
            System.out.println("Handled");
        }
    }
}