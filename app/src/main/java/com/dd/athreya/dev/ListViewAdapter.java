package com.dd.athreya.dev;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListViewAdapter extends BaseAdapter{
    Context context;
    String[] Version;
    LayoutInflater inflater;
    public ListViewAdapter(Context context, String[] mobile){
            this.context=context;
            this.Version=mobile;
        }

    public ListViewAdapter() {

            }

    public ListViewAdapter(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    public ListViewAdapter(String[] version) {

        Version = version;
    }

    @Override
    public int getCount() {
        return Version.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
            TextView textVersion;
            inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View itemView=inflater.inflate(R.layout.listitem,parent,false);
            textVersion=(TextView)itemView.findViewById(R.id.listitem);
            textVersion.setText(Version[position]);
            return itemView;
        }
    }
