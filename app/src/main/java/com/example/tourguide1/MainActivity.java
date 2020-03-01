package com.example.tourguide1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    TextView txtlogin,txtpassword,registertxt;
    Button Loginbtn;
    EditText edtxtLogin,edxtpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtlogin=findViewById(R.id.logintxtt);
        txtpassword=findViewById(R.id.txtPwd);
        registertxt=findViewById(R.id.lnkRegister);
        Loginbtn=findViewById(R.id.btnLogin);
        edtxtLogin=findViewById(R.id.Emailtxt);
        edxtpassword=findViewById(R.id.txtPwd);


        Loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);


            }
        });

    }

}
