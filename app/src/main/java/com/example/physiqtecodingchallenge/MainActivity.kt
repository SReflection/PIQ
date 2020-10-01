package com.example.physiqtecodingchallenge

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_main.*

class  MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        val res = findViewById(R.id.textview_result) as TextView
        val num = findViewById(R.id.edittext_numerator) as EditText
        val div = findViewById(R.id.edittext_divisor) as EditText
        val divide = findViewById(R.id.button_divide) as Button
        val clear = findViewById(R.id.button_clear) as Button

        divide.setOnClickListener{ res.text = getDivisionResult(num.text.toString(), div.text.toString())}
        clear.setOnClickListener{
            num.text.clear()
            div.text.clear()
            res.text = ""
        }

    }

    fun getDivisionResult(num: String, div: String): String {
        val dblNum = num.toDouble()
        val dblDiv = div.toDouble()
        val res = dblNum / dblDiv
        return res.toString()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
