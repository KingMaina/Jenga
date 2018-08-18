package com.example.user.jenga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class contactArchitects extends AppCompatActivity {
    List<Architects> architectsList;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_architects);

        architectsList = new ArrayList<>();
        architectsList.add(new Architects(R.drawable.rose,"Rose Wambui","Kitsuru","+254745678999"));
        architectsList.add(new Architects(R.drawable.noone,"Kimathi Lenard","Kiambu","+254745678999"));
        architectsList.add(new Architects(R.drawable.kenye,"Kenneth Kamau","Kasarani","+254745678999"));
        architectsList.add(new Architects(R.drawable.ruto,"William Ruto","Nairobi","+254745678999"));
        architectsList.add(new Architects(R.drawable.madowo,"LARRY Madowo","Karen,Nairobi","+254745678999"));
        listView = findViewById(R.id.list4);
        ArchitectAdapter adapter = new ArchitectAdapter(this,R.layout.architect,architectsList);
        listView.setAdapter(adapter);
    }
}
