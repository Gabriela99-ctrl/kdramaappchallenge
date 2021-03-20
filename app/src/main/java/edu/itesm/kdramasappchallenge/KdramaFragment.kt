package edu.itesm.kdramasappchallenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_kdramas.view.*
import kotlinx.android.synthetic.main.renglon_layout.*


class KdramaFragment : Fragment() {

    private val args by navArgs<KdramaFragmentArgs>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kdrama, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        foto.setImageResource(args.kdrama.picture)
        title.text = args.kdrama.title
        year.text = args.kdrama.year
        review.text = args.kdrama.review
        Toast.makeText(context,args.kdrama.title,2000).show()
    }

}
