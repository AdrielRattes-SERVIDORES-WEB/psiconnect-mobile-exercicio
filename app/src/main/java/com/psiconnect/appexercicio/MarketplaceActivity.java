package com.psiconnect.appexercicio;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MarketplaceActivity extends AppCompatActivity {

    private final String[] nomes = {
            "Dra. Ana Beatriz Silva",
            "Dr. Rafael Souza",
            "Dra. Carla Nunes",
            "Dr. Bruno Alves"
    };

    private final String[] especialidades = {
            "Ansiedade · TCC",
            "Terapia de Casal",
            "Psicologia Infantil",
            "Empresas · Burnout"
    };

    private final String[] crps = {
            "CRP 06/12345",
            "CRP 06/22233",
            "CRP 06/33344",
            "CRP 06/44455"
    };

    private final String[] precos = {
            "R$ 180",
            "R$ 200",
            "R$ 170",
            "R$ 220"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marketplace);

        ListView listView = findViewById(R.id.listPsicologos);
        listView.setAdapter(new PsicologoAdapter());

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(MarketplaceActivity.this, MedicoActivity.class);
            intent.putExtra("nome", nomes[position]);
            intent.putExtra("especialidade", especialidades[position]);
            intent.putExtra("crp", crps[position]);
            intent.putExtra("preco", precos[position]);
            startActivity(intent);
        });
    }

    private class PsicologoAdapter extends ArrayAdapter<String> {

        PsicologoAdapter() {
            super(MarketplaceActivity.this, R.layout.item_psicologo, nomes);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View row = convertView;
            if (row == null) {
                row = LayoutInflater.from(getContext()).inflate(R.layout.item_psicologo, parent, false);
            }

            TextView txtNome = row.findViewById(R.id.txtNome);
            TextView txtEspecialidade = row.findViewById(R.id.txtEspecialidade);
            TextView txtPreco = row.findViewById(R.id.txtPreco);

            txtNome.setText(nomes[position]);
            txtEspecialidade.setText(especialidades[position]);
            txtPreco.setText(precos[position]);

            return row;
        }
    }
}
