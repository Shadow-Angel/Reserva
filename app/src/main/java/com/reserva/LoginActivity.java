package com.reserva;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends Activity {

    EditText Usr;
    EditText Pasw;
    TextView Msj;
    String Usuario = "Euoropeza";
    String Pasword = "123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Usr = (EditText) findViewById(R.id.UsrText);
        Pasw = (EditText) findViewById(R.id.txtPasw);
        Msj = (TextView) findViewById(R.id.textViewMsj);
    }

    public void onClickEntrar(View V){
        String mensaje = "";
        if (Usuario.equals(Usr.getText().toString())){
            if (Pasword.equals(Pasw.getText().toString())){
                Intent envia = new Intent(this, MainActivity.class);
                finish();
                startActivity(envia);
            }else{
                mensaje = "Contraseña Incorrecta";
            }
        }else{
            mensaje = "Usuario Incorrecta";
        }
            Msj.setText(mensaje);
    }

}
