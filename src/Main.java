import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Hangman Game = new Hangman();
        Game.WordHintMap = new HashMap<>();
        Game.WordHintMap.put("apple", "A fruit that keeps the doctor away");
        Game.WordHintMap.put("java", "A popular programming language");
        Game.WordHintMap.put("ocean", "A large body of salt water");
        Game.WordHintMap.put("mountain", "A natural elevation of the earth's surface");
        Game.WordHintMap.put("piano", "A musical instrument with keys");
        Game.Play();
    }
}