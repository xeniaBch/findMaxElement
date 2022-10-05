import maxElement.MaxElement;

public class Main {
    public static void main(String[] args) {
        MaxElement friendList = new MaxElement();
        friendList.addElement(4);
        friendList.addElement(8);
        friendList.addElement(10);
        friendList.addElement(3);
        friendList.addElement(6);

        System.out.println(friendList.getMax());
        friendList.removeLast();

        System.out.println(friendList.getMax());
        friendList.removeLast();

        System.out.println(friendList.getMax());
        friendList.removeLast();

        System.out.println(friendList.getMax());
        friendList.removeLast();

        System.out.println(friendList.getMax());


    }

}
