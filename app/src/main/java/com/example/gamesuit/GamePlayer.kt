package com.example.gamesuit

open class Input(
    private val id: Int,
    val isPlayerChoice: String) {

    fun printInput() {
        println("$id. Masukkkan Pemain $id: ${this.isPlayerChoice}")
    }

}

class GamePlayer(id: Int, isPlayerChoice: String): Input(id, isPlayerChoice)
