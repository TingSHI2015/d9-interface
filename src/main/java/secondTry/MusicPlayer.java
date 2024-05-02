package secondTry;

public class MusicPlayer implements Playable{

    //don't need private variable hier!
/*    private String song;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public void play(String song){
        this.song = song;
        System.out.println("Play a song: " + song);
    }*/

    //----------
    @Override
    public void play(String song){
        System.out.println("Play a song: " + song);
    }
}
