package wilbert.jr11.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button =findViewById<Button>(R.id.btn_tirar)
        val Num_Dados = findViewById<EditText>(R.id.N_dados)
        val Num_caras = findViewById<EditText>(R.id.N_caras)
        val Resultado = findViewById<TextView>(R.id.txt_resultado)
        

        button.setOnClickListener{

        }
    }
}