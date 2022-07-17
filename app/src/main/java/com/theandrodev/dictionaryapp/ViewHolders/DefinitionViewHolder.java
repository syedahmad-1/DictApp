package com.theandrodev.dictionaryapp.ViewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.theandrodev.dictionaryapp.R;

public class DefinitionViewHolder extends RecyclerView.ViewHolder {
    public TextView definition_tv, example_tv;
    public DefinitionViewHolder(@NonNull View itemView) {
        super(itemView);
        definition_tv=itemView.findViewById(R.id.defintion_textview);
        example_tv=itemView.findViewById(R.id.example_textview);

    }
}