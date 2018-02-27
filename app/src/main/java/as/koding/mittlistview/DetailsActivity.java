package as.koding.mittlistview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        int position = intent.getIntExtra("position", 0);

        ArrayList<Person> personList = PersonList.personList;
        Person person = personList.get(position);

        TextView fornavn = findViewById(R.id.fornavn);
        TextView etternavn = findViewById(R.id.etternavn);
        TextView adresse = findViewById(R.id.adresse);
        TextView telefon = findViewById(R.id.telefon);

        fornavn.setText(person.getFornavn());
        etternavn.setText(person.getEtternavn());
        adresse.setText(person.getAddresse());
        telefon.setText(person.getTelefon());
    }
}
