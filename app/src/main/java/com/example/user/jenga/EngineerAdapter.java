package com.example.user.jenga;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


/**
 * Created by user on 15/08/2018.
 */

class EngineerAdapter extends ArrayAdapter<Engineers>{
    Context mCtxEngineers;
    int resourceEngineer;
    List<Engineers> engineersList;

    public EngineerAdapter( @NonNull Context mCtxEngineers,  @NonNull int resourceEngineer, List<Engineers> engineersList) {
        super(mCtxEngineers, resourceEngineer,engineersList);
        this.mCtxEngineers = mCtxEngineers;
        this.resourceEngineer = resourceEngineer;
        this.engineersList = engineersList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(mCtxEngineers);
        View view = inflater.inflate(R.layout.engineer,null);
//        find by id
        TextView name = view.findViewById(R.id.textEngineer);
        TextView location = view.findViewById(R.id.textEngineer2);
        ImageView pic = view.findViewById(R.id.circleEngineer);

        final Engineers engineers = engineersList.get(position);
        name.setText(engineers.getNameEngineer());
        location.setText(engineers.getLocationEngineer());
        pic.setImageDrawable(mCtxEngineers.getResources().getDrawable(engineers.getImageEngineers()));
        view.findViewById(R.id.buttonEngineer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent call = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", engineers.getPhoneNumberEngineer(), null));
                mCtxEngineers.startActivity(call);
            }
        });
        return view;
    }
}
