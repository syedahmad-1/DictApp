package com.theandrodev.dictionaryapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.theandrodev.dictionaryapp.Models.Meanings;


import com.theandrodev.dictionaryapp.R;
import com.theandrodev.dictionaryapp.ViewHolders.MeaningsViewHolder;

import java.util.List;

public class MeaningsAdapter extends RecyclerView.Adapter<MeaningsViewHolder> {
    private Context context;
    private List<Meanings> meaningsList;

    public MeaningsAdapter(Context context, List<Meanings> meaningsList) {
        this.context = context;
        this.meaningsList = meaningsList;
    }

    @NonNull
    @Override
    public MeaningsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MeaningsViewHolder(LayoutInflater.from(context).inflate(R.layout.meanings_list_items, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MeaningsViewHolder holder, int position) {
    holder.partsOfSpeech_tv.setText("Parts of Speech"+ meaningsList.get(position).getPartOfSpeech());
    holder.recyclerView_definition.setHasFixedSize(true);
    holder.recyclerView_definition.setLayoutManager(new GridLayoutManager(context, 1));
    DefinitionAdapter definitionAdapter = new DefinitionAdapter(context, meaningsList.get(position).getDefinitions());
    holder.recyclerView_definition.setAdapter(definitionAdapter);

    }

    @Override
    public int getItemCount() {
        return meaningsList.size();
    }
}