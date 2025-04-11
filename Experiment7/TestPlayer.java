package Experiment7;

interface Playable {
    void play();
    void pause();
    void stop();
}

class MusicPlayer implements Playable {
    private String currentState = "Stopped";
    
    @Override
    public void play() {
        currentState = "Playing";
        System.out.println("Music is playing");
    }
    
    @Override
    public void pause() {
        currentState = "Paused";
        System.out.println("Music is paused");
    }
    
    @Override
    public void stop() {
        currentState = "Stopped";
        System.out.println("Music is stopped");
    }
    
    public String getCurrentState() {
        return currentState;
    }
}

public class TestPlayer {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        
        System.out.println("Testing Music Player Controls:\n");
        
        player.play();
        System.out.println("Current State: " + player.getCurrentState());
        
        player.pause();
        System.out.println("Current State: " + player.getCurrentState());
        
        player.play();
        System.out.println("Current State: " + player.getCurrentState());
        
        player.stop();
        System.out.println("Current State: " + player.getCurrentState());
    }
}