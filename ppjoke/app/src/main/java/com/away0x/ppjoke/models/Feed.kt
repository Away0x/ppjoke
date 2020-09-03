package com.away0x.ppjoke.models

/**
 * Created by wutong on 2020-09-01
 */
data class Feed(
    var id: Int,
    var itemId: Long,
    var itemType: Int,
    var createTime: Int,
    var duration: Double,
    var feeds_text: String,
    var authorId: Long,
    var activityIcon: String,
    var activityText: String,
    var width: Int,
    var height: Int,
    var url: String,
    var cover: String,
    var author: User,
    var topComment: Comment?,
    var ugc: Ugc
)