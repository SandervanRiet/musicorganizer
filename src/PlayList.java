import java.util.ArrayList;
import java.util.Random;

public class PlayList {
    private String name;
    private MusicOrganizer organizer;
    private ArrayList<Track> tracks;

    public PlayList(String name) {
        this.name = name;
        organizer= new MusicOrganizer();
        tracks= new ArrayList<Track>();


    }
    public PlayList(String name, int number) {
        this(name);
        Random rand= new Random();
        for (int i = 0; i < number; i++) {
            int takeNumber = rand.nextInt(organizer.getNumberOfTracks());
            tracks.add(organizer.getTrack(takeNumber));

        }
    }
    public void listAllTracks(){
        {
            System.out.println("Track listing: ");

            for(Track track : tracks) {
                System.out.println(track.getDetails());
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        PlayList lijst= new PlayList("test", 3);
        lijst.listAllTracks();
    }
}
