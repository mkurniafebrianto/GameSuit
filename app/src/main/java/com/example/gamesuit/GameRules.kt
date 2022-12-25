package com.example.gamesuit

class GameRules (
    private var player1: String,
    private var player2: String,
    private var result: Boolean
) {
    fun validate() {
        if (player1.equals(player2)) {
            println("Hasil:")
            println("DRAW!")
        } else if (player1.equals("batu")) {
            when {
                player2.equals("gunting") -> {
                    result = true
                    finalResult(result)
                } else -> {
                    result = false
                    finalResult(result)
                }
            }
        } else if (player1.equals("gunting")) {
            when {
                player2.equals("kertas") -> {
                    result = true
                    finalResult(result)
                } else -> {
                    result = false
                    finalResult(result)
                }
            }
        } else if (player1.equals("batu")) {
            when {
                player2.equals("gunting") -> {
                    result = true
                    finalResult(result)
                } else -> {
                    result = false
                    finalResult(result)
                }
            }
        }
    }

    fun finalResult(result: Boolean) {
        when (result) {
            true -> {
                println("Hasil:")
                println("Pemain 1 MENANG!")
            }
            else -> {
                println("Hasil:")
                println("Pemain 2 MENANG!")
            }
        }
    }
}