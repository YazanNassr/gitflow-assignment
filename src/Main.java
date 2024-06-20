public class Main {
    public static void main(String[] args) {
        Greeter.greet("Dear", "Guest");
        Calendar calendar = new Calendar();
        System.out.printf("Today's date is: %s\n", calendar.getTodaysDate());
    }
}
