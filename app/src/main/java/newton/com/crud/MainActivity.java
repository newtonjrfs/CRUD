package newton.com.crud;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import newton.com.crud.Controle.Pessoa;

public class MainActivity extends AppCompatActivity {

    private EditText nome;
    private EditText senha;
    private Button botao_salvar;
    private Button botao_lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.textNome);
        senha = findViewById(R.id.textSenha);
        botao_salvar = findViewById(R.id.botaoSalvar);
        botao_lista = findViewById(R.id.botaoListar);

        botao_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nome_usuario = nome.getText().toString();
                String senha_usuario = senha.getText().toString();

                Pessoa pessoa = new Pessoa();
                pessoa.salvarRegistro(nome_usuario,senha_usuario);

                Log.i("teste de salvar","Passou aki com nome "+ nome_usuario + " e a senha "+ senha_usuario );


            }
        });

        botao_lista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,VerActivity.class));
            }
        });

    }
}
