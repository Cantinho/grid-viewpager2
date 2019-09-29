package br.com.cantinho.gridviewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.cantinho.gridviewpager2.adapter.CategoryAdapter
import br.com.cantinho.gridviewpager2.util.DataMockGenerator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter()
        viewPager2.adapter = adapter
        adapter.setItem(DataMockGenerator.generateCategories())
    }


}
