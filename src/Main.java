public class Main {
    public static void main(String[] args) {
        double price = 499.99;
        double tax = 4.99;
        int quantity  = 10;
        double total = 0;
        String message = "I want to buy " + quantity + " shirts!";
        System.out.println(message);
        total = price * quantity * tax;
        System.out.println("Total cost with tax is " + total);
    }
}