
package Zadanie3;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Person person = new Person();
        person.pesel = 881212345;
        person.imie = "Andrzej";
        Map<Integer, Person> mapPerson =new HashMap<Integer,Person>();
        mapPerson.put(person.pesel,person);

        Person findedPerson = mapPerson.get(881212345);
        System.out.println("Imie podanej osoby to " + findedPerson.imie + " pesel to " + findedPerson.pesel);
    }
}