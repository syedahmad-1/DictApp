package com.theandrodev.dictionaryapp.Models;

import java.util.ArrayList;

public class Definitions {
    String definition ="";
    String example ="";

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    ArrayList<String> synonyms=null;
    ArrayList<String> antonyms=null;

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }



    public ArrayList<String> getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(ArrayList<String> synonyms) {
        this.synonyms = synonyms;
    }

    public ArrayList<String> getAntonyms() {
        return antonyms;
    }

    public void setAntonyms(ArrayList<String> antonyms) {
        this.antonyms = antonyms;
    }



}