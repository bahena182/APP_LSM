package com.example.ensaame
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.ensaame.letras

import kotlinx.android.synthetic.main.fragment_glosario.*

//class VideosFragment : Fragment(R.layout.fragment_glosario) {
    class VideosFragment : Fragment() {

        var misLetras : TextView? = null
        var mibtnA : Button? = null
        var mibtnB : Button? = null

        var miVista : View? = null

        var carLetra : String? = "Letra"
        var letraSel : String? =  "LetraA"


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_glosario, container, false)

        miVista = view
        mibtnA = miVista?.findViewById(R.id.btnA)
        mibtnB = miVista?.findViewById(R.id.btnB)

        misLetras = miVista?.findViewById(R.id.lblLetras)

        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        misLetras?.text = "Si se creó la vista"

        mibtnA?.setOnClickListener(){
            letraSel = "A"

            Toast.makeText(context , "========= Claro que entró A==========", Toast.LENGTH_SHORT).show()

            //Le pasamos los datos al fragmento
            val bundle = Bundle()
            bundle.putString("carLetra", letraSel )
            var frag = letras()

            frag.arguments = bundle

            //Cuando el usuario de click en este botón, este fragmento debe reemplazarse con el nuevo
            //fragmento, que es el de la ubicación del Plantel

            var fr = getFragmentManager()?.beginTransaction()

            fr?.replace(R.id.containerView, frag)

            fr?.addToBackStack(null)

            fr?.commit()

        } //Del listener botón A
        //----------------------------
        mibtnB?.setOnClickListener(){
            letraSel = "B"

            Toast.makeText(context , "========= Claro que entró B==========", Toast.LENGTH_SHORT).show()

            //Le pasamos los datos al fragmento
            val bundle = Bundle()
            bundle.putString("carLetra", letraSel )
            var frag = letras()

            frag.arguments = bundle

            //Cuando el usuario de click en este botón, este fragmento debe reemplazarse con el nuevo
            //fragmento, que es el de la ubicación del Plantel

            var fr = getFragmentManager()?.beginTransaction()

            fr?.replace(R.id.containerView, frag)

            fr?.addToBackStack(null)

            fr?.commit()

        } //Del listener botón B

    }//-------------------------------------- Termina el OnViewCreated



}//--------------- Termina el fragmento


