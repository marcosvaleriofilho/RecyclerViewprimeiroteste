package br.edu.puc.recyclersample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatCheckBox
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class TarefasAdapter(private val dataSet: List<Tarefa>) :
    ListAdapter<Tarefa, TarefasAdapter.TarefaViewHolder>(TarefaDiffCallback) {
    /* ViewHolder para a TAREFA, define as referencias das views e acrescenta o "click". */
    class TarefaViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        private val tarefaTextView: AppCompatTextView = itemView.findViewById(R.id.tvTarefaNome)
        private val tarefaCheckConcluida: AppCompatCheckBox = itemView.findViewById(R.id.ckConcluido)
        private var tarefaAtual: Tarefa? = null
        /* Fazer a ligação da tarefa específica com a view específica da lista. */
        fun bind(t: Tarefa) {
            tarefaAtual = t
            tarefaTextView.text = t.nome
            tarefaCheckConcluida.isChecked = t.concluida
        }
    }
    /* Cria a viewholder (view temporária para armazenar o item e "infla" com o layout
    apropriado. */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.tarefa_item, parent, false)
        return TarefaViewHolder(view)
    }
    /* Obtem a tarefa e a utiliza como "viewholder". */
    override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {
        val t = dataSet[position]
        holder.bind(t)
    }
    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size
}
    object TarefaDiffCallback : DiffUtil.ItemCallback<Tarefa>() {
    override fun areItemsTheSame(oldItem: Tarefa, newItem: Tarefa): Boolean {
        return oldItem == newItem
    }
    override fun areContentsTheSame(oldItem: Tarefa, newItem: Tarefa): Boolean {
        return oldItem.nome == newItem.nome
    }
}