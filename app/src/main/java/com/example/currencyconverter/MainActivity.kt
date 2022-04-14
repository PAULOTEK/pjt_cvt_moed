package com.example.currencyconverter

import android.os.Bundle
import android.view.View


import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity(), View.OnClickListener {
    private  RecyclerView.ViewHolder mViewHolder = RecyclerView.ViewHolder()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.mViewHolder.editValue = findViewById (R.id.editValor)
        this.mViewHolder.textDolar = findViewById (R.id.textDolar)
        this.mViewHolder.textEuro = findViewById (R.id.testeuro)
        this.mViewHolder.ButtonCalcular = findViewById (R.id.btncalculate)
        this.mViewHolder.ButtonCalcular.setOnClickListener(this)
    }

    override void onClick(View v) {}

    private class ViewHolder{
        EditText editValue
        TextView textDolar
        TextView textEuro
        Button ButtonCalcular
    }
}
