🎲 Dice Roller App

A simple and fun Android dice roller app built with Kotlin. Press a button, and get your result!

📱 Features

Tap a button to roll the dice

Displays the final dice face (1–6)

Clean and simple UI with Material Design button


🛠️ Built With

Language: Kotlin

Platform: Android

UI: XML Layouts + Material Design

🧠 How the Code Works

1. Dice Image List
   
kotlinval diceRollerList = listOf(
    R.drawable.dice_1,
    R.drawable.dice_2,
    R.drawable.dice_3,
    R.drawable.dice_4,
    R.drawable.dice_5,
    R.drawable.dice_6
)

A list that holds the 6 dice images. Each index (0–5) matches a dice face (1–6).

2. Linking UI Elements
   
val rollButton = findViewById<Button>(R.id.rollbtn)

val dice1 = findViewById<ImageView>(R.id.diceimage1)

val dice2 = findViewById<ImageView>(R.id.diceimage2)

We connect the button and the two dice ImageViews from the XML layout to our Kotlin code using findViewById.


3. Setting Default Dice Image
   
kotlindice1.setImageResource(diceRollerList[0])

dice2.setImageResource(diceRollerList[0])

When the app starts, both dice show face 1 as the default image (index 0 = dice_1).


4. Rolling the Dice on Button Click
   
kotlinrollButton.setOnClickListener {
    val dicenumber1 = (1..6).random()
    val dicenumber2 = (1..6).random()
    dice1.setImageResource(diceRollerList[dicenumber1 - 1])
    dice2.setImageResource(diceRollerList[dicenumber2 - 1])
}

When the button is pressed:

(1..6).random() generates a random number between 1 and 6 for each die

We use dicenumber - 1 because lists start at index 0, but dice faces start at 1

setImageResource() updates the dice image to match the random number
