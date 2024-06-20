public class Greeter {
    public static void greet(String name) {
        if (name == null) {
            throw new RuntimeException("Invalid Name!");
        }
        System.out.println("Hello, " + name + "!");
    }

    public static void greet(String fname, String lname) {
        if (fname == null || lname == null) {
            throw new RuntimeException("Invalid Name!");
        }
        System.out.printf("Hello %s %s!\n", fname, lname);
    }
}
