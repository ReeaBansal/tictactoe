package com.example.riyapc.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen2);


        final EditText etPlayer1 = (EditText) findViewById(R.id.etPlayer1);
        final EditText etPlayer2 = (EditText) findViewById(R.id.etPlayer2);

        Button bPlay = (Button) findViewById(R.id.bPlay);

        bPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String PLAYER_1 = "" + etPlayer1.getText().toString();
                String PLAYER_2 = "" + etPlayer2.getText().toString();

                Intent i = new Intent(FirstScreen.this,MainActivity.class);


                i.putExtra("PLAYER_1",PLAYER_1);
                i.putExtra("PLAYER_2",PLAYER_2);

                startActivity(i);

            }
        });
    }
}
