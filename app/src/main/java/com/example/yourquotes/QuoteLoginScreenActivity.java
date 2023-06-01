package com.example.yourquotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class QuoteLoginScreenActivity extends AppCompatActivity {
    EditText edtusename, edtpassword;
    CardView cardlogin;
    TextView txtsign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote_login_screen);
        initview();
    }

    private void initview() {
        edtusename = findViewById(R.id.edtusename);
        edtpassword = findViewById(R.id.edtpassword);
        cardlogin = findViewById(R.id.cardlogin);
        txtsign = findViewById(R.id.txtsign);

        cardlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username, password;
                username = edtusename.getText().toString();
                password = edtpassword.getText().toString();
                if (username.isEmpty()) {
                    Toast.makeText(QuoteLoginScreenActivity.this, "Enter your Username", Toast.LENGTH_SHORT).show();
                } else
                {
                    if (password.isEmpty())
                    {
                        Toast.makeText(QuoteLoginScreenActivity.this, "Enter your Password", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Intent g=new Intent(QuoteLoginScreenActivity.this,CategoriesActivity.class);
                        startActivity(g);
                    }
                }
            }
        });
        txtsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(QuoteLoginScreenActivity.this,QuoteSignupActivity.class);
                startActivity(i);
            }
        });
    }
}