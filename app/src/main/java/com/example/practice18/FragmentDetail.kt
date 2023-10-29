package com.example.practice18

import android.annotation.SuppressLint
import androidx.fragment.app.Fragment
import android.widget.TextView
import android.os.Bundle
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.ListView

class DetailFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
        val imageView = view?.findViewById<ListView>(R.id.imageView)
    }



    // обновление текстового поля и добавление изображения в ImageView
    @SuppressLint("SetTextI18n")
    fun setSelectedItem(selectedItem: String?) {
        val detailsText: TextView? = view?.findViewById(R.id.detailsText)
        val imageView: ImageView? = view?.findViewById(R.id.imageView)

        if (selectedItem == "Чихуа-хуа"){
            detailsText?.text = selectedItem + " - Один из самых маленьких пород собак, происходит из Мексики."
            imageView?.setImageResource(R.drawable.dog)
        }
        if (selectedItem == "Овчарка") {
            detailsText?.text = selectedItem + " - Интеллектуальная и преданная порода собак, используемая для охраны и пастушьих задач."
            imageView?.setImageResource(R.drawable.ovchar)
        }
        if (selectedItem == "Мэйкун"){
            detailsText?.text = selectedItem + " - Крупная порода кошек с толстой шерстью, происходит из Китая."
            imageView?.setImageResource(R.drawable.catt)
        }
        if (selectedItem == "Британская кошка") {
            detailsText?.text = selectedItem + " - Одна из самых популярных пород кошек, известна своими пушистыми щеками и квадратной мордочкой."
            imageView?.setImageResource(R.drawable.briri)
        }
        if (selectedItem == "Сфинкс"){
            detailsText?.text = selectedItem + " - Безшерстная порода кошек, которая имеет уникальный вид с плохо развитым окрасом шкуры."
            imageView?.setImageResource(R.drawable.sfincs)
        }
    }
}