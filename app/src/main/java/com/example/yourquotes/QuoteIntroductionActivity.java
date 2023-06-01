package com.example.yourquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuoteIntroductionActivity extends AppCompatActivity {
    TextView btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote_introduction);
        initview();
    }

    private void initview() {
        btnnext=findViewById(R.id.btnnext);
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(QuoteIntroductionActivity.this,QuoteIntroducyionActivity2.class);
                startActivity(i);
            }
        });
    }
}