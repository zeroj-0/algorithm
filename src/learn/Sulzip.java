package learn;

import java.util.List;

public class Sulzip {

    List<Human> humans;
    List<String> drinkMenu;

    public Sulzip(List<Human> humans, List<String> drinkMenu) {
        this.humans = humans;
        this.drinkMenu = drinkMenu;
    }

    void goldenBell(String drink) {
        for(Human human : humans) {
            human.drink("beer");
        }
    }

    void s() {
        Human human = new Human("bill", true);
        Human human2 = new Human("billy", true);
        Human human3 = new Human("silly", true);
        Human human5 = new Human("kim", false);

        Human.god();
        Human.history();
        boolean isDying = Human.isDying;

    }
}

