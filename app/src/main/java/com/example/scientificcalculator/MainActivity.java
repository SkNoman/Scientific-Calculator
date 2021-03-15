package com.example.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bdot,bpie,bequal,bplus,bmin,bdiv,bmul,bsqrt,bsquare,bfact,bln,blog,btan,bcos,bsin,bpow,bmod,bc,bac;
    TextView output,input;
    String operation;
    double value,valueone,result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //just remove below line
        Toast.makeText(getApplicationContext(),"I Changed The Structure for You Jan", Toast.LENGTH_SHORT).show();


        b0=findViewById(R.id.b0);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        bdot=findViewById(R.id.bdot);
        bpie=findViewById(R.id.bpie);
        bequal=findViewById(R.id.bequal);
        bplus=findViewById(R.id.bplus);
        bmin=findViewById(R.id.bmin);
        bdiv=findViewById(R.id.bdiv);
        bmul=findViewById(R.id.bmul);
        bsqrt=findViewById(R.id.bsqrt);
        bsquare=findViewById(R.id.bsquare);
        bfact=findViewById(R.id.bfact);
        bln=findViewById(R.id.bln);
        blog=findViewById(R.id.blog);
        btan=findViewById(R.id.btan);
        bcos=findViewById(R.id.bcos);
        bsin=findViewById(R.id.bsin);
        bpow=findViewById(R.id.bpow);
        bmod=findViewById(R.id.bmod);

        bc=findViewById(R.id.bc);
        bac=findViewById(R.id.bac);

        input=findViewById(R.id.tvmain);
        output=findViewById(R.id.tvsec);


        //on click method.

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"9");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!input.getText().toString().contains("."))
                    if(input.getText().equals(""))
                    {
                        input.setText("0.");
                    }
                    else {
                        input.setText(input.getText() + ".");
                    }
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                output.setText("");
                Toast.makeText(getApplicationContext(),"I Love You Jan", Toast.LENGTH_SHORT).show();
                //above message is for fun don't take it seriously
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = input.getText().toString();
                val = val.substring(0, val.length() - 1);
                input.setText(val);
                if(val.length()==0){
                    Toast.makeText(getApplicationContext(),"Exit Calculator", Toast.LENGTH_SHORT).show();
                    input.setText(""+0);
                }

            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!input.getText().equals("")) {
                    operation = "+";
                    input();
                }
            }
        });

        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!input.getText().equals("")) {
                    operation = "-";
                    input();
                }
            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!input.getText().equals("")) {
                    operation = "*";
                    input();
                }
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!input.getText().equals("")) {
                    operation = "/";
                    input();
                }
            }
        });



        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().equals(""))
                {
                    output.setText("Sin ");
                    operation="sin";
                }


            }
        });

        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().equals(""))
                {
                    output.setText("Cos ");
                    operation="cos";
                }

            }
        });

        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().equals(""))
                {
                    output.setText("Tan ");
                    operation="tan";
                }

            }
        });

       blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().equals(""))
                {
                    output.setText("log(x)");
                    operation="log";
                }
                else
                {
                    value=Double.parseDouble(input.getText().toString());
                    result=Math.log10(value);
                    output.setText("log("+value+")=");
                    input.setText(String.valueOf(result));
                }
            }
        });

        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().equals(""))
                {
                    output.setText("ln(x)");
                    operation="ln";
                }
                else
                {
                    value=Double.parseDouble(input.getText().toString());
                    result=Math.log(value);
                    output.setText("ln("+value+")=");
                    input.setText(String.valueOf(result));
                }
            }
        });

        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().equals(""))
                {
                    output.setText("sqrt(x)");
                    operation="sqrt";
                }
                else
                {
                    value=Double.parseDouble(input.getText().toString());
                    result=Math.sqrt(value);
                    output.setText("sqrt("+value+")=");
                    input.setText(String.valueOf(result));
                }
            }
        });

        bsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().equals(""))
                {
                    output.setText("X^2");
                    operation="square";
                }
                else
                {
                    value=Double.parseDouble(input.getText().toString());
                    result=value*value;
                    output.setText(String.valueOf(value)+"^2");
                    input.setText(String.valueOf(result));
                }
            }
        });
        bpie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = Double.parseDouble(input.getText().toString());
                result = value*3.14159265;
                output.setText(""+result);
            }
        });
        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(input.getText().toString());
                int i;
                int fact  = 1;

                for(i = 1;i <= val;i++)
                {
                    fact = fact * i;
                    input.setText(String.valueOf(fact));
                    output.setText(val+"!");
                }

            }
        });

        bpow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!input.getText().equals("")){

                    value=Double.parseDouble(input.getText().toString());
                    input();
                    operation="pow";
                    output.setText(String.valueOf(value)+"^");
                }
            }
        });
        bmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!input.getText().equals("")) {
                    operation = "%";
                    input();
                }
            }
        });





        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(output.getText().equals("")&&input.getText().equals(""))){
                    valueone=Double.parseDouble(input.getText().toString());
                    if(operation.equals("+")){
                        value=value+valueone;
                        result=value;
                        output.setText(output.getText()+String.valueOf(valueone));
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("-")){
                        value=value-valueone;
                        result=value;
                        output.setText(output.getText()+String.valueOf(valueone));
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("*")){
                        value=value*valueone;
                        result=value;
                        output.setText(output.getText()+String.valueOf(valueone));
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("/")){
                        value=value/valueone;
                        result=value;
                        output.setText(output.getText()+String.valueOf(valueone));
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("%")){
                        value=value  % valueone;
                        result=value;
                        output.setText(output.getText()+String.valueOf(valueone));
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("pow")) {
                        value=Math.pow(value,valueone);
                        result=value;
                        output.setText(output.getText()+String.valueOf(valueone));
                        input.setText(String.valueOf(result));
                    }

                    if(operation.equals("sin")){

                        value=Double.parseDouble(input.getText().toString());
                        result = Math.sin(Math.toRadians(value));
                        input.setText("="+result);
                        output.setText("Sin"+value);
                    }

                    if(operation.equals("cos")){
                        value=Double.parseDouble(input.getText().toString());
                        result = Math.cos(Math.toRadians(value));
                        input.setText("="+result);
                        output.setText("Cos"+value);
                    }
                    if(operation.equals("tan")){
                        value=Double.parseDouble(input.getText().toString());
                        result = Math.tan(Math.toRadians(value));
                        input.setText("="+result);
                        output.setText("Tan"+value);
                    }
                    if(operation.equals("log")){
                        value=Math.log10(valueone);
                        result=value;
                        output.setText("Log("+valueone+")=");
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("ln")){
                        value=Math.log(valueone);
                        result=value;
                        output.setText("Ln("+valueone+")=");
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("sqrt")){
                        value=Math.sqrt(valueone);
                        result=value;
                        output.setText("Sqrt("+valueone+")=");
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("square")){
                        value=valueone*valueone;
                        result=value;
                        output.setText("Square("+valueone+")=");
                        input.setText(String.valueOf(result));
                    }
                    if(operation.equals("%")){
                        value=value%valueone;
                        result=value;
                        input.setText(String.valueOf(result));
                    }


                }
            }
        });

    }
    void input(){
        value=Double.parseDouble(input.getText().toString());
        input.setText("");
        output.setText(value+operation);
    }


}