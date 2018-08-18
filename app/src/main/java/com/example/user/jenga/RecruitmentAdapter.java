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
 * Created by user on 16/08/2018.
 */

class RecruitmentAdapter extends ArrayAdapter<Recruit>{
    Context mCtxRecruit;
    int resourceRecruit;
    List<Recruit> recruitList;

    public RecruitmentAdapter( @NonNull Context mCtxRecruit, @LayoutRes int resourceRecruit, @NonNull List<Recruit> recruitList) {
        super(mCtxRecruit, resourceRecruit, recruitList);
        this.mCtxRecruit = mCtxRecruit;
        this.recruitList = recruitList;
        this.resourceRecruit = resourceRecruit;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(mCtxRecruit);
        View view = inflater.inflate(R.layout.recruitment,null);

        TextView name = view.findViewById(R.id.textRecruit);
        TextView location = view.findViewById(R.id.textRecruit2);
        ImageView pic = view.findViewById(R.id.circleRecruit);
        final Recruit recruit =  recruitList.get(position);

        name.setText(recruit.getNameRecruit());
        location.setText(recruit.getLocationRecruit());
        pic.setImageDrawable(mCtxRecruit.getResources().getDrawable(recruit.getImageRecruit()));
        view.findViewById(R.id.buttonRecruit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent call = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",recruit.getPhoneNumberRecruit(), null));
                mCtxRecruit.startActivity(call);
            }
        });
        return view;
    }
}
