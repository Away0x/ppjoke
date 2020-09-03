package com.away0x.ppjoke.models

/**
 * Created by wutong on 2020-09-01
 */
data class User(
    var id: Int,
    var userId: Long,
    var name: String,
    var avatar: String,
    var description: String,
    var likeCount: Int,
    var topCommentCount: Int,
    var followCount: Int,
    var followerCount: Int,
    var qqOpenId: Any,
    var expires_time: Int,
    var score: Int,
    var historyCount: Int,
    var commentCount: Int,
    var favoriteCount: Int,
    var feedCount: Int,
    var hasFollow: Boolean
) {

}