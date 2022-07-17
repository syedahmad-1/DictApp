package com.theandrodev.dictionaryapp.Models;

import java.util.ArrayList;
import java.util.List;

public class ApiResponse {
    String word = "";
    String phonetic ="";
    List<Phonetics> phonetics = null;
    List<Meanings> meanings = null;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getPhonetic() {
        return phonetic;
    }

    public void setPhonetic(String phonetic) {
        this.phonetic = phonetic;
    }

    public List<Phonetics> getPhonetics() {
        return phonetics;
    }

    public void setPhonetics(List<Phonetics> phonetics) {
        this.phonetics = phonetics;
    }

    public List<Meanings> getMeanings() {
        return meanings;
    }

    public void setMeanings(List<Meanings> meanings) {
        this.meanings = meanings;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public ArrayList<String> getSourceUrls() {
        return sourceUrls;
    }

    public void setSourceUrls(ArrayList<String> sourceUrls) {
        this.sourceUrls = sourceUrls;
    }

    String license ="";
    ArrayList<String> sourceUrls=null;
}