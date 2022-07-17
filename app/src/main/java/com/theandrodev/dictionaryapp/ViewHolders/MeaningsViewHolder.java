package com.theandrodev.dictionaryapp.ViewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.theandrodev.dictionaryapp.R;

public class MeaningsViewHolder extends RecyclerView.ViewHolder {
    public TextView partsOfSpeech_tv;
    public RecyclerView recyclerView_definition;
    public MeaningsViewHolder(@NonNull View itemView) {
        super(itemView);
        partsOfSpeech_tv = itemView.findViewById(R.id.partsofspeech_textview);
        recyclerView_definition = itemView.findViewById(R.id.defintion_recyclerview);
    }
}