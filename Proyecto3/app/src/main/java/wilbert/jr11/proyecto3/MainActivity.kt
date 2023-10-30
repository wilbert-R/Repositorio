package wilbert.jr11.proyecto3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var conversion: Int= 0
    private var result: Double=0.0
    private var value: String=""
    private lateinit var total: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var selectedTemp=findViewById<Spinner>(R.id.spinner)
        var temp=findViewById<EditText>(R.id.temperatura)
        var button=findViewById<Button>(R.id.button)

        total=findViewById<TextView>(R.id.textView2)

        if(selectedTemp!=null)
        {
            val adapter=ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item,
                resources.getStringArray(R.array.convert_options)

            )
            selectedTemp.adapter=adapter
            selectedTemp.onItemSelectedListener=object:
                AdapterView.OnItemSelectedListener{
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    Toast.makeText(this@MainActivity,"Opcion selecionada:"+position,Toast.LENGTH_SHORT)
                        .show()
                    conversion=position
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }


            }

            button.setOnClickListener{
                value=temp.text.toString()
                converter(conversion)

            }
        }


    }

    fun converter(_conversion: Int){
        //Todo crear las conversiones
        when(_conversion){
            0->{
                //F=(C * 9/5) + 32
                result=(value.toDouble()* 9/5)+ 32
                total.text=result.toString()


            }
            1->{
                // K = C + 273.15
                result=value.toDouble() + 273.15
                total.text=result.toString()
            }
            2->{
                //C = (F - 32) * 5/9
                result=(value.toDouble() - 32) * 5/9
                total.text=result.toString()
            }
            3->{

                // (F-32)* 5/9 + 273.15
                result = (value.toDouble() - 32) * 5/9 + 273.15
                total.text=result.toString()
            }
            4->{
                //C = K - 273.15
                result= value.toDouble() - 273.15
                total.text=result.toString()
            }
            5->{
                //F= (K - 273.15) * 1.8 + 32
                result=(value.toDouble() - 273.15) * 1.8 + 32
                total.text=result.toString()
            }
        }

    }
}