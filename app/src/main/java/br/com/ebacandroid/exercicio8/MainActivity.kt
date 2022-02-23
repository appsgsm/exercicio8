package br.com.ebacandroid.exercicio8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat

class MainActivity : AppCompatActivity() {
    var textTitle: TextView? = null;
    var editText: EditText? = null;
    var tela: LinearLayoutCompat? = null;
    var numClicks = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textTitle = findViewById<TextView>(R.id.title)
        textTitle?.text = "Novo texto"

        editText = findViewById<EditText>(R.id.inputText)
        tela = findViewById(R.id.tela)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            //seria errado definir a variável aqui?
            //var count: Int = 0

            numClicks++
            changeUser(numClicks)
            //addConter(count)
            changeBackground()
        }
    }

    private fun changeBackground() {
        tela?.background = getDrawable(R.drawable.background_image_app)
    }
//Aqui ele reclama de erro porque é val, não dá pra fazer dessa forma?
    /*private fun addConter(counter: Int) {

        counter = counter + 1
        textTitle?.text = "Clicou no botão $counter"
    }*/


    private fun changeUser(numClicks: Int) {
        var texto = editText?.text
        var counter = numClicks.toString()
        textTitle?.text = "$texto $counter"
    }
}