package com.example.recyclerlayoutv10;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class recyclerviewadapter extends RecyclerView.Adapter<recyclerviewadapter.ViewHolder>{
    private ArrayList<birthdays> Meme =new ArrayList<>();
    private final Context context;
    public recyclerviewadapter(Context context) {
        this.context =context;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.birthday_list,parent,false);
        ViewHolder holder=new ViewHolder(view);

            return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
     holder.name.setText(Meme.get(position).getSitename());
     holder.date.setText(Meme.get(position).getDate());
     holder.parent.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Toast.makeText(context, Meme.get(position).getSitename()+"'s birthday!!  "+Meme.get(position).getDate(), Toast.LENGTH_SHORT).show();
         }
     });
        Glide.with(context)
                .asBitmap()
                .load(Meme.get(position).getImageurl())
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
                       return Meme.size();
    }

    public void setMeme(ArrayList<birthdays> meme) {
        Meme = meme;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private final CardView  parent;
        private final ImageView image;
        private TextView date;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name =itemView.findViewById(R.id.name);
            image=itemView.findViewById(R.id.image);
            parent =itemView.findViewById(R.id.parentlayout);
            date=itemView.findViewById(R.id.date);
        }
    }
}
