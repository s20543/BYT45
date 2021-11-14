public class Final {
    public static void main(String[] args) {

        User robert = new User("Alex");
        User john = new User("Sebastian");

        robert.sendMessage("Hi!");
        john.sendMessage("Welcome to our chat!");
    }
}