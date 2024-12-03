public interface Game {
    public String Guess(String target, char guess, int leftToGuess);
    public void Resign();
    public String ChooseWord();
    public void Play();
}
