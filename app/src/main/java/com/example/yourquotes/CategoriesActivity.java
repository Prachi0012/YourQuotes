package com.example.yourquotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class CategoriesActivity extends AppCompatActivity {
    RecyclerView rcv;
    ArrayList<ModelclassCategory> categorylist = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        initview();
    }

    private void initview() {
        rcv=findViewById(R.id.rcv);
        ModelclassCategory m1 = new ModelclassCategory();
        m1.setCategory("Happy");
        m1.setCategoryimg(R.drawable.happy1);
        categorylist.add(m1);

        ModelclassCategory m2 = new ModelclassCategory();
        m2.setCategory("Sad");
        m2.setCategoryimg(R.drawable.sad);
        categorylist.add(m2);

        ModelclassCategory m3 = new ModelclassCategory();
        m3.setCategory("Attitude");
        m3.setCategoryimg(R.drawable.attitude);
        categorylist.add(m3);

        ModelclassCategory m4 = new ModelclassCategory();
        m4.setCategory("Angry");
        m4.setCategoryimg(R.drawable.angry);
        categorylist.add(m4);

        ModelclassCategory m5 = new ModelclassCategory();
        m5.setCategory("Friendship");
        m5.setCategoryimg(R.drawable.friendship);
        categorylist.add(m5);

        ModelclassCategory m6 = new ModelclassCategory();
        m6.setCategory("Love");
        m6.setCategoryimg(R.drawable.love);
        categorylist.add(m6);

        ModelclassCategory m7 = new ModelclassCategory();
        m7.setCategory("Motivational");
        m7.setCategoryimg(R.drawable.motivation);
        categorylist.add(m7);

        ModelclassCategory m8 = new ModelclassCategory();
        m8.setCategory("Alone");
        m8.setCategoryimg(R.drawable.alone);
        categorylist.add(m8);

        ModelclassCategory m9 = new ModelclassCategory();
        m9.setCategory("Best");
        m9.setCategoryimg(R.drawable.best);
        categorylist.add(m9);

        ModelclassCategory m10 = new ModelclassCategory();
        m10.setCategory("Confidence");
        m10.setCategoryimg(R.drawable.confidence);
        categorylist.add(m10);

        ModelclassCategory m11 = new ModelclassCategory();
        m11.setCategory("Funny");
        m11.setCategoryimg(R.drawable.funny);
        categorylist.add(m11);

        CategoryInterface categoryInterface = new CategoryInterface() {
            @Override
            public void CategoryClick(String category) {
//                Toast.makeText(CategoriesActivity.this, "Category ==> "+category, Toast.LENGTH_SHORT).show();
                Intent i = new Intent(CategoriesActivity.this,QuotesActivity.class);
                i.putExtra("category",category);
                startActivity(i);
            }
        };


        GridLayoutManager manager = new GridLayoutManager(CategoriesActivity.this,2);
        rcv.setLayoutManager(manager);
        CategoryAdapter adapter = new CategoryAdapter(CategoriesActivity.this,categorylist,categoryInterface);
        rcv.setAdapter(adapter);


    }
}