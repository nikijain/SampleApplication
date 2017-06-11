package sfa.example.sampleapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class VideoFragment extends Fragment {

    private RecyclerView rv;
    private List<HomeModel> songList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_video, container, false);
        rv=(RecyclerView) view.findViewById(R.id.rvSongList);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);

        initializeData();
        initializeAdapter();
        return view;
    }

    private void initializeData(){
        songList = new ArrayList<>();
        songList.add(new HomeModel(R.drawable.demo_image,"EMPTINESS FT. JUSTIN TIBLEKAR", "18 HOURS AGO", "Lorem Ipsum is simply dummy text of the printing and typesetting industry."));
        songList.add(new HomeModel(R.drawable.demo_image,"I'M FALLING LOVE WITH U", "20 HOURS AGO", "Lorem Ipsum is simply dummy text of the printing and typesetting industry."));
        songList.add(new HomeModel(R.drawable.demo_image,"BABY FT. JUSTIN BABER", "8 HOURS AGO", "Lorem Ipsum is simply dummy text of the printing and typesetting industry."));
    }

    private void initializeAdapter(){
        RecyclerAdapter adapter = new RecyclerAdapter(getActivity(),songList);
        rv.setAdapter(adapter);
    }

}
