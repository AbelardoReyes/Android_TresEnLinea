package com.example.tresenlinea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public int fichaA=0;
public int fichaB=3;
public int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);
        Button btn10 = findViewById(R.id.btn10);
        Button btn11 = findViewById(R.id.btn11);
        //BOTON1
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i==0 & btn1==btn1) {
                    Toast.makeText(getApplicationContext(), "Turno del jugador o", Toast.LENGTH_LONG).show();
                    btn1.setText("X");
                    i++;
                }
                else if (btn1==btn1)
                {
                    Toast.makeText(getApplicationContext(), "Turno del jugador x", Toast.LENGTH_LONG).show();
                    btn1.setText("O");
                    i--;
                }
            }
        });
        //BOTON2
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (i==0 & btn2==btn2) {
                    Toast.makeText(getApplicationContext(), "Turno del jugador o", Toast.LENGTH_LONG).show();
                    btn2.setText("X");
                    i++;
                }
                else if (btn2==btn2)
                {
                    Toast.makeText(getApplicationContext(), "Turno del jugador x", Toast.LENGTH_LONG).show();
                    btn2.setText("O");
                    fichaA--;
                    fichaB++;
                    i--;
                }
            }
        });
        //BOTON3
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (i==0 & btn3==btn3) {
                    Toast.makeText(getApplicationContext(), "Turno del jugador o", Toast.LENGTH_LONG).show();
                    btn3.setText("X");
                    i++;
                }
                else if (btn3==btn3)
                {
                    Toast.makeText(getApplicationContext(), "Turno del jugador x", Toast.LENGTH_LONG).show();
                    btn3.setText("O");
                    i--;
                }
            }
        });
        //BOTON4
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i==0 & btn4==btn4) {
                    Toast.makeText(getApplicationContext(), "Turno del jugador o", Toast.LENGTH_LONG).show();
                    btn4.setText("X");
                    i++;
                }
                else if (btn4==btn4)
                {
                    Toast.makeText(getApplicationContext(), "Turno del jugador x", Toast.LENGTH_LONG).show();
                    btn4.setText("O");
                    i--;
                }
            }
        });
        //BOTON5
        btn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (i==0 & btn5==btn5) {
                    Toast.makeText(getApplicationContext(), "Turno del jugador o", Toast.LENGTH_LONG).show();
                    btn5.setText("X");
                    i++;
                }
                else if (btn5==btn5)
                {
                    Toast.makeText(getApplicationContext(), "Turno del jugador x", Toast.LENGTH_LONG).show();
                    btn5.setText("O");
                    i--;
                }
            }
        });
        //BOTON6
        btn6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (i==0 & btn6==btn6) {
                    Toast.makeText(getApplicationContext(), "Turno del jugador o", Toast.LENGTH_LONG).show();
                    btn6.setText("X");
                    i++;
                }
                else if (btn6==btn6)
                {
                    Toast.makeText(getApplicationContext(), "Turno del jugador x", Toast.LENGTH_LONG).show();
                    btn6.setText("O");
                    i--;
                }
            }
        });
        //BOTON7
        btn7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (i==0 & btn7==btn7) {
                    Toast.makeText(getApplicationContext(), "Turno del jugador o", Toast.LENGTH_LONG).show();
                    btn7.setText("X");
                    i++;
                }
                else if (btn7==btn7)
                {
                    Toast.makeText(getApplicationContext(), "Turno del jugador x", Toast.LENGTH_LONG).show();
                    btn7.setText("O");
                    i--;
                }
            }
        });
        //BOTON8
        btn8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (i==0 & btn8==btn8) {
                    Toast.makeText(getApplicationContext(), "Turno del jugador o", Toast.LENGTH_LONG).show();
                    btn8.setText("X");
                    i++;
                }
                else if (btn8==btn8)
                {
                    Toast.makeText(getApplicationContext(), "Turno del jugador x", Toast.LENGTH_LONG).show();
                    btn8.setText("O");
                    i--;
                }
            }
        });
        //BOTON9
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i==0 & btn9==btn9) {
                    Toast.makeText(getApplicationContext(), "Turno del jugador o", Toast.LENGTH_LONG).show();
                    btn9.setText("X");
                    fichaA++;
                    fichaB--;
                    i++;
                }
                else if (btn9==btn9)
                {
                    Toast.makeText(getApplicationContext(), "Turno del jugador x", Toast.LENGTH_LONG).show();
                    btn9.setText("O");
                    fichaA--;
                    fichaB++;
                    i--;
                }
            }
        });
        //victoria
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //GANAR EN HORIZONTAL
                if(btn1.getText().toString()==btn2.getText().toString() &
                        btn3.getText().toString()==btn2.getText().toString()) {
                    if (i == 1) {
                        Toast.makeText(getApplicationContext(), "Has ganado el jugador de las X", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Has ganado el jugador de las O", Toast.LENGTH_LONG).show();
                    }
                }
                if(btn4.getText().toString()==btn5.getText().toString() &
                        btn6.getText().toString()==btn5.getText().toString()) {
                    if (i == 1) {
                        Toast.makeText(getApplicationContext(), "Has ganado el jugador de las X", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Has ganado el jugador de las O", Toast.LENGTH_LONG).show();
                    }
                }
                if(btn1.getText().toString()==btn8.getText().toString() &
                        btn9.getText().toString()==btn8.getText().toString()) {
                    if (i == 1) {
                        Toast.makeText(getApplicationContext(), "Has ganado el jugador de las X", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Has ganado el jugador de las O", Toast.LENGTH_LONG).show();
                    }
                }
                //GANAR EN VERTICAL
                if(btn1.getText().toString()==btn4.getText().toString() &
                        btn7.getText().toString()==btn4.getText().toString()) {
                    if (i == 1) {
                        Toast.makeText(getApplicationContext(), "Has ganado el jugador de las X", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Has ganado el jugador de las O", Toast.LENGTH_LONG).show();
                    }
                }
                if(btn2.getText().toString()==btn5.getText().toString() &
                        btn8.getText().toString()==btn5.getText().toString()) {
                    if (i == 1) {
                        Toast.makeText(getApplicationContext(), "Has ganado el jugador de las X", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Has ganado el jugador de las O", Toast.LENGTH_LONG).show();
                    }
                }
                if(btn3.getText().toString()==btn6.getText().toString() &
                        btn9.getText().toString()==btn6.getText().toString()) {
                    if (i == 1) {
                        Toast.makeText(getApplicationContext(), "Has ganado el jugador de las X", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Has ganado el jugador de las O", Toast.LENGTH_LONG).show();
                    }
                }
                //GANAR EN INCLINADO
                if(btn1.getText().toString()==btn5.getText().toString() &
                        btn9.getText().toString()==btn5.getText().toString()) {
                    if (i == 1) {
                        Toast.makeText(getApplicationContext(), "Has ganado el jugador de las X", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Has ganado el jugador de las O", Toast.LENGTH_LONG).show();
                    }
                }
                if(btn3.getText().toString()==btn5.getText().toString() &
                        btn7.getText().toString()==btn5.getText().toString()) {
                    if (i == 1) {
                        Toast.makeText(getApplicationContext(), "Has ganado el jugador de las X", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Has ganado el jugador de las O", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
        //reinciar
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");
                i=0;
            }
        });
    }
}