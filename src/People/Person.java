package People;

import functions.StringFunctions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Person {
    static int count;
    static StringFunctions sf = new StringFunctions();
    private Integer id;
    private String name;
    Map<Integer, Person> preferredSpouse;

    public Person(){
        this.name = sf.randomName();
        this.id = count;
        count++;
        this.preferredSpouse = new HashMap<Integer, Person>();
    }

    public void makePreferences(ArrayList<Person> spouses) {
        ArrayList<Person> s = shuffleList(spouses);
        for (int i = 0 ; i < s.size() ; i++) {
            this.preferredSpouse.put(i, s.get(i));
        }
    }


    private ArrayList<Person> shuffleList(ArrayList<Person> s){
        final int size = s.size();
        int rand;
        Person p;
        for (int i = 0; i < s.size(); i++){
            rand = (int)(Math.random() * size);
            p = s.get(rand);
            s.set(rand, s.get(i));
            s.set(i, p);
        }
        return s;
    }

    public void printPreferences() {
        if (preferredSpouse.isEmpty()) {
            return;
        }
        else {
            for (int i = 0 ; i < preferredSpouse.size() ; i++) {
                Person p = preferredSpouse.get(i);
                System.out.println(i + " " + p);
            }
        }
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "ID: " + this.id + ", NAME: " + this.name;
    }

}
