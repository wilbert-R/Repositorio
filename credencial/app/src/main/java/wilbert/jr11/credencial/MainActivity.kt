package wilbert.jr11.credencial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_Resumen = findViewById<Button>(R.id.button2)
        button_Resumen.setOnClickListener{ Toast.makeText(this, "Wilbert jesus rubi garcia, Ingenieria en software, TIDS4-1,  ", Toast.LENGTH_LONG).show()
        }


        val button_promedio = findViewById<Button>(R.id.button)
        button_promedio.setOnClickListener{ Toast.makeText(this, "Promedio:80%", Toast.LENGTH_LONG).show()
        }
    }
}