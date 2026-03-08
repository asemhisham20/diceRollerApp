package com.examble.dicerollerapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    val diceRollerList= listOf(
        R.drawable.dice_1,
        R.drawable.dice_2,
        R.drawable.dice_3,
        R.drawable.dice_4,
        R.drawable.dice_5,
        R.drawable.dice_6
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rollButton = findViewById<Button>(R.id.rollbtn)
        val dice1=findViewById<ImageView>(R.id.diceimage1)
        val dice2=findViewById<ImageView>(R.id.diceimage2)
        dice1.setImageResource(diceRollerList[0])
        dice2.setImageResource(diceRollerList[0])
        rollButton.setOnClickListener {
            val dicenumber1 = (1..6).random()
            val dicenumber2 =(1..6).random()
            dice1.setImageResource(diceRollerList[dicenumber1-1])
            dice2.setImageResource(diceRollerList[dicenumber2-1])
        }




    }
}