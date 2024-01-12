package sound;

public class OrganPlayer extends Player {
    public OrganPlayer() {
        jfPlayer.changeInstrument(22);
    }

    @Override
    public void playNote(String note) {
        playNote(note, 4);
    }
    
    @Override
    public void stopNote(String note) { stopNote(note, 4); }
}

