package com.example.proxy;

import java.util.List;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterExample {

	private static final String TWITTER_CONSUMER_KEY = "PUT_YOUR_VALUES_HERE";
	private static final String TWITTER_SECRET_KEY = "PUT_YOUR_VALUES_HERE";
	private static final String TWITTER_ACCESS_TOKEN = "PUT_YOUR_VALUES_HERE";
	private static final String TWITTER_ACCESS_TOKEN_SECRET = "PUT_YOUR_VALUES_HERE";
	
	public static void main (String args[]) {
		
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		    .setOAuthConsumerKey(TWITTER_CONSUMER_KEY)
		    .setOAuthConsumerSecret(TWITTER_SECRET_KEY)
		    .setOAuthAccessToken(TWITTER_ACCESS_TOKEN)
		    .setOAuthAccessTokenSecret(TWITTER_ACCESS_TOKEN_SECRET);
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();
		try {
		    Query query = new Query("bh5k");
		    QueryResult result;
		    do {
		        result = twitter.search(query);
		        List<Status> tweets = result.getTweets();
		        for (Status tweet : tweets) {
		            System.out.println("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
		        }
		    } while ((query = result.nextQuery()) != null);
		    System.exit(0);
		} catch (TwitterException te) {
		    te.printStackTrace();
		    System.out.println("Failed to search tweets: " + te.getMessage());
		    System.exit(-1);
		}
	}
	
}
