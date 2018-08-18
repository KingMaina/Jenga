package com.example.user.jenga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class contactRecruit extends AppCompatActivity {

    List<Recruit> recruitList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_recruit);

        recruitList = new ArrayList<>();
        recruitList.add(new Recruit(R.drawable.red,"Jawabu Consultancy","Nairobi,Kenya","02054687978"));
        recruitList.add(new Recruit(R.drawable.yellow,"Datum Recruitment","Mombasa,Kenya","+2541234567"));
        recruitList.add(new Recruit(R.drawable.images,"Africana Recruits","Nyeri,Kenya","02054687976"));
        recruitList.add(new Recruit(R.drawable.trucks,"Devki Employers","Kisumu,Kenya","020796787978"));
        listView = (ListView) findViewById(R.id.list5);
        RecruitmentAdapter adapter= new RecruitmentAdapter(this,R.layout.recruitment,recruitList);
        listView.setAdapter(adapter);
    }
}
