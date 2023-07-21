package com.example.parkspot;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class signup extends AppCompatActivity {
    public Button signins,signup;
    public TextView name,mobile,age,gender,password;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        signins = findViewById(R.id.signin);
        signup = findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = findViewById(R.id.name);
                mobile = findViewById(R.id.phone);
                age = findViewById(R.id.age);
                gender = findViewById(R.id.gender);
                password = findViewById(R.id.password);

                OkHttpClient okhttpclient = new OkHttpClient();
                RequestBody reqbody = new FormBody.Builder().add("name",name.getText().toString()).add("mobile",mobile.getText().toString()).add("gender",gender.getText().toString()).add("age",age.getText().toString()).add("password",password.getText().toString()).build();
                String url = "http://192.168.43.111:8000/data";
                Request request = new Request.Builder().url(url).post(reqbody).build();
                okhttpclient.newCall(request).enqueue(new Callback() {
                    @Override
                    public void onFailure(@NonNull Call call, @NonNull IOException e) {
                        Toast.makeText(signup.this, "Server Error", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                        String res =  response.body().string();
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(signup.this, res, Toast.LENGTH_SHORT).show();


                            }
                        });


                    }

                });


            }
        });
        signins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(signup.this,signin.class);
                startActivity(i);

            }
        });
    }
}