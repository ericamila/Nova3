package com.curso.nova;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GastosActivity extends AppCompatActivity {

    private static Float totalLiquido = 0f;
    private static Float totalSolido = 0f;
    private static Float orcado = 300f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gastos);
        setTitle("Estimativa de gasto:");

    TextView txvQtdComida = findViewById(R.id.tvGastos);
        txvQtdComida.setText(" Convidados: "+Convidado.getQtdConvidados()+" pessoas\n\n" +
                "Valor do orçamento: R$"+String.format("%.2f",orcado)+"\n\n" +
                "O total de gastos com alimentos sólidos é:\nR$ "+qtdSolido()+"\n\n" +
                "O total de líquido é:\nR$ "+qtdLiquido()+"\n\n" +
                "Saldo restante do orçamento:\nR$ "+saldoRestante());
    }

    public String qtdLiquido(){
        totalLiquido = Convidado.getQtdConvidados()* 1.5f*2.9f;
        return  String.format("%.2f",totalLiquido);
    }

    public String qtdSolido(){
        totalSolido = Convidado.getQtdConvidados()* 0.6f*18.7f;
        return  String.format("%.2f",totalSolido);
    }

    public String saldoRestante(){
        return  String.format("%.2f",(orcado - totalLiquido - totalSolido));
    }
}