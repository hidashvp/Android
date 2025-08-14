package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity  extends AppCompatActivity {
    Button
    btn0,btn1,btn2,  btn3,btn4,btn5,  btn6,btn7,btn8,btn9,btnDivide,btnMultiply,btnMinus,btnClear,btnEqual,btnPlus;
    EditText res;
    float n1,n2;
    boolean add,sub,multi,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btn0=(Button)findViewById(R.id.btn0);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        //
        btnClear=(Button)findViewById(R.id.btnClear);
        btnDivide=(Button)findViewById(R.id.btnDivide) ;
        btnMultiply=(Button)findViewById(R.id.btnMultiply);
        btnMinus=(Button)findViewById(R.id.btnMinus);
        btnPlus=(Button)findViewById(R.id.btnPlus);
        btnEqual=(Button)findViewById(R.id.btnEqual);
        res=(EditText)findViewById(R.id.out) ;
        //
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.append("0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.append("1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.append("2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.append("3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.append("4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.append("5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.append("6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.append("7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.append("8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.append("9");
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res==null){
                    res.setText("");
                }
                else {
                    n1=Float.parseFloat(res.getText()+"");
                    add=true;
                    res.setText(null);
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res==null) {
                    res.setText("");}
                    else{
                    n1= Float.parseFloat(res.getText()+"");
                    sub = true;
                    res.setText("");
                }
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res==null) {
                    res.setText("");}
                else{
                    n1= Float.parseFloat(res.getText()+"");
                    multi = true;
                    res.setText("");
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res==null) {
                    res.setText("");}
                else{
                    n1= Float.parseFloat(res.getText()+"");
                    div = true;
                    res.setText("");
                }
            }
        });

        // Clear button: clear EditText and reset flags
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("");
                add = sub = multi = div = false;
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n2=Float.parseFloat(res.getText()+"");
                if(add==true){
                    res.setText((n1+n2+""));
                    add=false;
                }
                if(sub==true){
                    res.setText((n1-n2+""));
                    sub=false;
                }
                if(multi==true){
                    res.setText((n1*n2+""));
                    multi=false;
                }
                if(div==true){
                    res.setText((n1/n2+""));
                    div=false;
                }

            }
        });
    }
}








