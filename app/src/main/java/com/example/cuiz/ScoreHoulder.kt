package com.example.cuiz

object ScoreHolder {
    private var score: Score? = null

    fun getScore(): Score {
        if (score == null) {
            score = Score()
        }
        return score!!
    }
}


