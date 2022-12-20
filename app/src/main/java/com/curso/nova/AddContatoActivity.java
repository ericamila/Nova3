package com.curso.nova;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddContatoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contato);
        setTitle("Adicionar Convidados:");

        ConvidadoDao dao = new ConvidadoDao();

        final EditText campoNome = findViewById(R.id.cad_convidado_nome);
        final EditText campoTel = findViewById(R.id.cad_convidado_tel);
        final EditText campoEmail = findViewById(R.id.cad_convidado_email);
        final EditText campoAcompanhantes= findViewById(R.id.cad_convidado_acompanhantes);

        Button botaoSalvar = findViewById(R.id.bt_salvar_convidado);
        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomeConvidado = campoNome.getText().toString();
                String telConvidado = campoTel.getText().toString();
                String emailConvidado = campoEmail.getText().toString();
                Integer acompanhantesConvidado = Integer.parseInt(campoAcompanhantes.getText().toString());

                Convidado convidadoCriado = new Convidado(nomeConvidado, telConvidado,
                        emailConvidado, acompanhantesConvidado);

                dao.salvar(convidadoCriado);

                finish();

                Toast.makeText(AddContatoActivity.this, convidadoCriado.toString()
                        +" Adicionado com sucesso! "+convidadoCriado.getQtdConvidados(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}