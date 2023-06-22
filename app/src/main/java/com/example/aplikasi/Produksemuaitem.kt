package com.example.aplikasikita

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class Produksemuaitem(var halaman:Produksemua, var namas:List<String>, var fotos:List<Int>) :BaseAdapter() {
    override fun getCount(): Int {
        return namas.size;
    }

    override fun getItem(posisi: Int): Any {
        return posisi;
    }

    override fun getItemId(posisi: Int): Long {
        return posisi.toLong()
    }

    override fun getView(posisi: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(halaman).inflate(R.layout.produksemua_item,parent,false);
        val txt_nama:TextView = view.findViewById(R.id.txt_nama);
        val img_foto:ImageView = view.findViewById(R.id.img_foto);

        txt_nama.text = namas.get(posisi);
        img_foto.setImageResource(fotos.get(posisi));
        return view;
    }
}
