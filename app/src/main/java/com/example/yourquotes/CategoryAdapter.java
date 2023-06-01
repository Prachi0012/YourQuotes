package com.example.yourquotes;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.MyViewHolder> {
    CategoriesActivity categoriesActivity;
    ArrayList<ModelclassCategory> categorylist;
    CardView cardView;
    CategoryInterface categoryInterface;
    public CategoryAdapter(CategoriesActivity categoriesActivity, ArrayList<ModelclassCategory> categorylist, CategoryInterface categoryInterface) {
        this.categoriesActivity=categoriesActivity;
        this.categorylist=categorylist;
        this.categoryInterface=categoryInterface;
    }

    @NonNull
    @Override
    public CategoryAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(categoriesActivity).inflate(R.layout.category_item_file,parent,false);
        MyViewHolder m = new MyViewHolder(view);
        return m;
    }



    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.MyViewHolder holder, @SuppressLint("RecyclerView") int position) {

        int p;
        p=position;
            holder.txtcategory.setText( categorylist.get(position).getCategory());
            holder.imgCategory.setImageResource(categorylist.get(position).getCategoryimg());
            holder.itemView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    categoryInterface.CategoryClick(categorylist.get(p).category);
                }
            });


    }

    @Override

    public int getItemCount() {
        return categorylist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txtcategory;
        ImageView imgCategory;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtcategory= itemView.findViewById(R.id.txtcategory);
            imgCategory=itemView.findViewById(R.id.imgCategory);
            cardView=itemView.findViewById(R.id.categorybg);

        }
    }
}
