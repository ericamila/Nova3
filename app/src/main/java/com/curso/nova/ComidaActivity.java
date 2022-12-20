package com.curso.nova;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ComidaActivity extends AppCompatActivity {

    private static Float totalLiquido = 0f;
    private static Float totalSolido = 0f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comida);
        setTitle("Consumo de comida e bebidas:");

        TextView txvQtdComida = findViewById(R.id.tvComida);
        TextView txvQtdComidaTotal = findViewById(R.id.tvComidaTotal);
        txvQtdComida.setText(" Convidados: "+(Convidado.getQtdConvidados())+" pessoas\n\n" +
                " Consumo de suco: "+qtdLiquidoSuco()+"L\n" +
                " Consumo de refrigetante: "+qtdLiquidoRefri()+"L\n" +
                " Consumo de água: "+qtdLiquidoAgua()+"L\n" +
                " Consumo de salgados: "+qtdSolidoSalgado()+"kg \n" +
                " Consumo de doces: "+qtdSolidoDoce()+"kg \n" +
                " Gramas do bolo: "+qtdSolidoBolo()+"kg \n" +
                " Pratos: "+Convidado.getQtdConvidados()*2+" unidades \n" +
                " Copos: "+Convidado.getQtdConvidados()*3+" unidades \n" +
                " Talheres: "+(Convidado.getQtdConvidados()*2)+" unidades");
        txvQtdComidaTotal.setText(" Total de alimentos sólidos necessários é:\n"+qtdSolido()+"kg\n\n" +
                " Total de líquido é:\n"+qtdLiquido()+"L\n\n");
    }

    public String qtdLiquido(){
        totalLiquido = Convidado.getQtdConvidados()* 1.5f;
        return  String.format("%.2f",totalLiquido);
    }

    public String qtdSolido(){
        totalSolido = Convidado.getQtdConvidados()* 0.6f;
        return  String.format("%.3f",totalSolido);
    }

    public String qtdLiquidoAgua(){
        totalLiquido = Convidado.getQtdConvidados()* 1.5f;
        return  String.format("%.2f",(totalLiquido/3)-(totalLiquido/3*0.5));
    }
    public String qtdLiquidoSuco(){
        totalLiquido = Convidado.getQtdConvidados()* 1.5f;
        return  String.format("%.2f",(totalLiquido/3));
    }
    public String qtdLiquidoRefri(){
        totalLiquido = Convidado.getQtdConvidados()* 1.5f;
        return  String.format("%.2f",(totalLiquido/3)+(totalLiquido/3*0.5));
    }

    public String qtdSolidoBolo(){
        totalSolido = Convidado.getQtdConvidados()* 0.6f;
        return  String.format("%.3f",(totalSolido/3)+(totalSolido/3)/3);
    }

    public String qtdSolidoSalgado(){
        totalSolido = Convidado.getQtdConvidados()* 0.6f;
        return  String.format("%.3f",(totalSolido/3));
    }

    public String qtdSolidoDoce(){
        totalSolido = Convidado.getQtdConvidados()* 0.6f;
        return  String.format("%.3f",(totalSolido/3)-(totalSolido/3)/3);
    }

}