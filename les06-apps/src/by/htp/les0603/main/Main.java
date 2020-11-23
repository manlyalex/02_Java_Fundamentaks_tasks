package by.htp.les0603.main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Word firstWord = new Word("My name is Aliaksei");
        Word twoWord = new Word("I'm from Belarus");

        Word threeWord = new Word("I like listen to Music");
        Word fourthWord = new Word("Also I like to play Dota 2");

        Word fiveWord = new Word("I studied at the military academy ");
        Word sixWord = new Word("I’m an System administrator");

        List<Word> words = new ArrayList<Word>();

        List<Word> words1 = new ArrayList<Word>();

        List<Word> words2 = new ArrayList<Word>();

        words.add(firstWord);
        words.add(twoWord);

        words1.add(threeWord);
        words1.add(fourthWord);

        words2.add(fiveWord);
        words2.add(sixWord);

        Sentence firstSentence = new Sentence(words);

        Sentence twoSentence = new Sentence(words1);

        Sentence threeSentence = new Sentence(words2);

        List<Sentence> texts = new ArrayList<Sentence>();

        texts.add(firstSentence);
        texts.add(twoSentence);

        Text text = new Text("About Myself", texts);

        text.addText(threeSentence);

        System.out.println(text.toString());
    }
}
