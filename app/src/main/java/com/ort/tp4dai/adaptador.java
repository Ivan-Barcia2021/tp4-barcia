package com.ort.tp4dai;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class adaptador implements ListAdapter {
    private ArrayList<String> _listapeliculas;
    TextView txttitulo;
    private Context _micontexto;
    public adaptador(ArrayList<String> milistapeliculas, Context contextoausar){
        _listapeliculas= milistapeliculas;
        _micontexto=contextoausar;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    public int getCount(){
        return _listapeliculas.size();

    }
    public String getItem(int pos){
        String nombre;
        nombre=_listapeliculas.get(pos);
        return  nombre;
    }
    public long getItemId(int pos){
        return pos;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    public View getView(int pos, View vista, ViewGroup grupo){
        View vistadevolver;
        vistadevolver=null;
        LayoutInflater inflador;
        inflador=(LayoutInflater)_micontexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        vistadevolver=inflador.inflate(R.layout.listviewpeliculas, grupo,false);
        String textoposicionactual;
        textoposicionactual=getItem (pos);


        txttitulo=(TextView)vistadevolver.findViewById(R.id.mipelicula);
        txttitulo.setText(textoposicionactual);
        return vistadevolver;
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEnabled(int position) {
        return false;
    }
}
