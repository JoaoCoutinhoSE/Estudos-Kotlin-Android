package com.ppd.pdzim.primeiropassos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ppd.pdzim.primeiropassos.Adapters.ProdutosAdapter
import com.ppd.pdzim.primeiropassos.Models.Produto
import kotlinx.android.synthetic.main.activity_menu_card_view.*

class MenuCardViewActivity : AppCompatActivity() {

    var listaProdutos: MutableList<Produto> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_card_view)

        listaProdutos.add(
            Produto(
                nome = "Coca cola",
                preco = "1"
            )
        )

        listaProdutos.add(
            Produto(
                nome = "Sanduiche de atum",
                preco = "1"
            )
        )

        listaProdutos.add(
            Produto(
                nome = "Bolo",
                preco = "1"
            )
        )

        listaProdutos.add(
            Produto(
                nome = "Skinni cheiro de pé",
                preco = "1"
            )
        )

        produtosRecyclerView.adapter = ProdutosAdapter(listaProdutos)
        produtosRecyclerView.layoutManager = LinearLayoutManager(this)

    }
}
