package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TwitterListModel {

	private ArrayList<LonelyTweetModel> tweets;
	private int count;
	
	
	public TwitterListModel(){
		count=0;
		tweets = new ArrayList<LonelyTweetModel>();
	}
	
	public int getListLength(){
		return count;
	}

	public void addTweet(LonelyTweetModel tweet) throws IllegalArgumentException {
		
		for(int i = 0; i<this.getListLength(); i++){
			if (tweets.get(i).equals(tweet)){
				throw new IllegalArgumentException("already tweeted");
			}
		}
		tweets.add(tweet);
		count++;
	}
	
//	public void addTweet(){
//		
//	}
	
//	public LonelyTweetModel[] getTweets(){
//		
//	}
//	
	public boolean hasTweet(LonelyTweetModel tweet) {
		
		for(int i = 0; i<this.getListLength(); i++){
			if (tweets.get(i).equals(tweet)){
				return true;
			} 
		}
		return false;
	}

	public void removeTweet(LonelyTweetModel tweet){
		
		
	}
	
	
	
	
}
