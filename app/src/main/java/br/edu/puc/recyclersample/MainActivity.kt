package br.edu.puc.recyclersample
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dataSetDeTarefas = tarefasList()
        val flowersAdapter = TarefasAdapter(dataSetDeTarefas)
        val recyclerView: RecyclerView = findViewById(R.id.rvTarefas)
        recyclerView.adapter = flowersAdapter
    }
}