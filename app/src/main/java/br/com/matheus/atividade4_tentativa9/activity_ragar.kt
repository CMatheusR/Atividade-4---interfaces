package br.com.matheus.atividade4_tentativa9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_ragar.*

class activity_ragar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ragar)

        val melhor_amigo = intent.extras?.getString("melhor_amigo")
        if (melhor_amigo != null) {
            tvVindoDeRagnar.setText(tvVindoDeRagnar.text.toString() + " " + melhor_amigo)
            tvVindoDeRagnar.visibility = View.VISIBLE
        }

        setOnClickListener()
    }

    fun setOnClickListener() {
        btBjornRagnar.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("melhor_amigo", "Ragnar")
            startActivity(Intent(this, activity_bjorn::class.java).putExtras(bundle))
        }
        btLagerthaRagnar.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("melhor_amigo", "Ragnar")
            startActivity(Intent(this, activity_lagertha::class.java).putExtras(bundle))
        }
        btFlokiRagnar.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("melhor_amigo", "Ragnar")
            startActivity(Intent(this, activity_floki::class.java).putExtras(bundle))
        }
    }
}