package org.unitec.proyectounitec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// Es el punto de partida de toda app, MainActivity (Presenter)
class MainActivity : AppCompatActivity() {
    //fun: palabra reservada para declarar un método o una funcion
    override fun onCreate(nombre: Bundle?) {
        super.onCreate(nombre)
        setContentView(R.layout.ejemplo)


        // así se elimina la barra superior del celular
        //toda fea, horrorosa sin swag ni nada
        //good luck, and don't F*ck it up.
        supportActionBar?.hide()

    }
}