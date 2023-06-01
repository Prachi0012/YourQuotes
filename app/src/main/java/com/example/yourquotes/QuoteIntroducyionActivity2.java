package com.example.yourquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuoteIntroducyionActivity2 extends AppCompatActivity {
    TextView btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote_introducyion2);
        initview();
    }

    private void initview() {
        btnnext=findViewById(R.id.btnnext);
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(QuoteIntroducyionActivity2.this,QuoteIntroductionActivity3.class);
                startActivity(i);
            }
        });
    }
}