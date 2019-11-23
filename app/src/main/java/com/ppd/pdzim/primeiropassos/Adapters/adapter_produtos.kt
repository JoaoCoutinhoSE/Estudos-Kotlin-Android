package com.ppd.pdzim.primeiropassos.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ppd.pdzim.primeiropassos.Models.Produto

class adapter_produtos(private val listaProdutos: MutableList<Produto>,
                       private val context: Context) : RecyclerView.Adapter<adapter_produtos.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_cardapio, parent, false))
    }

    override fun getItemCount(): Int {
        return listaProdutos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.produtoHolder.text = listaProdutos.get(position)
    }


    class ViewHolder (view : Produto) : RecyclerView.ViewHolder(view) {
        val produtoHolder = view.listaProdutos
    }

}