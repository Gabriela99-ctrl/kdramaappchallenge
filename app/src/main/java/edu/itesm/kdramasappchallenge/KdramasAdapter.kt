package edu.itesm.kdramasappchallenge

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

// con este private me aseguro que no se modifique nada y que
// sea de uso exclusivo de kdramasAdapter

class KdramasAdapter(private val kdramas: List<Kdrama>)
    : RecyclerView.Adapter<KdramasAdapter.KdramaViewHolder>()
{
    // con los dos puntos estaos heredando al recycler
    inner class KdramaViewHolder(renglon: View) : RecyclerView.ViewHolder(renglon) {
        var title = renglon.findViewById<TextView>(R.id.title)
        var year = renglon.findViewById<TextView>(R.id.year)
        var review = renglon.findViewById<TextView>(R.id.review)
       var foto = renglon.findViewById<ImageView>(R.id.foto)




    }
    // Crea el renglon, este se crea automaticamente al
    // hacer alt+intro en "class" e implementar lo que ponga
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KdramaViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val  renglon_vista = inflater.inflate(R.layout.renglon_layout,parent,false)
        return KdramaViewHolder(renglon_vista)
    }

    override fun onBindViewHolder(holder: KdramaViewHolder, position: Int) {
       val kdrama = kdramas[position]
        holder.foto.setImageResource(kdrama.picture)
        holder.title.text = kdrama.title
        holder.year.text = kdrama.year
        holder.review.text = kdrama.review
        holder.itemView.setOnClickListener {
            val action = KdramasFragmentDirections.actionKdramasFragmentToKdramaFragment(kdrama)
            holder.itemView.findNavController().navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return kdramas.size
    }
}
