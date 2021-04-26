package com.example.recyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.recyclerview.R;
import com.example.recyclerview.model.Filme;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private List<Filme> listarFilmes;

    public Adapter(List<Filme> lista)  {
        this.listarFilmes = lista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { //criação dos itens
        //Transformar a xml em objeto view
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista,parent, false );

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) { //visualização dos itens

        Filme filme = listarFilmes.get(position);
        holder.titulo.setText(filme.getTitutloFilme());
        holder.genero.setText(filme.getGenero());
        holder.ano.setText(filme.getAno());

    }

    @Override
    public int getItemCount() { //identifica a quantidade de itens a ser exibidos
        return listarFilmes.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView titulo;
        TextView ano;
        TextView genero;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.textTitulo);
            ano = itemView.findViewById(R.id.textAno);
            genero = itemView.findViewById(R.id.textGenero);
        }
    }

}