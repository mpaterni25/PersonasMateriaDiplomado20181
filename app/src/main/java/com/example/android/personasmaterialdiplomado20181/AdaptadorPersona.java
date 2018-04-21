package com.example.android.personasmaterialdiplomado20181;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by android on 21/04/2018.
 */

public class AdaptadorPersona extends RecyclerView.Adapter<AdaptadorPersona.PersonasViewHolder>{

    private ArrayList<Persona> personas;

    public AdaptadorPersona (ArrayList<Persona> personas){
        this.personas=personas;
    }

    @Override
    public PersonasViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_persona,parent,false);
        return new PersonasViewHolder(v);
    }


    @Override
    public void onBindViewHolder(PersonasViewHolder holder, int position) {
        Persona p = personas.get(position);
        holder.foto.setImageResource(p.getFoto());
        holder.cedula.setText(p.getCedula());
        holder.nombre.setText(p.getNombre());
        holder.apellido.setText(p.getApellido());

    }

    @Override
    public int getItemCount() {
        return personas.size();
    }

    public static class PersonasViewHolder extends RecyclerView.ViewHolder{
        private ImageView foto;
        private TextView cedula;
        private TextView nombre;
        private TextView apellido;
        private View v;

        public PersonasViewHolder(View itemView) {
            super(itemView);
            v = itemView;
            foto =  v.findViewById(R.id.imgFoto);
            cedula =  v.findViewById(R.id.lblCedula);
            nombre =  v.findViewById(R.id.lblNombre);
            apellido =  v.findViewById(R.id.lblApellido);
        }
    }
}
