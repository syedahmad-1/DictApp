package com.theandrodev.dictionaryapp;

import com.theandrodev.dictionaryapp.Models.ApiResponse;

public interface onFetchDataListener {
    void onFetchData(ApiResponse apiResponse, String message);
    void onError(String message);
}