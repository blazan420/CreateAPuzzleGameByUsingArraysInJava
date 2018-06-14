package com.example.kevin.createapuzzlegamebyusingarraysinjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText edtPuzzle = (EditText)findViewById(R.id.edtPuzzle);
        String oldEdtPuzzleValue;

        Puzzle myPuzzle = new Puzzle();
        myPuzzle.letsShuffleTheDivices();

        for (int i = 0; i < 60; i++) {

            oldEdtPuzzleValue = edtPuzzle.getText().toString();

            edtPuzzle.setText(oldEdtPuzzleValue + myPuzzle.giveMeTheModels());
        }



    }
}
