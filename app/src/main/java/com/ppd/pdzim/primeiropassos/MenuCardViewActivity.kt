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

        produtosRecyclerView.adapter = ProdutosAdapter(listaProdutos)
        produtosRecyclerView.layoutManager = LinearLayoutManager(this)


        listaProdutos.add(
            Produto(
                nome = "Pao de queijo",
                preco = "$20",
                imagem = "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQqWhpb0TLdVQnVCzNmxjzk4COe3dOX-j-uUFLgK5rK92lerYMg"
            )
        )
        listaProdutos.add(
            Produto(
                nome = "Skinny cheiro de pé",
                preco = "$1000000000",
                imagem = "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQqWhpb0TLdVQnVCzNmxjzk4COe3dOX-j-uUFLgK5rK92lerYMg"
            )
        )
        listaProdutos.add(
            Produto(
                nome = "Coca-Cola",
                preco = "$5",
                imagem = "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQqWhpb0TLdVQnVCzNmxjzk4COe3dOX-j-uUFLgK5rK92lerYMg"
            )
        )
        listaProdutos.add(
            Produto(
                nome = "Sanduiche",
                preco = "$3",
                imagem = "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQqWhpb0TLdVQnVCzNmxjzk4COe3dOX-j-uUFLgK5rK92lerYMg"

            )
        )
        listaProdutos.add(
            Produto(
                nome = "Mais exemplo",
                preco = "$2",
                imagem = "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQqWhpb0TLdVQnVCzNmxjzk4COe3dOX-j-uUFLgK5rK92lerYMg"

            )
        )
        listaProdutos.add(
            Produto(
                nome = "kkkkkkkk",
                preco = "$4",
                imagem = "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQqWhpb0TLdVQnVCzNmxjzk4COe3dOX-j-uUFLgK5rK92lerYMg"

            )
        )
        listaProdutos.add(
            Produto(
                nome = "Teste",
                preco = "infinito",
                imagem = "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQqWhpb0TLdVQnVCzNmxjzk4COe3dOX-j-uUFLgK5rK92lerYMg"

            )
        )
        listaProdutos.add(
            Produto(
                nome = "Mais exemplo2",
                preco = "$2",
                imagem = "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQqWhpb0TLdVQnVCzNmxjzk4COe3dOX-j-uUFLgK5rK92lerYMg"

            )
        )
    }

}