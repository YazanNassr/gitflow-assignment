public class Greeter {
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void greet(String fname, String lname) {
        System.out.printf("Hello %s %s!\n", fname, lname);
    }
}
