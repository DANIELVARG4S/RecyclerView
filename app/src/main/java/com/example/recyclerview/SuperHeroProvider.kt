package com.example.recyclerview

class SuperHeroProvider {
    companion object {
        val superHeroList = listOf<SuperHero>(
            SuperHero(
                "SuperMan",
                "DC",
                "Clark",
                "https://"
            ),
            SuperHero(
                "Spiderman",
                "Marvel",
                "Peter",
                ""
            ),
            SuperHero(
                "Batman",
                "DC",
                "Bruce",
                ""
            ),
            SuperHero(
                "wolverin",
                "Marvel",
                "Loganl",
                ""
            ),
        )
    }
}