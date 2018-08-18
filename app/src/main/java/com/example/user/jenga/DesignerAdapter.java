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
import android.widget.Toast;

import java.util.List;


/**
 * Created by user on 15/08/2018.
 */

class DesignerAdapter extends ArrayAdapter<Designers> {
    Context mCtxDesign;
    int resourceDesign;
    List<Designers> listDesign;

    public DesignerAdapter(Context mCtxDesign, int resourceDesign, List<Designers> listDesign) {
        super(mCtxDesign, resourceDesign, listDesign);
        this.mCtxDesign = mCtxDesign;
        this.resourceDesign = resourceDesign;
        this.listDesign = listDesign;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(mCtxDesign);
        View view = inflater.inflate(R.layout.designer, null);

        TextView name = view.findViewById(R.id.textDesign);
        TextView location = view.findViewById(R.id.textDesign2);
        ImageView pic = view.findViewById(R.id.circleDesign);
        final Designers designers = listDesign.get(position);
        name.setText(designers.getNameDesign());
        location.setText(designers.getDescriptionDesign());
        pic.setImageDrawable(mCtxDesign.getResources().getDrawable(designers.getImagedesign()));
        view.findViewById(R.id.buttonDesign).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mCtxDesign, "Phone Is " + designers.getPhoneNumberDesign(), Toast.LENGTH_SHORT).show();
                Intent call = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", designers.getPhoneNumberDesign(), null));
                mCtxDesign.startActivity(call);
            }
        });
        return view;
    }
}

