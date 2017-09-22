package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;
    private int foulA = 0;
    private int foulB = 0;
    private int yellowCardA = 0;
    private int redCardA = 0;
    private int yellowCardB = 0;
    private int redCardB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * value for goal button.
     */
    public void goalA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void goalB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }


    /**
     * value for foul button.
     */
    public void foulA(View view) {
        foulA ++;
        displayForFoulA(foulA);
    }

    public void foulB(View view) {
        foulB ++;
        displayForFoulB(foulB);
    }

    /**
     * value for yellow card of team A
     */
    public void yellowCardA(View view){
        yellowCardA ++;
        displayForYellowCardA(yellowCardA);
    }

    /**
     * value for red card of team A
     */
    public void redCardA(View view){
        redCardA ++;
        displayForRedCardA(redCardA);
    }

    /**
     * value for yellow card of team B
     */
    public void yellowCardB(View view){
        yellowCardB ++;
        displayForYellowCardB(yellowCardB);
    }

    /**
     * value for red card of team B
     */
    public void redCardB(View view){
        redCardB ++;
        displayForRedCardB(redCardB);
    }


    /**
     * Reset button for team A and team B to be 0.
     */
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulA = 0;
        foulB = 0;
        yellowCardA = 0;
        redCardA = 0;
        yellowCardB = 0;
        redCardB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayForFoulA(foulA);
        displayForFoulB(foulB);
        displayForYellowCardA(yellowCardA);
        displayForRedCardA(redCardA);
        displayForYellowCardB(yellowCardB);
        displayForRedCardB(redCardB);
    }

    /**
     * Displays the given goals for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given goals for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fouls for Team A.
     */
    public void displayForFoulA(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(foul));
    }

    /**
     * Displays the given fouls for Team B.
     */
    public void displayForFoulB(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(foul));
    }

    /**
     * Displays the given yellow cards for Team A.
     */
    public void displayForYellowCardA(int yellowCardA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellowCard);
        scoreView.setText(String.valueOf(yellowCardA));
    }

    /**
     * Displays the given red cards for Team A.
     */
    public void displayForRedCardA(int redCardA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_redCard);
        scoreView.setText(String.valueOf(redCardA));
    }

    /**
     * Displays the given yellow cards for Team B.
     */
    public void displayForYellowCardB(int yellowCardB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellowCard);
        scoreView.setText(String.valueOf(yellowCardB));
    }

    /**
     * Displays the given red cards for Team B.
     */
    public void displayForRedCardB(int redCardB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_redCard);
        scoreView.setText(String.valueOf(redCardB));
    }

}
