package com.example.cuiz

class Score {

    private var number: Int = 0
    private var number2: Int = 0
    private var number3: Int = 0

    fun adiciona_numero(value: Int) {
        number += value
    }

    fun remove_numero(value: Int) {
        number -= value
    }

    fun getNumber(): Int {
        return number
    }

    fun setNumero(value: Int) {
        number = value
    }

    fun adiciona_numero2(value: Int) {
        number2 += value
    }

    fun remove_numero2(value: Int) {
        number2 -= value
    }

    fun getNumber2(): Int {
        return number2
    }

    fun setNumero2(value: Int) {
        number2 = value
    }

    fun adiciona_numero3(value: Int) {
        number3 += value
    }

    fun remove_numero3(value: Int) {
        number3 -= value
    }

    fun getNumber3(): Int {
        return number3
    }

    fun setNumero3(value: Int) {
        number3 = value
    }


}