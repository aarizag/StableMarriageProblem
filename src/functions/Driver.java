package functions;
import People.Person;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Person> men = new ArrayList<>();
        ArrayList<Person> women = new ArrayList<>();
        for (int i = 0 ; i < 10 ; i++) {
            men.add(new Person());
            System.out.println(men.get(i));
            women.add(new Person());
        }

        for (Person p : men) {
            p.makePreferences(women);
        }
        for (Person p : women){
            p.makePreferences(men);
        }

        for (int i = 0 ; i < men.size() ; i++) {
            System.out.println("Man #" + i + ": ");
            men.get(i).printPreferences();
        }

    }
}
