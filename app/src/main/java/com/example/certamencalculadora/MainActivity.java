package com.example.certamencalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1, tv2, tv3, tv4, tv5, tv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv_num1);
        tv2 = (TextView) findViewById(R.id.tv_simbolo);
        tv3 = (TextView) findViewById(R.id.tv_num2);
        tv5 = (TextView) findViewById(R.id.tv_resultado);
        tv6 = (TextView) findViewById(R.id.textView6);
    }

    public void sumar(View view){

        String valor1 = tv1.getText().toString(); //primero es String
        String valor2 = tv3.getText().toString();

        if( valor1.equals("") || valor2.equals("") ) {

            String error = getString(R.string.Error);
            tv5.setText(error);
            tv6.setText("");
        }

        else {
            //capturamos el texto introducido con un String y luego lo parseamos (lo convertimos a numero)
            tv2.setText("+");


            int numero1 = Integer.parseInt(valor1); //se parsea valor1 a INT
            int numero2 = Integer.parseInt(valor2);

            int suma = numero1 + numero2;

            String resultado = String.valueOf(suma); // se parseó un INT a STRING, porque no se puede mostrar un int de manera directa en el activity xml

            //seteamos (enviamos) el resultado al TextView )

            tv5.setText(resultado);
        }
    }

    public void restar(View view){

        String valor1 = tv1.getText().toString(); //primero es String
        String valor2 = tv3.getText().toString();

        if( valor1.equals("") || valor2.equals("") ) {

            String error = getString(R.string.Error);
            tv5.setText(error);
            tv6.setText("");
        }

        else {
            //capturamos el texto introducido con un String y luego lo parseamos (lo convertimos a numero)
            tv2.setText("-");

            int numero1 = Integer.parseInt(valor1); //se parsea valor1 a INT
            int numero2 = Integer.parseInt(valor2);

            int resta = numero1 - numero2;

            String resultado = String.valueOf(resta); // se parseó un INT a STRING, porque no se puede mostrar un int de manera directa en el activity xml

            //seteamos (enviamos) el resultado al TextView )

            tv5.setText(resultado);

        }

    }


    public void multiplicar(View view){

        String valor1 = tv1.getText().toString(); //primero es String
        String valor2 = tv3.getText().toString();

        if( valor1.equals("") || valor2.equals("") ) {

            String error = getString(R.string.Error);
            tv5.setText(error);
            tv6.setText("");
        }

        else {
            //capturamos el texto introducido con un String y luego lo parseamos (lo convertimos a numero)
            tv2.setText("X");


            int numero1 = Integer.parseInt(valor1); //se parsea valor1 a INT
            int numero2 = Integer.parseInt(valor2);

            int producto = numero1 * numero2;

            String resultado = String.valueOf(producto); // se parseó un INT a STRING, porque no se puede mostrar un int de manera directa en el activity xml

            //seteamos (enviamos) el resultado al TextView )

            tv5.setText(resultado);

        }

    }

    public void dividir(View view){

        tv2.setText("/");
        //capturamos el texto introducido con un String y luego lo parseamos (lo convertimos a numero)

        String valor1 = tv1.getText().toString(); //primero es String
        String valor2 = tv3.getText().toString();



        if( valor1.equals("") || valor2.equals("") ) {

            String error = getString(R.string.Error);
            tv5.setText(error);
            tv6.setText("");
        }

        else
        {

            int numero1 = Integer.parseInt(valor1); //se parsea valor1 a INT
            int numero2 = Integer.parseInt(valor2);
            if(numero2!=0)
            {

                    float division = (float) numero1 / (float) numero2;

                    String resultado = String.valueOf(division); // se parseó un INT a STRING, porque no se puede mostrar un int de manera directa en el activity xml

                    //seteamos (enviamos) el resultado al TextView )

                    tv5.setText(resultado);
            }
            else{

                String error = getString(R.string.Error);
                tv5.setText(error);
                tv6.setText("");
            }

        }




    }

    public void resetear(View view){
        String vacio = "";
        tv1.setText(vacio);
        tv2.setText("?");
        tv3.setText(vacio);
        tv5.setText(vacio);
        tv6.setText(vacio);


    }

    public void generar(View view){



        int random = (int) (Math.random()*100);

        int random2 = (int) (Math.random()*100);

        String primerNumero = String.valueOf(random);
        String segundoNumero = String.valueOf(random2);

        tv1.setText(primerNumero);
        tv2.setText("?");
        tv3.setText(segundoNumero);
        tv5.setText("");
        tv6.setText("");






    }



    public void esPar(View view) {
        String valor1 = tv1.getText().toString(); //primero es String

        String resultado = tv5.getText().toString();
        String division = tv2.getText().toString();

        if (!resultado.equals("") && !division.equals("/") && !valor1.equals("") )  {
            int  valor = Integer.parseInt(resultado);
            if (valor % 2 == 0) {

                String par = getString(R.string.par);
                tv6.setText(par);
            } else {
                String impar = getString(R.string.impar);
                tv6.setText(impar);
            }

        } else{
            String error = getString(R.string.Error);
            tv5.setText(error);
            tv6.setText("");

        }
    }



    public void esPrimo(View view){

        String resultado = tv5.getText().toString();
        String division = tv2.getText().toString();
        String num1_t = tv1.getText().toString();

        if (!resultado.equals("") && !division.equals("/") && !num1_t.equals("")  )
        {

            int valor = Integer.parseInt(resultado);

            if(valor<0){
                valor = valor * -1;
            }

            int contador = 2;
            boolean primo = true;

            while ((primo) && (contador != valor)) {
                if (valor % contador == 0)
                    primo = false;
                contador++;
            }

            if (primo == true)
            {
                String prim = getString(R.string.primo);
                tv6.setText(prim);
            }
            else {
                String noPrimo = getString(R.string.noPrimo);
                tv6.setText(noPrimo);
                }

        }

        else
            {
                String error = getString(R.string.Error);
                tv5.setText(error);
                tv6.setText("");
            }

    }

}
