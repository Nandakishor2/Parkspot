package com.example.parkspot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class landing1 extends AppCompatActivity {
    public Button next,previ;
    public TextView out;
    public TextView zero,one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen,fourteen,fifteen,sixteen,seventeen,eighteen,nineteen,twenty,twentyone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing1);


        previ= findViewById(R.id.prev);
        previ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(landing1.this,landing.class);
                startActivity(i);
            }
        });
        next = findViewById(R.id.nextpage);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(landing1.this,landing2.class);

                Bundle bundle = getIntent().getExtras();
                String[] amp = bundle.getStringArray("parkdata");
                bundle.putStringArray("parkdata", amp);
                startActivity(i);
            }
        });
        Bundle bundle = getIntent().getExtras();
        String[] amp = bundle.getStringArray("parkdata");
        bundle.putStringArray("parkdata", amp);
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
        bundle.putStringArray("myArray", amp);
        if (amp[22].endsWith("True")){
            zero.setBackgroundColor(Color.parseColor("#04FB04"));
        }
        else{
            zero.setBackgroundColor(Color.parseColor("#FB0404"));

        }
        if (amp[23].endsWith("True")){
            one.setBackgroundColor(Color.parseColor("#04FB04"));
        }
        else{
            one.setBackgroundColor(Color.parseColor("#FB0404"));
        }
        if (amp[24].endsWith("True")){
            two.setBackgroundColor(Color.parseColor("#04FB04"));
        }
        else{
            two.setBackgroundColor(Color.parseColor("#FB0404"));

        }
        if (amp[25].endsWith("True")){
            three.setBackgroundColor(Color.parseColor("#04FB04"));
        }
        else{
            three.setBackgroundColor(Color.parseColor("#FB0404"));
        }
        if (amp[26].endsWith("True")){
            four.setBackgroundColor(Color.parseColor("#04FB04"));
        }
        else{
            four.setBackgroundColor(Color.parseColor("#FB0404"));

        }
        if (amp[27].endsWith("True")){
            five.setBackgroundColor(Color.parseColor("#04FB04"));
        }
        else{
            five.setBackgroundColor(Color.parseColor("#FB0404"));
        }
        if (amp[28].endsWith("True")){
            six.setBackgroundColor(Color.parseColor("#04FB04"));
        }
        else{
            six.setBackgroundColor(Color.parseColor("#FB0404"));

        }
        if (amp[29].endsWith("True")){
            seven.setBackgroundColor(Color.parseColor("#04FB04"));
        }
        else{
            seven.setBackgroundColor(Color.parseColor("#FB0404"));
        }
        if (amp[30].endsWith("True")){
            eight.setBackgroundColor(Color.parseColor("#04FB04"));
        }
        else{
            eight.setBackgroundColor(Color.parseColor("#FB0404"));

        }
        if (amp[31].endsWith("True")){
            nine.setBackgroundColor(Color.parseColor("#04FB04"));
        }
        else{
            nine.setBackgroundColor(Color.parseColor("#FB0404"));
        }
        if (amp[32].endsWith("True")){
            ten.setBackgroundColor(Color.parseColor("#04FB04"));
        }
        else{
            ten.setBackgroundColor(Color.parseColor("#FB0404"));

        }
        if (amp[33].endsWith("True")){
            eleven.setBackgroundColor(Color.parseColor("#04FB04"));
        }
        else{
            eleven.setBackgroundColor(Color.parseColor("#FB0404"));
        }
        if (amp[34].endsWith("True")){
            twelve.setBackgroundColor(Color.parseColor("#04FB04"));
        }
        else{
            twelve.setBackgroundColor(Color.parseColor("#FB0404"));

        }
        if (amp[35].endsWith("True")){
            thirteen.setBackgroundColor(Color.parseColor("#04FB04"));
        }
        else{
            thirteen.setBackgroundColor(Color.parseColor("#FB0404"));
        }
        if (amp[36].endsWith("True")){
            fourteen.setBackgroundColor(Color.parseColor("#04FB04"));
        }
        else{
            fourteen.setBackgroundColor(Color.parseColor("#FB0404"));

        }
        if (amp[37].endsWith("True")){
            fifteen.setBackgroundColor(Color.parseColor("#04FB04"));
        }
        else{
            fifteen.setBackgroundColor(Color.parseColor("#FB0404"));
        }
        if (amp[38].endsWith("True")){
            sixteen.setBackgroundColor(Color.parseColor("#04FB04"));
        }
        else{
            sixteen.setBackgroundColor(Color.parseColor("#FB0404"));

        }
        if (amp[39].endsWith("True")){
            seventeen.setBackgroundColor(Color.parseColor("#04FB04"));
        }
        else{
            seventeen.setBackgroundColor(Color.parseColor("#FB0404"));
        }
        if (amp[40].endsWith("True")){
            eighteen.setBackgroundColor(Color.parseColor("#04FB04"));
        }
        else{
            eighteen.setBackgroundColor(Color.parseColor("#FB0404"));

        }
        if (amp[41].endsWith("True")){
            nineteen.setBackgroundColor(Color.parseColor("#04FB04"));
        }
        else{
            nineteen.setBackgroundColor(Color.parseColor("#FB0404"));
        }
        if (amp[42].endsWith("True")){
            twenty.setBackgroundColor(Color.parseColor("#04FB04"));
        }
        else{
            twenty.setBackgroundColor(Color.parseColor("#FB0404"));

        }
        if (amp[43].endsWith("True")){
            twentyone.setBackgroundColor(Color.parseColor("#16f216"));
        }
        else{
            twentyone.setBackgroundColor(Color.parseColor("#FB0404"));

        }
    }
}