package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var thisresult = FruitItem("190831", "차준호","용산",true,R.drawable.a)
        nameOfBook.text=thisresult.name
        nameOfAuthor.text=thisresult.author
        nameOfCom.text=thisresult.company
        if(thisresult.booked){
            bookAva.text="현재 도서 대출이 불가합니다."
        }else {
            bookAva.text="현재 도서 대출이 가능합니다."
        }

    }
}
