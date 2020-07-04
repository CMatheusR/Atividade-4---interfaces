package br.com.matheus.atividade4_tentativa9

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_athelstan.*
import kotlinx.android.synthetic.main.activity_bjorn.*

class activity_athelstan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_athelstan)

        val melhor_amigo = intent.extras?.getString("melhor_amigo")
        if (melhor_amigo != null) {
            tvVindoDeAthelstan.setText(tvVindoDeAthelstan.text.toString() + " " + melhor_amigo)
            tvVindoDeAthelstan.visibility = View.VISIBLE
        }

        setOnClickListener()
    }

    fun setOnClickListener() {
        btRagnarAthelstan.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("melhor_amigo", "Athelstan")
            startActivity(Intent(this, activity_ragar::class.java).putExtras(bundle))
        }
        btBjornAthelstan.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("melhor_amigo", "Athelstan")
            startActivity(Intent(this, activity_bjorn::class.java).putExtras(bundle))
        }
    }
}