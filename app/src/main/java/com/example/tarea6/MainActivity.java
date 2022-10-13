package com.example.tarea6;

import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.InputType;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    EditText edTxt1, edTxt2, edTxt3, edTxt4, edTxt5;
    TextView txt1, txt2, txt3, txt4, txt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (TextView) findViewById(R.id.txt1);
        txt2 = (TextView) findViewById(R.id.txt2);
        txt3 = (TextView) findViewById(R.id.txt3);
        txt4 = (TextView) findViewById(R.id.txt4);
        txt5 = (TextView) findViewById(R.id.txt5);
        edTxt1 = (EditText) findViewById(R.id.edTxt1);
        edTxt2 = (EditText) findViewById(R.id.edTxt2);
        edTxt3 = (EditText) findViewById(R.id.edTxt3);
        edTxt4 = (EditText) findViewById(R.id.edTxt4);
        edTxt5 = (EditText) findViewById(R.id.edTxt5);

        //Clase Propia
        clasepropiaOnKey miListener = new clasepropiaOnKey();
        edTxt1.setOnKeyListener(miListener);
        edTxt2.setOnKeyListener(miListener);
        edTxt3.setOnKeyListener(miListener);
        edTxt4.setOnKeyListener(miListener);
        edTxt5.setOnKeyListener(miListener);

        edTxt1.setInputType(InputType.TYPE_CLASS_TEXT);
        edTxt2.setInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
        edTxt3.setInputType(InputType.TYPE_CLASS_DATETIME);
        edTxt4.setInputType(InputType.TYPE_CLASS_PHONE);
        edTxt5.setInputType(InputType.TYPE_NUMBER_VARIATION_PASSWORD | InputType.TYPE_CLASS_NUMBER);

    }

    @Override
    public void onClick(View view) {

    }

    class clasepropiaOnKey implements View.OnKeyListener{

        @Override
        public boolean onKey(View view, int i, KeyEvent keyEvent) {

            if(keyEvent.getAction()==KeyEvent.ACTION_DOWN && i==KeyEvent.KEYCODE_ENTER){
                switch(view.getId()){
                    case R.id.edTxt1:
                        txt1.setText("Tu nombre es: " + edTxt1.getText().toString());
                        break;
                    case R.id.edTxt2:
                        txt2.setText("Tu gallegos es: " + edTxt2.getText().toString());
                        break;
                    case R.id.edTxt3:
                        txt3.setText("Tu fecha de nacimiento es: " + edTxt3.getText().toString());
                        break;
                    case R.id.edTxt4:
                        txt4.setText("Tu celular es: " + edTxt4.getText().toString());
                        break;
                    case R.id.edTxt5:
                        txt5.setText("Tu contraseña es: " + edTxt5.getText().toString());
                        break;
                }
                return true;
            }
            return false;
        }
    }
}