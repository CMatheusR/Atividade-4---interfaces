package br.com.matheus.atividade4_tentativa9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_rollo.*

class activity_rollo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rollo)

        val melhor_amigo = intent.extras?.getString("melhor_amigo")
        if (melhor_amigo != null) {
            tvVindoDeRollo.setText(tvVindoDeRollo.text.toString() + " " + melhor_amigo)
            tvVindoDeRollo.visibility = View.VISIBLE
        }

        setOnClickListener()
    }

    fun setOnClickListener() {
        btBjornRollo.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("melhor_amigo", "Rollo")
            startActivity(Intent(this, activity_bjorn::class.java).putExtras(bundle))
        }
    }
}