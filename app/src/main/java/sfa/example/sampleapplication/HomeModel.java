package sfa.example.sampleapplication;

/**
 * Created by HP on 11/06/2017.
 */

public class HomeModel {

    public int image;
    public String songName;
    public String postedTime;
    public String description;

    public HomeModel(int image, String songName, String postedTime, String description) {
        this.image = image;
        this.songName = songName;
        this.postedTime = postedTime;
        this.description = description;
    }

}
