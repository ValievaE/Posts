package ru.netology.posts.repository

import androidx.lifecycle.LiveData
import ru.netology.posts.dto.Post

interface PostRepository {
    fun getAll(): List<Post>
    fun likeById(id: Long)
    fun save(post: Post)
    fun removeById(id: Long)
}