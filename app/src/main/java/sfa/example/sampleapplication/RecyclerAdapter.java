package sfa.example.sampleapplication;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by HP on 11/06/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.PersonViewHolder> {

    private Context context;

    public static class PersonViewHolder extends RecyclerView.ViewHolder {

        TextView mtxtSongName, mtxtTime, mtxtDescription;
        ImageView mimgSong;

        PersonViewHolder(View itemView) {
            super(itemView);
            mtxtSongName = (TextView) itemView.findViewById(R.id.txtSongName);
            mtxtTime = (TextView) itemView.findViewById(R.id.txtTime);
            mtxtDescription = (TextView) itemView.findViewById(R.id.txtDescription);
            mimgSong = (ImageView) itemView.findViewById(R.id.imageSong);
        }
    }

    List<HomeModel> homeModels;

    public RecyclerAdapter(Context context, List<HomeModel> homeModels) {
        this.context = context;
        this.homeModels = homeModels;
    }


    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_adapter, viewGroup, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }

    public void onBindViewHolder(PersonViewHolder personViewHolder, final int i) {

        personViewHolder.mtxtSongName.setText(homeModels.get(i).songName);
        personViewHolder.mtxtTime.setText(homeModels.get(i).postedTime);
        personViewHolder.mtxtDescription.setText(homeModels.get(i).description);
        personViewHolder.mimgSong.setImageResource(homeModels.get(i).image);

    }

    @Override
    public int getItemCount() {
        return homeModels.size();
    }

}

