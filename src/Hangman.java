import java.util.Objects;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;

public class Hangman implements Game{
    String GameState;

    public Map<String, String> WordHintMap;

    public String Guess(String target, char guess, int counter) { // users guesses word
        char[] arr = target.toCharArray();
        for (char c : arr) {
            if (c == guess && counter != 1) {
                return "successful guess";
            } else if (c == guess) {
                return "victory";
            }
        }
        return "failed guess";
    }

    public String ChooseWord() { // choose random word from dictionary
        Random rand = new Random();

        String[] words = WordHintMap.keySet().toArray(new String[0]);
        int idx = rand.nextInt(words.length);

        return words[idx];
    }

    private String UpdateShowcase(String initWord, String current, char letterGuessed) {
        char[] newShowcase = current.toCharArray();
        for (int i = 0; i < initWord.length(); i++) {
            if (initWord.charAt(i) == letterGuessed) {
                newShowcase[i] = letterGuessed;
            }
        }
        return String.valueOf(newShowcase);
    }

    private int countUniqueSymbols(String s) {
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : s.toCharArray()) {
            uniqueChars.add(c);
        }
        return uniqueChars.size();
    }

    public void Play() { // main lifetime cycle
        this.GameState = "started";

        String word = ChooseWord();
        Session GameSession = new Session(word, "", countUniqueSymbols(word), "", 7);

        for (int i = 0; i < word.length(); i++) {
            GameSession.setShowcase(GameSession.getShowcase() + "*");
        }

        System.out.println("Starting the game! You will have to guess this word: " + GameSession.getShowcase());
        System.out.println("You can type /end to end the game or /hint to get some help");
        Scanner inp = new Scanner(System.in);
        while (Objects.equals(this.GameState, "started")) {
            System.out.println("Try a letter >>> ");
            String guess = inp.next();

            // checking for invalid input
            if (guess.length() != 1 && !guess.equals("/end") && !guess.equals("/hint")) {
                System.out.println("You have to type in ONE LETTER (or \"/end\", \"/hint\")!");
                continue;
            }

            if (guess.equals("/end")) {
                System.out.println("Your word was: " + word + ". See you next time!");
                return;
            } else if (guess.equals("/hint")) {
                System.out.println("Here is your hint: ");
                System.out.println(WordHintMap.get(GameSession.getWord()));
                continue;
            }
//            while (guess.length() != 1) {
//                System.out.print("You have to type in ONE LETTER (or \"/end\", \"/hint\")! Try again >>> ");
//                guess = inp.next();
//                if (guess.equals("end")) {
//                    System.out.println("Your word was: " + word + ". See you next time!");
//                    return;
//                }
//            }
            if (GameSession.Guessed.contains(guess)) {
                System.out.println("You have already guessed this letter!");
                continue;
            }
            String guessResult = Guess(GameSession.getWord(), guess.charAt(0), GameSession.LeftToGuess);

            if (Objects.equals(guessResult, "victory")) {
                this.GameState = "won";
                System.out.println("Congrats! You won with the word: " + word);
            } else if (Objects.equals(guessResult, "successful guess")){
                GameSession.setShowcase(UpdateShowcase(GameSession.getWord(), GameSession.getShowcase(), guess.charAt(0)));
                System.out.println("You got it right! Here is what's left: " + GameSession.getShowcase());
                GameSession.setLeftToGuess(GameSession.LeftToGuess - 1);
                GameSession.setGuessed(GameSession.Guessed + guess);
            } else {
                if (GameSession.getMistakesLeft() == 0) {
                    System.out.println("XD You lost! The word was: " + GameSession.getWord());
                    this.GameState = "lost";
                } else {
                    GameSession.setMistakesLeft(GameSession.getMistakesLeft() - 1);
                    System.out.println("You got unlucky, try again! Here is what you got: " + GameSession.getShowcase());
                    System.out.println("Mistakes left: " + GameSession.getMistakesLeft());
                }
            }
        }
    }
}
