package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnPapel, btnPedra, btnTesoura, btnPlay;

    TextView txtScorePlayer, txtScoreMaquina, txtEmpate;

    ImageView imgPlayer, imgMaquina;

    int statusPlayer = 0;
    int paper = 1;
    int rock = 2;
    int scissor = 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPapel = findViewById(R.id.btnPapel);
        btnPedra = findViewById(R.id.btnPedra);
        btnTesoura = findViewById(R.id.btnTesoura);
        btnPlay = findViewById(R.id.btnPlay);
        txtScorePlayer = findViewById(R.id.txtScorePlayer);
        txtScoreMaquina = findViewById(R.id.txtScoreMaquina);
        txtEmpate = findViewById(R.id.txtEmpates);
        imgMaquina = findViewById(R.id.imgMaquina);
        imgPlayer = findViewById(R.id.imgPlayer);




        btnPapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                statusPlayer = paper;
                imgPlayer.setImageResource(R.drawable.papel);

            }
        });

        btnPedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                statusPlayer = rock;
                imgPlayer.setImageResource(R.drawable.pedra);

            }
        });

        btnTesoura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                statusPlayer = scissor;
                imgPlayer.setImageResource(R.drawable.tesoura);

            }
        });

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int statusMaquina = (int) (3* Math.random()) + 1;

                if (statusMaquina == paper){
                    imgMaquina.setImageResource(R.drawable.papel);
                }

                else if (statusMaquina == rock){
                    imgMaquina.setImageResource(R.drawable.pedra);

                }

                else if (statusMaquina == scissor){
                    imgMaquina.setImageResource(R.drawable.tesoura);

                }

                    if(statusPlayer == statusMaquina){
                        int timesScore = Integer.parseInt(txtScorePlayer.getText().toString());
                        int Score = timesScore + 1;

                        txtEmpate.setText(Score+"");
                    }

                    else if(statusPlayer == paper && statusMaquina == rock){
                        int timesScore = Integer.parseInt(txtScorePlayer.getText().toString());
                        int Score = timesScore + 1;

                        txtScorePlayer.setText(Score+"");
                    }

                    else if(statusPlayer == rock && statusMaquina == scissor){
                        int timesScore = Integer.parseInt(txtScorePlayer.getText().toString());
                        int Score = timesScore + 1;

                        txtScorePlayer.setText(Score+"");
                    }

                    else if(statusPlayer == scissor && statusMaquina == paper){
                        int timesScore = Integer.parseInt(txtScorePlayer.getText().toString());
                        int Score = timesScore + 1;

                        txtScorePlayer.setText(Score+"");
                    }

                    else if(statusMaquina == paper && statusPlayer == rock){
                        int timesScore = Integer.parseInt(txtScoreMaquina.getText().toString());
                        int Score = timesScore + 1;

                        txtScoreMaquina.setText(Score+"");
                    }

                    else if(statusMaquina == rock && statusPlayer == scissor){
                        int timesScore = Integer.parseInt(txtScoreMaquina.getText().toString());
                        int Score = timesScore + 1;

                        txtScoreMaquina.setText(Score+"");
                    }

                    else if(statusMaquina == scissor && statusPlayer == paper){
                        int timesScore = Integer.parseInt(txtScoreMaquina.getText().toString());
                        int Score = timesScore + 1;

                        txtScoreMaquina.setText(Score+"");
                    }

            }
        });


    }
}