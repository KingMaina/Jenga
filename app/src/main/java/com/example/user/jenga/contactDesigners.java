package com.example.user.jenga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class contactDesigners extends AppCompatActivity {
    List<Designers> designersList;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        designersList = new ArrayList<>();
        designersList.add(new Designers(R.drawable.jessy,"Benson  Wafula","Nairobi","+254722660303"));
        designersList.add(new Designers(R.drawable.kenye,"Linus Maina","Kisumu","+254725771931"));
        designersList.add(new Designers(R.drawable.lorraine,"Rose Maina","Kakamega","+254711847016"));
        designersList.add(new Designers(R.drawable.rehema,"Reshy Munyoki","Nakuru","+254723111225"));
        designersList.add(new Designers(R.drawable.thot,"Mary Abutia","Naivasha","+254723111226"));
        listView = findViewById(R.id.list2);
        DesignerAdapter adapter = new DesignerAdapter(this,R.layout.designer,designersList);
        listView.setAdapter(adapter);
    }
}
