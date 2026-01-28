// static = modifier. A single copy of a variable/method is created and shared.
//			The class "owns" the static member
//          if we put static in front of a variable that variable is shared by everything in the class.
//          if we comare it to python it is like class variable but not exactly the same.

class Friends {
    String name;
    static int No_of_friends;

    Friends(String name) {
        this.name = name;
        No_of_friends ++ ;
    }
    static void totalFriends() {
        System.out.println("You have " +No_of_friends+ " friends.");
    }
}

public class Static_Keyword {
    public static void main(String[] args) {
        Friends friend_1 = new Friends("Spongebob");
        Friends friend_2 = new Friends("Patrik");
        Friends friend_3 = new Friends("Squidward");

        Friends.totalFriends();
        System.out.println(friend_1.name);
        System.out.println(friend_2.name);
        System.out.println(friend_3.name);
    }
}
