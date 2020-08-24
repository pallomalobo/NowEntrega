package com.example.nowentrega

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainLayout : AppCompatActivity(){

    private var progressBar: ProgressBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_finalizar.setOnClickListener {
            val alertDialog: AlertDialog? = this.let {

                val builder = AlertDialog.Builder(it)
                builder.setTitle("Entrega agendada")
                builder.setMessage("Ao receber sua compras faça a higienização correta para evitar contaminação. Fique seguro!")
                builder.apply {
                    setNeutralButton("Ok",null)
                }
                builder.create()
                    builder.show()
            }
        }
    }



}