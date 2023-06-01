package com.example.yourquotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class QuoteSignupActivity extends AppCompatActivity {
    EditText edtusername, edtmail, edtpassword, edtconform;
    CardView cardregister;
    TextView txtlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote_signup);
        initview();
    }

    private void initview() {
        edtusername=findViewById(R.id.edtusername);
        edtmail=findViewById(R.id.edtmail);
        edtpassword=findViewById(R.id.edtpassword);
        edtconform=findViewById(R.id.edtconform);

        cardregister=findViewById(R.id.cardregister);
        txtlogin=findViewById(R.id.txtlogin);

        cardregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username,email,password,cpass;
                username= edtusername.getText().toString();
                email=edtmail.getText().toString();
                password=edtpassword.getText().toString();
                cpass=edtconform.getText().toString();

                if(username.isEmpty())
                {
                    Toast.makeText(QuoteSignupActivity.this, "Enter your Username ", Toast.LENGTH_SHORT).show();
                }
                else if (email.isEmpty())
                {
                    Toast.makeText(QuoteSignupActivity.this, "Enter your Email Address ", Toast.LENGTH_SHORT).show();
                }
                else if (password.isEmpty())
                {
                    Toast.makeText(QuoteSignupActivity.this, "Enter your Password", Toast.LENGTH_SHORT).show();
                }
                else if (cpass.isEmpty())
                {
                    Toast.makeText(QuoteSignupActivity.this, "Re-Enter to conform Password", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent ha =new Intent(QuoteSignupActivity.this,CategoriesActivity.class);
                    startActivity(ha);
                }
            }
        });
        txtlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l=new Intent(QuoteSignupActivity.this,QuoteLoginScreenActivity.class);
                startActivity(l);
            }
        });


    }
}