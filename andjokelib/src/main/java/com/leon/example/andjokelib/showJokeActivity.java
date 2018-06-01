package com.leon.example.andjokelib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class showJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_joke);

        //Retrieves and saves joke from intent extra
        Intent intent = getIntent();

        String joke = "";
        if (intent.getStringExtra(getString(R.string.JOKE_EXTRA)) != null)
        {

            joke = intent.getStringExtra(getString(R.string.JOKE_EXTRA));
        }

        TextView jokeView = findViewById(R.id.joke_text_view);

        Log.v("ReadJoke", joke);
        //Sets joke to text
        jokeView.setText( joke );
    }
}
