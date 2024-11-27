import java.util.Objects;

public class Hangman implements Game{
    String State;
    String[] Dictionary;


    public boolean Guess(String guess) { // users guesses word
        return false;
    }


    public void Resign() { // end game before winning

    }

    public int ChooseWord() { // choose random word from dictionary
        return 0;
    }

    public void Play() { // main lifetime cycle
        this.State = "active";
        while (Objects.equals(this.State, "active")) {

        }
    }
}
