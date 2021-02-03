package com.github.orelzion.mvvm101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.viewModels
import androidx.core.widget.doAfterTextChanged

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val editText = findViewById<EditText>(R.id.editText)

        editText.doAfterTextChanged { text ->
            viewModel.onInputChanged(text.toString())
        }

        viewModel.mainViewLiveData.observe(this, {
            textView.text = it.text
        })
    }
}