public class Session {
    String Word;
    String Showcase;
    int LeftToGuess;


    public Session(String w, String s, int l) {
        Word = w;
        Showcase = s;
        LeftToGuess = l;
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
}
