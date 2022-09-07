package uz.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import uz.saidarabxon.akramov.movieapp.databinding.ItemRvBinding
import uz.saidarabxon.models.Movie

class RvAdapter(private val list: ArrayList<Movie>, val context: Context) :
    RecyclerView.Adapter<RvAdapter.VH>() {
    inner class VH(private val itemRvBinding: ItemRvBinding) :
        RecyclerView.ViewHolder(itemRvBinding.root) {
        fun onBind(movie: Movie) {
            Glide.with(context).load(movie.imageURL).into(itemRvBinding.image)
            itemRvBinding.txtName.text = movie.name
            itemRvBinding.txtView.text = movie.views
            itemRvBinding.txtDate.text = movie.relaseDate
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size


}