package com.theandrodev.dictionaryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.theandrodev.dictionaryapp.Adapters.MeaningsAdapter;
import com.theandrodev.dictionaryapp.Adapters.PhoneticsAdapter;
import com.theandrodev.dictionaryapp.Models.ApiResponse;


public class MainActivity extends AppCompatActivity {

    private SearchView searchView;

    RecyclerView recyclerView_phonetics, recyclerView_meanings;
    PhoneticsAdapter phoneticsAdapter;
    MeaningsAdapter meaningsAdapter;

    private TextView word_textView, phonetics_textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        word_textView = findViewById(R.id.word_text_view);
        phonetics_textView = findViewById(R.id.phoentics_textview);
        searchView = findViewById(R.id.search_view);

        recyclerView_phonetics=findViewById(R.id.phonetics_recycler_view);
        recyclerView_meanings=findViewById(R.id.meanings_recycler_view);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                RequestManager manager = new RequestManager(MainActivity.this);
                manager.getWordMeaning(listener, query);
                return true;

            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

    }

    private  final onFetchDataListener listener = new onFetchDataListener() {
        @Override
        public void onFetchData(ApiResponse apiResponse, String message) {

            if (apiResponse==null){
                Log.d("Response", "onFetchData: "+apiResponse.toString());
                Toast.makeText(MainActivity.this, "No data found", Toast.LENGTH_SHORT).show();
                return;
            }
            Toast.makeText(MainActivity.this, "worked", Toast.LENGTH_SHORT).show();
            showData(apiResponse);
        }

        @Override
        public void onError(String message) {
            Log.d("Error", "onError: "+message.toString());

        }
    };

    private void showData(ApiResponse apiResponse){
        Toast.makeText(this, "Response:"+ apiResponse.toString(), Toast.LENGTH_LONG).show();
//        word_textView.setText("Word: "+ apiResponse.getWord());
//        recyclerView_phonetics.setHasFixedSize(true);
//        recyclerView_phonetics.setLayoutManager(new GridLayoutManager(this, 1));
//        phoneticsAdapter = new PhoneticsAdapter(this, apiResponse.getPhonetics());
//        recyclerView_phonetics.setAdapter(phoneticsAdapter);
//
//        recyclerView_meanings.setHasFixedSize(true);
//        recyclerView_meanings.setLayoutManager(new GridLayoutManager(this, 1));
//        meaningsAdapter = new MeaningsAdapter(this, apiResponse.getMeanings());
//        recyclerView_meanings.setAdapter(meaningsAdapter);
    }

   }