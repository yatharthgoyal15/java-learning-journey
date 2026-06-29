interface Camera {

    void clickPhoto();
}

interface MusicPlayer {

    void playMusic();
}

class Smartphone implements Camera, MusicPlayer {

    @Override
    public void clickPhoto() {
        System.out.println("Photo Clicked");
    }

    @Override
    public void playMusic() {
        System.out.println("Music Playing");
    }
}

public class Day17_Interfaces {

    public static void main(String[] args) {

        Smartphone phone = new Smartphone();

        phone.clickPhoto();
        phone.playMusic();
    }
}