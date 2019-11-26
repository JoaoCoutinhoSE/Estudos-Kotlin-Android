package com.ppd.pdzim.primeiropassos.Adapters

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ppd.pdzim.primeiropassos.Models.Produto
import com.ppd.pdzim.primeiropassos.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_cardapio.view.*

class ProdutosAdapter(private val listaProdutos: MutableList<Produto>) : RecyclerView.Adapter<ProdutosAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //Aqui o layout do item da lista é inflado
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_cardapio, parent, false))
    }

    override fun getItemCount(): Int = listaProdutos.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //Aqui você aplica os itens da lista que veio como parâmetro nos itens do ViewHolder (Ali em baixo)
        holder.nomeTextView.text = listaProdutos[position].nome
        holder.precoTextView.text = listaProdutos[position].preco
        holder.imagemImageView.text = listaProdutos[position].imagem
        Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(ImageView())
    }


    class ViewHolder (view : View) : RecyclerView.ViewHolder(view) {
        //Aqui eu pego os itens dentro do item inflado
        val nomeTextView = view.textview_nome
        val precoTextView = view.textview_preco
        val imagemImageView = view.imageview_foto
    }

}