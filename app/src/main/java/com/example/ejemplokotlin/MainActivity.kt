package com.example.ejemplokotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class Estudiante(val nombre: String, val codigo: String, val edad: Int) {
    fun mostrarInformacion() {
        Log.d("Estudiante", "Nombre: $nombre, Código: $codigo, Edad: $edad")
    }
}
class MainActivity : AppCompatActivity() {

    private val listaEstudiantes = mutableListOf<Estudiante>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        agregarEstudiante("Carlos Pérez", "A001", 20)
        agregarEstudiante("Ana López", "A002", 22)

        mostrarListaEstudiantes()
    }

    private fun agregarEstudiante(nombre: String, codigo: String, edad: Int) {
        val estudiante = Estudiante(nombre, codigo, edad)
        listaEstudiantes.add(estudiante)
        Log.d("Registro", "Estudiante agregado: $nombre")
    }

    private fun mostrarListaEstudiantes() {
        Log.d("Registro", "Lista de estudiantes:")
        for (estudiante in listaEstudiantes) {
            estudiante.mostrarInformacion()
        }
    }
}
