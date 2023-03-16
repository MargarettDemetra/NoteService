package ru.netology.ru.netology

open class Note(
    val id: Int,
    val authorId: Int,
    val authorName: String,
    val title: String,
    val text: String
)

class Comment(
    id: Int,
    authorId: Int,
    text: String,
    val answer: String,
) : Note(id,authorId,"","",text)




