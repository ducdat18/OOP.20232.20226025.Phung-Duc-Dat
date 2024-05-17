package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

import hust.soict.globalict.aims.media.Disc;
import hust.soict.globalict.aims.media.Playable;
import hust.soict.globalict.aims.media.Track;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private final ArrayList<Track> tracks = new ArrayList<>();

    public CompactDisc(int id, String title) {
        super(id, title);
    }

    public CompactDisc(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }

    public CompactDisc(int id, String title, String category, String artist, float cost){
        super(id,title, category, cost);
        this.artist = artist;
    }
    // Getter
    public ArrayList<Track> getTracks() {
        return tracks;
    }
    public String getArtist() {
        return artist;
    }
    public int getLength(){
        int length = 0;
        for(Track track : this.tracks){
            length += track.getLength();
        }
        return length;
    }
    public void addTrack(Track track){
        if (this.tracks.contains(track)){
            System.out.println("***This track exists in the CD***");
        } else {
            this.tracks.add(track);
            System.out.println("***This track has been added to the track list***s");
        }
    }
    public void removeTrack(Track track){
        if (this.tracks.contains(track)){
            this.tracks.remove(track);
            System.out.println("***This track has been removed the track list***");
        } else {
            System.out.println("***This track does not exist in the track list***");
        }
    }
    public String toString(){
        return "CD - [" + this.getId() + "] - [" + this.getTitle() + "] - [" + this.getCategory() + "] - [" + this.getArtist() + "] - [" + this.getLength() + "]:[" + this.getCost() + "]$\n" + "Track list: " + this.tracks;
    }

    @Override
    public void play() {
        if (!tracks.isEmpty()){
            for(Track track : this.tracks){
                System.out.print("Track " + (tracks.indexOf(track) + 1) + ": ");
                track.play();
            }
        } else {
            System.out.println("***No track in the track list***");
        }
    }

}