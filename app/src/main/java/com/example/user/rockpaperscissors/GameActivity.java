package com.example.user.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    Button rockButton;
    Button paperButton;
    Button scissorsButton;
    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Log.d(getClass().toString(), "onCreate called");

        rockButton = (Button) findViewById(R.id.rock_button);
        paperButton = (Button) findViewById(R.id.paper_button);
        scissorsButton = (Button) findViewById(R.id.scissors_button);
        resultView = (TextView) findViewById(R.id.result_view);
    }

    public void onRockButtonClicked(View button) {
        Log.d(getClass().toString(), "onRockButtonClicked was called");
        Log.d(getClass().toString(), "The player chose rock");
        Game game = new Game();
        String option = game.run("Rock");
        resultView.setText(option);
    }
    public void onPaperButtonClicked(View button) {
        Log.d(getClass().toString(), "onPaperButtonClicked was called");
        Log.d(getClass().toString(), "The player chose paper");
        Game game = new Game();
        String option = game.run("Paper");
        resultView.setText(option);

    }

    public void onScissorsButtonClicked(View button) {
        Log.d(getClass().toString(), "onScissorsButtonClicked was called");
        Log.d(getClass().toString(), "The player chose scissors");
        Game game = new Game();
        String option = game.run("Scissors");
        resultView.setText(option);

    }

}
