package com.rsa.recyclerviewinandroid.adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.rsa.recyclerviewinandroid.R;
import com.rsa.recyclerviewinandroid.models.Items;

import java.util.List;
import java.util.Random;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    private final List<Items> items;
    private final Context context;

    public ItemAdapter(List<Items> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.txtName.setText(items.get(position).getBookName());
        holder.txtFirstChar.setText(items.get(position).getBookName().substring(0, 1));
        Random random = new Random();
        holder.txtFirstChar.setBackgroundColor(Color.rgb(random.nextInt(191), random.nextInt(2), random.nextInt(141)));

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView txtFirstChar;
        TextView txtName;
        ConstraintLayout itemContainer;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            txtFirstChar = itemView.findViewById(R.id.txt_first_char);
            txtName = itemView.findViewById(R.id.txt_name);
            itemContainer = itemView.findViewById(R.id.item_container);

            itemContainer.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.item_container:
                    Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.txt_first_char:
                    Toast.makeText(context, "Clicked on 1st Char", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }
}
