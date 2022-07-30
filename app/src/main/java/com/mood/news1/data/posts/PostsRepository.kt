package com.mood.news1.data.posts

import com.mood.news1.data.Result
import com.mood.news1.model.Post

/**
 * Interface to the Posts data layer.
 */
interface PostsRepository {

    /**
     * Get a specific News1 Post.
     *
     * @param postId the id of the post to get.
     */
    suspend fun getPost(postId: String?) : Result<Post>

}