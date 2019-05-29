package com.mb16.qtc;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;

public class ActPrincipal extends AppCompatActivity {

    private AppCompatEditText editMatricula;
    private AppCompatEditText editSenha;

    private TextInputLayout txtlayoutMatricula;
    private TextInputLayout txtlayoutSenha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_principal);

        editMatricula = (AppCompatEditText) findViewById(R.id.editMatricula);
        editSenha     = (AppCompatEditText) findViewById(R.id.editsenha);

        txtlayoutMatricula = (TextInputLayout) findViewById(R.id.txtlayoutmatricula);
        txtlayoutSenha     = (TextInputLayout) findViewById(R.id.txtlayoutsenha);

    }

    private void validateForm() {
        if (editMatricula.getText().toString().isEmpty()) {
            txtlayoutMatricula.setErrorEnabled(true);
            txtlayoutMatricula.setError("Preencha com sua matrícula");
        }else {
            txtlayoutMatricula.setErrorEnabled(false);
        }

        if (editSenha.getText().toString().isEmpty()) {
            txtlayoutSenha.setErrorEnabled(true);
            txtlayoutSenha.setError("Preencha com sua senha");
        }else {
            txtlayoutSenha.setErrorEnabled(false);
        }

    }
}
