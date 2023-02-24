package com.example.FunQuizApp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class  CategoryAct extends AppCompatActivity implements View.OnClickListener {
    Button btHistory,btComputer,btEnglish,btMaths,btGraphics;
    private long backPressedTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        btHistory = findViewById(R.id.History);
        btComputer = findViewById(R.id.Computers);
        btEnglish = findViewById(R.id.English);
        btMaths = findViewById(R.id.Maths);
        btGraphics = findViewById(R.id.Graphics);

        btHistory.setOnClickListener(this);
        btComputer.setOnClickListener(this);
        btEnglish.setOnClickListener(this);
        btMaths.setOnClickListener(this);
        btGraphics.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.History:
                Intent intentHistory = new Intent(CategoryAct.this,QuizActivity.class);
                intentHistory.putExtra("Category",Constants.HISTORY);
                startActivity(intentHistory);
                break;


            case R.id.English:
                Intent intentEnglish = new Intent(CategoryAct.this,QuizActivity.class);
                intentEnglish.putExtra("Category",Constants.ENGLISH);
                startActivity(intentEnglish);
                break;

            case R.id.Maths:
                Intent intentMaths = new Intent(CategoryAct.this,QuizActivity.class);
                intentMaths.putExtra("Category",Constants.MATHS);
                startActivity(intentMaths);
                break;

            case R.id.Computers:
                Intent intentComputers = new Intent(CategoryAct.this,QuizActivity.class);
                intentComputers.putExtra("Category",Constants.COMPUTERS);
                startActivity(intentComputers);
                break;

            case R.id.Graphics:
                Intent intentGraphics = new Intent(CategoryAct.this,QuizActivity.class);
                intentGraphics.putExtra("Category",Constants.GRAPHICS);
                startActivity(intentGraphics);
                break;
        }
    }
    @Override
    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()){

            Intent intent = new Intent(CategoryAct.this,PlayActivity.class);
            startActivity(intent);

        }else {
            Toast.makeText(this, "Press Again to Exit", Toast.LENGTH_SHORT).show();

        }
        backPressedTime = System.currentTimeMillis();
    }
}