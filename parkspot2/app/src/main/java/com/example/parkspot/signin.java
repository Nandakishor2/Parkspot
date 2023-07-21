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

public class signin extends AppCompatActivity {
    public Button signup1,signin1;
    public TextView phone,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        signup1 = findViewById(R.id.signup);
        signin1 = findViewById(R.id.signin);
        phone =  findViewById(R.id.phone);
        password = findViewById(R.id.password);
        signin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OkHttpClient okhttpclient = new OkHttpClient();
                RequestBody reqbody = new FormBody.Builder().add("mobile",phone.getText().toString()).add("passcode",password.getText().toString()).build();
                String url = "http://192.168.43.111:8000/validate";
                Request request = new Request.Builder().url(url).post(reqbody).build();
                okhttpclient.newCall(request).enqueue(new Callback() {
                    @Override
                    public void onFailure(@NonNull Call call, @NonNull IOException e) {
                        System.out.println("Error");

                    }

                    @Override
                    public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                        String res = response.body().string();
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {

                                if(res.equals("Login Successful")){
                                    Toast.makeText(signin.this, res, Toast.LENGTH_SHORT).show();
                                    Intent i =new Intent(signin.this,landing.class);
                                    startActivity(i);

                                }
                                else{
                                    Toast.makeText(signin.this, res, Toast.LENGTH_SHORT).show();

                                }



                            }
                        });

                    }
                });

            }
        });
        signup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(signin.this,signup.class);
                startActivity(i);
            }
        });
    }
}