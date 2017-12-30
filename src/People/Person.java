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

    }
    private ArrayList<Person> shuffleList(ArrayList<Person> s){
        final int size = s.size();
        int rand;
        for (int i = 0; i < s.size(); i++){
            rand = ((int)Math.random() * size);

        }
        return null;
    }
}
