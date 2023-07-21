package com.example.parkspot;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class landing extends AppCompatActivity {
    public Button btn,next;
    public TextView out;
    public TextView zero,one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen,fourteen,fifteen,sixteen,seventeen,eighteen,nineteen,twenty,twentyone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        Bundle bundle = new Bundle();

        btn= findViewById(R.id.prev);
        next = findViewById(R.id.nextpage);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(landing.this,landing1.class);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    OkHttpClient okhttpclient = new OkHttpClient();

                    String url = "http://192.168.43.111:8000/parkingspace";
                    Request request = new Request.Builder().url(url).build();
                    okhttpclient.newCall(request).enqueue(new Callback(){
                        @Override
                        public void onFailure(@NonNull Call call, @NonNull IOException e) {
                            Toast.makeText(landing.this, "Server Error", Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                            String res = response.body().string();
                            String[] amp = res.split(",");
                            zero = findViewById(R.id.zero);
                            one = findViewById(R.id.one);
                            two = findViewById(R.id.two);
                            three = findViewById(R.id.three);
                            four = findViewById(R.id.four);
                            five = findViewById(R.id.five);
                            six = findViewById(R.id.six);
                            seven = findViewById(R.id.seven);
                            eight = findViewById(R.id.eight);
                            nine = findViewById(R.id.nine);
                            ten = findViewById(R.id.ten);
                            eleven = findViewById(R.id.eleven);
                            twelve = findViewById(R.id.twelve);
                            thirteen = findViewById(R.id.thirteen);
                            fourteen = findViewById(R.id.fourteen);
                            fifteen = findViewById(R.id.fifteen);
                            sixteen = findViewById(R.id.sixteen);
                            seventeen = findViewById(R.id.seventeen);
                            eighteen = findViewById(R.id.eighteen);
                            nineteen = findViewById(R.id.nineteen);
                            twenty = findViewById(R.id.twenty);
                            twentyone = findViewById(R.id.twentyone);

                            for (int i = 0; i < amp.length; i++) {

                                amp[i] =amp[i].substring(1,amp[i].length()-1);
                                Log.d("AMP", "amp[21] value: " + amp[21]);

                            }
                            bundle.putStringArray("parkdata", amp);
                            if (amp[0].endsWith("True")){
                                zero.setBackgroundColor(Color.parseColor("#04FB04"));
                            }
                            else{
                                zero.setBackgroundColor(Color.parseColor("#FB0404"));

                            }
                            if (amp[1].endsWith("True")){
                                one.setBackgroundColor(Color.parseColor("#04FB04"));
                            }
                            else{
                                one.setBackgroundColor(Color.parseColor("#FB0404"));
                            }
                            if (amp[2].endsWith("True")){
                                two.setBackgroundColor(Color.parseColor("#04FB04"));
                            }
                            else{
                                two.setBackgroundColor(Color.parseColor("#FB0404"));

                            }
                            if (amp[3].endsWith("True")){
                                three.setBackgroundColor(Color.parseColor("#04FB04"));
                            }
                            else{
                                three.setBackgroundColor(Color.parseColor("#FB0404"));
                            }
                            if (amp[4].endsWith("True")){
                                four.setBackgroundColor(Color.parseColor("#04FB04"));
                            }
                            else{
                                four.setBackgroundColor(Color.parseColor("#FB0404"));

                            }
                            if (amp[5].endsWith("True")){
                                five.setBackgroundColor(Color.parseColor("#04FB04"));
                            }
                            else{
                                five.setBackgroundColor(Color.parseColor("#FB0404"));
                            }
                            if (amp[6].endsWith("True")){
                                six.setBackgroundColor(Color.parseColor("#04FB04"));
                            }
                            else{
                                six.setBackgroundColor(Color.parseColor("#FB0404"));

                            }
                            if (amp[7].endsWith("True")){
                                seven.setBackgroundColor(Color.parseColor("#04FB04"));
                            }
                            else{
                                seven.setBackgroundColor(Color.parseColor("#FB0404"));
                            }
                            if (amp[8].endsWith("True")){
                                eight.setBackgroundColor(Color.parseColor("#04FB04"));
                            }
                            else{
                                eight.setBackgroundColor(Color.parseColor("#FB0404"));

                            }
                            if (amp[9].endsWith("True")){
                                nine.setBackgroundColor(Color.parseColor("#04FB04"));
                            }
                            else{
                                nine.setBackgroundColor(Color.parseColor("#FB0404"));
                            }
                            if (amp[10].endsWith("True")){
                                ten.setBackgroundColor(Color.parseColor("#04FB04"));
                            }
                            else{
                                ten.setBackgroundColor(Color.parseColor("#FB0404"));

                            }
                            if (amp[11].endsWith("True")){
                                eleven.setBackgroundColor(Color.parseColor("#04FB04"));
                            }
                            else{
                                eleven.setBackgroundColor(Color.parseColor("#FB0404"));
                            }
                            if (amp[12].endsWith("True")){
                                twelve.setBackgroundColor(Color.parseColor("#04FB04"));
                            }
                            else{
                                twelve.setBackgroundColor(Color.parseColor("#FB0404"));

                            }
                            if (amp[13].endsWith("True")){
                                thirteen.setBackgroundColor(Color.parseColor("#04FB04"));
                            }
                            else{
                                thirteen.setBackgroundColor(Color.parseColor("#FB0404"));
                            }
                            if (amp[14].endsWith("True")){
                                fourteen.setBackgroundColor(Color.parseColor("#04FB04"));
                            }
                            else{
                                fourteen.setBackgroundColor(Color.parseColor("#FB0404"));

                            }
                            if (amp[15].endsWith("True")){
                                fifteen.setBackgroundColor(Color.parseColor("#04FB04"));
                            }
                            else{
                                fifteen.setBackgroundColor(Color.parseColor("#FB0404"));
                            }
                            if (amp[16].endsWith("True")){
                                sixteen.setBackgroundColor(Color.parseColor("#04FB04"));
                            }
                            else{
                                sixteen.setBackgroundColor(Color.parseColor("#FB0404"));

                            }
                            if (amp[17].endsWith("True")){
                                seventeen.setBackgroundColor(Color.parseColor("#04FB04"));
                            }
                            else{
                                seventeen.setBackgroundColor(Color.parseColor("#FB0404"));
                            }
                            if (amp[18].endsWith("True")){
                                eighteen.setBackgroundColor(Color.parseColor("#04FB04"));
                            }
                            else{
                                eighteen.setBackgroundColor(Color.parseColor("#FB0404"));

                            }
                            if (amp[19].endsWith("True")){
                                nineteen.setBackgroundColor(Color.parseColor("#04FB04"));
                            }
                            else{
                                nineteen.setBackgroundColor(Color.parseColor("#FB0404"));
                            }
                            if (amp[20].endsWith("True")){
                                twenty.setBackgroundColor(Color.parseColor("#04FB04"));
                            }
                            else{
                                twenty.setBackgroundColor(Color.parseColor("#FB0404"));

                            }
                            if (amp[21].endsWith("True")){
                                twentyone.setBackgroundColor(Color.parseColor("#16f216"));
                            }
                            else{
                                twentyone.setBackgroundColor(Color.parseColor("#FB0404"));

                            }




                        }
                    });








;


            }
        });
    }
}