package learn;

public class Human {
    public String name;
    public boolean isDrunken;
    public static boolean isDying = true;

    public Human(String name, boolean isDrunken) {
        this.name = name;
        this.isDrunken = isDrunken;
    }

    public static void history() {
    }

    public void drink(String str) {
        isDrunken = true;
    }

    static void god() {
        System.out.println("god!!!");
    }

}
