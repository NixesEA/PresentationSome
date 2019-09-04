package com.puter.presentationsome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Presenter.presenterCallback, View.OnClickListener {

    lateinit var presenter: Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = Presenter(this)

        first_btn.setOnClickListener(this)
        second_btn.setOnClickListener(this)
    }

    override fun toastOne() {
        Toast.makeText(this, "toastOne", Toast.LENGTH_LONG).show()
    }

    override fun toastTwo(msg: String) {
        Toast.makeText(this, "msg: $msg", Toast.LENGTH_LONG).show()
    }

    override fun onClick(view: View) {
        when(view){
            first_btn->{
                presenter.firstEvent()
            }
            second_btn->{
                presenter.secondEvent(test_ed.text.toString())
            }
        }
    }
}
