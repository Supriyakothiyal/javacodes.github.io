// Instrument.java
abstract class Instrument {
    abstract void play();
    abstract void tune();
}

// Glockenspiel.java
class Glockenspiel extends Instrument {
    @Override
    void play() {
        System.out.println("Playing the Glockenspiel");
    }

    @Override
    void tune() {
        System.out.println("Tuning the Glockenspiel");
    }
}

// Violin.java
class Violin extends Instrument {
    @Override
    void play() {
        System.out.println("Playing the Violin");
    }

    @Override
    void tune() {
        System.out.println("Tuning the Violin");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Glockenspiel glockenspiel = new Glockenspiel();
        glockenspiel.play();
        glockenspiel.tune();

        Violin violin = new Violin();
        violin.play();
        violin.tune();
    }
}
