package com.example.lab66
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CountryAdapter(getListData())
    }
    private fun getListData(): List<Country> {
        return listOf(
            Country("Vietnam (Asia)", "vietnam", 98000000),
            Country("United States of America", "us", 320000000),
            Country("Russia", "russia", 142000000)
        )
    }
}
