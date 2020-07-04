package br.com.matheus.atividade4_tentativa9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_floki.*

class activity_floki : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_floki)

        val melhor_amigo = intent.extras?.getString("melhor_amigo")
        if (melhor_amigo != null) {
            tvVindoDeFloki.setText(tvVindoDeFloki.text.toString() + " " + melhor_amigo)
            tvVindoDeFloki.visibility = View.VISIBLE
        }

        setOnClickListener()
    }

    fun setOnClickListener() {
        btRagnarFloki.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("melhor_amigo", "Floki")
            startActivity(Intent(this, activity_ragar::class.java).putExtras(bundle))
        }
    }
}