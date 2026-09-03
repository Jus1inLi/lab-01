package com.example.PetShop


class Depressed (date: String) : Mood(date) {

    override fun getMood(): String {
        return "depressed"
    }
}