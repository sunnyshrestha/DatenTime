package dev.suncha.datentime;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Sunny on 1/8/2015.
 * http://www.myandroidsolutions.com/2014/07/21/android-l-recyclerview-tutorial/ <----------this one
 */
public class MyCustomAdapter extends RecyclerView.Adapter<MyCustomAdapter.ViewHolder>implements View.OnClickListener,View.OnLongClickListener {

    private ArrayList<String> mDataset;
    private static Context sContext;

    // Adapter's Constructor
    public MyCustomAdapter(Context context, ArrayList<String> myDataset) {
        mDataset = myDataset;
        sContext = context;
    }

    @Override
    public MyCustomAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_row, parent, false);
        ViewHolder holder = new ViewHolder(v);
        holder.title.setOnClickListener(MyCustomAdapter.this);
        holder.title.setOnLongClickListener(MyCustomAdapter.this);

        holder.title.setTag(holder);

        return holder;

    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        if(i==0){


    }



    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public boolean onLongClick(View v) {
        return false;
    }

    // Create the ViewHolder class to keep references to your views
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView image;
        public TextView title;

        /**
         * Constructor
         * @param v The container view which holds the elements from the row item xml
         */
        public ViewHolder(View v) {
            super(v);

            image = (ImageView) v.findViewById(R.id.image);
            title = (TextView) v.findViewById(R.id.title);
        }
    }
}
}
