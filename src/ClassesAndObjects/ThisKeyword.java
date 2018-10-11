package ClassesAndObjects;

public class ThisKeyword {

    String userName;

    public ThisKeyword() {
        this("Anonymous");
    }

    public ThisKeyword(String userName) {
        this.userName = userName;
    }

    public void welcomeUser() {
        System.out.println("Welcome to the platform, " + userName);
    }

    public static void main(String[] args) {
        ThisKeyword obj1 = new ThisKeyword("Hardik");
        ThisKeyword obj2 = new ThisKeyword("Mayur");

        obj1.welcomeUser();
        obj2.welcomeUser();
    }

}
