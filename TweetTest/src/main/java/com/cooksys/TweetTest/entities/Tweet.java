package com.cooksys.TweetTest.entities;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Tweet {

	  @Id
	  @GeneratedValue
	  private int id;

	  @ManyToOne
	  private User author;

	  @CreationTimestamp
	  private Timestamp posted;
	  
	  @Column(nullable = false)
	  private boolean deleted = false;
	  
	  @Column(nullable = false)
	  private String content;
	  
	  @ManyToMany(mappedBy = "likedTweets", cascade = CascadeType.REMOVE)
	  private List<User> likes;

	  @ManyToMany( cascade = CascadeType.REMOVE)
	  private List<Hashtag> hashtags;
	  
	  @ManyToMany(cascade = CascadeType.REMOVE)
	  private List<User> userMentioned;
	  
	  @ManyToOne(cascade = CascadeType.REMOVE)
	  private Tweet inReplyTo;
	  
	  @OneToMany(mappedBy = "inReplyTo", cascade = CascadeType.REMOVE)
	  private List<Tweet> replies;
	  
	  @ManyToOne( cascade = CascadeType.REMOVE)
	  private Tweet repostOf;
	  
	  @OneToMany(mappedBy = "repostOf", cascade = CascadeType.REMOVE)
	  private List<Tweet> reposts;
}
