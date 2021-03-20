package edu.itesm.kdramasappchallenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_kdramas.*


class KdramasFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kdramas, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        kdramas_recycler.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = KdramasAdapter(createData())
        }
    }

    fun createData(): ArrayList<Kdrama>{
        val kdramas = ArrayList<Kdrama>()
        kdramas.add(Kdrama(R.drawable.sweet_home,"Sweet Home", "2020","A traumatized high school student (Song Kang) who, after being bullied at school, never leaves his room. Later he loses his family in a car accident, a situation that causes him to move to a new apartment, a place where strange and mysterious things begin to happen."))

        kdramas.add(Kdrama(R.drawable.extracurricular, "Extracurricular", "2020", "The story centers on a high school senior (Kim Dong-hee) who has survived a life alone, thanks to a protective service that he developed.Which makes it a story full of action and contractions, drugs, and much more, with themes that become extremely complex."))
        kdramas.add(Kdrama(R.drawable.penthouse, "The Penthouse", "2020", "The story takes place in a 100-story luxury building, exclusively for the wealthiest in society, and focuses on three women: the \"queen\" of the penthouse Shim Soo Ryun, the \"prima donna\" Chun Seo Jin who does not know will stop at nothing to get what he wants"))
        kdramas.add(Kdrama(R.drawable.sky, "SKY Castle", "2018", "In a residential area near the outskirts of Seoul called SKY Castle , live prestigious professionals and with equally prominent jobs. The 'Bee' mothers wish to have their children in the best and recognized universities in the country. The question is how much are you willing to give in return?"))
        kdramas.add(Kdrama(R.drawable.descendientes, "Sun Descendants", "2016", "Yoo Si Jin (Song Joong Ki) is the captain of the Special Forces. He, along with Senior Sergeant Seo Dae Young (Jin Goo), catch a thief who gets hurt while capturing him, he is sent to the hospital while Dae Young realizes that he has stolen his cell phone and they go to get it back."))
        kdramas.add(Kdrama(R.drawable.recuerdosalhambra, "Alhambra Memories", "2018", "A thriller about the mysteries surrounding augmented reality (AR). The owner of an investment company travels to Spain and stays in a cheap hotel run by a former guitarist."))
        kdramas.add(Kdrama(R.drawable.king, "The King", "2020", "A fantasy romance drama in which a deity has unleashed a demon into the human world, and that demon has opened the door to a parallel world. One resembles modern Korea as we know it, while the other is an alternate universe in which Korea is an empire ruled by a single monarch (Lee min-hoo)."))
        kdramas.add(Kdrama(R.drawable.stranger, "Stranger", "2013", "The son of a senior official in North Korea who accidentally crosses to the South. Is it possible to experience total alienation in a country full of people who look like you? Lee Young Ho is the son of an upper-class family in North Korea, but he crosses over to South Korea by mistake when he gets involved in a car accident."))
        kdramas.add(Kdrama(R.drawable.crashing, "Crashing Landing on You", "2020", "One day while paragliding, Yoon Se Ri, a wealthy South Korean heiress and CEO of a company, lands in North Korea due to an accident caused by a tornado with high winds, where she meets Ri Jung Hyuk, an army officer. North Korean, who tries to hide her and protect her from the government"))
        kdramas.add(Kdrama(R.drawable.trueb, "True Beauty", "2020", "After watching beauty videos on the internet, a shy comic book fan masters the art of makeup and sees her social standing skyrocket as she becomes the prettiest girl in her school, literally overnight. But will her elite status be short-lived? How long can she keep her \"real me\" a secret?"))
        kdramas.add(Kdrama(R.drawable.voices, "Voice", "2017", "Two detectives team up to catch a serial killer who killed their families. Star detective Moo Jin Hyuk's (Jang Hyuk) life spirals out of control after finding his wife murdered."))
        kdramas.add(Kdrama(R.drawable.goblin, "Goblin", "2016", "In the Goryeo era, King Wang Yeo is viciously manipulated by his royal adviser who turns him against General Kim Shin (Gong Yoo) by betraying him and condemning him and his entire family to die."))


        return kdramas
    }
}