package com.alvaroitu.aula2_edit_radio_check;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText nome;
    EditText sobrenome;
    Button enviar;
    TextView resultado;

    CheckBox vermelho;
    CheckBox verde;
    CheckBox azul;
    RadioGroup radioGroupSexo;
    RadioButton sexo;
    RadioButton masculino;
    RadioButton feminino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.nome);
        sobrenome = findViewById(R.id.sobrenome);
        enviar = findViewById(R.id.enviar);
        resultado = findViewById(R.id.resultado);
        vermelho = findViewById(R.id.vermelho);
        verde = findViewById(R.id.verde);
        azul = findViewById(R.id.azul);
        radioGroupSexo = findViewById(R.id.sexo);
        masculino = findViewById(R.id.masculino);
        feminino = findViewById(R.id.feminino);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomeDigitado = nome.getText().toString();
                String sobrenomeDigitado = sobrenome.getText().toString();
                String nomeSobrenome = "Nome é " + nomeDigitado + " " + sobrenomeDigitado ;

                String cores = "";
                String sexoEscolhido = "";

                if(vermelho.isChecked()){
                    String corSelecionada = vermelho.getText().toString();
                    cores = corSelecionada + " selecionado - ";
                }

                if(verde.isChecked()){
                    String corSelecionada = verde.getText().toString();
                    cores = cores + corSelecionada + " selecionado - ";
                }

                if(azul.isChecked()){
                    String corSelecionada = azul.getText().toString();
                    cores = cores + corSelecionada + " selecionado - ";
                }

                int radioButtonSelected = radioGroupSexo.getCheckedRadioButtonId();
                sexo = findViewById(radioButtonSelected);
                String sexoSelecionado = sexo.getText().toString();
                sexoEscolhido = sexoSelecionado + " selecionado";

                resultado.setText(nomeSobrenome + "\n" + cores + "\n" + sexoEscolhido);
            }
        });
    }

    public void limpar(View view){
        nome.setText("");
        sobrenome.setText("");
        vermelho.setChecked(false);
        verde.setChecked(false);
        azul.setChecked(false);
        sexo.setChecked(false);
        masculino.setChecked(false);
        feminino.setChecked(false);
        resultado.setText("");
    }
}