package com.example.user.jenga;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Drawer extends AppCompatActivity {
    List<Here> listhere;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);
        listhere = new ArrayList<>();
        listhere.add(new Here(R.drawable.jessy,"Benson  Wafula","Nairobi","+254722660303"));
        listhere.add(new Here(R.drawable.kenye,"Linus Maina","Kisumu","+254725771931"));
        listhere.add(new Here(R.drawable.lorraine,"Rose Maina","Kakamega","+254711847016"));
        listhere.add(new Here(R.drawable.rehema,"Reshy Munyoki","Nakuru","+254723111225"));
        listhere.add(new Here(R.drawable.thot,"Mary Abutia","Naivasha","+254723111226"));
        listView = (ListView)findViewById(R.id.listview);
        ContractorAdapter adapter = new ContractorAdapter
                (this,R.layout.contractor,listhere);
        listView.setAdapter(adapter);

       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
/*            if (i==0) {
                Intent p=new Intent(getApplicationContext(),bamburibuy.class);
                startActivity(p);
            }*/
           }
       });

    }
}
