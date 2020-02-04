package com.example.a4assignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.gson.JsonArray;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;

public class MyListAdapter extends ArrayAdapter<tiedonhaku> {

    private Context context;
    ArrayList<tiedonhaku> datalista;

    public MyListAdapter(@NonNull Context context, int resource,
                         @NonNull List<tiedonhaku> objects) {
        super(context, resource, objects);
        this.context = context;
        this.datalista = (ArrayList<tiedonhaku>) objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View v = layoutInflater.inflate(R.layout.omalayout, parent, false);
        LinearLayout linearLayout = (LinearLayout) v;
        TextView textViewTitle = v.findViewById(R.id.title);
        TextView textViewBody = v.findViewById(R.id.body);
        textViewTitle.setText((CharSequence)datalista.get(position));
        textViewBody.setText((CharSequence)datalista.get(position));

        return linearLayout;

    }
}
