package as.koding.mittlistview;

import java.util.ArrayList;

/**
 * Created by thomasorten on 27.02.2018.
 */

public class PersonList {

    public static ArrayList<Person> personList = new ArrayList<Person>();

    public PersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
}
