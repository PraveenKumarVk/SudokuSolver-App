package com.example.myapplicationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView A1,A2,A3,A4,A5,A6,A7,A8,A9;
    TextView B1,B2,B3,B4,B5,B6,B7,B8,B9;
    TextView C1,C2,C3,C4,C5,C6,C7,C8,C9;
    TextView D1,D2,D3,D4,D5,D6,D7,D8,D9;
    TextView E1,E2,E3,E4,E5,E6,E7,E8,E9;
    TextView F1,F2,F3,F4,F5,F6,F7,F8,F9;
    TextView G1,G2,G3,G4,G5,G6,G7,G8,G9;
    TextView H1,H2,H3,H4,H5,H6,H7,H8,H9;
    TextView I1,I2,I3,I4,I5,I6,I7,I8,I9;
    Button b_solve,b_reset,b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;

    public int arr[][]=new int[9][9];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        A1= (TextView) findViewById(R.id.a1);
        A2= (TextView) findViewById(R.id.a2);
        A3= (TextView) findViewById(R.id.a3);
        A4= (TextView) findViewById(R.id.a4);
        A5= (TextView) findViewById(R.id.a5);
        A6= (TextView) findViewById(R.id.a6);
        A7= (TextView) findViewById(R.id.a7);
        A8= (TextView) findViewById(R.id.a8);
        A9= (TextView) findViewById(R.id.a9);
        B1= (TextView) findViewById(R.id.b1);
        B2= (TextView) findViewById(R.id.b2);
        B3= (TextView) findViewById(R.id.b3);
        B4= (TextView) findViewById(R.id.b4);
        B5= (TextView) findViewById(R.id.b5);
        B6= (TextView) findViewById(R.id.b6);
        B7= (TextView) findViewById(R.id.b7);
        B8= (TextView) findViewById(R.id.b8);
        B9= (TextView) findViewById(R.id.b9);
        C1= (TextView) findViewById(R.id.c1);
        C2= (TextView) findViewById(R.id.c2);
        C3= (TextView) findViewById(R.id.c3);
        C4= (TextView) findViewById(R.id.c4);
        C5= (TextView) findViewById(R.id.c5);
        C6= (TextView) findViewById(R.id.c6);
        C7= (TextView) findViewById(R.id.c7);
        C8= (TextView) findViewById(R.id.c8);
        C9= (TextView) findViewById(R.id.c9);
        D1= (TextView) findViewById(R.id.d1);
        D2= (TextView) findViewById(R.id.d2);
        D3= (TextView) findViewById(R.id.d3);
        D4= (TextView) findViewById(R.id.d4);
        D5= (TextView) findViewById(R.id.d5);
        D6= (TextView) findViewById(R.id.d6);
        D7= (TextView) findViewById(R.id.d7);
        D8= (TextView) findViewById(R.id.d8);
        D9= (TextView) findViewById(R.id.d9);
        E1= (TextView) findViewById(R.id.e1);
        E2= (TextView) findViewById(R.id.e2);
        E3= (TextView) findViewById(R.id.e3);
        E4= (TextView) findViewById(R.id.e4);
        E5= (TextView) findViewById(R.id.e5);
        E6= (TextView) findViewById(R.id.e6);
        E7= (TextView) findViewById(R.id.e7);
        E8= (TextView) findViewById(R.id.e8);
        E9= (TextView) findViewById(R.id.e9);
        F1= (TextView) findViewById(R.id.f1);
        F2= (TextView) findViewById(R.id.f2);
        F3= (TextView) findViewById(R.id.f3);
        F4= (TextView) findViewById(R.id.f4);
        F5= (TextView) findViewById(R.id.f5);
        F6= (TextView) findViewById(R.id.f6);
        F7= (TextView) findViewById(R.id.f7);
        F8= (TextView) findViewById(R.id.f8);
        F9= (TextView) findViewById(R.id.f9);
        G1= (TextView) findViewById(R.id.g1);
        G2= (TextView) findViewById(R.id.g2);
        G3= (TextView) findViewById(R.id.g3);
        G4= (TextView) findViewById(R.id.g4);
        G5= (TextView) findViewById(R.id.g5);
        G6= (TextView) findViewById(R.id.g6);
        G7= (TextView) findViewById(R.id.g7);
        G8= (TextView) findViewById(R.id.g8);
        G9= (TextView) findViewById(R.id.g9);
        H1= (TextView) findViewById(R.id.h1);
        H2= (TextView) findViewById(R.id.h2);
        H3= (TextView) findViewById(R.id.h3);
        H4= (TextView) findViewById(R.id.h4);
        H5= (TextView) findViewById(R.id.h5);
        H6= (TextView) findViewById(R.id.h6);
        H7= (TextView) findViewById(R.id.h7);
        H8= (TextView) findViewById(R.id.h8);
        H9= (TextView) findViewById(R.id.h9);
        I1= (TextView) findViewById(R.id.i1);
        I2= (TextView) findViewById(R.id.i2);
        I3= (TextView) findViewById(R.id.i3);
        I4= (TextView) findViewById(R.id.i4);
        I5= (TextView) findViewById(R.id.i5);
        I6= (TextView) findViewById(R.id.i6);
        I7= (TextView) findViewById(R.id.i7);
        I8= (TextView) findViewById(R.id.i8);
        I9= (TextView) findViewById(R.id.i9);
        b_solve=(Button) findViewById(R.id.solve);
        b_reset=(Button)findViewById(R.id.reset);
        b0=(Button)findViewById(R.id.b_0);
        b1=(Button)findViewById(R.id.b_1);
        b2=(Button)findViewById(R.id.b_2);
        b3=(Button)findViewById(R.id.b_3);
        b4=(Button)findViewById(R.id.b_4);
        b5=(Button)findViewById(R.id.b_5);
        b6=(Button)findViewById(R.id.b_6);
        b7=(Button)findViewById(R.id.b_7);
        b8=(Button)findViewById(R.id.b_8);
        b9=(Button)findViewById(R.id.b_9);
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                arr[i][j]=0;
            }
        }
            A1.setOnClickListener(this);
            A2.setOnClickListener(this);
            A3.setOnClickListener(this);
            A4.setOnClickListener(this);
            A5.setOnClickListener(this);
            A6.setOnClickListener(this);
            A7.setOnClickListener(this);
            A8.setOnClickListener(this);
            A9.setOnClickListener(this);

            B1.setOnClickListener(this);
            B2.setOnClickListener(this);
            B3.setOnClickListener(this);
            B4.setOnClickListener(this);
            B5.setOnClickListener(this);
            B6.setOnClickListener(this);
            B7.setOnClickListener(this);
            B8.setOnClickListener(this);
            B9.setOnClickListener(this);

            C1.setOnClickListener(this);
            C2.setOnClickListener(this);
            C3.setOnClickListener(this);
            C4.setOnClickListener(this);
            C5.setOnClickListener(this);
            C6.setOnClickListener(this);
            C7.setOnClickListener(this);
            C8.setOnClickListener(this);
            C9.setOnClickListener(this);

            D1.setOnClickListener(this);
            D2.setOnClickListener(this);
            D3.setOnClickListener(this);
            D4.setOnClickListener(this);
            D5.setOnClickListener(this);
            D6.setOnClickListener(this);
            D7.setOnClickListener(this);
            D8.setOnClickListener(this);
            D9.setOnClickListener(this);

            E1.setOnClickListener(this);
            E2.setOnClickListener(this);
            E3.setOnClickListener(this);
            E4.setOnClickListener(this);
            E5.setOnClickListener(this);
            E6.setOnClickListener(this);
            E7.setOnClickListener(this);
            E8.setOnClickListener(this);
            E9.setOnClickListener(this);

            F1.setOnClickListener(this);
            F2.setOnClickListener(this);
            F3.setOnClickListener(this);
            F4.setOnClickListener(this);
            F5.setOnClickListener(this);
            F6.setOnClickListener(this);
            F7.setOnClickListener(this);
            F8.setOnClickListener(this);
            F9.setOnClickListener(this);

            G1.setOnClickListener(this);
            G2.setOnClickListener(this);
            G3.setOnClickListener(this);
            G4.setOnClickListener(this);
            G5.setOnClickListener(this);
            G6.setOnClickListener(this);
            G7.setOnClickListener(this);
            G8.setOnClickListener(this);
            G9.setOnClickListener(this);

            H1.setOnClickListener(this);
            H2.setOnClickListener(this);
            H3.setOnClickListener(this);
            H4.setOnClickListener(this);
            H5.setOnClickListener(this);
            H6.setOnClickListener(this);
            H7.setOnClickListener(this);
            H8.setOnClickListener(this);
            H9.setOnClickListener(this);


            I1.setOnClickListener(this);
            I2.setOnClickListener(this);
            I3.setOnClickListener(this);
            I4.setOnClickListener(this);
            I5.setOnClickListener(this);
            I6.setOnClickListener(this);
            I7.setOnClickListener(this);
            I8.setOnClickListener(this);
            I9.setOnClickListener(this);
        

        final Animation anim1 =AnimationUtils.loadAnimation(this,R.anim.bounce);

        final Animation anim2 =AnimationUtils.loadAnimation(this,R.anim.lefttoright);
        anim2.setDuration(500);


        b_solve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_solve.startAnimation(anim1);
                Solver solver=new Solver(arr);
                if(solver.solve()) {
                    arr=solver.solved_sudo();
                    A1.setText(Integer.toString(arr[0][0]));
                    A2.setText(Integer.toString(arr[0][1]));
                    A3.setText(Integer.toString(arr[0][2]));
                    A4.setText(Integer.toString(arr[0][3]));
                    A5.setText(Integer.toString(arr[0][4]));
                    A6.setText(Integer.toString(arr[0][5]));
                    A7.setText(Integer.toString(arr[0][6]));
                    A8.setText(Integer.toString(arr[0][7]));
                    A9.setText(Integer.toString(arr[0][8]));
                    B1.setText(Integer.toString(arr[1][0]));
                    B2.setText(Integer.toString(arr[1][1]));
                    B3.setText(Integer.toString(arr[1][2]));
                    B4.setText(Integer.toString(arr[1][3]));
                    B5.setText(Integer.toString(arr[1][4]));
                    B6.setText(Integer.toString(arr[1][5]));
                    B7.setText(Integer.toString(arr[1][6]));
                    B8.setText(Integer.toString(arr[1][7]));
                    B9.setText(Integer.toString(arr[1][8]));
                    C1.setText(Integer.toString(arr[2][0]));
                    C2.setText(Integer.toString(arr[2][1]));
                    C3.setText(Integer.toString(arr[2][2]));
                    C4.setText(Integer.toString(arr[2][3]));
                    C5.setText(Integer.toString(arr[2][4]));
                    C6.setText(Integer.toString(arr[2][5]));
                    C7.setText(Integer.toString(arr[2][6]));
                    C8.setText(Integer.toString(arr[2][7]));
                    C9.setText(Integer.toString(arr[2][8]));
                    D1.setText(Integer.toString(arr[3][0]));
                    D2.setText(Integer.toString(arr[3][1]));
                    D3.setText(Integer.toString(arr[3][2]));
                    D4.setText(Integer.toString(arr[3][3]));
                    D5.setText(Integer.toString(arr[3][4]));
                    D6.setText(Integer.toString(arr[3][5]));
                    D7.setText(Integer.toString(arr[3][6]));
                    D8.setText(Integer.toString(arr[3][7]));
                    D9.setText(Integer.toString(arr[3][8]));
                    E1.setText(Integer.toString(arr[4][0]));
                    E2.setText(Integer.toString(arr[4][1]));
                    E3.setText(Integer.toString(arr[4][2]));
                    E4.setText(Integer.toString(arr[4][3]));
                    E5.setText(Integer.toString(arr[4][4]));
                    E6.setText(Integer.toString(arr[4][5]));
                    E7.setText(Integer.toString(arr[4][6]));
                    E8.setText(Integer.toString(arr[4][7]));
                    E9.setText(Integer.toString(arr[4][8]));
                    F1.setText(Integer.toString(arr[5][0]));
                    F2.setText(Integer.toString(arr[5][1]));
                    F3.setText(Integer.toString(arr[5][2]));
                    F4.setText(Integer.toString(arr[5][3]));
                    F5.setText(Integer.toString(arr[5][4]));
                    F6.setText(Integer.toString(arr[5][5]));
                    F7.setText(Integer.toString(arr[5][6]));
                    F8.setText(Integer.toString(arr[5][7]));
                    F9.setText(Integer.toString(arr[5][8]));
                    G1.setText(Integer.toString(arr[6][0]));
                    G2.setText(Integer.toString(arr[6][1]));
                    G3.setText(Integer.toString(arr[6][2]));
                    G4.setText(Integer.toString(arr[6][3]));
                    G5.setText(Integer.toString(arr[6][4]));
                    G6.setText(Integer.toString(arr[6][5]));
                    G7.setText(Integer.toString(arr[6][6]));
                    G8.setText(Integer.toString(arr[6][7]));
                    G9.setText(Integer.toString(arr[6][8]));
                    H1.setText(Integer.toString(arr[7][0]));
                    H2.setText(Integer.toString(arr[7][1]));
                    H3.setText(Integer.toString(arr[7][2]));
                    H4.setText(Integer.toString(arr[7][3]));
                    H5.setText(Integer.toString(arr[7][4]));
                    H6.setText(Integer.toString(arr[7][5]));
                    H7.setText(Integer.toString(arr[7][6]));
                    H8.setText(Integer.toString(arr[7][7]));
                    H9.setText(Integer.toString(arr[7][8]));
                    I1.setText(Integer.toString(arr[8][0]));
                    I2.setText(Integer.toString(arr[8][1]));
                    I3.setText(Integer.toString(arr[8][2]));
                    I4.setText(Integer.toString(arr[8][3]));
                    I5.setText(Integer.toString(arr[8][4]));
                    I6.setText(Integer.toString(arr[8][5]));
                    I7.setText(Integer.toString(arr[8][6]));
                    I8.setText(Integer.toString(arr[8][7]));
                    I9.setText(Integer.toString(arr[8][8]));

                }
                else
                    Toast.makeText(MainActivity.this, "Lyt teesko iga", Toast.LENGTH_SHORT).show();

            }
        });
        b_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b_reset.startAnimation(anim2);
                A1.setText("");
                A2.setText("");
                A3.setText("");
                A4.setText("");
                A5.setText("");
                A6.setText("");
                A7.setText("");
                A8.setText("");
                A9.setText("");
                B1.setText("");
                B2.setText("");
                B3.setText("");
                B4.setText("");
                B5.setText("");
                B6.setText("");
                B7.setText("");
                B8.setText("");
                B9.setText("");
                C1.setText("");
                C2.setText("");
                C3.setText("");
                C4.setText("");
                C5.setText("");
                C6.setText("");
                C7.setText("");
                C8.setText("");
                C9.setText("");
                D1.setText("");
                D2.setText("");
                D3.setText("");
                D4.setText("");
                D5.setText("");
                D6.setText("");
                D7.setText("");
                D8.setText("");
                D9.setText("");
                E1.setText("");
                E2.setText("");
                E3.setText("");
                E4.setText("");
                E5.setText("");
                E6.setText("");
                E7.setText("");
                E8.setText("");
                E9.setText("");
                F1.setText("");
                F2.setText("");
                F3.setText("");
                F4.setText("");
                F5.setText("");
                F6.setText("");
                F7.setText("");
                F8.setText("");
                F9.setText("");
                G1.setText("");
                G2.setText("");
                G3.setText("");
                G4.setText("");
                G5.setText("");
                G6.setText("");
                G7.setText("");
                G8.setText("");
                G9.setText("");
                H1.setText("");
                H2.setText("");
                H3.setText("");
                H4.setText("");
                H5.setText("");
                H6.setText("");
                H7.setText("");
                H8.setText("");
                H9.setText("");
                I1.setText("");
                I2.setText("");
                I3.setText("");
                I4.setText("");
                I5.setText("");
                I6.setText("");
                I7.setText("");
                I8.setText("");
                I9.setText("");




            }
        });
    }





    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.a1:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A1.setText("0");
                        arr[0][0]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A1.setText("1");
                        arr[0][0]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A1.setText("2");
                        arr[0][0]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A1.setText("3");
                        arr[0][0]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A1.setText("4");
                        arr[0][0]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A1.setText("5");
                        arr[0][0]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A1.setText("6");
                        arr[0][0]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A1.setText("7");
                        arr[0][0]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A1.setText("8");
                        arr[0][0]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A1.setText("9");
                        arr[0][0]=9;
                    }
                });
                break;
            case R.id.a2:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A2.setText("0");
                        arr[0][1]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A2.setText("1");
                        arr[0][1]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A2.setText("2");
                        arr[0][1]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A2.setText("3");
                        arr[0][1]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A2.setText("4");
                        arr[0][1]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A2.setText("5");
                        arr[0][1]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A2.setText("6");
                        arr[0][1]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A2.setText("7");
                        arr[0][1]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A2.setText("8");
                        arr[0][1]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A2.setText("9");
                        arr[0][1]=9;
                    }
                });
                break;
            case R.id.a3:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A3.setText("0");
                        arr[0][2]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A3.setText("1");
                        arr[0][2]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A3.setText("2");
                        arr[0][2]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A3.setText("3");
                        arr[0][2]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A3.setText("4");
                        arr[0][2]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A3.setText("5");
                        arr[0][2]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A3.setText("6");
                        arr[0][2]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A3.setText("7");
                        arr[0][2]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A3.setText("8");
                        arr[0][2]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A3.setText("9");
                        arr[0][2]=9;
                    }
                });
                break;
            case R.id.a4:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A4.setText("0");
                        arr[0][3]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A4.setText("1");
                        arr[0][3]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A4.setText("2");
                        arr[0][3]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A4.setText("3");
                        arr[0][3]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A4.setText("4");
                        arr[0][3]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A4.setText("5");
                        arr[0][3]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A4.setText("6");
                        arr[0][3]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A4.setText("7");
                        arr[0][3]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A4.setText("8");
                        arr[0][3]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A4.setText("9");
                        arr[0][3]=9;
                    }
                });
                break;
            case R.id.a5:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A5.setText("0");
                        arr[0][4]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A5.setText("1");
                        arr[0][4]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A5.setText("2");
                        arr[0][4]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A5.setText("3");
                        arr[0][4]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A5.setText("4");
                        arr[0][4]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A5.setText("5");
                        arr[0][4]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A5.setText("6");
                        arr[0][4]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A5.setText("7");
                        arr[0][4]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A5.setText("8");
                        arr[0][4]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A5.setText("9");
                        arr[0][4]=9;
                    }
                });
                break;
            case R.id.a6:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A6.setText("0");
                        arr[0][5]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A6.setText("1");
                        arr[0][5]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A6.setText("2");
                        arr[0][5]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A6.setText("3");
                        arr[0][5]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A6.setText("4");
                        arr[0][5]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A6.setText("5");
                        arr[0][5]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A6.setText("6");
                        arr[0][5]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A6.setText("7");
                        arr[0][5]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A6.setText("8");
                        arr[0][5]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A6.setText("9");
                        arr[0][5]=9;
                    }
                });
                break;
            case R.id.a7:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A7.setText("0");
                        arr[0][6]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A7.setText("1");
                        arr[0][6]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A7.setText("2");
                        arr[0][6]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A7.setText("3");
                        arr[0][6]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A7.setText("4");
                        arr[0][6]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A7.setText("5");
                        arr[0][6]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A7.setText("6");
                        arr[0][6]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A7.setText("7");
                        arr[0][6]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A7.setText("8");
                        arr[0][6]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A7.setText("9");
                        arr[0][6]=9;
                    }
                });
                break;
            case R.id.a8:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A8.setText("0");
                        arr[0][7]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A8.setText("1");
                        arr[0][7]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A8.setText("2");
                        arr[0][7]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A8.setText("3");
                        arr[0][7]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A8.setText("4");
                        arr[0][7]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A8.setText("5");
                        arr[0][7]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A8.setText("6");
                        arr[0][7]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A8.setText("7");
                        arr[0][7]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A8.setText("8");
                        arr[0][7]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A8.setText("9");
                        arr[0][7]=9;
                    }
                });
                break;
            case R.id.a9:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A9.setText("0");
                        arr[0][8]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A9.setText("1");
                        arr[0][8]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A9.setText("2");
                        arr[0][8]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A9.setText("3");
                        arr[0][8]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A9.setText("4");
                        arr[0][8]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A9.setText("5");
                        arr[0][8]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A9.setText("6");
                        arr[0][8]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A9.setText("7");
                        arr[0][8]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A9.setText("8");
                        arr[0][8]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        A9.setText("9");
                        arr[0][8]=9;
                    }
                });
                break;
            case R.id.b1:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B1.setText("0");
                        arr[1][0]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B1.setText("1");
                        arr[1][0]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B1.setText("2");
                        arr[1][0]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B1.setText("3");
                        arr[1][0]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B1.setText("4");
                        arr[1][0]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B1.setText("5");
                        arr[1][0]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B1.setText("6");
                        arr[1][0]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B1.setText("7");
                        arr[1][0]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B1.setText("8");
                        arr[1][0]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B1.setText("9");
                        arr[1][0]=9;
                    }
                });
                break;
            case R.id.b2:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B2.setText("0");
                        arr[1][1]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B2.setText("1");
                        arr[1][1]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B2.setText("2");
                        arr[1][1]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B2.setText("3");
                        arr[1][1]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B2.setText("4");
                        arr[1][1]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B2.setText("5");
                        arr[1][1]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B2.setText("6");
                        arr[1][1]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B2.setText("7");
                        arr[1][1]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B2.setText("8");
                        arr[1][1]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B2.setText("9");
                        arr[1][1]=9;
                    }
                });
                break;
            case R.id.b3:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B3.setText("0");
                        arr[1][2]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B3.setText("1");
                        arr[1][2]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B3.setText("2");
                        arr[1][2]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B3.setText("3");
                        arr[1][2]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B3.setText("4");
                        arr[1][2]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B3.setText("5");
                        arr[1][2]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B3.setText("6");
                        arr[1][2]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B3.setText("7");
                        arr[1][2]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B3.setText("8");
                        arr[1][2]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B3.setText("9");
                        arr[1][2]=9;
                    }
                });
                break;
            case R.id.b4:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B4.setText("0");
                        arr[1][3]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B4.setText("1");
                        arr[1][3]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B4.setText("2");
                        arr[1][3]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B4.setText("3");
                        arr[1][3]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B4.setText("4");
                        arr[1][3]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B4.setText("5");
                        arr[1][3]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B4.setText("6");
                        arr[1][3]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B4.setText("7");
                        arr[1][3]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B4.setText("8");
                        arr[1][3]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B4.setText("9");
                        arr[1][3]=9;
                    }
                });
                break;
            case R.id.b5:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B5.setText("0");
                        arr[1][4]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B5.setText("1");
                        arr[1][4]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B5.setText("2");
                        arr[1][4]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B5.setText("3");
                        arr[1][4]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B5.setText("4");
                        arr[1][4]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B5.setText("5");
                        arr[1][4]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B5.setText("6");
                        arr[1][4]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B5.setText("7");
                        arr[1][4]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B5.setText("8");
                        arr[1][4]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B5.setText("9");
                        arr[1][4]=9;
                    }
                });
                break;
            case R.id.b6:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B6.setText("0");
                        arr[1][5]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B6.setText("1");
                        arr[1][5]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B6.setText("2");
                        arr[1][5]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B6.setText("3");
                        arr[1][5]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B6.setText("4");
                        arr[1][5]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B6.setText("5");
                        arr[1][5]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B6.setText("6");
                        arr[1][5]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B6.setText("7");
                        arr[1][5]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B6.setText("8");
                        arr[1][5]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B6.setText("9");
                        arr[1][5]=9;
                    }
                });
                break;
            case R.id.b7:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B7.setText("0");
                        arr[1][6]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B7.setText("1");
                        arr[1][6]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B7.setText("2");
                        arr[1][6]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B7.setText("3");
                        arr[1][6]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B7.setText("4");
                        arr[1][6]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B7.setText("5");
                        arr[1][6]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B7.setText("6");
                        arr[1][6]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B7.setText("7");
                        arr[1][6]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B7.setText("8");
                        arr[1][6]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B7.setText("9");
                        arr[1][6]=9;
                    }
                });
                break;
            case R.id.b8:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B8.setText("0");
                        arr[1][7]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B8.setText("1");
                        arr[1][7]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B8.setText("2");
                        arr[1][7]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B8.setText("3");
                        arr[1][7]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B8.setText("4");
                        arr[1][7]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B8.setText("5");
                        arr[1][7]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B8.setText("6");
                        arr[1][7]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B8.setText("7");
                        arr[1][7]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B8.setText("8");
                        arr[1][7]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B8.setText("9");
                        arr[1][7]=9;
                    }
                });
                break;
            case R.id.b9:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B9.setText("0");
                        arr[1][8]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B9.setText("1");
                        arr[1][8]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B9.setText("2");
                        arr[1][8]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B9.setText("3");
                        arr[1][8]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B9.setText("4");
                        arr[1][8]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B9.setText("5");
                        arr[1][8]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B9.setText("6");
                        arr[1][8]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B9.setText("7");
                        arr[1][8]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B9.setText("8");
                        arr[1][8]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        B9.setText("9");
                        arr[1][8]=9;
                    }
                });
                break;
            case R.id.c1:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C1.setText("0");
                        arr[2][0]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C1.setText("1");
                        arr[2][0]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C1.setText("2");
                        arr[2][0]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C1.setText("3");
                        arr[2][0]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C1.setText("4");
                        arr[2][0]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C1.setText("5");
                        arr[2][0]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C1.setText("6");
                        arr[2][0]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C1.setText("7");
                        arr[2][0]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C1.setText("8");
                        arr[2][0]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C1.setText("9");
                        arr[2][0]=9;
                    }
                });
                break;
            case R.id.c2:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C2.setText("0");
                        arr[2][1]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C2.setText("1");
                        arr[2][1]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C2.setText("2");
                        arr[2][1]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C2.setText("3");
                        arr[2][1]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C2.setText("4");
                        arr[2][1]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C2.setText("5");
                        arr[2][1]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C2.setText("6");
                        arr[2][1]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C2.setText("7");
                        arr[2][1]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C2.setText("8");
                        arr[2][1]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C2.setText("9");
                        arr[2][1]=9;
                    }
                });
                break;
            case R.id.c3:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C3.setText("0");
                        arr[2][2]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C3.setText("1");
                        arr[2][2]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C3.setText("2");
                        arr[2][2]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C3.setText("3");
                        arr[2][2]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C3.setText("4");
                        arr[2][2]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C3.setText("5");
                        arr[2][2]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C3.setText("6");
                        arr[2][2]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C3.setText("7");
                        arr[2][2]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C3.setText("8");
                        arr[2][2]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C3.setText("9");
                        arr[2][2]=9;
                    }
                });
                break;
            case R.id.c4:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C4.setText("0");
                        arr[2][3]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C4.setText("1");
                        arr[2][3]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C4.setText("2");
                        arr[2][3]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C4.setText("3");
                        arr[2][3]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C4.setText("4");
                        arr[2][3]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C4.setText("5");
                        arr[2][3]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C4.setText("6");
                        arr[2][3]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C4.setText("7");
                        arr[2][3]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C4.setText("8");
                        arr[2][3]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C4.setText("9");
                        arr[2][3]=9;
                    }
                });
                break;
            case R.id.c5:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C5.setText("0");
                        arr[2][4]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C5.setText("1");
                        arr[2][4]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C5.setText("2");
                        arr[2][4]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C5.setText("3");
                        arr[2][4]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C5.setText("4");
                        arr[2][4]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C5.setText("5");
                        arr[2][4]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C5.setText("6");
                        arr[2][4]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C5.setText("7");
                        arr[2][4]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C5.setText("8");
                        arr[2][4]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C5.setText("9");
                        arr[2][4]=9;
                    }
                });
                break;
            case R.id.c6:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C6.setText("0");
                        arr[2][5]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C6.setText("1");
                        arr[2][5]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C6.setText("2");
                        arr[2][5]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C6.setText("3");
                        arr[2][5]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C6.setText("4");
                        arr[2][5]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C6.setText("5");
                        arr[2][5]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C6.setText("6");
                        arr[2][5]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C6.setText("7");
                        arr[2][5]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C6.setText("8");
                        arr[2][5]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C6.setText("9");
                        arr[2][5]=9;
                    }
                });
                break;
            case R.id.c7:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C7.setText("0");
                        arr[2][6]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C7.setText("1");
                        arr[2][6]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C7.setText("2");
                        arr[2][6]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C7.setText("3");
                        arr[2][6]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C7.setText("4");
                        arr[2][6]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C7.setText("5");
                        arr[2][6]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C7.setText("6");
                        arr[2][6]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C7.setText("7");
                        arr[2][6]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C7.setText("8");
                        arr[2][6]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C7.setText("9");
                        arr[2][6]=9;
                    }
                });
                break;
            case R.id.c8:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C8.setText("0");
                        arr[2][7]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C8.setText("1");
                        arr[2][7]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C8.setText("2");
                        arr[2][7]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C8.setText("3");
                        arr[2][7]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C8.setText("4");
                        arr[2][7]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C8.setText("5");
                        arr[2][7]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C8.setText("6");
                        arr[2][7]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C8.setText("7");
                        arr[2][7]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C8.setText("8");
                        arr[2][7]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C8.setText("9");
                        arr[2][7]=9;
                    }
                });
                break;
            case R.id.c9:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C9.setText("0");
                        arr[2][8]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C9.setText("1");
                        arr[2][8]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C9.setText("2");
                        arr[2][8]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C9.setText("3");
                        arr[2][8]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C9.setText("4");
                        arr[2][8]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C9.setText("5");
                        arr[2][8]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C9.setText("6");
                        arr[2][8]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C9.setText("7");
                        arr[2][8]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C9.setText("8");
                        arr[2][8]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        C9.setText("9");
                        arr[2][8]=9;
                    }
                });
                break;
            case R.id.d1:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D1.setText("0");
                        arr[3][0]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D1.setText("1");
                        arr[3][0]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D1.setText("2");
                        arr[3][0]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D1.setText("3");
                        arr[3][0]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D1.setText("4");
                        arr[3][0]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D1.setText("5");
                        arr[3][0]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D1.setText("6");
                        arr[3][0]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D1.setText("7");
                        arr[3][0]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D1.setText("8");
                        arr[3][0]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D1.setText("9");
                        arr[3][0]=9;
                    }
                });
                break;
            case R.id.d2:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D2.setText("0");
                        arr[3][1]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D2.setText("1");
                        arr[3][1]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D2.setText("2");
                        arr[3][1]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D2.setText("3");
                        arr[3][1]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D2.setText("4");
                        arr[3][1]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D2.setText("5");
                        arr[3][1]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D2.setText("6");
                        arr[3][1]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D2.setText("7");
                        arr[3][1]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D2.setText("8");
                        arr[3][1]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D2.setText("9");
                        arr[3][1]=9;
                    }
                });
                break;
            case R.id.d3:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D3.setText("0");
                        arr[3][2]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D3.setText("1");
                        arr[3][2]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D3.setText("2");
                        arr[3][2]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D3.setText("3");
                        arr[3][2]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D3.setText("4");
                        arr[3][2]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D3.setText("5");
                        arr[3][2]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D3.setText("6");
                        arr[3][2]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D3.setText("7");
                        arr[3][2]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D3.setText("8");
                        arr[3][2]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D3.setText("9");
                        arr[3][2]=9;
                    }
                });
                break;
            case R.id.d4:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D4.setText("0");
                        arr[3][3]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D4.setText("1");
                        arr[3][3]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D4.setText("2");
                        arr[3][3]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D4.setText("3");
                        arr[3][3]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D4.setText("4");
                        arr[3][3]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D4.setText("5");
                        arr[3][3]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D4.setText("6");
                        arr[3][3]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D4.setText("7");
                        arr[3][3]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D4.setText("8");
                        arr[3][3]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D4.setText("9");
                        arr[3][3]=9;
                    }
                });
                break;
            case R.id.d5:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D5.setText("0");
                        arr[3][4]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D5.setText("1");
                        arr[3][4]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D5.setText("2");
                        arr[3][4]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D5.setText("3");
                        arr[3][4]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D5.setText("4");
                        arr[3][4]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D5.setText("5");
                        arr[3][4]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D5.setText("6");
                        arr[3][4]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D5.setText("7");
                        arr[3][4]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D5.setText("8");
                        arr[3][4]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D5.setText("9");
                        arr[3][4]=9;
                    }
                });
                break;
            case R.id.d6:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D6.setText("0");
                        arr[3][5]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D6.setText("1");
                        arr[3][5]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D6.setText("2");
                        arr[3][5]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D6.setText("3");
                        arr[3][5]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D6.setText("4");
                        arr[3][5]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D6.setText("5");
                        arr[3][5]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D6.setText("6");
                        arr[3][5]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D6.setText("7");
                        arr[3][5]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D6.setText("8");
                        arr[3][5]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D6.setText("9");
                        arr[3][5]=9;
                    }
                });
                break;
            case R.id.d7:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D7.setText("0");
                        arr[3][6]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D7.setText("1");
                        arr[3][6]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D7.setText("2");
                        arr[3][6]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D7.setText("3");
                        arr[3][6]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D7.setText("4");
                        arr[3][6]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D7.setText("5");
                        arr[3][6]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D7.setText("6");
                        arr[3][6]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D7.setText("7");
                        arr[3][6]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D7.setText("8");
                        arr[3][6]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D7.setText("9");
                        arr[3][6]=9;
                    }
                });
                break;
            case R.id.d8:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D8.setText("0");
                        arr[3][7]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D8.setText("1");
                        arr[3][7]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D8.setText("2");
                        arr[3][7]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D8.setText("3");
                        arr[3][7]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D8.setText("4");
                        arr[3][7]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D8.setText("5");
                        arr[3][7]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D8.setText("6");
                        arr[3][7]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D8.setText("7");
                        arr[3][7]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D8.setText("8");
                        arr[3][7]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D8.setText("9");
                        arr[3][7]=9;
                    }
                });
                break;
            case R.id.d9:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D9.setText("0");
                        arr[3][8]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D9.setText("1");
                        arr[3][8]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D9.setText("2");
                        arr[3][8]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D9.setText("3");
                        arr[3][8]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D9.setText("4");
                        arr[3][8]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D9.setText("5");
                        arr[3][8]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D9.setText("6");
                        arr[3][8]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D9.setText("7");
                        arr[3][8]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D9.setText("8");
                        arr[3][8]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        D9.setText("9");
                        arr[3][8]=9;
                    }
                });
                break;
            case R.id.e1:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E1.setText("0");
                        arr[4][0]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E1.setText("1");
                        arr[4][0]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E1.setText("2");
                        arr[4][0]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E1.setText("3");
                        arr[4][0]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E1.setText("4");
                        arr[4][0]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E1.setText("5");
                        arr[4][0]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E1.setText("6");
                        arr[4][0]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E1.setText("7");
                        arr[4][0]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E1.setText("8");
                        arr[4][0]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E1.setText("9");
                        arr[4][0]=9;
                    }
                });
                break;
            case R.id.e2:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E2.setText("0");
                        arr[4][1]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E2.setText("1");
                        arr[4][1]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E2.setText("2");
                        arr[4][1]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E2.setText("3");
                        arr[4][1]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E2.setText("4");
                        arr[4][1]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E2.setText("5");
                        arr[4][1]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E2.setText("6");
                        arr[4][1]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E2.setText("7");
                        arr[4][1]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E2.setText("8");
                        arr[4][1]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E2.setText("9");
                        arr[4][1]=9;
                    }
                });
                break;
            case R.id.e3:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E3.setText("0");
                        arr[4][2]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E3.setText("1");
                        arr[4][2]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E3.setText("2");
                        arr[4][2]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E3.setText("3");
                        arr[4][2]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E3.setText("4");
                        arr[4][2]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E3.setText("5");
                        arr[4][2]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E3.setText("6");
                        arr[4][2]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E3.setText("7");
                        arr[4][2]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E3.setText("8");
                        arr[4][2]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E3.setText("9");
                        arr[4][2]=9;
                    }
                });
                break;
            case R.id.e4:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E4.setText("0");
                        arr[4][3]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E4.setText("1");
                        arr[4][3]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E4.setText("2");
                        arr[4][3]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E4.setText("3");
                        arr[4][3]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E4.setText("4");
                        arr[4][3]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E4.setText("5");
                        arr[4][3]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E4.setText("6");
                        arr[4][3]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E4.setText("7");
                        arr[4][3]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E4.setText("8");
                        arr[4][3]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E4.setText("9");
                        arr[4][3]=9;
                    }
                });
                break;
            case R.id.e5:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E5.setText("0");
                        arr[4][4]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E5.setText("1");
                        arr[4][4]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E5.setText("2");
                        arr[4][4]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E5.setText("3");
                        arr[4][4]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E5.setText("4");
                        arr[4][4]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E5.setText("5");
                        arr[4][4]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E5.setText("6");
                        arr[4][4]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E5.setText("7");
                        arr[4][4]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E5.setText("8");
                        arr[4][4]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E5.setText("9");
                        arr[4][4]=9;
                    }
                });
                break;
            case R.id.e6:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E6.setText("0");
                        arr[4][5]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E6.setText("1");
                        arr[4][5]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E6.setText("2");
                        arr[4][5]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E6.setText("3");
                        arr[4][5]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E6.setText("4");
                        arr[4][5]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E6.setText("5");
                        arr[4][5]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E6.setText("6");
                        arr[4][5]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E6.setText("7");
                        arr[4][5]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E6.setText("8");
                        arr[4][5]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E6.setText("9");
                        arr[4][5]=9;
                    }
                });
                break;
            case R.id.e7:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E7.setText("0");
                        arr[4][6]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E7.setText("1");
                        arr[4][6]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E7.setText("2");
                        arr[4][6]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E7.setText("3");
                        arr[4][6]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E7.setText("4");
                        arr[4][6]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E7.setText("5");
                        arr[4][6]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E7.setText("6");
                        arr[4][6]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E7.setText("7");
                        arr[4][6]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E7.setText("8");
                        arr[4][6]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E7.setText("9");
                        arr[4][6]=9;
                    }
                });
                break;
            case R.id.e8:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E8.setText("0");
                        arr[4][7]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E8.setText("1");
                        arr[4][7]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E8.setText("2");
                        arr[4][7]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E8.setText("3");
                        arr[4][7]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E8.setText("4");
                        arr[4][7]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E8.setText("5");
                        arr[4][7]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E8.setText("6");
                        arr[4][7]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E8.setText("7");
                        arr[4][7]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E8.setText("8");
                        arr[4][7]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E8.setText("9");
                        arr[4][7]=9;
                    }
                });
                break;
            case R.id.e9:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E9.setText("0");
                        arr[4][8]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E9.setText("1");
                        arr[4][8]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E9.setText("2");
                        arr[4][8]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E9.setText("3");
                        arr[4][8]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E9.setText("4");
                        arr[4][8]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E9.setText("5");
                        arr[4][8]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E9.setText("6");
                        arr[4][8]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E9.setText("7");
                        arr[4][8]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E9.setText("8");
                        arr[4][8]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        E9.setText("9");
                        arr[4][8]=9;
                    }
                });
                break;
            case R.id.f1:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F1.setText("0");
                        arr[5][0]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F1.setText("1");
                        arr[5][0]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F1.setText("2");
                        arr[5][0]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F1.setText("3");
                        arr[5][0]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F1.setText("4");
                        arr[5][0]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F1.setText("5");
                        arr[5][0]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F1.setText("6");
                        arr[5][0]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F1.setText("7");
                        arr[5][0]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F1.setText("8");
                        arr[5][0]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F1.setText("9");
                        arr[5][0]=9;
                    }
                });
                break;
            case R.id.f2:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F2.setText("0");
                        arr[5][1]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F2.setText("1");
                        arr[5][1]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F2.setText("2");
                        arr[5][1]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F2.setText("3");
                        arr[5][1]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F2.setText("4");
                        arr[5][1]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F2.setText("5");
                        arr[5][1]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F2.setText("6");
                        arr[5][1]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F2.setText("7");
                        arr[5][1]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F2.setText("8");
                        arr[5][1]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F2.setText("9");
                        arr[5][1]=9;
                    }
                });
                break;
            case R.id.f3:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F3.setText("0");
                        arr[5][2]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F3.setText("1");
                        arr[5][2]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F3.setText("2");
                        arr[5][2]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F3.setText("3");
                        arr[5][2]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F3.setText("4");
                        arr[5][2]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F3.setText("5");
                        arr[5][2]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F3.setText("6");
                        arr[5][2]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F3.setText("7");
                        arr[5][2]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F3.setText("8");
                        arr[5][2]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F3.setText("9");
                        arr[5][2]=9;
                    }
                });
                break;
            case R.id.f4:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F4.setText("0");
                        arr[5][3]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F4.setText("1");
                        arr[5][3]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F4.setText("2");
                        arr[5][3]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F4.setText("3");
                        arr[5][3]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F4.setText("4");
                        arr[5][3]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F4.setText("5");
                        arr[5][3]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F4.setText("6");
                        arr[5][3]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F4.setText("7");
                        arr[5][3]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F4.setText("8");
                        arr[5][3]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F4.setText("9");
                        arr[5][3]=9;
                    }
                });
                break;
            case R.id.f5:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F5.setText("0");
                        arr[5][4]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F5.setText("1");
                        arr[5][4]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F5.setText("2");
                        arr[5][4]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F5.setText("3");
                        arr[5][4]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F5.setText("4");
                        arr[5][4]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F5.setText("5");
                        arr[5][4]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F5.setText("6");
                        arr[5][4]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F5.setText("7");
                        arr[5][4]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F5.setText("8");
                        arr[5][4]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F5.setText("9");
                        arr[5][4]=9;
                    }
                });
                break;
            case R.id.f6:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F6.setText("0");
                        arr[5][5]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F6.setText("1");
                        arr[5][5]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F6.setText("2");
                        arr[5][5]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F6.setText("3");
                        arr[5][5]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F6.setText("4");
                        arr[5][5]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F6.setText("5");
                        arr[5][5]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F6.setText("6");
                        arr[5][5]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F6.setText("7");
                        arr[5][5]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F6.setText("8");
                        arr[5][5]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F6.setText("9");
                        arr[5][5]=9;
                    }
                });
                break;
            case R.id.f7:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F7.setText("0");
                        arr[5][6]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F7.setText("1");
                        arr[5][6]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F7.setText("2");
                        arr[5][6]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F7.setText("3");
                        arr[5][6]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F7.setText("4");
                        arr[5][6]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F7.setText("5");
                        arr[5][6]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F7.setText("6");
                        arr[5][6]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F7.setText("7");
                        arr[5][6]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F7.setText("8");
                        arr[5][6]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F7.setText("9");
                        arr[5][6]=9;
                    }
                });
                break;
            case R.id.f8:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F8.setText("0");
                        arr[5][7]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F8.setText("1");
                        arr[5][7]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F8.setText("2");
                        arr[5][7]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F8.setText("3");
                        arr[5][7]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F8.setText("4");
                        arr[5][7]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F8.setText("5");
                        arr[5][7]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F8.setText("6");
                        arr[5][7]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F8.setText("7");
                        arr[5][7]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F8.setText("8");
                        arr[5][7]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F8.setText("9");
                        arr[5][7]=9;
                    }
                });
                break;
            case R.id.f9:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F9.setText("0");
                        arr[5][8]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F9.setText("1");
                        arr[5][8]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F9.setText("2");
                        arr[5][8]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F9.setText("3");
                        arr[5][8]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F9.setText("4");
                        arr[5][8]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F9.setText("5");
                        arr[5][8]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F9.setText("6");
                        arr[5][8]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F9.setText("7");
                        arr[5][8]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F9.setText("8");
                        arr[5][8]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        F9.setText("9");
                        arr[5][8]=9;
                    }
                });
                break;
            case R.id.g1:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G1.setText("0");
                        arr[6][0]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G1.setText("1");
                        arr[6][0]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G1.setText("2");
                        arr[6][0]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G1.setText("3");
                        arr[6][0]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G1.setText("4");
                        arr[6][0]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G1.setText("5");
                        arr[6][0]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G1.setText("6");
                        arr[6][0]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G1.setText("7");
                        arr[6][0]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G1.setText("8");
                        arr[6][0]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G1.setText("9");
                        arr[6][0]=9;
                    }
                });
                break;
            case R.id.g2:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G2.setText("0");
                        arr[6][1]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G2.setText("1");
                        arr[6][1]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G2.setText("2");
                        arr[6][1]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G2.setText("3");
                        arr[6][1]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G2.setText("4");
                        arr[6][1]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G2.setText("5");
                        arr[6][1]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G2.setText("6");
                        arr[6][1]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G2.setText("7");
                        arr[6][1]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G2.setText("8");
                        arr[6][1]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G2.setText("9");
                        arr[6][1]=9;
                    }
                });
                break;
            case R.id.g3:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G3.setText("0");
                        arr[6][2]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G3.setText("1");
                        arr[6][2]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G3.setText("2");
                        arr[6][2]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G3.setText("3");
                        arr[6][2]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G3.setText("4");
                        arr[6][2]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G3.setText("5");
                        arr[6][2]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G3.setText("6");
                        arr[6][2]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G3.setText("7");
                        arr[6][2]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G3.setText("8");
                        arr[6][2]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G3.setText("9");
                        arr[6][2]=9;
                    }
                });
                break;
            case R.id.g4:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G4.setText("0");
                        arr[6][3]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G4.setText("1");
                        arr[6][3]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G4.setText("2");
                        arr[6][3]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G4.setText("3");
                        arr[6][3]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G4.setText("4");
                        arr[6][3]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G4.setText("5");
                        arr[6][3]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G4.setText("6");
                        arr[6][3]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G4.setText("7");
                        arr[6][3]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G4.setText("8");
                        arr[6][3]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G4.setText("9");
                        arr[6][3]=9;
                    }
                });
                break;
            case R.id.g5:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G5.setText("0");
                        arr[6][4]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G5.setText("1");
                        arr[6][4]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G5.setText("2");
                        arr[6][4]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G5.setText("3");
                        arr[6][4]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G5.setText("4");
                        arr[6][4]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G5.setText("5");
                        arr[6][4]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G5.setText("6");
                        arr[6][4]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G5.setText("7");
                        arr[6][4]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G5.setText("8");
                        arr[6][4]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G5.setText("9");
                        arr[6][4]=9;
                    }
                });
                break;
            case R.id.g6:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G6.setText("0");
                        arr[6][5]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G6.setText("1");
                        arr[6][5]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G6.setText("2");
                        arr[6][5]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G6.setText("3");
                        arr[6][5]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G6.setText("4");
                        arr[6][5]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G6.setText("5");
                        arr[6][5]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G6.setText("6");
                        arr[6][5]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G6.setText("7");
                        arr[6][5]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G6.setText("8");
                        arr[6][5]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G6.setText("9");
                        arr[6][5]=9;
                    }
                });
                break;
            case R.id.g7:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G7.setText("0");
                        arr[6][6]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G7.setText("1");
                        arr[6][6]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G7.setText("2");
                        arr[6][6]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G7.setText("3");
                        arr[6][6]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G7.setText("4");
                        arr[6][6]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G7.setText("5");
                        arr[6][6]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G7.setText("6");
                        arr[6][6]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G7.setText("7");
                        arr[6][6]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G7.setText("8");
                        arr[6][6]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G7.setText("9");
                        arr[6][6]=9;
                    }
                });
                break;
            case R.id.g8:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G8.setText("0");
                        arr[6][7]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G8.setText("1");
                        arr[6][7]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G8.setText("2");
                        arr[6][7]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G8.setText("3");
                        arr[6][7]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G8.setText("4");
                        arr[6][7]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G8.setText("5");
                        arr[6][7]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G8.setText("6");
                        arr[6][7]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G8.setText("7");
                        arr[6][7]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G8.setText("8");
                        arr[6][7]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G8.setText("9");
                        arr[6][7]=9;
                    }
                });
                break;
            case R.id.g9:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G9.setText("0");
                        arr[6][8]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G9.setText("1");
                        arr[6][8]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G9.setText("2");
                        arr[6][8]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G9.setText("3");
                        arr[6][8]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G9.setText("4");
                        arr[6][8]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G9.setText("5");
                        arr[6][8]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G9.setText("6");
                        arr[6][8]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G9.setText("7");
                        arr[6][8]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G9.setText("8");
                        arr[6][8]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        G9.setText("9");
                        arr[6][8]=9;
                    }
                });
                break;
            case R.id.h1:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H1.setText("0");
                        arr[7][0]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H1.setText("1");
                        arr[7][0]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H1.setText("2");
                        arr[7][0]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H1.setText("3");
                        arr[7][0]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H1.setText("4");
                        arr[7][0]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H1.setText("5");
                        arr[7][0]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H1.setText("6");
                        arr[7][0]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H1.setText("7");
                        arr[7][0]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H1.setText("8");
                        arr[7][0]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H1.setText("9");
                        arr[7][0]=9;
                    }
                });
                break;
            case R.id.h2:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H2.setText("0");
                        arr[7][1]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H2.setText("1");
                        arr[7][1]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H2.setText("2");
                        arr[7][1]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H2.setText("3");
                        arr[7][1]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H2.setText("4");
                        arr[7][1]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H2.setText("5");
                        arr[7][1]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H2.setText("6");
                        arr[7][1]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H2.setText("7");
                        arr[7][1]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H2.setText("8");
                        arr[7][1]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H2.setText("9");
                        arr[7][1]=9;
                    }
                });
                break;
            case R.id.h3:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H3.setText("0");
                        arr[7][2]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H3.setText("1");
                        arr[7][2]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H3.setText("2");
                        arr[7][2]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H3.setText("3");
                        arr[7][2]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H3.setText("4");
                        arr[7][2]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H3.setText("5");
                        arr[7][2]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H3.setText("6");
                        arr[7][2]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H3.setText("7");
                        arr[7][2]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H3.setText("8");
                        arr[7][2]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H3.setText("9");
                        arr[7][2]=9;
                    }
                });
                break;
            case R.id.h4:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H4.setText("0");
                        arr[7][3]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H4.setText("1");
                        arr[7][3]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H4.setText("2");
                        arr[7][3]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H4.setText("3");
                        arr[7][3]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H4.setText("4");
                        arr[7][3]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H4.setText("5");
                        arr[7][3]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H4.setText("6");
                        arr[7][3]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H4.setText("7");
                        arr[7][3]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H4.setText("8");
                        arr[7][3]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H4.setText("9");
                        arr[7][3]=9;
                    }
                });
                break;
            case R.id.h5:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H5.setText("0");
                        arr[7][4]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H5.setText("1");
                        arr[7][4]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H5.setText("2");
                        arr[7][4]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H5.setText("3");
                        arr[7][4]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H5.setText("4");
                        arr[7][4]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H5.setText("5");
                        arr[7][4]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H5.setText("6");
                        arr[7][4]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H5.setText("7");
                        arr[7][4]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H5.setText("8");
                        arr[7][4]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H5.setText("9");
                        arr[7][4]=9;
                    }
                });
                break;
            case R.id.h6:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H6.setText("0");
                        arr[7][5]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H6.setText("1");
                        arr[7][5]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H6.setText("2");
                        arr[7][5]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H6.setText("3");
                        arr[7][5]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H6.setText("4");
                        arr[7][5]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H6.setText("5");
                        arr[7][5]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H6.setText("6");
                        arr[7][5]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H6.setText("7");
                        arr[7][5]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H6.setText("8");
                        arr[7][5]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H6.setText("9");
                        arr[7][5]=9;
                    }
                });
                break;
            case R.id.h7:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H7.setText("0");
                        arr[7][6]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H7.setText("1");
                        arr[7][6]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H7.setText("2");
                        arr[7][6]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H7.setText("3");
                        arr[7][6]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H7.setText("4");
                        arr[7][6]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H7.setText("5");
                        arr[7][6]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H7.setText("6");
                        arr[7][6]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H7.setText("7");
                        arr[7][6]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H7.setText("8");
                        arr[7][6]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H7.setText("9");
                        arr[7][6]=9;
                    }
                });
                break;
            case R.id.h8:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H8.setText("0");
                        arr[7][7]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H8.setText("1");
                        arr[7][7]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H8.setText("2");
                        arr[7][7]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H8.setText("3");
                        arr[7][7]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H8.setText("4");
                        arr[7][7]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H8.setText("5");
                        arr[7][7]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H8.setText("6");
                        arr[7][7]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H8.setText("7");
                        arr[7][7]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H8.setText("8");
                        arr[7][7]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H8.setText("9");
                        arr[7][7]=9;
                    }
                });
                break;
            case R.id.h9:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H9.setText("0");
                        arr[7][8]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H9.setText("1");
                        arr[7][8]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H9.setText("2");
                        arr[7][8]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H9.setText("3");
                        arr[7][8]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H9.setText("4");
                        arr[7][8]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H9.setText("5");
                        arr[7][8]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H9.setText("6");
                        arr[7][8]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H9.setText("7");
                        arr[7][8]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H9.setText("8");
                        arr[7][8]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        H9.setText("9");
                        arr[7][8]=9;
                    }
                });
                break;
            case R.id.i1:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I1.setText("0");
                        arr[8][0]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I1.setText("1");
                        arr[8][0]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I1.setText("2");
                        arr[8][0]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I1.setText("3");
                        arr[8][0]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I1.setText("4");
                        arr[8][0]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I1.setText("5");
                        arr[8][0]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I1.setText("6");
                        arr[8][0]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I1.setText("7");
                        arr[8][0]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I1.setText("8");
                        arr[8][0]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I1.setText("9");
                        arr[8][0]=9;
                    }
                });
                break;
            case R.id.i2:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I2.setText("0");
                        arr[8][1]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I2.setText("1");
                        arr[8][1]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I2.setText("2");
                        arr[8][1]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I2.setText("3");
                        arr[8][1]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I2.setText("4");
                        arr[8][1]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I2.setText("5");
                        arr[8][1]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I2.setText("6");
                        arr[8][1]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I2.setText("7");
                        arr[8][1]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I2.setText("8");
                        arr[8][1]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I2.setText("9");
                        arr[8][1]=9;
                    }
                });
                break;
            case R.id.i3:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I3.setText("0");
                        arr[8][2]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I3.setText("1");
                        arr[8][2]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I3.setText("2");
                        arr[8][2]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I3.setText("3");
                        arr[8][2]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I3.setText("4");
                        arr[8][2]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I3.setText("5");
                        arr[8][2]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I3.setText("6");
                        arr[8][2]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I3.setText("7");
                        arr[8][2]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I3.setText("8");
                        arr[8][2]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I3.setText("9");
                        arr[8][2]=9;
                    }
                });
                break;
            case R.id.i4:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I4.setText("0");
                        arr[8][3]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I4.setText("1");
                        arr[8][3]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I4.setText("2");
                        arr[8][3]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I4.setText("3");
                        arr[8][3]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I4.setText("4");
                        arr[8][3]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I4.setText("5");
                        arr[8][3]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I4.setText("6");
                        arr[8][3]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I4.setText("7");
                        arr[8][3]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I4.setText("8");
                        arr[8][3]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I4.setText("9");
                        arr[8][3]=9;
                    }
                });
                break;
            case R.id.i5:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I5.setText("0");
                        arr[8][4]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I5.setText("1");
                        arr[8][4]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I5.setText("2");
                        arr[8][4]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I5.setText("3");
                        arr[8][4]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I5.setText("4");
                        arr[8][4]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I5.setText("5");
                        arr[8][4]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I5.setText("6");
                        arr[8][4]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I5.setText("7");
                        arr[8][4]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I5.setText("8");
                        arr[8][4]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I5.setText("9");
                        arr[8][4]=9;
                    }
                });
                break;
            case R.id.i6:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I6.setText("0");
                        arr[8][5]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I6.setText("1");
                        arr[8][5]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I6.setText("2");
                        arr[8][5]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I6.setText("3");
                        arr[8][5]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I6.setText("4");
                        arr[8][5]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I6.setText("5");
                        arr[8][5]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I6.setText("6");
                        arr[8][5]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I6.setText("7");
                        arr[8][5]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I6.setText("8");
                        arr[8][5]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I6.setText("9");
                        arr[8][5]=9;
                    }
                });
                break;
            case R.id.i7:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I7.setText("0");
                        arr[8][6]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I7.setText("1");
                        arr[8][6]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I7.setText("2");
                        arr[8][6]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I7.setText("3");
                        arr[8][6]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I7.setText("4");
                        arr[8][6]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I7.setText("5");
                        arr[8][6]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I7.setText("6");
                        arr[8][6]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I7.setText("7");
                        arr[8][6]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I7.setText("8");
                        arr[8][6]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I7.setText("9");
                        arr[8][6]=9;
                    }
                });
                break;
            case R.id.i8:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I8.setText("0");
                        arr[8][7]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I8.setText("1");
                        arr[8][7]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I8.setText("2");
                        arr[8][7]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I8.setText("3");
                        arr[8][7]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I8.setText("4");
                        arr[8][7]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I8.setText("5");
                        arr[8][7]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I8.setText("6");
                        arr[8][7]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I8.setText("7");
                        arr[8][7]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I8.setText("8");
                        arr[8][7]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I8.setText("9");
                        arr[8][7]=9;
                    }
                });
                break;
            case R.id.i9:
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I9.setText("0");
                        arr[8][8]=0;
                    }
                });
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I9.setText("1");
                        arr[8][8]=1;
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I9.setText("2");
                        arr[8][8]=2;
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I9.setText("3");
                        arr[8][8]=3;
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I9.setText("4");
                        arr[8][8]=4;
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I9.setText("5");
                        arr[8][8]=5;
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I9.setText("6");
                        arr[8][8]=6;
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I9.setText("7");
                        arr[8][8]=7;
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I9.setText("8");
                        arr[8][8]=8;
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        I9.setText("9");
                        arr[8][8]=9;
                    }
                });
                break;

        }

    }
}