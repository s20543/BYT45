public class User {
    private String name;

    public String getName() {
        return name;
    }
    public User(String name){
        this.name  = name;
    }
    public void sendMessage(String message){
        Chat.showMessage(this,message);
    }
}