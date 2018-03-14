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

    int scoreTeam = 0;

    public void displaySixOnTeamA(View v) {
        scoreTeam = scoreTeam + 6;
        displayForTeamA(scoreTeam);
    }
    public void displayFourOnTeamA(View v) {
        scoreTeam = scoreTeam + 4;
        displayForTeamA(scoreTeam);
    }
    public void displayTwoOnTeamA(View v) {
        scoreTeam = scoreTeam + 2;
        displayForTeamA(scoreTeam);
    }
    public void displayOneOnTeamA(View v) {
        scoreTeam = scoreTeam + 1;
        displayForTeamA(scoreTeam);
    }
    public void displayNoBAllOnTeamA(View v) {
        scoreTeam = scoreTeam + 1;
        displayForTeamA(scoreTeam);
    }
    public void displayWideOnTeamA(View v) {
        scoreTeam = scoreTeam + 1;
        displayForTeamA(scoreTeam);
    }

    public void displayOutOnTeamA(View v) {
        scoreTeam = scoreTeam + 1;
        displayOutForTeamA(scoreTeam);
    }
}
