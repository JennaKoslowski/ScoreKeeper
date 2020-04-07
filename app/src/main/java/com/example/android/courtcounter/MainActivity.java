package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void add_three_A(View v) {
        scoreA=scoreA+3;
        displayForTeamA(scoreA);
    }

    public void add_two_A(View v) {
        scoreA=scoreA+2;
        displayForTeamA(scoreA);
    }
    public void add_one_A(View v) {
        scoreA=scoreA+1;
        displayForTeamA(scoreA);
    }
    /**
     * Display given score for Team B
     * */
    public void displayForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }
    public void add_three_B(View v) {
        scoreB=scoreB+3;
        displayForTeamB(scoreB);
    }

    public void add_two_B(View v) {
        scoreB=scoreB+2;
        displayForTeamB(scoreB);
    }
    public void add_one_B(View v) {
        scoreB=scoreB+1;
        displayForTeamB(scoreB);
    }

    public void reset(View v){
        scoreA=0;
        displayForTeamA(scoreA);
        scoreB=0;
        displayForTeamB(scoreB);
    }
}
