package ado.edu.intec.layoutsapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);

      //  TextView textView = (TextView) findViewById(R.id.textView1);

        //Construct the data source
        ArrayList<User> arrayofUsers = new ArrayList<User>();
        //Populate the adapter
        for (int i=0;i<100;i++) {
            arrayofUsers.add(new User("Juan"+ i, "Santo Domingo" + 2*i));
        }
        //Create the adapter to convert the array views
        UserAdapter adapter = new UserAdapter(CustomAdapterActivity.this, arrayofUsers);
        //Attach the adapter to a ListView
        ListView listViewW = (ListView) findViewById(R.id.listViewCustom);
        listViewW.setAdapter(adapter);
    }
}
