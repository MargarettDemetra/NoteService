package ru.netology

import ru.netology.ru.netology.Note


fun main() {
    val immutable = listOf(
        Note(
            id = 1,
            authorId = 1,
            authorName = "Худсовет",
            title = "Прерафаэлиты",
            text = "Что это такое?"
        ),
        Note(
            id = 2,
            authorId = 1,
            authorName = "Худсовет",
            title = "Абстракционисты",
            text = "Каких абстракционистов вы знаете?"
        )

    )
    val mutable = mutableListOf(
        Note(
            id = 1,
            authorId = 1,
            authorName = "Худсовет",
            title = "Прерафаэлиты",
            text = "Что это такое?"
        )
    )


}