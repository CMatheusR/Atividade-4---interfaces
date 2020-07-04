package br.com.matheus.atividade4_tentativa9

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bjorn.*

class activity_bjorn : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bjorn)

        val melhor_amigo = intent.extras?.getString("melhor_amigo")
        if (melhor_amigo != null) {
            tvVindoDeBjorn.setText(tvVindoDeBjorn.text.toString() + " " + melhor_amigo)
            tvVindoDeBjorn.visibility = View.VISIBLE
        }

        setOnClickListener()
    }

    fun setOnClickListener() {
        btRagnarBjorn.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("melhor_amigo", "Bjorn")
            startActivity(Intent(this, activity_ragar::class.java).putExtras(bundle))
        }
        btLagerthaBjorn.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("melhor_amigo", "Bjorn")
            startActivity(Intent(this, activity_lagertha::class.java).putExtras(bundle))
        }
        btFlokiBjorn.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("melhor_amigo", "Bjorn")
            startActivity(Intent(this, activity_floki::class.java).putExtras(bundle))
        }
        btAthelstanaBjorn.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("melhor_amigo", "Bjorn")
            startActivity(Intent(this, activity_athelstan::class.java).putExtras(bundle))
        }
    }
}