package br.com.cantinho.gridviewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.get
import br.com.cantinho.gridviewpager2.adapter.CategoryAdapter
import br.com.cantinho.gridviewpager2.model.CategoryContainer
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

    fun onClick(view: View) {
        when(view.id) {
            R.id.btn1X1 -> adapter.setContainerType(CategoryAdapter.VIEW_TYPE_1X1_CONTAINER)
            R.id.btn2X2 -> adapter.setContainerType(CategoryAdapter.VIEW_TYPE_2X2_CONTAINER)
            R.id.btn3X3 -> adapter.setContainerType(CategoryAdapter.VIEW_TYPE_3X3_CONTAINER)
            R.id.btn4X4 -> adapter.setContainerType(CategoryAdapter.VIEW_TYPE_4X4_CONTAINER)
        }
    }
}
