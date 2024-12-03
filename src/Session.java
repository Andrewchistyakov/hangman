public class Session {
    String Word;
    String Showcase;
    int LeftToGuess;
    String Guessed;


    public Session(String w, String s, int l, String g) {
        Word = w;
        Showcase = s;
        LeftToGuess = l;
        Guessed = g;
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
}
