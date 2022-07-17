package com.theandrodev.dictionaryapp.Models;

import java.util.ArrayList;

public class Meanings {
    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }



    String partOfSpeech="";

    public ArrayList<Definitions> getDefinitions() {
        return definitions;
    }

    public void setDefinitions(ArrayList<Definitions> definitions) {
        this.definitions = definitions;
    }

    ArrayList<Definitions> definitions = null;

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

    ArrayList<String> synonyms=null;
    ArrayList<String> antonyms = null;


}