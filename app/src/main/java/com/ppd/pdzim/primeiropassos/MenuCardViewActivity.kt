package com.ppd.pdzim.primeiropassos

import android.os.Bundle
import androidx.appcompat.app.AlertController
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ppd.pdzim.primeiropassos.Models.Produto
import kotlinx.android.synthetic.main.activity_menu_card_view.*

class MenuCardViewActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<Produto>
    private lateinit var viewManager: RecyclerView.LayoutManager

    var listaProdutos: MutableList<Produto> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_card_view)

        viewManager = LinearLayoutManager(this)

        listaProdutos.add(
            Produto(
                Nome = "Sanduiche",
                Preco = "1"
            )
        )

        listaProdutos.add(
            Produto(
                Nome = "Sanduiche 2",
                Preco = "1"
            )
        )

        listaProdutos.add(
            Produto(
                Nome = "Sanduiche 3",
                Preco = "1"
            )
        )

        listaProdutos.add(
            Produto(
                Nome = "Sanduiche 4",
                Preco = "1"
            )
        )
    }
}
