package com.away0x.ppjoke.models

/**
 * Created by wutong on 2020-09-01
 */
data class Comment(
    var id: Int,
    var itemId: Long,
    var commentId: Long,
    var userId: Int,
    var commentType: Int,
    var createTime: Int,
    var commentCount: Int,
    var likeCount: Int,
    var commentText: String,
    var imageUrl: Any,
    var videoUrl: Any,
    var width: Int,
    var height: Int,
    var hasLiked: Boolean,
    var author: User,
    var ugc: Ugc
)