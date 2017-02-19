package com.example.pulkit.tictactoe;


        import android.widget.Button;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;

    boolean p1 , p2;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1= (Button) findViewById(R.id.b1);
        b2= (Button) findViewById(R.id.b2);
        b3= (Button) findViewById(R.id.b3);
        b4= (Button) findViewById(R.id.b4);
        b5= (Button) findViewById(R.id.b5);
        b6= (Button) findViewById(R.id.b6);
        b7= (Button) findViewById(R.id.b7);
        b8= (Button) findViewById(R.id.b8);
        b9= (Button) findViewById(R.id.b9);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);

        clear();

    }

    @Override
    public void onClick(View v) {

           {

            switch (v.getId()) {

                case R.id.b1:
                    if (p1 == false && p2 == false) {
                        p1 = true;
                        b1.setText("X");
                        p1 = false;
                        p2 = true;
                    } else if (p2 == true) {
                        b1.setText("O");
                        p2 = false;
                        p1 = true;
                    }
                    else if (p1==true){
                        b1.setText("X");
                        p1=false;
                        p2=true;
                    }
                    i++;
                    b1.setEnabled(false);
                    break;

                case R.id.b2:
                    if (p1 == false && p2 == false) {
                        p1 = true;b2.setText("X");
                        p1 = false;
                        p2 = true;
                    } else if (p2 == true) {b2.setText("O");
                        p2 = false;
                        p1 = true;
                    }
                    else if (p1==true){b2.setText("X");
                        p1=false;
                        p2=true;
                    }
                    i++;b2.setEnabled(false);
                    break;

                case R.id.b3:
                    if (p1 == false && p2 == false) {
                        p1 = true;
                        b3.setText("X");
                        p1 = false;
                        p2 = true;
                    } else if (p2 == true) {
                        b3.setText("O");
                        p2 = false;
                        p1 = true;
                    }
                    else if (p1==true){
                        b3.setText("X");
                        p1=false;
                        p2=true;
                    }
                    i++;
                    b3.setEnabled(false);
                    break;

                case R.id.b4:
                    if (p1 == false && p2 == false) {
                        p1 = true;
                        b4.setText("X");
                        p1 = false;
                        p2 = true;
                    } else if (p2 == true) {
                        b4.setText("O");
                        p2 = false;
                        p1 = true;
                    }
                    else if (p1==true){
                        b4.setText("X");
                        p1=false;
                        p2=true;
                    }
                    i++;
                    b4.setEnabled(false);
                    break;

                case R.id.b5:
                    if (p1 == false && p2 == false) {
                        p1 = true;
                        b5.setText("X");
                        p1 = false;
                        p2 = true;
                    } else if (p2 == true) {
                        b5.setText("O");
                        p2 = false;
                        p1 = true;
                    }
                    else if (p1==true){
                        b5.setText("X");
                        p1=false;
                        p2=true;
                    }
                    i++;
                    b5.setEnabled(false);
                    break;

                case R.id.b6:
                    if (p1 == false && p2 == false) {
                        p1 = true;
                        b6.setText("X");
                        p1 = false;
                        p2 = true;
                    } else if (p2 == true) {
                        b6.setText("O");
                        p2 = false;
                        p1 = true;
                    }
                      else if (p1==true){
                        b6.setText("X");
                        p1=false;
                        p2=true;
                    }
                    i++;
                    b6.setEnabled(false);
                    break;

                case R.id.b7:
                    if (p1 == false && p2 == false) {
                        p1 = true;
                        b7.setText("X");
                        p1 = false;
                        p2 = true;
                    } else if (p2 == true) {
                        b7.setText("O");
                        p2 = false;
                        p1 = true;
                    }
                    else if (p1==true){
                        b7.setText("X");
                        p1=false;
                        p2=true;
                    }
                    i++;
                    b7.setEnabled(false);
                    break;

                case R.id.b8:
                    if (p1 == false && p2 == false) {
                        p1 = true;
                        b8.setText("X");
                        p1 = false;
                        p2 = true;
                    } else if (p2 == true) {
                        b8.setText("O");
                        p2 = false;
                        p1 = true;
                    }
                    else if (p1==true){
                        b8.setText("X");
                        p1=false;
                        p2=true;
                    }
                    i++;
                    b8.setEnabled(false);
                    break;

                case R.id.b9:
                    if (p1 == false && p2 == false) {
                        p1 = true;
                        b9.setText("X");
                        p1 = false;
                        p2 = true;
                    } else if (p2 == true) {
                        b9.setText("O");
                        p2 = false;
                        p1 = true;
                    }
                    else if (p1==true){
                        b9.setText("X");
                        p1=false;
                        p2=true;
                    }
                    i++;
                    b9.setEnabled(false);
                    break;


            }

            if(i>4)
            {
                if((b1.getText().toString()==b2.getText().toString()&& b2.getText().toString()==b3.getText().toString()&& b1.getText().toString()!="")||(b1.getText().toString()==b5.getText().toString()&&b5.getText().toString()==b9.getText().toString()&& b1.getText().toString()!="")||(b3.getText().toString()==b5.getText().toString()&&b5.getText().toString()==b7.getText().toString()&& b3.getText().toString()!="")||(b1.getText().toString()==b4.getText().toString()&&b4.getText().toString()==b7.getText().toString()&& b1.getText().toString()!="")||(b4.getText().toString()==b5.getText().toString()&&b5.getText().toString()==b6.getText().toString()&& b4.getText().toString()!="")||(b7.getText()==b8.getText().toString()&&b8.getText().toString()==b9.getText().toString()&& b7.getText().toString()!="")||(b3.getText().toString()==b6.getText().toString()&&b6.getText().toString()==b9.getText().toString()&& b3.getText().toString()!="")||(b2.getText().toString()==b5.getText().toString()&&b5.getText().toString()==b8.getText().toString()&& b2.getText().toString()!=""))
                {
                    {
                        if (p1 == true)
                        {
                            Toast.makeText(this, "PLAYER 2 WINS", Toast.LENGTH_SHORT).show();
                            clear();
                        }
                        else if (p2 == true)
                        {
                            Toast.makeText(this, "PLAYER 1 WINS", Toast.LENGTH_SHORT).show();
                            clear();
                        }
                    }
                }

            }

            if(i==9)
            {
                Toast.makeText(this, "DRAW", Toast.LENGTH_SHORT).show();
                clear();
            }
        }


    }

    void clear() {
        i=0;
        p1=false;
        p2=false;
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        Toast.makeText(this, "Player 1 start!", Toast.LENGTH_SHORT).show();
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
    }
}
