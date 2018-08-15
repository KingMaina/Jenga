package com.example.user.jenga;

import android.content.Context;
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

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;


/**
 * Created by user on 15/08/2018.
 */

 class DesignerAdapter extends ArrayAdapter<Designers> {
    Context mCtxDesign;
    int resourceDesign;
    List<Designers> listDesign;

    public DesignerAdapter(@RecentlyNonNull @NonNull Context context, @LayoutRes int resource, @RecentlyNonNull @NonNull List<Designers> objects, Context mCtxDesign, int resourceDesign, List<Designers> listDesign) {
        super(context, resource, objects);
        this.mCtxDesign = mCtxDesign;
        this.resourceDesign = resourceDesign;
        this.listDesign = listDesign;
    }

    @NonNull
    @Override
    public View getView(int position, @RecentlyNullable @Nullable View convertView, @RecentlyNonNull @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(mCtxDesign);
        View view = inflater.inflate(R.layout.designer,null);

        TextView name = view.findViewById(R.id.textDesign2);
        TextView location = view.findViewById(R.id.textDesign2);
        ImageView

    }
}

