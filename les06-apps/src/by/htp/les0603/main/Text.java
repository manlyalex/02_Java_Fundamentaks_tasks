package by.htp.les0603.main;

import java.util.List;

public class Text {
    private String title;
    private List<Sentence> sentences;


    public Text(String title, List<Sentence> sentences) {
        this.title = title;
        this.sentences = sentences;
    }
    public List<Sentence> addText(Sentence sentenceToAdd) {
        this.sentences.add(sentenceToAdd);

        return this.sentences;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    @Override
    public String toString() {
        return String.format("%s\n %s", this.getTitle(), this.getSentences());
    }


}
