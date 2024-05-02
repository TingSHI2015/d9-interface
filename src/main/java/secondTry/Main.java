package secondTry;

public class Main {
    public static void main(String[] args){


        Playable musicPlayer = new MusicPlayer();  //error: MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.play("Don't worry, be happy!");   // use this not in reality

        Playable videoPlayer = new VideoPlayer();  //error:  VideoPlayer videoPlayer = new VideoPlayer();
        videoPlayer.play("Frida");   // use this not in reality

        // use this way in reality!!!!!-------------------!!!
        MediaController controller = new MediaController();
        controller.playMedia(musicPlayer,"song3");
        controller.playMedia(videoPlayer,"video3");


    }
}
