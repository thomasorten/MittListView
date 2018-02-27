package as.koding.mittlistview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Ola", "Nordmann"));
        personList.add(new Person("Kari", "Nordmann"));
        personList.add(new Person("Titten", "Tei"));
        personList.add(new Person("Arnold", "Schwarz"));
        personList.add(new Person("Ola", "Nordmann"));
        personList.add(new Person("Kari", "Nordmann"));
        personList.add(new Person("Titten", "Tei"));
        personList.add(new Person("Arnold", "Schwarz"));
        personList.add(new Person("Ola", "Nordmann"));
        personList.add(new Person("Kari", "Nordmann"));
        personList.add(new Person("Titten", "Tei"));
        personList.add(new Person("Arnold", "Schwarz"));
        personList.add(new Person("Ola", "Nordmann"));
        personList.add(new Person("Kari", "Nordmann"));
        personList.add(new Person("Titten", "Tei"));
        personList.add(new Person("Arnold", "Schwarz"));

        ListView listView = (ListView)findViewById(R.id.listView);
        ListeAdapter adapter = new ListeAdapter(this, R.layout.list_item, personList);
        listView.setAdapter(adapter);
    }



}
