package com.example.android.courtcounter;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int wicketTeamA = 0;
    private int overTeamA = 0;
    private TextView scoreViewA;
    private TextView overViewA;

    private int scoreTeamB = 0;
    private int wicketTeamB = 0;
    private int overTeamB = 0;
    private TextView scoreViewB;
    private TextView overViewB;


    @SuppressLint("StringFormatInvalid")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreViewA = findViewById(R.id.team_a_score);
        overViewA = findViewById(R.id.team_a_over);

        scoreViewB = findViewById(R.id.team_b_score);
        overViewB = findViewById(R.id.team_b_over);

        overViewA.setText(getString(R.string.team_overs, 0, 0));
        overViewB.setText(getString(R.string.team_overs, 0, 0));

        scoreViewA.setText(getString(R.string.team_score, 0, 0));
        scoreViewB.setText(getString(R.string.team_score, 0, 0));

    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA++;
        overTeamA++;
        displayForTeamA();
    }

    /**
     * Increase the score for Team A by 4 points.
     */
    public void addFourForTeamA(View v) {
        scoreTeamA += 4;
        overTeamA++;
        displayForTeamA();
    }

    /**
     * Increase the score for Team A by 6 points.
     */
    public void addSixForTeamA(View v) {
        scoreTeamA += 6;
        overTeamA++;
        displayForTeamA();
    }

    /**
     * Increase the wicket by 1 for Team A
     */
    public void updateWicketForTeamA(View v) {
        wicketTeamA++;
        overTeamA++;
        displayForTeamA();
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB++;
        overTeamB++;
        displayForTeamB();
    }

    /**
     * Increase the score for Team A by 4 points.
     */
    public void addFourForTeamB(View v) {
        scoreTeamB += 4;
        overTeamB++;
        displayForTeamB();
    }

    /**
     * Increase the wicket by 1 for Team B
     */
    public void updateWicketForTeamB(View v) {
        wicketTeamB++;
        overTeamB++;
        displayForTeamB();
    }

    /**
     * Increase the score for Team B by 6 points.
     */
    public void addSixForTeamB(View v) {
        scoreTeamB += 6;
        overTeamB++;
        displayForTeamB();
    }

    /**
     * Displays the given score for Team A.
     */
    @SuppressLint("StringFormatInvalid")
    public void displayForTeamA() {
        scoreViewA.setText(getString(R.string.team_score, scoreTeamA, wicketTeamA));
        overViewA.setText(getString(R.string.team_overs, (overTeamA / 6), overTeamA % 6));
    }

    /**
     * Displays the given score for Team A.
     */
    @SuppressLint("StringFormatInvalid")
    public void displayForTeamB() {
        scoreViewB.setText(getString(R.string.team_score, scoreTeamB, wicketTeamB));
        overViewB.setText(getString(R.string.team_overs, (overTeamB / 6), overTeamB % 6));
    }

    /**
     * Reset score for both team
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        wicketTeamA = 0;
        wicketTeamB = 0;
        overTeamA = 0;
        overTeamB = 0;
        displayForTeamA();
        displayForTeamB();
    }
}
