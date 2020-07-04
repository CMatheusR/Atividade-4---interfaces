package br.com.matheus.atividade4_tentativa9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_lagertha.*

class activity_lagertha : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lagertha)

        val melhor_amigo = intent.extras?.getString("melhor_amigo")
        if (melhor_amigo != null) {
            tvVindoDeLagertha.setText(tvVindoDeLagertha.text.toString() + " " + melhor_amigo)
            tvVindoDeLagertha.visibility = View.VISIBLE
        }

        setOnClickListener()
    }

    fun setOnClickListener() {
        btRagnarLagertha.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("melhor_amigo", "Lagertha")
            startActivity(Intent(this, activity_ragar::class.java).putExtras(bundle))
        }
        btBjornLagertha.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("melhor_amigo", "Lagertha")
            startActivity(Intent(this, activity_bjorn::class.java).putExtras(bundle))
        }
    }
}