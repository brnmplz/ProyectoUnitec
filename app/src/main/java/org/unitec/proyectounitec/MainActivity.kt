package org.unitec.proyectounitec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// Es el punto de partida de toda app, MainActivity (Presenter)
class MainActivity : AppCompatActivity() {
    //fun: palabra reservada para declarar un método o una funcion
    override fun onCreate(nombre: Bundle?) {
        super.onCreate(nombre)
        setContentView(R.layout.activity_main)
    }
}