public class Main {
    public static void main(String[] args) {
        String name = "You!!";
        // Check to see if an argument was provided
        if (args.length > 0) {
            name = args[0];
        }

        System.out.println("Hello "+name+"!");
    }
}