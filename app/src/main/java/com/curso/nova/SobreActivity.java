package com.curso.nova;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);
        setTitle("Sobre:");
    }

    public void sair(View view){
        Toast.makeText(SobreActivity.this, "Botão sair pressionado", Toast.LENGTH_SHORT).show();
        finishAffinity();
    }

}