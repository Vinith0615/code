//Exercise(interface & packages
import java.util.ArrayList;

import java.util.ArrayList;

public class NameList {
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<>();

        
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");
        names.add("Ethan");

        
        names.remove("Charlie");

        
        System.out.println("Final list of names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}