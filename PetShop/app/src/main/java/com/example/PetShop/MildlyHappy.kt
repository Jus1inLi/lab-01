package com.example.PetShop

class MildlyHappy (date: String) : Mood(date){
    override fun getMood(): String {
        return "mildly Happy"
    }
}