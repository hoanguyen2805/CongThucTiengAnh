package com.app.formulaenglish.model;

public class Sentence {

    private int type;
    private String title;
    private String description;
    private String[] childSentence;
    private String fileName;
    private String[] fileNameChild;

    public Sentence() {
        // constructor
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setChildSentence(String[] childSentence) {
        this.childSentence = childSentence;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFileNameChild(String[] fileNameChild) {
        this.fileNameChild = fileNameChild;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public int getType() {
        return type;
    }

    public String[] getFileNameChild() {
        return fileNameChild;
    }

    public String getFileName() {
        return fileName;
    }

    public String[] getChildSentence() {
        return childSentence;
    }
}
