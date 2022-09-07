package uz.saidarabxon.akramov.movieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import uz.adapter.RvAdapter
import uz.saidarabxon.akramov.movieapp.databinding.ActivityMainBinding
import uz.saidarabxon.akramov.movieapp.databinding.ItemRvBinding
import uz.saidarabxon.models.Movie



class MainActivity : AppCompatActivity() {
    private val list = ArrayList<Movie>()
    private lateinit var binding: ActivityMainBinding
    private lateinit var rvAdapter: RvAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)





        rvAdapter = RvAdapter(loadData(),this)

        binding.rView.adapter = rvAdapter

    }

    private fun loadData():ArrayList<Movie> {

        list.add(
            Movie(
                "https://static.wikia.nocookie.net/marvelcinematicuniverse/images/1/11/Avengers_Infinity_war_poster.jpeg/revision/latest/scale-to-width-down/337?cb=20180316141550",
                "Avengers: Infinity War",
                "Views:500",
                "Release Date: 16 Feb 2018")
        )
        list.add(
            Movie(
                "https://static.wikia.nocookie.net/marvelcinematicuniverse/images/c/c7/Avengers_Age_Of_Ultron-poster1.jpg/revision/latest/scale-to-width-down/337?cb=20150224202250",
                "Avengers: Age of Ultron",
                "Views: 400",
                "Release Date: 2015")
        )
        list.add(
            Movie(
                "https://static.wikia.nocookie.net/marvelcinematicuniverse/images/5/55/Iron_Man_3_IMAX_poster.jpg/revision/latest/scale-to-width-down/337?cb=20130319165854",
                "Iron Man 3",
                "Views: 600",
                "Release Date: 2013")
        )
        list.add(Movie(
            "https://static.wikia.nocookie.net/marvelmovies/images/8/8f/2012_Avengers_Poster.jpg/revision/latest/scale-to-width-down/337?cb=20210622013030",
            "Avengers",
            "Views: 800",
            "Release Date: 2012"))
        return list
    }



}