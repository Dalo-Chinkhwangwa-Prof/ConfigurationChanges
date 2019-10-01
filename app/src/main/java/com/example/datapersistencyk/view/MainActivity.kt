package com.example.datapersistencyk.view

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.datapersistencyk.R
import com.example.datapersistencyk.util.Constants
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    //Our data
    private var fullName: String = "Welcome!"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        full_name_textview.text = fullName

        set_full_name_button.setOnClickListener { _ ->
            fullName =
                "${first_name_edittext.text.toString().trim()} ${last_name_edittext.text.toString().trim()}".trim()
            full_name_textview.text = fullName
        }

    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT)
            Toast.makeText(
                this,
                "Configuration changed to : PORTRAIT",
                Toast.LENGTH_SHORT
            ).show()
        else if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE)
            Toast.makeText(
                this,
                "Configuration changed to : LANDSCAPE",
                Toast.LENGTH_SHORT
            ).show()
    }

//    override fun onRestoreInstanceState(inState: Bundle) {
//        super.onRestoreInstanceState(inState)
//        fullName = inState.getString(Constants.NAME_KEY) ?: "Welcome!!"
//        full_name_textview.text = fullName
//    }
//
//    override fun onSaveInstanceState(outState: Bundle) {
//        super.onSaveInstanceState(outState)
//        outState.putString(Constants.NAME_KEY, fullName)
//    }
}
