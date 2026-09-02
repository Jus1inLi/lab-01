package com.example.PetShop

class Cat(name: String, age: Int): Pet(name, age), Pettable {
    override fun speak(): String {
        return "Meow"
    }

    override fun pet() {
        println("The dog $name is being petted")
    }
}