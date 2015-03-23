package com.hitherejoe.hackernews.data.remote;

import com.hitherejoe.hackernews.data.model.Comment;
import com.hitherejoe.hackernews.data.model.Story;
import com.hitherejoe.hackernews.data.model.User;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

public interface HackerNewsService {

    public final String ENDPOINT = "https://hacker-news.firebaseio.com/v0/";

    /**
     * Return a list of the latest post IDs.
     */
    @GET("/topstories.json")
    public Observable<List<Long>> getTopStories();

    /**
     * Return a list of a users post IDs.
     */
    @GET("/user/{user}.json")
    public Observable<User> getUser(@Path("user") String user);

    /**
     * Return story item.
     */
    @GET("/item/{itemId}.json")
    public Observable<Story> getStoryItem(@Path("itemId") String itemId);

    /**
     * Returns a comment item.
     */
    @GET("/item/{itemId}.json")
    public Observable<Comment> getCommentItem(@Path("itemId") String itemId);

}
