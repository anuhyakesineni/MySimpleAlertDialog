package com.example.mysimplealertdialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            var alert = AlertDialog.Builder(this)
            alert.setTitle("ActionBar")
            alert.setPositiveButton("Yes", { dialogInterface: DialogInterface, i: Int ->
                Toast.makeText(this,"You have cicked yes",Toast.LENGTH_SHORT).show()

            })

            alert.setNegativeButton("No", { dialogInterface: DialogInterface, i: Int ->
                Toast.makeText(this,"You have cicked no",Toast.LENGTH_SHORT).show()

            })

            alert.create()
            alert.show()

        }
    }

    override fun onBackPressed(){
        var alert = AlertDialog.Builder(this)
        alert.setTitle("Do you want to exit?")
        alert.setPositiveButton("Yes", { dialogInterface: DialogInterface, i: Int ->
            Toast.makeText(this,"You have cicked yes",Toast.LENGTH_SHORT).show()

        })

        alert.setNegativeButton("Cancel", { dialogInterface: DialogInterface, i: Int ->
            Toast.makeText(this,"You have cicked no",Toast.LENGTH_SHORT).show()

        })

        alert.create()
        alert.show()




    }
}