import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Hangman Game = new Hangman();

        // add words with hints here
        Game.WordHintMap = new HashMap<>();
        Game.WordHintMap.put("apple", "A fruit that keeps the doctor away");
        Game.WordHintMap.put("java", "A popular programming language");
        Game.WordHintMap.put("ocean", "A large body of salt water");
        Game.WordHintMap.put("mountain", "A natural elevation of the earth's surface");
        Game.WordHintMap.put("piano", "A musical instrument with keys");
        Game.WordHintMap.put("giraffe", "The tallest land animal with a long neck");
        Game.WordHintMap.put("chocolate", "A sweet treat made from cacao");
        Game.WordHintMap.put("volcano", "An opening in the Earth's crust that erupts lava");
        Game.WordHintMap.put("jupiter", "The largest planet in our solar system");
        Game.WordHintMap.put("symphony", "A large-scale musical composition for orchestra");
        Game.WordHintMap.put("quicksand", "A loose, water-saturated sand that can trap objects");
        Game.WordHintMap.put("telescope", "An instrument for observing distant objects in space");
        Game.WordHintMap.put("dinosaur", "A prehistoric reptile that roamed the Earth");

        Game.Play();
    }
}