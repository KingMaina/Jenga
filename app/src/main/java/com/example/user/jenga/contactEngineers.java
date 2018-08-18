package com.example.user.jenga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class contactEngineers extends AppCompatActivity {
    List<Engineers> engineersList;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_engineers);
        engineersList=new ArrayList<>();
//        add items into list
        engineersList.add(new Engineers(R.drawable.jessy,"Jessy Kagwa","Mombasa","+254722334455"));
        engineersList.add(new Engineers(R.drawable.hermoine,"Miriam Muriuri","CBD,Nairobi","+254722334455"));
        engineersList.add(new Engineers(R.drawable.ernest,"Andrew Maina","Lamu","+254722334455"));
        engineersList.add(new Engineers(R.drawable.angela,"Angela Mamuyu","Nyeri","+254722334455"));
        engineersList.add(new Engineers(R.drawable.abu,"Hype Ballo","Westlands,Nairobi","+254722334455"));
        listView = findViewById(R.id.list3);
        EngineerAdapter adapter = new EngineerAdapter(this,R.layout.engineer,engineersList);
        listView.setAdapter(adapter);
    }
}
