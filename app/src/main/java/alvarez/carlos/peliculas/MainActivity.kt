package alvarez.carlos.peliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var peliculas: ArrayList<Pelicula> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        llenar_peliculas()
        var adapter=AdaptadorMovies( this,peliculas)
        var listview: ListView =findViewById(R.id.listv)
        listview.adapter=adapter
    }

    fun llenar_peliculas(){
        val pelicula1=Pelicula( 1, getString(R.string.peli1), getString(R.string.peli1_desc), 120, R.drawable.bighero6 )
        peliculas.add(pelicula1)

        val pelicula2=Pelicula( 2, getString(R.string.peli2), getString(R.string.peli2_desc), 125, R.drawable.mil )
        peliculas.add(pelicula2)

        val pelicula3=Pelicula( 3, getString(R.string.peli3), getString(R.string.peli3_desc), 97, R.drawable.mib )
        peliculas.add(pelicula3)

        val pelicula4=Pelicula( 4, getString(R.string.peli4), getString(R.string.peli4_desc), 100, R.drawable.toystory )
        peliculas.add(pelicula4)

        val pelicula5=Pelicula( 5, getString(R.string.peli5), getString(R.string.peli5_desc), 112, R.drawable.drwho )
        peliculas.add(pelicula5)
    }
}