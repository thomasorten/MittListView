package as.koding.mittlistview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private ArrayList<Person> personList = new ArrayList<Person>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new FetchDataAsync().execute("https://www.vegvesen.no/ws/no/vegvesen/veg/parkeringsomraade/parkeringsregisteret/v1/parkeringsomraade");

//        personList.add(new Person("Ola", "Nordmann"));
//        personList.add(new Person("Kari", "Nordmann"));
//        personList.add(new Person("Titten", "Tei"));
//        personList.add(new Person("Arnold", "Schwarz"));
//        personList.add(new Person("Ola", "Nordmann"));
//        personList.add(new Person("Kari", "Nordmann"));
//        personList.add(new Person("Titten", "Tei"));
//        personList.add(new Person("Arnold", "Schwarz"));
//        personList.add(new Person("Ola", "Nordmann"));
//        personList.add(new Person("Kari", "Nordmann"));
//        personList.add(new Person("Titten", "Tei"));
//        personList.add(new Person("Arnold", "Schwarz"));
//        personList.add(new Person("Ola", "Nordmann"));
//        personList.add(new Person("Kari", "Nordmann"));
//        personList.add(new Person("Titten", "Tei"));
//        personList.add(new Person("Arnold", "Schwarz"));
//
//        PersonList list = new PersonList(personList);

        ListView listView = (ListView)findViewById(R.id.listView);
        ListeAdapter adapter = new ListeAdapter(this, R.layout.list_item, personList);
        listView.setAdapter(adapter);

    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }
}
