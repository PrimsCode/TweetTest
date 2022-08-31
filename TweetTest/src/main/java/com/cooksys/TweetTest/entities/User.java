package com.cooksys.TweetTest.entities;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@NoArgsConstructor
@Data
@Table(name = "user_table")
public class User {

	 @Id
	 @GeneratedValue
	 private long id;
	
	  @Embedded
	  private Credentials credentials;
	  
	  @Embedded
	  private Profile profile;

	  @Column(nullable = false)
	  private boolean deleted = false;

	  @CreationTimestamp
	  @Column(nullable = false)
	  private Timestamp joined;
	 
	  @OneToMany(mappedBy = "author", cascade = CascadeType.REMOVE)
	  private List<Tweet> tweets;
	 
	  @ManyToMany(cascade = CascadeType.REMOVE)
	  private List<Tweet> likedTweets;
	  
	  @ManyToMany(cascade = CascadeType.REMOVE)
	  private List<User> followers;
	  
	  @ManyToMany(mappedBy = "followers", cascade = CascadeType.REMOVE)
	  private List<User> following;
	  
	  @ManyToMany(mappedBy = "userMentioned", cascade = CascadeType.REMOVE)
	  private List<Tweet> mentions;
}
