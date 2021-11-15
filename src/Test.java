public class Test {
    public static void main(String[] args) {
        MusicOrganizer mo = new MusicOrganizer();
        mo.listAllTracks();
        mo.listByArtist("woody");
        mo.playTrack(6);
    }
}
