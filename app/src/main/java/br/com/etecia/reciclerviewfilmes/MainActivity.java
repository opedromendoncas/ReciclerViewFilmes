package br.com.etecia.reciclerviewfilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Filmes> ListaFilmes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //criando a base de dados para carregamento da lista de filmes
        ListaFilmes = new ArrayList<>();

        ListaFilmes.add(
          new Filmes("Velozes e Furiosos 3",
                  "Um corredor de rua americano no Japão aprende um novo estilo e enfrenta o campeão.",
                  "Ação", R.drawable.velozestokio)
        );

        //criando a classe adaptadora e passando os parâmetros
        MyAdapter adapter = new MyAdapter(getApplicationContext(),);
    }
}