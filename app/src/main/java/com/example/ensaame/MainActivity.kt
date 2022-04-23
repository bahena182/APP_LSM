package com.example.ensaame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val perfilFragment = PerfilFragment()
        val leccionesFragment =LeccionesFragment()
        val videosFragment =VideosFragment()
        val avanceFragment =  AvanceFragment()

        bottomNavigationView.setOnNavigationItemSelectedListener {
             when(it.itemId){
                 R.id.perfil ->{
                     setCurrentFragment(perfilFragment)
                     true
                 }
                 R.id.lecciones ->{
                     setCurrentFragment(leccionesFragment)
                     true
                 }
                 R.id.avance ->{
                     setCurrentFragment(avanceFragment)
                     true
                 }
                 R.id.videos ->{
                     setCurrentFragment(videosFragment)
                     true
                 }
               else->false
             }
        }
    }

    private fun setCurrentFragment(fragment: Fragment){
       supportFragmentManager.beginTransaction().apply {
           replace(R.id.containerView, fragment)
           commit()
       }


    }
}