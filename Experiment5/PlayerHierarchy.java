package Experiment5;

// Base class for all players
class Player {
    protected String name;
    protected int age;
    protected String position;
    
    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }
    
    public void play() {
        System.out.println(name + " is playing");
    }
    
    public void train() {
        System.out.println(name + " is training");
    }
}

class Cricket_Player extends Player {
    private String battingStyle;
    
    public Cricket_Player(String name, int age, String position, String battingStyle) {
        super(name, age, position);
        this.battingStyle = battingStyle;
    }
    
    @Override
    public void play() {
        System.out.println(name + " is playing cricket as a " + position);
    }
    
    @Override
    public void train() {
        System.out.println(name + " is practicing " + battingStyle + " batting");
    }
}

class Football_Player extends Player {
    private int jerseyNumber;
    
    public Football_Player(String name, int age, String position, int jerseyNumber) {
        super(name, age, position);
        this.jerseyNumber = jerseyNumber;
    }
    
    @Override
    public void play() {
        System.out.println(name + " is playing football with jersey number " + jerseyNumber);
    }
    
    @Override
    public void train() {
        System.out.println(name + " is practicing football drills");
    }
}

class Hockey_Player extends Player {
    private String stickType;
    
    public Hockey_Player(String name, int age, String position, String stickType) {
        super(name, age, position);
        this.stickType = stickType;
    }
    
    @Override
    public void play() {
        System.out.println(name + " is playing hockey using " + stickType + " stick");
    }
    
    @Override
    public void train() {
        System.out.println(name + " is practicing hockey techniques");
    }
}

public class PlayerHierarchy {
    public static void main(String[] args) {
        Cricket_Player cricketer = new Cricket_Player("Virat", 32, "Batsman", "Right-handed");
        Football_Player footballer = new Football_Player("Messi", 34, "Forward", 10);
        Hockey_Player hockey = new Hockey_Player("Singh", 28, "Center", "Composite");
        
        // Demonstrating polymorphism
        Player[] players = {cricketer, footballer, hockey};
        
        for (Player player : players) {
            player.play();
            player.train();
            System.out.println();
        }
    }
}