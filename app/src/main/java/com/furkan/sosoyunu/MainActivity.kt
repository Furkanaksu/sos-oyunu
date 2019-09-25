package com.furkan.sosoyunu

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.view.View as View1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnClick(view: View1)
    {
        var SecilenBtn = view as Button
        var btnID = 0
        when(SecilenBtn.id)
        {
            R.id.btn1 -> btnID = 1
            R.id.btn2 -> btnID = 2
            R.id.btn3 -> btnID = 3
            R.id.btn4 -> btnID = 4
            R.id.btn5 -> btnID = 5
            R.id.btn6 -> btnID = 6
            R.id.btn7 -> btnID = 7
            R.id.btn8 -> btnID = 8
            R.id.btn9 -> btnID = 9
        }
        Toast.makeText(this,"Seçilen Button No:"+btnID,Toast.LENGTH_SHORT).show()
        Oyna(btnID,SecilenBtn)
    }

    var Oyuncu1 = ArrayList<Int>()
    var Oyuncu2 = ArrayList<Int>()
    var AktifOyuncu = 1

    fun Oyna(btnID: Int, SecilenBtn:Button)
    {
        if(AktifOyuncu == 1)
        {
            SecilenBtn.text ="S"
            SecilenBtn.setBackgroundColor(Color.GREEN)
            Oyuncu1.add(btnID)
            AktifOyuncu = 2
        }else
        {
            SecilenBtn.text ="O"
            SecilenBtn.setBackgroundColor(Color.BLUE)
            Oyuncu1.add(btnID)
            AktifOyuncu = 1
        }
        SecilenBtn.isEnabled = false
        KazananiBul()
    }
    fun  KazananiBul()
    {
        var kazanan = -1
        if(Oyuncu1.contains(1) && Oyuncu1.contains(2)&& Oyuncu1.contains(3))
        {
            kazanan = 1
        }
        if(Oyuncu2.contains(1) && Oyuncu2.contains(2)&& Oyuncu2.contains(3))
        {
            kazanan = 2
        }
        if(Oyuncu1.contains(4) && Oyuncu1.contains(5)&& Oyuncu1.contains(6))
    {
        kazanan = 1
    }
        if(Oyuncu2.contains(4) && Oyuncu2.contains(5)&& Oyuncu2.contains(6))
        {
            kazanan = 2
        }
        if(Oyuncu1.contains(7) && Oyuncu1.contains(8)&& Oyuncu1.contains(9))
        {
            kazanan = 1
        }
        if(Oyuncu2.contains(7) && Oyuncu2.contains(8)&& Oyuncu2.contains(9))
        {
            kazanan = 2
        }
        //--------------------------------------------------------------------------------------
        if(Oyuncu1.contains(1) && Oyuncu1.contains(4)&& Oyuncu1.contains(7))
        {
            kazanan = 1
        }
        if(Oyuncu2.contains(1) && Oyuncu2.contains(4)&& Oyuncu2.contains(7))
        {
            kazanan = 2
        }
        if(Oyuncu1.contains(2) && Oyuncu1.contains(5)&& Oyuncu1.contains(8))
        {
            kazanan = 1
        }
        if(Oyuncu2.contains(2) && Oyuncu2.contains(5)&& Oyuncu2.contains(8))
        {
            kazanan = 2
        }
        if(Oyuncu1.contains(3) && Oyuncu1.contains(6)&& Oyuncu1.contains(9))
        {
            kazanan = 1
        }
        if(Oyuncu2.contains(3) && Oyuncu2.contains(6)&& Oyuncu2.contains(9))
        {
            kazanan = 2
        }

        if(kazanan!=-1)
        {
            if(kazanan==1)
            {
                Toast.makeText(this,"1. Oyuncu kazandı",Toast.LENGTH_SHORT).show()
            }else
            {
                Toast.makeText(this,"2. Oyuncu kazandı",Toast.LENGTH_SHORT).show()
            }
        }
    }
}
