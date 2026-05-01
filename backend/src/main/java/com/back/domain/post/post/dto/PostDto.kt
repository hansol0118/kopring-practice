package com.back.domain.post.post.dto

import com.back.domain.post.post.entity.Post
import java.time.LocalDateTime

@JvmRecord
data class PostDto(
    val id: Int,
    val title: String?,
    val content: String?,
    val authorId: Int,
    val authorName: String?,
    val createDate: LocalDateTime?,
    val modifyDate: LocalDateTime?
) {
    constructor(post: Post) : this(
        post.getId(),
        post.getTitle(),
        post.getContent(),
        post.getAuthor().getId(),
        post.getAuthor().getName(),
        post.getCreateDate(),
        post.getModifyDate()
    )
}
