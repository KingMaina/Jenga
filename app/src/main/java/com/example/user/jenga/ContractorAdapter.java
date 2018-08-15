package com.example.user.jenga;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by user on 10/08/2018.
 */

public class ContractorAdapter extends ArrayAdapter<Here> {
    Context mCtx;
    int resource;
    List<Here> listhere;
    public ContractorAdapter(Context mCtx,int resource,List<Here> listhere){
        super(mCtx,resource,listhere);
//        initialize varibales
        this.mCtx=mCtx;
        this.resource=resource;
        this.listhere = listhere;
    }
    //    override method to return view of all items on list
    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        we create a layout inflator to inflate the layout resource file
        LayoutInflater inflater = LayoutInflater.
                from(mCtx);
        View view = inflater.inflate(R.layout.contractor, null);

        TextView nameit = view.findViewById(R.id.textView2);
        TextView describeit = view.findViewById(R.id.textView3);
        CircleImageView picture = view.findViewById(R.id.circleImageView);
        Button btnContact=view.findViewById(R.id.button);
//    get objects based on position
        final Here here = listhere.get(position);
        nameit.setText(here.getName());
        describeit.setText(here.getDescription());
        picture.setImageDrawable(mCtx.getResources().getDrawable(here.getImage()));

        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mCtx, "Phone Is "+here.getPhoneNumber(), Toast.LENGTH_SHORT).show();
                Intent call = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",here.getPhoneNumber(),null));
                mCtx.startActivity(call);
            }
        });
        return view;
    }
}

