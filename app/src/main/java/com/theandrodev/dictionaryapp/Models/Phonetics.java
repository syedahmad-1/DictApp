package com.theandrodev.dictionaryapp.Models;

import java.util.ArrayList;
import java.util.List;

public class Phonetics {

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }



    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    String text ="";
    String audio ="";
    String sourceUrl ="";

    public List<License> getLicense() {
        return license;
    }

    public void setLicense(List<License> license) {
        this.license = license;
    }

    List<License> license = null;
}