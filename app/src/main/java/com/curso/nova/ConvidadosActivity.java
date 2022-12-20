package com.curso.nova;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ConvidadosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convidados);
        setTitle("Lista de Convidados:");

        FloatingActionButton btnovoConvidado = findViewById(R.id.activity_convidados_fab_novo_convidado);
        btnovoConvidado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ConvidadosActivity.this, AddContatoActivity.class));
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        ConvidadoDao dao = new ConvidadoDao();

        ListView listaDeAlunos = findViewById(R.id.activity_convidados_lista_de_convidados);
        listaDeAlunos.setAdapter(new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                dao.listaConvidados()));
    }
}