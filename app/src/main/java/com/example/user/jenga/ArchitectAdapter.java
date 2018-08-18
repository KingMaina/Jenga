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

class ArchitectAdapter extends ArrayAdapter<Architects> {
    Context mCtxArchitect;
    int resourceArchitect;
    List<Architects> architectsList ;

    public ArchitectAdapter(@NonNull Context mCtxArchitect, @LayoutRes int resourceArchitect, @NonNull List<Architects> architectsList) {
        super(mCtxArchitect, resourceArchitect, architectsList);

        this.mCtxArchitect = mCtxArchitect;
        this.resourceArchitect = resourceArchitect;
        this.architectsList = architectsList;

    }

    @NonNull
    @Override
    public View getView(int position,  @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(mCtxArchitect);
        View view = inflater.inflate(R.layout.architect,null);

        TextView name = view.findViewById(R.id.textArchitect);
        TextView location = view.findViewById(R.id.textArchitect2);
        ImageView pic = view.findViewById(R.id.circleArchitect);
        final Architects architects =  architectsList.get(position);


        name.setText(architects.getNameArchitect());
        location.setText(architects.getLocationArchitect());
        pic.setImageDrawable(mCtxArchitect.getResources().getDrawable(architects.getImageArchitect()));
        view.findViewById(R.id.buttonArchitect).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent call = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",architects.getPhoneNumberArchitect(), null));
                mCtxArchitect.startActivity(call);
            }
        });
        return view;
    }
}
