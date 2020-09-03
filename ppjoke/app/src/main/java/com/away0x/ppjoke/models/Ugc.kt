package com.away0x.ppjoke.models

/**
 * Created by wutong on 2020-09-01
 */
data class Ugc(
    var likeCount: Int,
    var shareCount: Int,
    var commentCount: Int,
    var hasFavorite: Boolean,
    var hasLiked: Boolean,
    var hasdiss: Boolean,
    var hasDissed: Boolean
)