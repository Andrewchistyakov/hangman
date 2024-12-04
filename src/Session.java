// class to store state of the game session
public class Session {
    String Word;
    String Showcase;
    String Guessed;
    int LeftToGuess;
    int MistakesLeft;

    public Session(String w, String s, int l, String g, int m) {
        Word = w;
        Showcase = s;
        LeftToGuess = l;
        Guessed = g;
        MistakesLeft = m;
    }

    public void setLeftToGuess(int leftToGuess) {
        LeftToGuess = leftToGuess;
    }

    public void setShowcase(String showcase) {
        Showcase = showcase;
    }

    public String getWord() {
        return Word;
    }

    public int getLeftToGuess() {
        return LeftToGuess;
    }

    public String getShowcase() {
        return Showcase;
    }

    public String getGuessed() {
        return Guessed;
    }

    public void setGuessed(String guessed) {
        Guessed = guessed;
    }

    public int getMistakesLeft() {
        return MistakesLeft;
    }

    public void setMistakesLeft(int mistakesLeft) {
        MistakesLeft = mistakesLeft;
    }
}
