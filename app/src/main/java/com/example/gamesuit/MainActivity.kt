package com.example.gamesuit

import android.media.metrics.PlaybackErrorEvent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val suitOpt = arrayOf("batu", "gunting", "kertas")
        val player1 = GamePlayer(1, suitOpt[Random.nextInt(suitOpt.size)])
        val player2 = GamePlayer(2, suitOpt[Random.nextInt(suitOpt.size)])

        println("==========================")
        println("GAME SUIT TERMINAL VERSION")
        println("==========================")

        player1.printInput()
        player2.printInput()
        GameRules(player1.isPlayerChoice, player2.isPlayerChoice, false).validate()
    }
}