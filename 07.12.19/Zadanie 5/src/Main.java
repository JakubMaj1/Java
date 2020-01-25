//package Zadanie5;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        People people = new People(23 , "Lukasz");
        People people1 = new People( 22 , "Anna");
        People samePerson = new People(23,"Piotr");

        HashSet<People> hashSet = new HashSet<>();
        hashSet.add(people);
        hashSet.add(people1);
        hashSet.add(samePerson);

        for (People peopleTemp:hashSet) {
            System.out.println(peopleTemp.hashCode());
            System.out.println(peopleTemp.equals(people));
        }

        TreeSet<People>treeSetPeople = new TreeSet<>();

        treeSetPeople.addAll(hashSet);
        treeSetPeople.comparator();

        for (People peopleTemp:treeSetPeople) {
            System.out.println(peopleTemp.wiek);
        }

        TreeSet<People>peopleTreeSet2 = new TreeSet<>();
        treeSetPeople.addAll(hashSet);
        treeSetPeople.comparator().reversed();


    }
}