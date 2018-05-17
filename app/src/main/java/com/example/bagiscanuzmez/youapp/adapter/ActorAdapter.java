package com.example.bagiscanuzmez.youapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.bagiscanuzmez.youapp.DetailActivity;
import com.example.bagiscanuzmez.youapp.R;
import com.example.bagiscanuzmez.youapp.model.Actor;
import com.example.bagiscanuzmez.youapp.model.Movie;

import java.util.List;

/**
 * Created by bagiscanuzmez on 15.05.2018.
 */


//package com.example.bagiscanuzmez.youapp.adapter;

        import android.content.Context;
        import android.content.Intent;
        import android.support.v7.widget.RecyclerView;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;
        import android.widget.Toast;

        import com.bumptech.glide.Glide;
        import com.example.bagiscanuzmez.youapp.DetailActivity;
        import com.example.bagiscanuzmez.youapp.R;
        import com.example.bagiscanuzmez.youapp.model.Movie;

        import java.util.List;

/**
 * Created by bagiscanuzmez on 12.05.2018.
 */

/**
 *
 * This is the ActorAdapter java class. It's job is to take data from the API using the
 * Service interface in api folder. It used to based on movie adapter, therefore some parts
 * are on movie materials, like movie card.xml .
 *
 * */


public class ActorAdapter extends RecyclerView.Adapter<ActorAdapter.MyViewHolder>{

    private Context mContext;
    private List<Actor> actorList;

    public ActorAdapter(Context mContext, List<Actor> actorList){
        this.mContext = mContext;
        this.actorList = actorList;
    }

    public void setFilter(String s){
        List<Actor> newList = actorList;
        newList.clear();
        for(int listSize = 1; listSize<=actorList.size(); listSize++){
            if(actorList.get(listSize).getName().indexOf(s) > 0){
                newList.add(actorList.get(listSize));
            }
        }
        actorList = newList;
    }


    /**
     * In order to get view on movie_card
     * */
    @Override
    public ActorAdapter.MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.movie_card, viewGroup, false);
        return new MyViewHolder(view);
    }

    /**
     * In order to get view on movie_card
     * */
    @Override
    public void onBindViewHolder(final ActorAdapter.MyViewHolder viewHolder, int i){
        viewHolder.title.setText(actorList.get(i).getName());
      //  System.out.println("Original title is here " + actorList.get(i).getOriginalTitle());
        String popularity = Double.toString(actorList.get(i).getPopularity());
        System.out.println("Vote is here " + popularity);
        viewHolder.userrating.setText(popularity);

        Glide.with(mContext)
                .load(actorList.get(i).getProfilePath())
                .placeholder(R.drawable.load)
                .into(viewHolder.thumbnail);

    }

    /**
     * This part is the insertion part of the datas from the API
     * */
    @Override
    public int getItemCount(){
        return actorList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView title, userrating;
        public ImageView thumbnail;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            userrating = (TextView) view.findViewById(R.id.userrating);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
            view.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    int pos = getAdapterPosition();
                    if(pos != RecyclerView.NO_POSITION){
                        Actor clickedDataItem = actorList.get(pos);
                        Intent intent = new Intent(mContext, DetailActivity.class);
                        intent.putExtra("original_title", actorList.get(pos).getName());
                        intent.putExtra("poster_path", actorList.get(pos).getProfilePath());
                     //   intent.putExtra("overview", actorList.get(pos).getOverview());
                        intent.putExtra("vote_average", Double.toString(actorList.get(pos).getPopularity()));
                       // intent.putExtra("release_date", actorList.get(pos).getReleaseDate());
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        mContext.startActivity(intent);
                        Toast.makeText(v.getContext(), "You clicked" + clickedDataItem.getName(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}
