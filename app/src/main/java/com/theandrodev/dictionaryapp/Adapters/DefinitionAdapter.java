package com.theandrodev.dictionaryapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.theandrodev.dictionaryapp.Models.Definitions;
import com.theandrodev.dictionaryapp.R;
import com.theandrodev.dictionaryapp.ViewHolders.DefinitionViewHolder;

import java.util.List;

public class DefinitionAdapter extends RecyclerView.Adapter<DefinitionViewHolder> {
    private Context context;
    private List<Definitions> defintitionList;

    public DefinitionAdapter(Context context, List<Definitions> defintitionList) {
        this.context = context;
        this.defintitionList = defintitionList;
    }

    @NonNull
    @Override
    public DefinitionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DefinitionViewHolder(LayoutInflater.from(context).inflate(R.layout.definitions_list_items, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DefinitionViewHolder holder, int position) {
        holder.definition_tv.setText("Defintiton: "+ defintitionList.get(position).getDefinition());
        holder.example_tv.setText("Example: "+ defintitionList.get(position).getExample());
    }

    @Override
    public int getItemCount() {
        return defintitionList.size();
    }
}