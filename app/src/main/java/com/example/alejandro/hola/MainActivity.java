package com.example.alejandro.hola;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et_name;
    private TextView tv_resultado;

    private  EditText valor1;
    private  EditText valor2;

    public MainActivity() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_name=(EditText) findViewById(R.id.et_name);
        tv_resultado=(TextView) findViewById(R.id.tv_resultado);
    }

    public void saludar(View view){

        tv_resultado.setText("hola " + et_name.getText());
    }
}
