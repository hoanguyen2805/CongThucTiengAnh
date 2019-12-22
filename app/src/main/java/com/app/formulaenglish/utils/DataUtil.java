package com.app.formulaenglish.utils;

import com.app.formulaenglish.model.Sentence;
import com.app.formulaenglish.model.SentenceEnum;
import com.app.formulaenglish.model.WordEnum;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {

    public static List<Sentence> getSentenceData() {
        List<Sentence> list = new ArrayList<>();
        for (SentenceEnum sentenceEnum : SentenceEnum.values()) {
            Sentence sentence = new Sentence();
            sentence.setTitle(sentenceEnum.getTitle());
            sentence.setDescription(sentenceEnum.getDescription());
            sentence.setType(sentenceEnum.getType());
            sentence.setFileName(sentenceEnum.getFileName());
            sentence.setChildSentence(sentenceEnum.getChildSentence());
            sentence.setFileNameChild(sentenceEnum.getFileNameChild());
            list.add(sentence);
        }
        return list;
    }

    public static List<Sentence> getWordData() {
        List<Sentence> list = new ArrayList<>();
        for (WordEnum wordEnum : WordEnum.values()) {
            Sentence sentence = new Sentence();
            sentence.setTitle(wordEnum.getTitle());
            sentence.setDescription(wordEnum.getDescription());
            sentence.setType(wordEnum.getType());
            sentence.setFileName(wordEnum.getFileName());
            sentence.setChildSentence(wordEnum.getChildSentence());
            sentence.setFileNameChild(wordEnum.getFileNameChild());
            list.add(sentence);
        }
        return list;
    }
}
