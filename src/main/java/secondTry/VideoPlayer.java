package secondTry;

public class VideoPlayer implements Playable{
    @Override
    public void play(String video){
        System.out.println("Play a video: " + video);
    }
}
