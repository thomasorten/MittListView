package as.koding.mittlistview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by thomasorten on 20.02.2018.
 */

public class ListeAdapter extends ArrayAdapter<Person> {
    Context context;
    List<Person> personList;

    public ListeAdapter(Context context, int resourceId, List<Person> personList){

        super(context, resourceId, personList);
        this.context = context;
        this.personList = personList;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if(v == null){
            LayoutInflater vi;
            vi = LayoutInflater.from(this.context);
            v = vi.inflate(R.layout.list_item, null);
        }
        final Person person = this.personList.get(position);
        TextView t1 = (TextView)v.findViewById(R.id.fornavn);
        TextView t2 = (TextView)v.findViewById(R.id.etternavn);
        t1.setText(person.getFornavn());
        t2.setText(person.getEtternavn());

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailsActivity.class);
                intent.putExtra("position", position);
                context.startActivity(intent);
            }
        });

        return v;
    }
}
