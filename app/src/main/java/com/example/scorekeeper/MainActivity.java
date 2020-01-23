package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int scoreTeamCanada = 0;
    int scoreTeamRussia = 0;
    private View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamCanada(View v) {
        scoreTeamCanada = scoreTeamCanada + 1;
        displayForTeamA(scoreTeamCanada);
    }


    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamRussia(View v) {
        scoreTeamRussia = scoreTeamRussia + 1;
        displayForTeamB(scoreTeamRussia);
    }


    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreTeamCanada = 0;
        scoreTeamRussia = 0;
        displayForTeamA(scoreTeamCanada);
        displayForTeamB(scoreTeamRussia);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_canada_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_russia_score);
        scoreView.setText(String.valueOf(score));
    }
}
