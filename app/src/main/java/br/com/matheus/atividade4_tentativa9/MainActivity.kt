package br.com.matheus.atividade4_tentativa9

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setOnClickListeners()
    }

    fun setOnClickListeners() {
        btLagerthaMain.setOnClickListener {
            startActivity(Intent(this, activity_lagertha::class.java))
        }
        btAlthelstanMain.setOnClickListener {
            startActivity(Intent(this, activity_athelstan::class.java))
        }
        btBjornMain.setOnClickListener {
            startActivity(Intent(this, activity_bjorn::class.java))
        }
        btFlokiMain.setOnClickListener {
            startActivity(Intent(this, activity_floki::class.java))
        }
        btRagnarMain.setOnClickListener {
            startActivity(Intent(this, activity_ragar::class.java))
        }
        btRolloMain.setOnClickListener {
            startActivity(Intent(this, activity_rollo::class.java))
        }
    }
}