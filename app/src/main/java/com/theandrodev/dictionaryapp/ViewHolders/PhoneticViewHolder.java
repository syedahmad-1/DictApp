package com.theandrodev.dictionaryapp.ViewHolders;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.theandrodev.dictionaryapp.R;

public class PhoneticViewHolder extends RecyclerView.ViewHolder {
    public TextView phonetic_tv;
    public ImageButton imageButton_audio;
    public PhoneticViewHolder(@NonNull View itemView) {
        super(itemView);
        phonetic_tv = itemView.findViewById(R.id.phoentics_textview);
        imageButton_audio = itemView.findViewById(R.id.play_button);
    }
}