package com.example.android.cricketscorecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayOutForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_out);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given scoer for Team B.
     */
    public void displayOutForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_out);
        scoreView.setText(String.valueOf(score));
    }

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int outA = 0;
    int outB = 0;

/**
 *  Team A
 */
    public void displaySixOnTeamA(View v) {
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA);
    }
    public void displayFourOnTeamA(View v) {
        scoreTeamA = scoreTeamA + 4;
        displayForTeamA(scoreTeamA);
    }
    public void displayTwoOnTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }
    public void displayOneOnTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    public void displayNoBAllOnTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    public void displayWideOnTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void displayOutOnTeamA(View v) {
        outA = outA + 1;
        displayOutForTeamA(outA);
    }
    /**
     * Team B
     */
    public void displaySixOnTeamB(View v) {
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB);
    }
    public void displayFourOnTeamB(View v) {
        scoreTeamB = scoreTeamB + 4;
        displayForTeamB(scoreTeamB);
    }
    public void displayTwoOnTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }
    public void displayOneOnTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    public void displayNoBAllOnTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    public void displayWideOnTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void displayOutOnTeamB(View v) {
        outB = outB + 1;
        displayOutForTeamB(outB);
    }

    public void reset(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        outA = 0;
        outB = 0;
        displayForTeamA(scoreTeamA);
        displayOutForTeamA(outA);
        displayOutForTeamB(outB);
        displayForTeamB(scoreTeamB);
    }
}
