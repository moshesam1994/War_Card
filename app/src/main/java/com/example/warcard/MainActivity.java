package com.example.warcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView iv_card1,iv_card2;
    TextView tv_score1,tv_score2;
    Button btm_deal;
    int score1=0,score2=0;
Random r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_card1=findViewById(R.id.iv_card1);
        iv_card2=findViewById(R.id.iv_card2);
        tv_score1 =findViewById(R.id.tv_card1);
        tv_score2=findViewById(R.id.tv_card2);
        btm_deal=findViewById(R.id.btm_deal);
        r=new Random();
btm_deal.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

    int card1 = r.nextInt(13) + 2;
    int card2 = r.nextInt(13) + 2;

    int image1 = getResources().getIdentifier("poker" + card1, "drawable", getPackageName());
    iv_card1.setImageResource(image1);
    int image2 = getResources().getIdentifier("poker" + card2, "drawable", getPackageName());
    iv_card2.setImageResource(image2);

    if (card1 > card2)
        tv_score1.setText("Player 1:"+String.valueOf(++score1));
    else if (card1 < card2)
        tv_score2.setText("Player 2:"+String.valueOf(++score2));


    else
        Toast.makeText(MainActivity.this, "WAR", Toast.LENGTH_SHORT).show();
    }

    });

    }
}