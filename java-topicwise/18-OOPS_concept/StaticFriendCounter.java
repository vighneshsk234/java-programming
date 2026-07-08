class Friend {

    String name;

    // Static variable shared by all objects
    static int numberOfFriends = 0;

    // Constructor
    Friend(String name) {
        this.name = name;
        numberOfFriends++;
    }

    // Instance method
    void displayFriend() {
        System.out.println("Friend Name: " + name);
    }

    // Static method
    static void displayTotalFriends() {
        System.out.println("Total Friends: " + numberOfFriends);
    }
}

public class StaticFriendCounter {

    public static void main(String[] args) {

        Friend friend1 = new Friend("Vighnesh");
        Friend friend2 = new Friend("Rahul");
        Friend friend3 = new Friend("Priya");
        Friend friend4 = new Friend("Amit");

        friend1.displayFriend();
        friend2.displayFriend();
        friend3.displayFriend();
        friend4.displayFriend();

        System.out.println();

        // Calling static method using the class name
        Friend.displayTotalFriends();
    }
}